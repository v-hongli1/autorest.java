// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.model.clientmodel;

import com.azure.autorest.Javagen;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProxyMethodExample {

    private final Logger logger = new PluginLogger(Javagen.getPluginInstance(), ProxyMethodExample.class);

    private static final ObjectMapper PRETTY_PRINTER = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private static final ObjectMapper NORMAL_PRINTER = new ObjectMapper();
    private static final String SLASH = "/";
    private static final String QUOTED_SLASH = Pattern.quote(SLASH);

    private static String tspDirectory = null;
    public static void setTspDirectory(String tspDirectory) {
        ProxyMethodExample.tspDirectory = tspDirectory;
    }

    // https://azure.github.io/autorest/extensions/#x-ms-examples
    // https://github.com/Azure/azure-rest-api-specs/blob/main/documentation/x-ms-examples.md

    public static class ParameterValue {
        private final Object objectValue;

        public ParameterValue(Object objectValue) {
            this.objectValue = objectValue;
        }

        /**
         * @return the object value of the parameter
         */
        public Object getObjectValue() {
            return objectValue;
        }

        /**
         * Gets the un-escaped query value.
         *
         * This is done by heuristic, and not guaranteed to be correct.
         *
         * @return the un-escaped query value
         */
        public Object getUnescapedQueryValue() {
            Object unescapedValue = objectValue;
            if (objectValue instanceof String) {
                unescapedValue = URLDecoder.decode((String) objectValue, StandardCharsets.UTF_8);
            }
            return unescapedValue;
        }

        @Override
        public String toString() {
            try {
                return "ParameterValue{" +
                        "objectValue=" + PRETTY_PRINTER.writeValueAsString(objectValue) +
                        '}';
            } catch (JsonProcessingException e) {
                return "ParameterValue{" +
                        "objectValue=" + objectValue +
                        '}';
            }
        }

        public String getJsonString() {
            try {
                return NORMAL_PRINTER.writeValueAsString(objectValue);
            } catch (JsonProcessingException e) {
                return objectValue.toString();
            }
        }
    }

    public static class Response {

        private final int statusCode;
        private final HttpHeaders httpHeaders;
        private final Object body;

        @SuppressWarnings("unchecked")
        public Response(int statusCode, Object response) {
            this.statusCode = statusCode;
            this.httpHeaders = new HttpHeaders();
            if (response instanceof Map) {
                Map<String, Object> responseMap = (Map<String, Object>) response;
                if (responseMap.containsKey("headers") && responseMap.get("headers") instanceof Map) {
                    Map<String, Object> headersMap = (Map<String, Object>) responseMap.get("headers");
                    headersMap.forEach((header, value) -> {
                        httpHeaders.add(HttpHeaderName.fromString(header), value.toString());
                    });
                }
                this.body = responseMap.getOrDefault("body", null);
            } else {
                this.body = null;
            }
        }

        /** @return the status code */
        public int getStatusCode() {
            return statusCode;
        }

        /** @return the http headers */
        public HttpHeaders getHttpHeaders() {
            return httpHeaders;
        }

        /** @return the response body */
        public Object getBody() {
            return body;
        }

        /** @return the response body as JSON string */
        public String getJsonBody() {
            if (body != null) {
                try {
                    return NORMAL_PRINTER.writeValueAsString(body);
                } catch (JsonProcessingException e) {
                    return body.toString();
                }
            } else {
                return "";
            }
        }

        /**
         * @param obj the object for JSON string
         * @return the object as JSON string
         */
        public String getJson(Object obj) {
            if (obj != null) {
                try {
                    return NORMAL_PRINTER.writeValueAsString(obj);
                } catch (JsonProcessingException e) {
                    return obj.toString();
                }
            } else {
                return "";
            }
        }

        @Override
        public String toString() {
            try {
                return "Response{" +
                        "statusCode=" + statusCode +
                        ", httpHeaders=" + httpHeaders +
                        ", body=" + PRETTY_PRINTER.writeValueAsString(body) +
                        '}';
            } catch (JsonProcessingException e) {
                return "Response{" +
                        "statusCode=" + statusCode +
                        ", httpHeaders=" + httpHeaders +
                        ", body=" + body +
                        '}';
            }
        }
    }

    private final Map<String, ParameterValue> parameters = new LinkedHashMap<>();
    private final Map<Integer, Response> responses = new LinkedHashMap<>();
    private final String originalFile;
    private String relativeOriginalFileName;
    private String codeSnippetIdentifier;
    private String name;

    /**
     * @return the map of parameter name to parameter object values
     */
    public Map<String, ParameterValue> getParameters() {
        return parameters;
    }

    /**
     * @return the map of status code to response
     */
    public Map<Integer, Response> getResponses() {
        return responses;
    }

    /**
     * @return the primary response
     */
    public Optional<Response> getPrimaryResponse() {
        if (responses.isEmpty()) {
            return Optional.empty();
        }

        Optional<Response> response = responses.values().stream()
                .filter(r -> r.statusCode / 100 == 2)
                .findFirst();
        if (!response.isPresent()) {
            response = responses.values().stream().findFirst();
        }
        return response;
    }

    /**
     * @return value of "x-ms-original-file" extension
     */
    public String getOriginalFile() {
        return originalFile;
    }

    /**
     * Heuristically find relative path of the original file to the repository.
     *
     * For instance, "specification/resources/resource-manager/Microsoft.Authorization/stable/2020-09-01/examples/getDataPolicyManifest.json"
     *
     * @return the relative path of the original file
     */
    public String getRelativeOriginalFileName() {
        if (relativeOriginalFileName == null && !CoreUtils.isNullOrEmpty(this.getOriginalFile())) {
            String originalFileName = this.getOriginalFile();
            try {
                URL url = new URI(originalFileName).toURL();
                switch (url.getProtocol()) {
                    case "http":
                    case "https":
                    {
                        String[] segments = url.getPath().split(QUOTED_SLASH);
                        if (segments.length > 3) {
                            // first 3 should be owner, name, branch
                            originalFileName = Arrays.stream(segments)
                                    .filter(s -> !s.isEmpty())
                                    .skip(3)
                                    .collect(Collectors.joining(SLASH));
                        }
                        break;
                    }

                    case "file":
                    {
                        String relativeFileName = tspDirectory != null
                                ? getRelativeOriginalFileNameForTsp(url)
                                : getRelativeOriginalFileNameForSwagger(url);
                        if (relativeFileName != null) {
                            originalFileName = relativeFileName;
                        }
                        break;
                    }

                    default:
                    {
                        logger.error("Unknown protocol in x-ms-original-file: '{}'", originalFileName);
                        break;
                    }
                }
            } catch (MalformedURLException | URISyntaxException | IllegalArgumentException e) {
                logger.error("Failed to parse x-ms-original-file: '{}'", originalFileName);
            }
            relativeOriginalFileName = originalFileName;
        }
        return relativeOriginalFileName;
    }

    /**
     * identifier of the codesnippet label from codesnippet-maven-plugin
     * @see <a href="https://github.com/Azure/azure-sdk-tools/blob/main/packages/java-packages/codesnippet-maven-plugin/README.md">codesnippet-maven-plugin</a>
     * @return the identifier of the codesnippet label that wraps around the example code
     */
    public String getCodeSnippetIdentifier() {
        return codeSnippetIdentifier;
    }

    /** @return example name */
    public String getName() {
        return name;
    }

    private ProxyMethodExample(String originalFile) {
        this.originalFile = originalFile;
    }

    static String getRelativeOriginalFileNameForTsp(URL url) {
        // TypeSpec
        /*
         * Example:
         * directory "specification/standbypool/StandbyPool.Management"
         * originalFileName "file:///C:/github/azure-sdk-for-java/sdk/standbypool/azure-resourcemanager-standbypool/TempTypeSpecFiles/StandbyPool.Management/examples/2023-12-01-preview/StandbyVirtualMachinePools_Update.json"
         *
         * There is an overlap of "StandbyPool.Management", so that we can combine the 2 to Result:
         * "specification/standbypool/StandbyPool.Management/examples/2023-12-01-preview/StandbyVirtualMachinePools_Update.json"
         */
        String originalFileName = null;
        String[] directorySegments = tspDirectory.split(QUOTED_SLASH);
        String directoryLastSegment = directorySegments[directorySegments.length - 1];
        int sharedDirectorySegment = -1;
        String[] segments = url.getPath().split(QUOTED_SLASH);
        for (int i = segments.length - 1; i >= 0; --i) {
            if (Objects.equals(directoryLastSegment, segments[i])) {
                sharedDirectorySegment = i;
                break;
            }
        }
        if (sharedDirectorySegment >= 0) {
            originalFileName = Stream.concat(
                    Arrays.stream(directorySegments),
                    Arrays.stream(segments).skip(sharedDirectorySegment + 1)
            ).collect(Collectors.joining(SLASH));
        }
        return originalFileName;
    }

    static String getRelativeOriginalFileNameForSwagger(URL url) {
        // Swagger
        /*
         * The examples should be under "specification/<service>/resource-manager"
         * or "specification/<service>/data-plane"
         */
        String originalFileName = null;
        String[] segments = url.getPath().split(QUOTED_SLASH);
        int resourceManagerOrDataPlaneSegmentIndex = -1;
        for (int i = 0; i < segments.length; ++i) {
            if ("resource-manager".equals(segments[i]) || "data-plane".equals(segments[i])) {
                resourceManagerOrDataPlaneSegmentIndex = i;
                break;
            }
        }
        if (resourceManagerOrDataPlaneSegmentIndex > 2) {
            originalFileName = Arrays.stream(segments)
                    .skip(resourceManagerOrDataPlaneSegmentIndex - 2)
                    .collect(Collectors.joining(SLASH));
        }
        return originalFileName;
    }

    @Override
    public String toString() {
        return "ProxyMethodExample{" +
                "parameters=" + parameters +
                ", responses=" + responses +
                '}';
    }

    public static final class Builder {
        private final Map<String, ParameterValue> parameters = new LinkedHashMap<>();
        private final Map<Integer, Response> responses = new LinkedHashMap<>();
        private String originalFile;
        private String codeSnippetIdentifier;
        private String name;

        public Builder() {
        }

        public Builder parameter(String parameterName, Object parameterValue) {
            if (parameterValue != null) {
                this.parameters.put(parameterName, new ParameterValue(parameterValue));
            }
            return this;
        }

        public Builder response(Integer statusCode, Object response) {
            this.responses.put(statusCode, new Response(statusCode, response));
            return this;
        }

        public Builder originalFile(String originalFile) {
            this.originalFile = originalFile;
            return this;
        }

        public Builder codeSnippetIdentifier(String identifier) {
            this.codeSnippetIdentifier = identifier;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ProxyMethodExample build() {
            ProxyMethodExample proxyMethodExample = new ProxyMethodExample(originalFile);
            proxyMethodExample.parameters.putAll(this.parameters);
            proxyMethodExample.responses.putAll(this.responses);
            proxyMethodExample.codeSnippetIdentifier = this.codeSnippetIdentifier;
            proxyMethodExample.name = this.name;
            return proxyMethodExample;
        }
    }
}
