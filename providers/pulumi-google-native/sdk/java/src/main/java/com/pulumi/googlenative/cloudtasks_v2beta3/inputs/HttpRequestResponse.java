// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks_v2beta3.inputs.OAuthTokenResponse;
import com.pulumi.googlenative.cloudtasks_v2beta3.inputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * HTTP request. The task will be pushed to the worker as an HTTP request. If the worker or the redirected worker acknowledges the task by returning a successful HTTP response code ([`200` - `299`]), the task will be removed from the queue. If any other HTTP response code is returned or no response is received, the task will be retried according to the following: * User-specified throttling: retry configuration, rate limits, and the queue&#39;s state. * System throttling: To prevent the worker from overloading, Cloud Tasks may temporarily reduce the queue&#39;s effective rate. User-specified settings will not be changed. System throttling happens because: * Cloud Tasks backs off on all errors. Normally the backoff specified in rate limits will be used. But if the worker returns `429` (Too Many Requests), `503` (Service Unavailable), or the rate of errors is high, Cloud Tasks will use a higher backoff rate. The retry specified in the `Retry-After` HTTP response header is considered. * To prevent traffic spikes and to smooth sudden increases in traffic, dispatches ramp up slowly when the queue is newly created or idle and if large numbers of tasks suddenly become available to dispatch (due to spikes in create task rates, the queue being unpaused, or many tasks that are scheduled at the same time).
 * 
 */
public final class HttpRequestResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpRequestResponse Empty = new HttpRequestResponse();

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod.
     * 
     */
    @Import(name="body", required=true)
    private String body;

    public String body() {
        return this.body;
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB.
     * 
     */
    @Import(name="headers", required=true)
    private Map<String,String> headers;

    public Map<String,String> headers() {
        return this.headers;
    }

    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    @Import(name="httpMethod", required=true)
    private String httpMethod;

    public String httpMethod() {
        return this.httpMethod;
    }

    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    @Import(name="oauthToken", required=true)
    private OAuthTokenResponse oauthToken;

    public OAuthTokenResponse oauthToken() {
        return this.oauthToken;
    }

    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    @Import(name="oidcToken", required=true)
    private OidcTokenResponse oidcToken;

    public OidcTokenResponse oidcToken() {
        return this.oidcToken;
    }

    /**
     * The full url path that the request will be sent to. This string must begin with either &#34;http://&#34; or &#34;https://&#34;. Some examples are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location` header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private HttpRequestResponse() {}

    private HttpRequestResponse(HttpRequestResponse $) {
        this.body = $.body;
        this.headers = $.headers;
        this.httpMethod = $.httpMethod;
        this.oauthToken = $.oauthToken;
        this.oidcToken = $.oidcToken;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRequestResponse $;

        public Builder() {
            $ = new HttpRequestResponse();
        }

        public Builder(HttpRequestResponse defaults) {
            $ = new HttpRequestResponse(Objects.requireNonNull(defaults));
        }

        public Builder body(String body) {
            $.body = body;
            return this;
        }

        public Builder headers(Map<String,String> headers) {
            $.headers = headers;
            return this;
        }

        public Builder httpMethod(String httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        public Builder oauthToken(OAuthTokenResponse oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        public Builder oidcToken(OidcTokenResponse oidcToken) {
            $.oidcToken = oidcToken;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public HttpRequestResponse build() {
            $.body = Objects.requireNonNull($.body, "expected parameter 'body' to be non-null");
            $.headers = Objects.requireNonNull($.headers, "expected parameter 'headers' to be non-null");
            $.httpMethod = Objects.requireNonNull($.httpMethod, "expected parameter 'httpMethod' to be non-null");
            $.oauthToken = Objects.requireNonNull($.oauthToken, "expected parameter 'oauthToken' to be non-null");
            $.oidcToken = Objects.requireNonNull($.oidcToken, "expected parameter 'oidcToken' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
