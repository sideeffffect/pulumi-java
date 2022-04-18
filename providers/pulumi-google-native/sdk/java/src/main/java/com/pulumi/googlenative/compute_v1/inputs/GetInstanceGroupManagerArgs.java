// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupManagerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupManagerArgs Empty = new GetInstanceGroupManagerArgs();

    @Import(name="instanceGroupManager", required=true)
      private final String instanceGroupManager;

    public String instanceGroupManager() {
        return this.instanceGroupManager;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String zone() {
        return this.zone;
    }

    public GetInstanceGroupManagerArgs(
        String instanceGroupManager,
        @Nullable String project,
        String zone) {
        this.instanceGroupManager = Objects.requireNonNull(instanceGroupManager, "expected parameter 'instanceGroupManager' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetInstanceGroupManagerArgs() {
        this.instanceGroupManager = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceGroupManager;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManager = defaults.instanceGroupManager;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder instanceGroupManager(String instanceGroupManager) {
            this.instanceGroupManager = Objects.requireNonNull(instanceGroupManager);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetInstanceGroupManagerArgs build() {
            return new GetInstanceGroupManagerArgs(instanceGroupManager, project, zone);
        }
    }
}
