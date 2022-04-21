// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.ApiKeyAuthenticationResponse;
import com.pulumi.azurenative.deploymentmanager.inputs.RolloutIdentityAuthenticationResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The properties that make up a REST request
 * 
 */
public final class RestRequestResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestRequestResponse Empty = new RestRequestResponse();

    /**
     * The authentication information required in the request to the health provider.
     * 
     */
    @Import(name="authentication", required=true)
    private Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication;

    public Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication() {
        return this.authentication;
    }

    /**
     * The HTTP method to use for the request.
     * 
     */
    @Import(name="method", required=true)
    private String method;

    public String method() {
        return this.method;
    }

    /**
     * The HTTP URI to use for the request.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private RestRequestResponse() {}

    private RestRequestResponse(RestRequestResponse $) {
        this.authentication = $.authentication;
        this.method = $.method;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestRequestResponse $;

        public Builder() {
            $ = new RestRequestResponse();
        }

        public Builder(RestRequestResponse defaults) {
            $ = new RestRequestResponse(Objects.requireNonNull(defaults));
        }

        public Builder authentication(Either<ApiKeyAuthenticationResponse,RolloutIdentityAuthenticationResponse> authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder method(String method) {
            $.method = method;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public RestRequestResponse build() {
            $.authentication = Objects.requireNonNull($.authentication, "expected parameter 'authentication' to be non-null");
            $.method = Objects.requireNonNull($.method, "expected parameter 'method' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
