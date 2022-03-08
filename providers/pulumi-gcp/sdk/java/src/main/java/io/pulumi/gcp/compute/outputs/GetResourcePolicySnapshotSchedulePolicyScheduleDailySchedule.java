// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule {
    private final Integer daysInCycle;
    private final String startTime;

    @OutputCustomType.Constructor({"daysInCycle","startTime"})
    private GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(
        Integer daysInCycle,
        String startTime) {
        this.daysInCycle = daysInCycle;
        this.startTime = startTime;
    }

    public Integer getDaysInCycle() {
        return this.daysInCycle;
    }
    public String getStartTime() {
        return this.startTime;
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

        public Builder setDaysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule(daysInCycle, startTime);
        }
    }
}
