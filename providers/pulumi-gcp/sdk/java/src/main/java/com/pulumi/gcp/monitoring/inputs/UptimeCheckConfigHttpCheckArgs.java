// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckAuthInfoArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckConfigHttpCheckArgs extends ResourceArgs {

    public static final UptimeCheckConfigHttpCheckArgs Empty = new UptimeCheckConfigHttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * Structure is documented below.
     * 
     */
    @Import(name="authInfo")
    private @Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo;

    /**
     * @return The authentication information. Optional when creating an HTTP check; defaults to empty.
     * Structure is documented below.
     * 
     */
    public Optional<Output<UptimeCheckConfigHttpCheckAuthInfoArgs>> authInfo() {
        return Optional.ofNullable(this.authInfo);
    }

    /**
     * The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. &#34;foo=bar&#34; in URL-encoded form is &#34;foo%3Dbar&#34; and in base64 encoding is &#34;Zm9vJTI1M0RiYXI=&#34;.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. &#34;foo=bar&#34; in URL-encoded form is &#34;foo%3Dbar&#34; and in base64 encoding is &#34;Zm9vJTI1M0RiYXI=&#34;.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type to use for the check.
     * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
     */
    @Import(name="maskHeaders")
    private @Nullable Output<Boolean> maskHeaders;

    /**
     * @return Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
     * 
     */
    public Optional<Output<Boolean>> maskHeaders() {
        return Optional.ofNullable(this.maskHeaders);
    }

    /**
     * The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to &#34;/&#34;).
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to &#34;/&#34;).
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<String> requestMethod;

    /**
     * @return The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
     * Default value is `GET`.
     * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
     * 
     */
    public Optional<Output<String>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @Import(name="useSsl")
    private @Nullable Output<Boolean> useSsl;

    /**
     * @return If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    public Optional<Output<Boolean>> useSsl() {
        return Optional.ofNullable(this.useSsl);
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
     */
    @Import(name="validateSsl")
    private @Nullable Output<Boolean> validateSsl;

    /**
     * @return Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
     * 
     */
    public Optional<Output<Boolean>> validateSsl() {
        return Optional.ofNullable(this.validateSsl);
    }

    private UptimeCheckConfigHttpCheckArgs() {}

    private UptimeCheckConfigHttpCheckArgs(UptimeCheckConfigHttpCheckArgs $) {
        this.authInfo = $.authInfo;
        this.body = $.body;
        this.contentType = $.contentType;
        this.headers = $.headers;
        this.maskHeaders = $.maskHeaders;
        this.path = $.path;
        this.port = $.port;
        this.requestMethod = $.requestMethod;
        this.useSsl = $.useSsl;
        this.validateSsl = $.validateSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigHttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigHttpCheckArgs $;

        public Builder() {
            $ = new UptimeCheckConfigHttpCheckArgs();
        }

        public Builder(UptimeCheckConfigHttpCheckArgs defaults) {
            $ = new UptimeCheckConfigHttpCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authInfo The authentication information. Optional when creating an HTTP check; defaults to empty.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authInfo(@Nullable Output<UptimeCheckConfigHttpCheckAuthInfoArgs> authInfo) {
            $.authInfo = authInfo;
            return this;
        }

        /**
         * @param authInfo The authentication information. Optional when creating an HTTP check; defaults to empty.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authInfo(UptimeCheckConfigHttpCheckAuthInfoArgs authInfo) {
            return authInfo(Output.of(authInfo));
        }

        /**
         * @param body The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. &#34;foo=bar&#34; in URL-encoded form is &#34;foo%3Dbar&#34; and in base64 encoding is &#34;Zm9vJTI1M0RiYXI=&#34;.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body The request body associated with the HTTP POST request. If contentType is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the requestMethod is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte. Note - As with all bytes fields JSON representations are base64 encoded. e.g. &#34;foo=bar&#34; in URL-encoded form is &#34;foo%3Dbar&#34; and in base64 encoding is &#34;Zm9vJTI1M0RiYXI=&#34;.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param contentType The content type to use for the check.
         * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type to use for the check.
         * Possible values are `TYPE_UNSPECIFIED` and `URL_ENCODED`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param headers The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The list of headers to send as part of the uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param maskHeaders Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
         * 
         * @return builder
         * 
         */
        public Builder maskHeaders(@Nullable Output<Boolean> maskHeaders) {
            $.maskHeaders = maskHeaders;
            return this;
        }

        /**
         * @param maskHeaders Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to True then the headers will be obscured with ******.
         * 
         * @return builder
         * 
         */
        public Builder maskHeaders(Boolean maskHeaders) {
            return maskHeaders(Output.of(maskHeaders));
        }

        /**
         * @param path The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to &#34;/&#34;).
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to the page to run the check against. Will be combined with the host (specified within the MonitoredResource) and port to construct the full URL. Optional (defaults to &#34;/&#34;).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to the page to run the check against. Will be combined with host (specified within the MonitoredResource) to construct the full URL.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param requestMethod The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
         * Default value is `GET`.
         * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(@Nullable Output<String> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        /**
         * @param requestMethod The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then requestMethod defaults to GET.
         * Default value is `GET`.
         * Possible values are `METHOD_UNSPECIFIED`, `GET`, and `POST`.
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(String requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        /**
         * @param useSsl If true, use HTTPS instead of HTTP to run the check.
         * 
         * @return builder
         * 
         */
        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            $.useSsl = useSsl;
            return this;
        }

        /**
         * @param useSsl If true, use HTTPS instead of HTTP to run the check.
         * 
         * @return builder
         * 
         */
        public Builder useSsl(Boolean useSsl) {
            return useSsl(Output.of(useSsl));
        }

        /**
         * @param validateSsl Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
         * 
         * @return builder
         * 
         */
        public Builder validateSsl(@Nullable Output<Boolean> validateSsl) {
            $.validateSsl = validateSsl;
            return this;
        }

        /**
         * @param validateSsl Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitoredResource is set to uptime_url. If useSsl is false, setting validateSsl to true has no effect.
         * 
         * @return builder
         * 
         */
        public Builder validateSsl(Boolean validateSsl) {
            return validateSsl(Output.of(validateSsl));
        }

        public UptimeCheckConfigHttpCheckArgs build() {
            return $;
        }
    }

}
