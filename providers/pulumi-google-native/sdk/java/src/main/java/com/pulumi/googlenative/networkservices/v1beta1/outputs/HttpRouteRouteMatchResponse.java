// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.HttpRouteHeaderMatchResponse;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.HttpRouteQueryParameterMatchResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpRouteRouteMatchResponse {
    /**
     * @return The HTTP request path value should exactly match this value. Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    private final String fullPathMatch;
    /**
     * @return Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be matched.
     * 
     */
    private final List<HttpRouteHeaderMatchResponse> headers;
    /**
     * @return Specifies if prefix_match and full_path_match matches are case sensitive. The default value is false.
     * 
     */
    private final Boolean ignoreCase;
    /**
     * @return The HTTP request path value must begin with specified prefix_match. prefix_match must begin with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    private final String prefixMatch;
    /**
     * @return Specifies a list of query parameters to match against. ALL of the query parameters must be matched.
     * 
     */
    private final List<HttpRouteQueryParameterMatchResponse> queryParameters;
    /**
     * @return The HTTP request path value must satisfy the regular expression specified by regex_match after removing any query parameters and anchor supplied with the original URL. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    private final String regexMatch;

    @CustomType.Constructor
    private HttpRouteRouteMatchResponse(
        @CustomType.Parameter("fullPathMatch") String fullPathMatch,
        @CustomType.Parameter("headers") List<HttpRouteHeaderMatchResponse> headers,
        @CustomType.Parameter("ignoreCase") Boolean ignoreCase,
        @CustomType.Parameter("prefixMatch") String prefixMatch,
        @CustomType.Parameter("queryParameters") List<HttpRouteQueryParameterMatchResponse> queryParameters,
        @CustomType.Parameter("regexMatch") String regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headers = headers;
        this.ignoreCase = ignoreCase;
        this.prefixMatch = prefixMatch;
        this.queryParameters = queryParameters;
        this.regexMatch = regexMatch;
    }

    /**
     * @return The HTTP request path value should exactly match this value. Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    public String fullPathMatch() {
        return this.fullPathMatch;
    }
    /**
     * @return Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be matched.
     * 
     */
    public List<HttpRouteHeaderMatchResponse> headers() {
        return this.headers;
    }
    /**
     * @return Specifies if prefix_match and full_path_match matches are case sensitive. The default value is false.
     * 
     */
    public Boolean ignoreCase() {
        return this.ignoreCase;
    }
    /**
     * @return The HTTP request path value must begin with specified prefix_match. prefix_match must begin with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    public String prefixMatch() {
        return this.prefixMatch;
    }
    /**
     * @return Specifies a list of query parameters to match against. ALL of the query parameters must be matched.
     * 
     */
    public List<HttpRouteQueryParameterMatchResponse> queryParameters() {
        return this.queryParameters;
    }
    /**
     * @return The HTTP request path value must satisfy the regular expression specified by regex_match after removing any query parameters and anchor supplied with the original URL. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match, prefix_match, or regex_match should be used.
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRouteMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullPathMatch;
        private List<HttpRouteHeaderMatchResponse> headers;
        private Boolean ignoreCase;
        private String prefixMatch;
        private List<HttpRouteQueryParameterMatchResponse> queryParameters;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRouteMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headers = defaults.headers;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameters = defaults.queryParameters;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(String fullPathMatch) {
            this.fullPathMatch = Objects.requireNonNull(fullPathMatch);
            return this;
        }
        public Builder headers(List<HttpRouteHeaderMatchResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(HttpRouteHeaderMatchResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder ignoreCase(Boolean ignoreCase) {
            this.ignoreCase = Objects.requireNonNull(ignoreCase);
            return this;
        }
        public Builder prefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }
        public Builder queryParameters(List<HttpRouteQueryParameterMatchResponse> queryParameters) {
            this.queryParameters = Objects.requireNonNull(queryParameters);
            return this;
        }
        public Builder queryParameters(HttpRouteQueryParameterMatchResponse... queryParameters) {
            return queryParameters(List.of(queryParameters));
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }        public HttpRouteRouteMatchResponse build() {
            return new HttpRouteRouteMatchResponse(fullPathMatch, headers, ignoreCase, prefixMatch, queryParameters, regexMatch);
        }
    }
}
