// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerGithubPushArgs extends ResourceArgs {

    public static final TriggerGithubPushArgs Empty = new TriggerGithubPushArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
    private @Nullable Output<Boolean> invertRegex;

    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Optional<Output<Boolean>> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }

    /**
     * Regex of tags to match.  Specify only one of branch or tag.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Regex of tags to match.  Specify only one of branch or tag.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private TriggerGithubPushArgs() {}

    private TriggerGithubPushArgs(TriggerGithubPushArgs $) {
        this.branch = $.branch;
        this.invertRegex = $.invertRegex;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerGithubPushArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerGithubPushArgs $;

        public Builder() {
            $ = new TriggerGithubPushArgs();
        }

        public Builder(TriggerGithubPushArgs defaults) {
            $ = new TriggerGithubPushArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch Regex of branches to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch Regex of branches to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            $.invertRegex = invertRegex;
            return this;
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(Boolean invertRegex) {
            return invertRegex(Output.of(invertRegex));
        }

        /**
         * @param tag Regex of tags to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Regex of tags to match.  Specify only one of branch or tag.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public TriggerGithubPushArgs build() {
            return $;
        }
    }

}
