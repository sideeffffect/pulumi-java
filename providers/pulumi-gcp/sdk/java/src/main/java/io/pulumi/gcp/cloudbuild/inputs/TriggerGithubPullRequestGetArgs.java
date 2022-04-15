// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerGithubPullRequestGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerGithubPullRequestGetArgs Empty = new TriggerGithubPullRequestGetArgs();

    /**
     * Regex of branches to match.  Specify only one of branch or tag.
     * 
     */
    @Import(name="branch", required=true)
      private final Output<String> branch;

    public Output<String> branch() {
        return this.branch;
    }

    /**
     * Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
     * Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
     * 
     */
    @Import(name="commentControl")
      private final @Nullable Output<String> commentControl;

    public Output<String> commentControl() {
        return this.commentControl == null ? Codegen.empty() : this.commentControl;
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
      private final @Nullable Output<Boolean> invertRegex;

    public Output<Boolean> invertRegex() {
        return this.invertRegex == null ? Codegen.empty() : this.invertRegex;
    }

    public TriggerGithubPullRequestGetArgs(
        Output<String> branch,
        @Nullable Output<String> commentControl,
        @Nullable Output<Boolean> invertRegex) {
        this.branch = Objects.requireNonNull(branch, "expected parameter 'branch' to be non-null");
        this.commentControl = commentControl;
        this.invertRegex = invertRegex;
    }

    private TriggerGithubPullRequestGetArgs() {
        this.branch = Codegen.empty();
        this.commentControl = Codegen.empty();
        this.invertRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerGithubPullRequestGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> branch;
        private @Nullable Output<String> commentControl;
        private @Nullable Output<Boolean> invertRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerGithubPullRequestGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.commentControl = defaults.commentControl;
    	      this.invertRegex = defaults.invertRegex;
        }

        public Builder branch(Output<String> branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder branch(String branch) {
            this.branch = Output.of(Objects.requireNonNull(branch));
            return this;
        }
        public Builder commentControl(@Nullable Output<String> commentControl) {
            this.commentControl = commentControl;
            return this;
        }
        public Builder commentControl(@Nullable String commentControl) {
            this.commentControl = Codegen.ofNullable(commentControl);
            return this;
        }
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            this.invertRegex = invertRegex;
            return this;
        }
        public Builder invertRegex(@Nullable Boolean invertRegex) {
            this.invertRegex = Codegen.ofNullable(invertRegex);
            return this;
        }        public TriggerGithubPullRequestGetArgs build() {
            return new TriggerGithubPullRequestGetArgs(branch, commentControl, invertRegex);
        }
    }
}
