// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RepoSource describes the location of the source in a Google Cloud Source Repository.
 * 
 */
public final class RepoSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepoSourceArgs Empty = new RepoSourceArgs();

    /**
     * Name of the branch to build.
     * 
     */
    @InputImport(name="branchName")
      private final @Nullable Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName == null ? Input.empty() : this.branchName;
    }

    /**
     * Explicit commit SHA to build.
     * 
     */
    @InputImport(name="commitSha")
      private final @Nullable Input<String> commitSha;

    public Input<String> getCommitSha() {
        return this.commitSha == null ? Input.empty() : this.commitSha;
    }

    /**
     * ID of the project that owns the repo.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the repo.
     * 
     */
    @InputImport(name="repoName")
      private final @Nullable Input<String> repoName;

    public Input<String> getRepoName() {
        return this.repoName == null ? Input.empty() : this.repoName;
    }

    /**
     * Name of the tag to build.
     * 
     */
    @InputImport(name="tagName")
      private final @Nullable Input<String> tagName;

    public Input<String> getTagName() {
        return this.tagName == null ? Input.empty() : this.tagName;
    }

    public RepoSourceArgs(
        @Nullable Input<String> branchName,
        @Nullable Input<String> commitSha,
        @Nullable Input<String> project,
        @Nullable Input<String> repoName,
        @Nullable Input<String> tagName) {
        this.branchName = branchName;
        this.commitSha = commitSha;
        this.project = project;
        this.repoName = repoName;
        this.tagName = tagName;
    }

    private RepoSourceArgs() {
        this.branchName = Input.empty();
        this.commitSha = Input.empty();
        this.project = Input.empty();
        this.repoName = Input.empty();
        this.tagName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branchName;
        private @Nullable Input<String> commitSha;
        private @Nullable Input<String> project;
        private @Nullable Input<String> repoName;
        private @Nullable Input<String> tagName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitSha = defaults.commitSha;
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
    	      this.tagName = defaults.tagName;
        }

        public Builder branchName(@Nullable Input<String> branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder branchName(@Nullable String branchName) {
            this.branchName = Input.ofNullable(branchName);
            return this;
        }

        public Builder commitSha(@Nullable Input<String> commitSha) {
            this.commitSha = commitSha;
            return this;
        }

        public Builder commitSha(@Nullable String commitSha) {
            this.commitSha = Input.ofNullable(commitSha);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder repoName(@Nullable Input<String> repoName) {
            this.repoName = repoName;
            return this;
        }

        public Builder repoName(@Nullable String repoName) {
            this.repoName = Input.ofNullable(repoName);
            return this;
        }

        public Builder tagName(@Nullable Input<String> tagName) {
            this.tagName = tagName;
            return this;
        }

        public Builder tagName(@Nullable String tagName) {
            this.tagName = Input.ofNullable(tagName);
            return this;
        }
        public RepoSourceArgs build() {
            return new RepoSourceArgs(branchName, commitSha, project, repoName, tagName);
        }
    }
}
