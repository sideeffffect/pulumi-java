// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.HttpRouteHeaderMatchIntegerRangeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpRouteHeaderMatchResponse {
    /**
     * @return The value of the header should match exactly the content of exact_match.
     * 
     */
    private final String exactMatch;
    /**
     * @return The name of the HTTP header to match against.
     * 
     */
    private final String header;
    /**
     * @return If specified, the match result will be inverted before checking. Default value is set to false.
     * 
     */
    private final Boolean invertMatch;
    /**
     * @return The value of the header must start with the contents of prefix_match.
     * 
     */
    private final String prefixMatch;
    /**
     * @return A header with header_name must exist. The match takes place whether or not the header has a value.
     * 
     */
    private final Boolean presentMatch;
    /**
     * @return If specified, the rule will match if the request header value is within the range.
     * 
     */
    private final HttpRouteHeaderMatchIntegerRangeResponse rangeMatch;
    /**
     * @return The value of the header must match the regular expression specified in regex_match. For regular expression grammar, please see: https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String regexMatch;
    /**
     * @return The value of the header must end with the contents of suffix_match.
     * 
     */
    private final String suffixMatch;

    @CustomType.Constructor
    private HttpRouteHeaderMatchResponse(
        @CustomType.Parameter("exactMatch") String exactMatch,
        @CustomType.Parameter("header") String header,
        @CustomType.Parameter("invertMatch") Boolean invertMatch,
        @CustomType.Parameter("prefixMatch") String prefixMatch,
        @CustomType.Parameter("presentMatch") Boolean presentMatch,
        @CustomType.Parameter("rangeMatch") HttpRouteHeaderMatchIntegerRangeResponse rangeMatch,
        @CustomType.Parameter("regexMatch") String regexMatch,
        @CustomType.Parameter("suffixMatch") String suffixMatch) {
        this.exactMatch = exactMatch;
        this.header = header;
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.rangeMatch = rangeMatch;
        this.regexMatch = regexMatch;
        this.suffixMatch = suffixMatch;
    }

    /**
     * @return The value of the header should match exactly the content of exact_match.
     * 
     */
    public String exactMatch() {
        return this.exactMatch;
    }
    /**
     * @return The name of the HTTP header to match against.
     * 
     */
    public String header() {
        return this.header;
    }
    /**
     * @return If specified, the match result will be inverted before checking. Default value is set to false.
     * 
     */
    public Boolean invertMatch() {
        return this.invertMatch;
    }
    /**
     * @return The value of the header must start with the contents of prefix_match.
     * 
     */
    public String prefixMatch() {
        return this.prefixMatch;
    }
    /**
     * @return A header with header_name must exist. The match takes place whether or not the header has a value.
     * 
     */
    public Boolean presentMatch() {
        return this.presentMatch;
    }
    /**
     * @return If specified, the rule will match if the request header value is within the range.
     * 
     */
    public HttpRouteHeaderMatchIntegerRangeResponse rangeMatch() {
        return this.rangeMatch;
    }
    /**
     * @return The value of the header must match the regular expression specified in regex_match. For regular expression grammar, please see: https://github.com/google/re2/wiki/Syntax
     * 
     */
    public String regexMatch() {
        return this.regexMatch;
    }
    /**
     * @return The value of the header must end with the contents of suffix_match.
     * 
     */
    public String suffixMatch() {
        return this.suffixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteHeaderMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private String header;
        private Boolean invertMatch;
        private String prefixMatch;
        private Boolean presentMatch;
        private HttpRouteHeaderMatchIntegerRangeResponse rangeMatch;
        private String regexMatch;
        private String suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteHeaderMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.header = defaults.header;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder exactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }
        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder invertMatch(Boolean invertMatch) {
            this.invertMatch = Objects.requireNonNull(invertMatch);
            return this;
        }
        public Builder prefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }
        public Builder presentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }
        public Builder rangeMatch(HttpRouteHeaderMatchIntegerRangeResponse rangeMatch) {
            this.rangeMatch = Objects.requireNonNull(rangeMatch);
            return this;
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }
        public Builder suffixMatch(String suffixMatch) {
            this.suffixMatch = Objects.requireNonNull(suffixMatch);
            return this;
        }        public HttpRouteHeaderMatchResponse build() {
            return new HttpRouteHeaderMatchResponse(exactMatch, header, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
