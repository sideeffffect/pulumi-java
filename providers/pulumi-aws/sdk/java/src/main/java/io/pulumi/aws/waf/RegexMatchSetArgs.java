// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexMatchSetArgs Empty = new RegexMatchSetArgs();

    /**
     * The name or description of the Regex Match Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    @InputImport(name="regexMatchTuples")
      private final @Nullable Input<List<RegexMatchSetRegexMatchTupleArgs>> regexMatchTuples;

    public Input<List<RegexMatchSetRegexMatchTupleArgs>> getRegexMatchTuples() {
        return this.regexMatchTuples == null ? Input.empty() : this.regexMatchTuples;
    }

    public RegexMatchSetArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<RegexMatchSetRegexMatchTupleArgs>> regexMatchTuples) {
        this.name = name;
        this.regexMatchTuples = regexMatchTuples;
    }

    private RegexMatchSetArgs() {
        this.name = Input.empty();
        this.regexMatchTuples = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<RegexMatchSetRegexMatchTupleArgs>> regexMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regexMatchTuples = defaults.regexMatchTuples;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder regexMatchTuples(@Nullable Input<List<RegexMatchSetRegexMatchTupleArgs>> regexMatchTuples) {
            this.regexMatchTuples = regexMatchTuples;
            return this;
        }

        public Builder regexMatchTuples(@Nullable List<RegexMatchSetRegexMatchTupleArgs> regexMatchTuples) {
            this.regexMatchTuples = Input.ofNullable(regexMatchTuples);
            return this;
        }
        public RegexMatchSetArgs build() {
            return new RegexMatchSetArgs(name, regexMatchTuples);
        }
    }
}
