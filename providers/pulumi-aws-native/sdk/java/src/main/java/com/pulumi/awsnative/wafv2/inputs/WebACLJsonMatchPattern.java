// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The pattern to look for in the JSON body.
 * 
 */
public final class WebACLJsonMatchPattern extends com.pulumi.resources.InvokeArgs {

    public static final WebACLJsonMatchPattern Empty = new WebACLJsonMatchPattern();

    /**
     * Inspect all parts of the web request's JSON body.
     * 
     */
    @Import(name="all")
      private final @Nullable Object all;

    public Optional<Object> all() {
        return this.all == null ? Optional.empty() : Optional.ofNullable(this.all);
    }

    @Import(name="includedPaths")
      private final @Nullable List<String> includedPaths;

    public List<String> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public WebACLJsonMatchPattern(
        @Nullable Object all,
        @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    private WebACLJsonMatchPattern() {
        this.all = null;
        this.includedPaths = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonMatchPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder all(@Nullable Object all) {
            this.all = all;
            return this;
        }
        public Builder includedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }        public WebACLJsonMatchPattern build() {
            return new WebACLJsonMatchPattern(all, includedPaths);
        }
    }
}
