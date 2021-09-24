package fixtures.bodycomplex.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.bodycomplex.AutoRestComplexTestServiceVersion;

/** Initializes a new instance of the AutoRestComplexTestService type. */
public final class AutoRestComplexTestServiceImpl {
    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** Service version. */
    private final AutoRestComplexTestServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public AutoRestComplexTestServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The BasicsImpl object to access its operations. */
    private final BasicsImpl basics;

    /**
     * Gets the BasicsImpl object to access its operations.
     *
     * @return the BasicsImpl object.
     */
    public BasicsImpl getBasics() {
        return this.basics;
    }

    /** The PrimitivesImpl object to access its operations. */
    private final PrimitivesImpl primitives;

    /**
     * Gets the PrimitivesImpl object to access its operations.
     *
     * @return the PrimitivesImpl object.
     */
    public PrimitivesImpl getPrimitives() {
        return this.primitives;
    }

    /** The ArraysImpl object to access its operations. */
    private final ArraysImpl arrays;

    /**
     * Gets the ArraysImpl object to access its operations.
     *
     * @return the ArraysImpl object.
     */
    public ArraysImpl getArrays() {
        return this.arrays;
    }

    /** The DictionariesImpl object to access its operations. */
    private final DictionariesImpl dictionaries;

    /**
     * Gets the DictionariesImpl object to access its operations.
     *
     * @return the DictionariesImpl object.
     */
    public DictionariesImpl getDictionaries() {
        return this.dictionaries;
    }

    /** The InheritancesImpl object to access its operations. */
    private final InheritancesImpl inheritances;

    /**
     * Gets the InheritancesImpl object to access its operations.
     *
     * @return the InheritancesImpl object.
     */
    public InheritancesImpl getInheritances() {
        return this.inheritances;
    }

    /** The PolymorphismsImpl object to access its operations. */
    private final PolymorphismsImpl polymorphisms;

    /**
     * Gets the PolymorphismsImpl object to access its operations.
     *
     * @return the PolymorphismsImpl object.
     */
    public PolymorphismsImpl getPolymorphisms() {
        return this.polymorphisms;
    }

    /** The PolymorphicrecursivesImpl object to access its operations. */
    private final PolymorphicrecursivesImpl polymorphicrecursives;

    /**
     * Gets the PolymorphicrecursivesImpl object to access its operations.
     *
     * @return the PolymorphicrecursivesImpl object.
     */
    public PolymorphicrecursivesImpl getPolymorphicrecursives() {
        return this.polymorphicrecursives;
    }

    /** The ReadonlypropertiesImpl object to access its operations. */
    private final ReadonlypropertiesImpl readonlyproperties;

    /**
     * Gets the ReadonlypropertiesImpl object to access its operations.
     *
     * @return the ReadonlypropertiesImpl object.
     */
    public ReadonlypropertiesImpl getReadonlyproperties() {
        return this.readonlyproperties;
    }

    /** The FlattencomplexesImpl object to access its operations. */
    private final FlattencomplexesImpl flattencomplexes;

    /**
     * Gets the FlattencomplexesImpl object to access its operations.
     *
     * @return the FlattencomplexesImpl object.
     */
    public FlattencomplexesImpl getFlattencomplexes() {
        return this.flattencomplexes;
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public AutoRestComplexTestServiceImpl(String host, AutoRestComplexTestServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host,
                serviceVersion);
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public AutoRestComplexTestServiceImpl(
            HttpPipeline httpPipeline, String host, AutoRestComplexTestServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host, serviceVersion);
    }

    /**
     * Initializes an instance of AutoRestComplexTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public AutoRestComplexTestServiceImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String host,
            AutoRestComplexTestServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.serviceVersion = serviceVersion;
        this.basics = new BasicsImpl(this);
        this.primitives = new PrimitivesImpl(this);
        this.arrays = new ArraysImpl(this);
        this.dictionaries = new DictionariesImpl(this);
        this.inheritances = new InheritancesImpl(this);
        this.polymorphisms = new PolymorphismsImpl(this);
        this.polymorphicrecursives = new PolymorphicrecursivesImpl(this);
        this.readonlyproperties = new ReadonlypropertiesImpl(this);
        this.flattencomplexes = new FlattencomplexesImpl(this);
    }
}