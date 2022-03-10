// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.enums.RestAuthLocation;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * ApiKey authentication gives a name and a value that can be included in either the request header or query parameters.
 * 
 */
public final class ApiKeyAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyAuthenticationArgs Empty = new ApiKeyAuthenticationArgs();

    /**
     * The location of the authentication key/value pair in the request.
     * 
     */
    @InputImport(name="in", required=true)
      private final Input<RestAuthLocation> in;

    public Input<RestAuthLocation> getIn() {
        return this.in;
    }

    /**
     * The key name of the authentication key/value pair.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The authentication type.
     * Expected value is 'ApiKey'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The value of the authentication key/value pair.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ApiKeyAuthenticationArgs(
        Input<RestAuthLocation> in,
        Input<String> name,
        Input<String> type,
        Input<String> value) {
        this.in = Objects.requireNonNull(in, "expected parameter 'in' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ApiKeyAuthenticationArgs() {
        this.in = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RestAuthLocation> in;
        private Input<String> name;
        private Input<String> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder in(Input<RestAuthLocation> in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }

        public Builder in(RestAuthLocation in) {
            this.in = Input.of(Objects.requireNonNull(in));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ApiKeyAuthenticationArgs build() {
            return new ApiKeyAuthenticationArgs(in, name, type, value);
        }
    }
}
