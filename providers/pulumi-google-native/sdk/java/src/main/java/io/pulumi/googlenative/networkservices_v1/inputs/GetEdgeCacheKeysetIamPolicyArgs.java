// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEdgeCacheKeysetIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEdgeCacheKeysetIamPolicyArgs Empty = new GetEdgeCacheKeysetIamPolicyArgs();

    @InputImport(name="edgeCacheKeysetId", required=true)
      private final String edgeCacheKeysetId;

    public String getEdgeCacheKeysetId() {
        return this.edgeCacheKeysetId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetEdgeCacheKeysetIamPolicyArgs(
        String edgeCacheKeysetId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.edgeCacheKeysetId = Objects.requireNonNull(edgeCacheKeysetId, "expected parameter 'edgeCacheKeysetId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetEdgeCacheKeysetIamPolicyArgs() {
        this.edgeCacheKeysetId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEdgeCacheKeysetIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String edgeCacheKeysetId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEdgeCacheKeysetIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCacheKeysetId = defaults.edgeCacheKeysetId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder edgeCacheKeysetId(String edgeCacheKeysetId) {
            this.edgeCacheKeysetId = Objects.requireNonNull(edgeCacheKeysetId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetEdgeCacheKeysetIamPolicyArgs build() {
            return new GetEdgeCacheKeysetIamPolicyArgs(edgeCacheKeysetId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
