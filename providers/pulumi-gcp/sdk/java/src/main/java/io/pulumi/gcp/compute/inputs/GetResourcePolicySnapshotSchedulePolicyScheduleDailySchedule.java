// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule Empty = new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule();

    @Import(name="daysInCycle", required=true)
      private final Integer daysInCycle;

    public Integer daysInCycle() {
        return this.daysInCycle;
    }

    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    public GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(
        Integer daysInCycle,
        String startTime) {
        this.daysInCycle = Objects.requireNonNull(daysInCycle, "expected parameter 'daysInCycle' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule() {
        this.daysInCycle = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer daysInCycle;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder daysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(daysInCycle, startTime);
        }
    }
}
