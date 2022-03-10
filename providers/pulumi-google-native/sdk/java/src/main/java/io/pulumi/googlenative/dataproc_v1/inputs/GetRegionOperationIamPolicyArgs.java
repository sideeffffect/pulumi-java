// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionOperationIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionOperationIamPolicyArgs Empty = new GetRegionOperationIamPolicyArgs();

    @InputImport(name="operationId", required=true)
      private final String operationId;

    public String getOperationId() {
        return this.operationId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="regionId", required=true)
      private final String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public GetRegionOperationIamPolicyArgs(
        String operationId,
        @Nullable String project,
        String regionId) {
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.project = project;
        this.regionId = Objects.requireNonNull(regionId, "expected parameter 'regionId' to be non-null");
    }

    private GetRegionOperationIamPolicyArgs() {
        this.operationId = null;
        this.project = null;
        this.regionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionOperationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationId;
        private @Nullable String project;
        private String regionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionOperationIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationId = defaults.operationId;
    	      this.project = defaults.project;
    	      this.regionId = defaults.regionId;
        }

        public Builder operationId(String operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public GetRegionOperationIamPolicyArgs build() {
            return new GetRegionOperationIamPolicyArgs(operationId, project, regionId);
        }
    }
}
