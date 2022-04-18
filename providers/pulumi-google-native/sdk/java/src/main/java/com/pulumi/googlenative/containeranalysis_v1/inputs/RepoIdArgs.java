// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ProjectRepoIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class RepoIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoIdArgs Empty = new RepoIdArgs();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @Import(name="projectRepoId")
      private final @Nullable Output<ProjectRepoIdArgs> projectRepoId;

    public Output<ProjectRepoIdArgs> projectRepoId() {
        return this.projectRepoId == null ? Codegen.empty() : this.projectRepoId;
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> uid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    public RepoIdArgs(
        @Nullable Output<ProjectRepoIdArgs> projectRepoId,
        @Nullable Output<String> uid) {
        this.projectRepoId = projectRepoId;
        this.uid = uid;
    }

    private RepoIdArgs() {
        this.projectRepoId = Codegen.empty();
        this.uid = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ProjectRepoIdArgs> projectRepoId;
        private @Nullable Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(@Nullable Output<ProjectRepoIdArgs> projectRepoId) {
            this.projectRepoId = projectRepoId;
            return this;
        }
        public Builder projectRepoId(@Nullable ProjectRepoIdArgs projectRepoId) {
            this.projectRepoId = Codegen.ofNullable(projectRepoId);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }        public RepoIdArgs build() {
            return new RepoIdArgs(projectRepoId, uid);
        }
    }
}
