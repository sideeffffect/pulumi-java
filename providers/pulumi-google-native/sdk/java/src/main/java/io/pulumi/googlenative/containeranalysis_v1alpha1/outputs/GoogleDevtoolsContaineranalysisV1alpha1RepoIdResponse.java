// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse {
    /**
     * A combination of a project ID and a repo name.
     * 
     */
    private final GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId;
    /**
     * A server-assigned, globally unique identifier.
     * 
     */
    private final String uid;

    @OutputCustomType.Constructor
    private GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse(
        @OutputCustomType.Parameter("projectRepoId") GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId,
        @OutputCustomType.Parameter("uid") String uid) {
        this.projectRepoId = projectRepoId;
        this.uid = uid;
    }

    /**
     * A combination of a project ID and a repo name.
     * 
    */
    public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse getProjectRepoId() {
        return this.projectRepoId;
    }
    /**
     * A server-assigned, globally unique identifier.
     * 
    */
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectRepoId = defaults.projectRepoId;
    	      this.uid = defaults.uid;
        }

        public Builder projectRepoId(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse projectRepoId) {
            this.projectRepoId = Objects.requireNonNull(projectRepoId);
            return this;
        }

        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1RepoIdResponse(projectRepoId, uid);
        }
    }
}
