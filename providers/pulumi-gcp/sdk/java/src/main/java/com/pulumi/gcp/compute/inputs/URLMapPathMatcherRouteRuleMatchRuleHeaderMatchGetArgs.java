// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs Empty = new URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    @Import(name="exactMatch")
    private @Nullable Output<String> exactMatch;

    public Optional<Output<String>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    /**
     * The name of the header to add.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    @Import(name="invertMatch")
    private @Nullable Output<Boolean> invertMatch;

    public Optional<Output<Boolean>> invertMatch() {
        return Optional.ofNullable(this.invertMatch);
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    @Import(name="presentMatch")
    private @Nullable Output<Boolean> presentMatch;

    public Optional<Output<Boolean>> presentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }

    /**
     * The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]   - -3 will match.  - 0 will
     * not match.  - 0.25 will not match.  - -3someString will not match.   Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="rangeMatch")
    private @Nullable Output<URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch;

    public Optional<Output<URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs>> rangeMatch() {
        return Optional.ofNullable(this.rangeMatch);
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    @Import(name="regexMatch")
    private @Nullable Output<String> regexMatch;

    public Optional<Output<String>> regexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="suffixMatch")
    private @Nullable Output<String> suffixMatch;

    public Optional<Output<String>> suffixMatch() {
        return Optional.ofNullable(this.suffixMatch);
    }

    private URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs() {}

    private URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs $) {
        this.exactMatch = $.exactMatch;
        this.headerName = $.headerName;
        this.invertMatch = $.invertMatch;
        this.prefixMatch = $.prefixMatch;
        this.presentMatch = $.presentMatch;
        this.rangeMatch = $.rangeMatch;
        this.regexMatch = $.regexMatch;
        this.suffixMatch = $.suffixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(String exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            $.invertMatch = invertMatch;
            return this;
        }

        public Builder invertMatch(Boolean invertMatch) {
            return invertMatch(Output.of(invertMatch));
        }

        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            $.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(Boolean presentMatch) {
            return presentMatch(Output.of(presentMatch));
        }

        public Builder rangeMatch(@Nullable Output<URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch) {
            $.rangeMatch = rangeMatch;
            return this;
        }

        public Builder rangeMatch(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs rangeMatch) {
            return rangeMatch(Output.of(rangeMatch));
        }

        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        public Builder regexMatch(String regexMatch) {
            return regexMatch(Output.of(regexMatch));
        }

        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            $.suffixMatch = suffixMatch;
            return this;
        }

        public Builder suffixMatch(String suffixMatch) {
            return suffixMatch(Output.of(suffixMatch));
        }

        public URLMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            return $;
        }
    }

}
