// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of HTTP header match atrributes.
 * 
 */
public final class HttpHeaderMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpHeaderMatchArgs Empty = new HttpHeaderMatchArgs();

    /**
     * The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier.
     * 
     */
    @Import(name="regexMatch", required=true)
    private Output<String> regexMatch;

    public Output<String> regexMatch() {
        return this.regexMatch;
    }

    private HttpHeaderMatchArgs() {}

    private HttpHeaderMatchArgs(HttpHeaderMatchArgs $) {
        this.headerName = $.headerName;
        this.regexMatch = $.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpHeaderMatchArgs $;

        public Builder() {
            $ = new HttpHeaderMatchArgs();
        }

        public Builder(HttpHeaderMatchArgs defaults) {
            $ = new HttpHeaderMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder regexMatch(Output<String> regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        public Builder regexMatch(String regexMatch) {
            return regexMatch(Output.of(regexMatch));
        }

        public HttpHeaderMatchArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.regexMatch = Objects.requireNonNull($.regexMatch, "expected parameter 'regexMatch' to be non-null");
            return $;
        }
    }

}
