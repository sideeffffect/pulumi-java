// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RouteRequestParameterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteRequestParameterGetArgs Empty = new RouteRequestParameterGetArgs();

    /**
     * Request parameter key. This is a [request data mapping parameter](https://docs.aws.amazon.com/apigateway/latest/developerguide/websocket-api-data-mapping.html#websocket-mapping-request-parameters).
     * 
     */
    @Import(name="requestParameterKey", required=true)
    private Output<String> requestParameterKey;

    public Output<String> requestParameterKey() {
        return this.requestParameterKey;
    }

    /**
     * Boolean whether or not the parameter is required.
     * 
     */
    @Import(name="required", required=true)
    private Output<Boolean> required;

    public Output<Boolean> required() {
        return this.required;
    }

    private RouteRequestParameterGetArgs() {}

    private RouteRequestParameterGetArgs(RouteRequestParameterGetArgs $) {
        this.requestParameterKey = $.requestParameterKey;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteRequestParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteRequestParameterGetArgs $;

        public Builder() {
            $ = new RouteRequestParameterGetArgs();
        }

        public Builder(RouteRequestParameterGetArgs defaults) {
            $ = new RouteRequestParameterGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder requestParameterKey(Output<String> requestParameterKey) {
            $.requestParameterKey = requestParameterKey;
            return this;
        }

        public Builder requestParameterKey(String requestParameterKey) {
            return requestParameterKey(Output.of(requestParameterKey));
        }

        public Builder required(Output<Boolean> required) {
            $.required = required;
            return this;
        }

        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public RouteRequestParameterGetArgs build() {
            $.requestParameterKey = Objects.requireNonNull($.requestParameterKey, "expected parameter 'requestParameterKey' to be non-null");
            $.required = Objects.requireNonNull($.required, "expected parameter 'required' to be non-null");
            return $;
        }
    }

}
