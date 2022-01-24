package fixtures.lro.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the patch201RetryWithAsyncHeader operation. */
public final class LROsPatch201RetryWithAsyncHeaderResponse
        extends ResponseBase<LROsPatch201RetryWithAsyncHeaderHeaders, Product> {
    /**
     * Creates an instance of LROsPatch201RetryWithAsyncHeaderResponse.
     *
     * @param request the request which resulted in this LROsPatch201RetryWithAsyncHeaderResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LROsPatch201RetryWithAsyncHeaderResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Product value,
            LROsPatch201RetryWithAsyncHeaderHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public Product getValue() {
        return super.getValue();
    }
}