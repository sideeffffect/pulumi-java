// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ProjectRepoIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A unique identifier for a Cloud Repo.
 * 
 */
public final class RepoIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepoIdArgs Empty = new RepoIdArgs();

    /**
     * A combination of a project ID and a repo name.
     * 
     */
    @InputImport(name="projectRepoId")
      private final @Nullable Input<ProjectRepoIdArgs> projectRepoId;

    public Input<ProjectRepoIdArgs> getProjectRepoId() {
        return this.projectRepoId == null ? Input.empty() : this.projectRepoId;
    }

    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public RepoIdArgs(
        @Nullable Input<ProjectRepoIdArgs> projectRepoId,
        @Nullable Input<String> uid) {
        this.projectRepoId = projectRepoId;
        this.uid = uid;
    }

    private RepoIdArgs() {
        this.projectRepoId = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ProjectRepoIdArgs> projectRepoId;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(@Nullable Input<ProjectRepoIdArgs> projectRepoId) {
            this.projectRepoId = projectRepoId;
            return this;
        }

        public Builder projectRepoId(@Nullable ProjectRepoIdArgs projectRepoId) {
            this.projectRepoId = Input.ofNullable(projectRepoId);
            return this;
        }

        public Builder uid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public RepoIdArgs build() {
            return new RepoIdArgs(projectRepoId, uid);
        }
    }
}
