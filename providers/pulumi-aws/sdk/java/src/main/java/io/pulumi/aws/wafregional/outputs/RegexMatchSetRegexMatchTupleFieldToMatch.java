// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegexMatchSetRegexMatchTupleFieldToMatch {
    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
     */
    private final @Nullable String data;
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RegexMatchSetRegexMatchTupleFieldToMatch(
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("type") String type) {
        this.data = data;
        this.type = type;
    }

    /**
     * When `type` is `HEADER`, enter the name of the header that you want to search, e.g., `User-Agent` or `Referer`.
     * If `type` is any other value, omit this field.
     * 
    */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * The part of the web request that you want AWS WAF to search for a specified string.
     * e.g., `HEADER`, `METHOD` or `BODY`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_FieldToMatch.html)
     * for all supported values.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTupleFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetRegexMatchTupleFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RegexMatchSetRegexMatchTupleFieldToMatch build() {
            return new RegexMatchSetRegexMatchTupleFieldToMatch(data, type);
        }
    }
}
