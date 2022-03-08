// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1OperationResponse {
    /**
     * methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
     */
    private final List<String> methods;
    /**
     * REST resource path associated with the API proxy or remote service.
     * 
     */
    private final String resource;

    @OutputCustomType.Constructor({"methods","resource"})
    private GoogleCloudApigeeV1OperationResponse(
        List<String> methods,
        String resource) {
        this.methods = methods;
        this.resource = resource;
    }

    /**
     * methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
    */
    public List<String> getMethods() {
        return this.methods;
    }
    /**
     * REST resource path associated with the API proxy or remote service.
     * 
    */
    public String getResource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> methods;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.resource = defaults.resource;
        }

        public Builder setMethods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public GoogleCloudApigeeV1OperationResponse build() {
            return new GoogleCloudApigeeV1OperationResponse(methods, resource);
        }
    }
}
