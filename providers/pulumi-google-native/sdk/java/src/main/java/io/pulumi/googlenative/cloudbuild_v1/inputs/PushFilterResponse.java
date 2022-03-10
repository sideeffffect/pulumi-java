// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Push contains filter properties for matching GitHub git pushes.
 * 
 */
public final class PushFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final PushFilterResponse Empty = new PushFilterResponse();

    /**
     * Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @InputImport(name="branch", required=true)
      private final String branch;

    public String getBranch() {
        return this.branch;
    }

    /**
     * When true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
     */
    @InputImport(name="invertRegex", required=true)
      private final Boolean invertRegex;

    public Boolean getInvertRegex() {
        return this.invertRegex;
    }

    /**
     * Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @InputImport(name="tag", required=true)
      private final String tag;

    public String getTag() {
        return this.tag;
    }

    public PushFilterResponse(
        String branch,
        Boolean invertRegex,
        String tag) {
        this.branch = Objects.requireNonNull(branch, "expected parameter 'branch' to be non-null");
        this.invertRegex = Objects.requireNonNull(invertRegex, "expected parameter 'invertRegex' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private PushFilterResponse() {
        this.branch = null;
        this.invertRegex = null;
        this.tag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private Boolean invertRegex;
        private String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(PushFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.invertRegex = defaults.invertRegex;
    	      this.tag = defaults.tag;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }

        public Builder invertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }

        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public PushFilterResponse build() {
            return new PushFilterResponse(branch, invertRegex, tag);
        }
    }
}
