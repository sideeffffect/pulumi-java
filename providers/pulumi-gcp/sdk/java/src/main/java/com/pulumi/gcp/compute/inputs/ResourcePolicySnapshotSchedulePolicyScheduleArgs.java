// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs;
import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs;
import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();

    /**
     * The policy will execute every nth day at the specified time.
     * Structure is documented below.
     * 
     */
    @Import(name="dailySchedule")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule;

    public Output<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule() {
        return this.dailySchedule == null ? Codegen.empty() : this.dailySchedule;
    }

    /**
     * The policy will execute every nth hour starting at the specified time.
     * Structure is documented below.
     * 
     */
    @Import(name="hourlySchedule")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule;

    public Output<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule() {
        return this.hourlySchedule == null ? Codegen.empty() : this.hourlySchedule;
    }

    /**
     * Allows specifying a snapshot time for each day of the week.
     * Structure is documented below.
     * 
     */
    @Import(name="weeklySchedule")
      private final @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule;

    public Output<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule() {
        return this.weeklySchedule == null ? Codegen.empty() : this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleArgs(
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule,
        @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.hourlySchedule = hourlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleArgs() {
        this.dailySchedule = Codegen.empty();
        this.hourlySchedule = Codegen.empty();
        this.weeklySchedule = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule;
        private @Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder dailySchedule(@Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }
        public Builder dailySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs dailySchedule) {
            this.dailySchedule = Codegen.ofNullable(dailySchedule);
            return this;
        }
        public Builder hourlySchedule(@Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }
        public Builder hourlySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs hourlySchedule) {
            this.hourlySchedule = Codegen.ofNullable(hourlySchedule);
            return this;
        }
        public Builder weeklySchedule(@Nullable Output<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }
        public Builder weeklySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs weeklySchedule) {
            this.weeklySchedule = Codegen.ofNullable(weeklySchedule);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyScheduleArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleArgs(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
