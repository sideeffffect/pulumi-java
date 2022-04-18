// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkerPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkerPoolArgs Empty = new GetWorkerPoolArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="workerPoolId", required=true)
      private final String workerPoolId;

    public String workerPoolId() {
        return this.workerPoolId;
    }

    public GetWorkerPoolArgs(
        @Nullable String project,
        String workerPoolId) {
        this.project = project;
        this.workerPoolId = Objects.requireNonNull(workerPoolId, "expected parameter 'workerPoolId' to be non-null");
    }

    private GetWorkerPoolArgs() {
        this.project = null;
        this.workerPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String workerPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.workerPoolId = defaults.workerPoolId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder workerPoolId(String workerPoolId) {
            this.workerPoolId = Objects.requireNonNull(workerPoolId);
            return this;
        }        public GetWorkerPoolArgs build() {
            return new GetWorkerPoolArgs(project, workerPoolId);
        }
    }
}
