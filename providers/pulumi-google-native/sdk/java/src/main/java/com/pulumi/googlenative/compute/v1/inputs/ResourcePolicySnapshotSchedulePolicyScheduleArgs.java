// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.inputs.ResourcePolicyDailyCycleArgs;
import com.pulumi.googlenative.compute.v1.inputs.ResourcePolicyHourlyCycleArgs;
import com.pulumi.googlenative.compute.v1.inputs.ResourcePolicyWeeklyCycleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A schedule for disks where the schedueled operations are performed.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();

    @Import(name="dailySchedule")
    private @Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule;

    public Optional<Output<ResourcePolicyDailyCycleArgs>> dailySchedule() {
        return Optional.ofNullable(this.dailySchedule);
    }

    @Import(name="hourlySchedule")
    private @Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule;

    public Optional<Output<ResourcePolicyHourlyCycleArgs>> hourlySchedule() {
        return Optional.ofNullable(this.hourlySchedule);
    }

    @Import(name="weeklySchedule")
    private @Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule;

    public Optional<Output<ResourcePolicyWeeklyCycleArgs>> weeklySchedule() {
        return Optional.ofNullable(this.weeklySchedule);
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleArgs() {}

    private ResourcePolicySnapshotSchedulePolicyScheduleArgs(ResourcePolicySnapshotSchedulePolicyScheduleArgs $) {
        this.dailySchedule = $.dailySchedule;
        this.hourlySchedule = $.hourlySchedule;
        this.weeklySchedule = $.weeklySchedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyScheduleArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder dailySchedule(@Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule) {
            $.dailySchedule = dailySchedule;
            return this;
        }

        public Builder dailySchedule(ResourcePolicyDailyCycleArgs dailySchedule) {
            return dailySchedule(Output.of(dailySchedule));
        }

        public Builder hourlySchedule(@Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule) {
            $.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder hourlySchedule(ResourcePolicyHourlyCycleArgs hourlySchedule) {
            return hourlySchedule(Output.of(hourlySchedule));
        }

        public Builder weeklySchedule(@Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule) {
            $.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder weeklySchedule(ResourcePolicyWeeklyCycleArgs weeklySchedule) {
            return weeklySchedule(Output.of(weeklySchedule));
        }

        public ResourcePolicySnapshotSchedulePolicyScheduleArgs build() {
            return $;
        }
    }

}
