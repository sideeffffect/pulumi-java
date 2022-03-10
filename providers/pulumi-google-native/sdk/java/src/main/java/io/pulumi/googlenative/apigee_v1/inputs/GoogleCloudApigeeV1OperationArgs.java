// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the pairing of REST resource path and the actions (verbs) allowed on the resource path.
 * 
 */
public final class GoogleCloudApigeeV1OperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1OperationArgs Empty = new GoogleCloudApigeeV1OperationArgs();

    /**
     * methods refers to the REST verbs as in https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html. When none specified, all verb types are allowed.
     * 
     */
    @InputImport(name="methods")
      private final @Nullable Input<List<String>> methods;

    public Input<List<String>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * REST resource path associated with the API proxy or remote service.
     * 
     */
    @InputImport(name="resource", required=true)
      private final Input<String> resource;

    public Input<String> getResource() {
        return this.resource;
    }

    public GoogleCloudApigeeV1OperationArgs(
        @Nullable Input<List<String>> methods,
        Input<String> resource) {
        this.methods = methods;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GoogleCloudApigeeV1OperationArgs() {
        this.methods = Input.empty();
        this.resource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1OperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> methods;
        private Input<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1OperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.resource = defaults.resource;
        }

        public Builder methods(@Nullable Input<List<String>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder methods(@Nullable List<String> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder resource(Input<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }
        public GoogleCloudApigeeV1OperationArgs build() {
            return new GoogleCloudApigeeV1OperationArgs(methods, resource);
        }
    }
}
