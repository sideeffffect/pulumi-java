// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCapacityReservationSpecificationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCapacityReservationSpecificationGetArgs Empty = new SpotInstanceRequestCapacityReservationSpecificationGetArgs();

    /**
     * Indicates the instance&#39;s Capacity Reservation preferences. Can be `&#34;open&#34;` or `&#34;none&#34;`. (Default: `&#34;open&#34;`).
     * 
     */
    @Import(name="capacityReservationPreference")
    private @Nullable Output<String> capacityReservationPreference;

    public Optional<Output<String>> capacityReservationPreference() {
        return Optional.ofNullable(this.capacityReservationPreference);
    }

    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    @Import(name="capacityReservationTarget")
    private @Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget;

    public Optional<Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetGetArgs>> capacityReservationTarget() {
        return Optional.ofNullable(this.capacityReservationTarget);
    }

    private SpotInstanceRequestCapacityReservationSpecificationGetArgs() {}

    private SpotInstanceRequestCapacityReservationSpecificationGetArgs(SpotInstanceRequestCapacityReservationSpecificationGetArgs $) {
        this.capacityReservationPreference = $.capacityReservationPreference;
        this.capacityReservationTarget = $.capacityReservationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotInstanceRequestCapacityReservationSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotInstanceRequestCapacityReservationSpecificationGetArgs $;

        public Builder() {
            $ = new SpotInstanceRequestCapacityReservationSpecificationGetArgs();
        }

        public Builder(SpotInstanceRequestCapacityReservationSpecificationGetArgs defaults) {
            $ = new SpotInstanceRequestCapacityReservationSpecificationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationPreference(@Nullable Output<String> capacityReservationPreference) {
            $.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        public Builder capacityReservationPreference(String capacityReservationPreference) {
            return capacityReservationPreference(Output.of(capacityReservationPreference));
        }

        public Builder capacityReservationTarget(@Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget) {
            $.capacityReservationTarget = capacityReservationTarget;
            return this;
        }

        public Builder capacityReservationTarget(SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetGetArgs capacityReservationTarget) {
            return capacityReservationTarget(Output.of(capacityReservationTarget));
        }

        public SpotInstanceRequestCapacityReservationSpecificationGetArgs build() {
            return $;
        }
    }

}
