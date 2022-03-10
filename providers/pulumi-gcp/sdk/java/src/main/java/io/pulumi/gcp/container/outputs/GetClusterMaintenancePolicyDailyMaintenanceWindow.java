// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMaintenancePolicyDailyMaintenanceWindow {
    private final String duration;
    private final String startTime;

    @OutputCustomType.Constructor
    private GetClusterMaintenancePolicyDailyMaintenanceWindow(
        @OutputCustomType.Parameter("duration") String duration,
        @OutputCustomType.Parameter("startTime") String startTime) {
        this.duration = duration;
        this.startTime = startTime;
    }

    public String getDuration() {
        return this.duration;
    }
    public String getStartTime() {
        return this.startTime;
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
        }
        public GetClusterMaintenancePolicyDailyMaintenanceWindow build() {
            return new GetClusterMaintenancePolicyDailyMaintenanceWindow(duration, startTime);
        }
    }
}
