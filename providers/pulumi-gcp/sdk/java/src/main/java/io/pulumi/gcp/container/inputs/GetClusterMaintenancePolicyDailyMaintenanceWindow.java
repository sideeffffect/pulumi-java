// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterMaintenancePolicyDailyMaintenanceWindow extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterMaintenancePolicyDailyMaintenanceWindow Empty = new GetClusterMaintenancePolicyDailyMaintenanceWindow();

    @Import(name="duration", required=true)
      private final String duration;

    public String duration() {
        return this.duration;
    }

    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public GetClusterMaintenancePolicyDailyMaintenanceWindow(
        String duration,
        String startTime) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private GetClusterMaintenancePolicyDailyMaintenanceWindow() {
        this.duration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMaintenancePolicyDailyMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMaintenancePolicyDailyMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetClusterMaintenancePolicyDailyMaintenanceWindow build() {
            return new GetClusterMaintenancePolicyDailyMaintenanceWindow(duration, startTime);
        }
    }
}
