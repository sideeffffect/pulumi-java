// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RouteRequestParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteRequestParameterGetArgs Empty = new RouteRequestParameterGetArgs();

    /**
     * Request parameter key. This is a [request data mapping parameter](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-data-mapping.html#websocket-mapping-request-parameters).
     * 
     */
    @InputImport(name="requestParameterKey", required=true)
      private final Input<String> requestParameterKey;

    public Input<String> getRequestParameterKey() {
        return this.requestParameterKey;
    }

    /**
     * Boolean whether or not the parameter is required.
     * 
     */
    @InputImport(name="required", required=true)
      private final Input<Boolean> required;

    public Input<Boolean> getRequired() {
        return this.required;
    }

    public RouteRequestParameterGetArgs(
        Input<String> requestParameterKey,
        Input<Boolean> required) {
        this.requestParameterKey = Objects.requireNonNull(requestParameterKey, "expected parameter 'requestParameterKey' to be non-null");
        this.required = Objects.requireNonNull(required, "expected parameter 'required' to be non-null");
    }

    private RouteRequestParameterGetArgs() {
        this.requestParameterKey = Input.empty();
        this.required = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteRequestParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> requestParameterKey;
        private Input<Boolean> required;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteRequestParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestParameterKey = defaults.requestParameterKey;
    	      this.required = defaults.required;
        }

        public Builder requestParameterKey(Input<String> requestParameterKey) {
            this.requestParameterKey = Objects.requireNonNull(requestParameterKey);
            return this;
        }

        public Builder requestParameterKey(String requestParameterKey) {
            this.requestParameterKey = Input.of(Objects.requireNonNull(requestParameterKey));
            return this;
        }

        public Builder required(Input<Boolean> required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }

        public Builder required(Boolean required) {
            this.required = Input.of(Objects.requireNonNull(required));
            return this;
        }
        public RouteRequestParameterGetArgs build() {
            return new RouteRequestParameterGetArgs(requestParameterKey, required);
        }
    }
}
