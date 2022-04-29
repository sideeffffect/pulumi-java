// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs;
import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobHttpTargetArgs extends ResourceArgs {

    public static final JobHttpTargetArgs Empty = new JobHttpTargetArgs();

    /**
     * HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return HTTP request body.
     * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
     * It is an error to set body on a job with an incompatible HttpMethod.
     * A base64-encoded string.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return This map contains the header field names and values.
     * Repeated headers are not supported, but a header value can contain commas.
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Which HTTP method to use for the request.
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<String> httpMethod;

    /**
     * @return Which HTTP method to use for the request.
     * 
     */
    public Optional<Output<String>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * Contains information needed for generating an OAuth token.
     * This type of authorization should be used when sending requests to a GCP endpoint.
     * Structure is documented below.
     * 
     */
    @Import(name="oauthToken")
    private @Nullable Output<JobHttpTargetOauthTokenArgs> oauthToken;

    /**
     * @return Contains information needed for generating an OAuth token.
     * This type of authorization should be used when sending requests to a GCP endpoint.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobHttpTargetOauthTokenArgs>> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }

    /**
     * Contains information needed for generating an OpenID Connect token.
     * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     * Structure is documented below.
     * 
     */
    @Import(name="oidcToken")
    private @Nullable Output<JobHttpTargetOidcTokenArgs> oidcToken;

    /**
     * @return Contains information needed for generating an OpenID Connect token.
     * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobHttpTargetOidcTokenArgs>> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }

    /**
     * The full URI path that the request will be sent to.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The full URI path that the request will be sent to.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private JobHttpTargetArgs() {}

    private JobHttpTargetArgs(JobHttpTargetArgs $) {
        this.body = $.body;
        this.headers = $.headers;
        this.httpMethod = $.httpMethod;
        this.oauthToken = $.oauthToken;
        this.oidcToken = $.oidcToken;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobHttpTargetArgs $;

        public Builder() {
            $ = new JobHttpTargetArgs();
        }

        public Builder(JobHttpTargetArgs defaults) {
            $ = new JobHttpTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param body HTTP request body.
         * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
         * It is an error to set body on a job with an incompatible HttpMethod.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body HTTP request body.
         * A request body is allowed only if the HTTP method is POST, PUT, or PATCH.
         * It is an error to set body on a job with an incompatible HttpMethod.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param headers This map contains the header field names and values.
         * Repeated headers are not supported, but a header value can contain commas.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers This map contains the header field names and values.
         * Repeated headers are not supported, but a header value can contain commas.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param httpMethod Which HTTP method to use for the request.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod Which HTTP method to use for the request.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(String httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param oauthToken Contains information needed for generating an OAuth token.
         * This type of authorization should be used when sending requests to a GCP endpoint.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(@Nullable Output<JobHttpTargetOauthTokenArgs> oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        /**
         * @param oauthToken Contains information needed for generating an OAuth token.
         * This type of authorization should be used when sending requests to a GCP endpoint.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(JobHttpTargetOauthTokenArgs oauthToken) {
            return oauthToken(Output.of(oauthToken));
        }

        /**
         * @param oidcToken Contains information needed for generating an OpenID Connect token.
         * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(@Nullable Output<JobHttpTargetOidcTokenArgs> oidcToken) {
            $.oidcToken = oidcToken;
            return this;
        }

        /**
         * @param oidcToken Contains information needed for generating an OpenID Connect token.
         * This type of authorization should be used when sending requests to third party endpoints or Cloud Run.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(JobHttpTargetOidcTokenArgs oidcToken) {
            return oidcToken(Output.of(oidcToken));
        }

        /**
         * @param uri The full URI path that the request will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The full URI path that the request will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public JobHttpTargetArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
