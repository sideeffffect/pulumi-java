// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegexPatternSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetArgs Empty = new RegexPatternSetArgs();

    /**
     * The name or description of the Regex Pattern Set.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
     * 
     */
    @InputImport(name="regexPatternStrings")
      private final @Nullable Input<List<String>> regexPatternStrings;

    public Input<List<String>> getRegexPatternStrings() {
        return this.regexPatternStrings == null ? Input.empty() : this.regexPatternStrings;
    }

    public RegexPatternSetArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<String>> regexPatternStrings) {
        this.name = name;
        this.regexPatternStrings = regexPatternStrings;
    }

    private RegexPatternSetArgs() {
        this.name = Input.empty();
        this.regexPatternStrings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> regexPatternStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regexPatternStrings = defaults.regexPatternStrings;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder regexPatternStrings(@Nullable Input<List<String>> regexPatternStrings) {
            this.regexPatternStrings = regexPatternStrings;
            return this;
        }

        public Builder regexPatternStrings(@Nullable List<String> regexPatternStrings) {
            this.regexPatternStrings = Input.ofNullable(regexPatternStrings);
            return this;
        }
        public RegexPatternSetArgs build() {
            return new RegexPatternSetArgs(name, regexPatternStrings);
        }
    }
}
