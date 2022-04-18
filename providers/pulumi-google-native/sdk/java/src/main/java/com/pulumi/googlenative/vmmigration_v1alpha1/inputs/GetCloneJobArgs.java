// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloneJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloneJobArgs Empty = new GetCloneJobArgs();

    @Import(name="cloneJobId", required=true)
      private final String cloneJobId;

    public String cloneJobId() {
        return this.cloneJobId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
      private final String migratingVmId;

    public String migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
      private final String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    public GetCloneJobArgs(
        String cloneJobId,
        String location,
        String migratingVmId,
        @Nullable String project,
        String sourceId) {
        this.cloneJobId = Objects.requireNonNull(cloneJobId, "expected parameter 'cloneJobId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.migratingVmId = Objects.requireNonNull(migratingVmId, "expected parameter 'migratingVmId' to be non-null");
        this.project = project;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
    }

    private GetCloneJobArgs() {
        this.cloneJobId = null;
        this.location = null;
        this.migratingVmId = null;
        this.project = null;
        this.sourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloneJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloneJobId;
        private String location;
        private String migratingVmId;
        private @Nullable String project;
        private String sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloneJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloneJobId = defaults.cloneJobId;
    	      this.location = defaults.location;
    	      this.migratingVmId = defaults.migratingVmId;
    	      this.project = defaults.project;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder cloneJobId(String cloneJobId) {
            this.cloneJobId = Objects.requireNonNull(cloneJobId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder migratingVmId(String migratingVmId) {
            this.migratingVmId = Objects.requireNonNull(migratingVmId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }        public GetCloneJobArgs build() {
            return new GetCloneJobArgs(cloneJobId, location, migratingVmId, project, sourceId);
        }
    }
}
