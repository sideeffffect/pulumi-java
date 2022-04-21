// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchTemplateCapacityReservationSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateCapacityReservationSpecificationArgs Empty = new LaunchTemplateCapacityReservationSpecificationArgs();

    /**
     * Indicates the instance&#39;s Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
     * 
     */
    @Import(name="capacityReservationPreference")
    private @Nullable Output<String> capacityReservationPreference;

    public Optional<Output<String>> capacityReservationPreference() {
        return Optional.ofNullable(this.capacityReservationPreference);
    }

    /**
     * Used to target a specific Capacity Reservation:
     * 
     */
    @Import(name="capacityReservationTarget")
    private @Nullable Output<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget;

    public Optional<Output<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs>> capacityReservationTarget() {
        return Optional.ofNullable(this.capacityReservationTarget);
    }

    private LaunchTemplateCapacityReservationSpecificationArgs() {}

    private LaunchTemplateCapacityReservationSpecificationArgs(LaunchTemplateCapacityReservationSpecificationArgs $) {
        this.capacityReservationPreference = $.capacityReservationPreference;
        this.capacityReservationTarget = $.capacityReservationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchTemplateCapacityReservationSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchTemplateCapacityReservationSpecificationArgs $;

        public Builder() {
            $ = new LaunchTemplateCapacityReservationSpecificationArgs();
        }

        public Builder(LaunchTemplateCapacityReservationSpecificationArgs defaults) {
            $ = new LaunchTemplateCapacityReservationSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationPreference(@Nullable Output<String> capacityReservationPreference) {
            $.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        public Builder capacityReservationPreference(String capacityReservationPreference) {
            return capacityReservationPreference(Output.of(capacityReservationPreference));
        }

        public Builder capacityReservationTarget(@Nullable Output<LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget) {
            $.capacityReservationTarget = capacityReservationTarget;
            return this;
        }

        public Builder capacityReservationTarget(LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetArgs capacityReservationTarget) {
            return capacityReservationTarget(Output.of(capacityReservationTarget));
        }

        public LaunchTemplateCapacityReservationSpecificationArgs build() {
            return $;
        }
    }

}
