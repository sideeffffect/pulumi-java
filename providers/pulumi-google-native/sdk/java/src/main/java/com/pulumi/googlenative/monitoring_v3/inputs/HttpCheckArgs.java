// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v3.enums.HttpCheckContentType;
import com.pulumi.googlenative.monitoring_v3.enums.HttpCheckRequestMethod;
import com.pulumi.googlenative.monitoring_v3.inputs.BasicAuthenticationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information involved in an HTTP/HTTPS Uptime check request.
 * 
 */
public final class HttpCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpCheckArgs Empty = new HttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
     */
    @Import(name="authInfo")
    private @Nullable Output<BasicAuthenticationArgs> authInfo;

    public Optional<Output<BasicAuthenticationArgs>> authInfo() {
        return Optional.ofNullable(this.authInfo);
    }

    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren&#39;t used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a &#34;Content-Type&#34; header is provided via headers field. The content_type field should be used instead.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<HttpCheckContentType> contentType;

    public Optional<Output<HttpCheckContentType>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
     */
    @Import(name="maskHeaders")
    private @Nullable Output<Boolean> maskHeaders;

    public Optional<Output<Boolean>> maskHeaders() {
        return Optional.ofNullable(this.maskHeaders);
    }

    /**
     * Optional (defaults to &#34;/&#34;). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with &#34;/&#34;, a &#34;/&#34; will be prepended automatically.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<HttpCheckRequestMethod> requestMethod;

    public Optional<Output<HttpCheckRequestMethod>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @Import(name="useSsl")
    private @Nullable Output<Boolean> useSsl;

    public Optional<Output<Boolean>> useSsl() {
        return Optional.ofNullable(this.useSsl);
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
     */
    @Import(name="validateSsl")
    private @Nullable Output<Boolean> validateSsl;

    public Optional<Output<Boolean>> validateSsl() {
        return Optional.ofNullable(this.validateSsl);
    }

    private HttpCheckArgs() {}

    private HttpCheckArgs(HttpCheckArgs $) {
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
    public static Builder builder(HttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpCheckArgs $;

        public Builder() {
            $ = new HttpCheckArgs();
        }

        public Builder(HttpCheckArgs defaults) {
            $ = new HttpCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder authInfo(@Nullable Output<BasicAuthenticationArgs> authInfo) {
            $.authInfo = authInfo;
            return this;
        }

        public Builder authInfo(BasicAuthenticationArgs authInfo) {
            return authInfo(Output.of(authInfo));
        }

        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        public Builder body(String body) {
            return body(Output.of(body));
        }

        public Builder contentType(@Nullable Output<HttpCheckContentType> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(HttpCheckContentType contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        public Builder maskHeaders(@Nullable Output<Boolean> maskHeaders) {
            $.maskHeaders = maskHeaders;
            return this;
        }

        public Builder maskHeaders(Boolean maskHeaders) {
            return maskHeaders(Output.of(maskHeaders));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder requestMethod(@Nullable Output<HttpCheckRequestMethod> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        public Builder requestMethod(HttpCheckRequestMethod requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        public Builder useSsl(@Nullable Output<Boolean> useSsl) {
            $.useSsl = useSsl;
            return this;
        }

        public Builder useSsl(Boolean useSsl) {
            return useSsl(Output.of(useSsl));
        }

        public Builder validateSsl(@Nullable Output<Boolean> validateSsl) {
            $.validateSsl = validateSsl;
            return this;
        }

        public Builder validateSsl(Boolean validateSsl) {
            return validateSsl(Output.of(validateSsl));
        }

        public HttpCheckArgs build() {
            return $;
        }
    }

}
