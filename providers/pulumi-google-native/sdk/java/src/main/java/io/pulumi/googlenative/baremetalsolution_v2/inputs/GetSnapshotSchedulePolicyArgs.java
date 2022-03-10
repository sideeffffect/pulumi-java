// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotSchedulePolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotSchedulePolicyArgs Empty = new GetSnapshotSchedulePolicyArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="snapshotSchedulePolicyId", required=true)
      private final String snapshotSchedulePolicyId;

    public String getSnapshotSchedulePolicyId() {
        return this.snapshotSchedulePolicyId;
    }

    public GetSnapshotSchedulePolicyArgs(
        String location,
        @Nullable String project,
        String snapshotSchedulePolicyId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.snapshotSchedulePolicyId = Objects.requireNonNull(snapshotSchedulePolicyId, "expected parameter 'snapshotSchedulePolicyId' to be non-null");
    }

    private GetSnapshotSchedulePolicyArgs() {
        this.location = null;
        this.project = null;
        this.snapshotSchedulePolicyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String snapshotSchedulePolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.snapshotSchedulePolicyId = defaults.snapshotSchedulePolicyId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder snapshotSchedulePolicyId(String snapshotSchedulePolicyId) {
            this.snapshotSchedulePolicyId = Objects.requireNonNull(snapshotSchedulePolicyId);
            return this;
        }
        public GetSnapshotSchedulePolicyArgs build() {
            return new GetSnapshotSchedulePolicyArgs(location, project, snapshotSchedulePolicyId);
        }
    }
}
