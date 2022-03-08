// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PushFilterResponse {
    /**
     * Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String branch;
    /**
     * When true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
     */
    private final Boolean invertRegex;
    /**
     * Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    private final String tag;

    @OutputCustomType.Constructor({"branch","invertRegex","tag"})
    private PushFilterResponse(
        String branch,
        Boolean invertRegex,
        String tag) {
        this.branch = branch;
        this.invertRegex = invertRegex;
        this.tag = tag;
    }

    /**
     * Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
    */
    public String getBranch() {
        return this.branch;
    }
    /**
     * When true, only trigger a build if the revision regex does NOT match the git_ref regex.
     * 
    */
    public Boolean getInvertRegex() {
        return this.invertRegex;
    }
    /**
     * Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
    */
    public String getTag() {
        return this.tag;
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

        public Builder setBranch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }

        public Builder setInvertRegex(Boolean invertRegex) {
            this.invertRegex = Objects.requireNonNull(invertRegex);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public PushFilterResponse build() {
            return new PushFilterResponse(branch, invertRegex, tag);
        }
    }
}
