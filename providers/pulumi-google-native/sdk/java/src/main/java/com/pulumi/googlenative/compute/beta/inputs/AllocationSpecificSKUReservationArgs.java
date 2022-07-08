// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.inputs.AllocationSpecificSKUAllocationReservedInstancePropertiesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This reservation type allows to pre allocate specific instance configuration. Next ID: 6
 * 
 */
public final class AllocationSpecificSKUReservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUReservationArgs Empty = new AllocationSpecificSKUReservationArgs();

    /**
     * Specifies the number of resources that are allocated.
     * 
     */
    @Import(name="count")
    private @Nullable Output<String> count;

    /**
     * @return Specifies the number of resources that are allocated.
     * 
     */
    public Optional<Output<String>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The instance properties for the reservation.
     * 
     */
    @Import(name="instanceProperties")
    private @Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties;

    /**
     * @return The instance properties for the reservation.
     * 
     */
    public Optional<Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs>> instanceProperties() {
        return Optional.ofNullable(this.instanceProperties);
    }

    private AllocationSpecificSKUReservationArgs() {}

    private AllocationSpecificSKUReservationArgs(AllocationSpecificSKUReservationArgs $) {
        this.count = $.count;
        this.instanceProperties = $.instanceProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllocationSpecificSKUReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllocationSpecificSKUReservationArgs $;

        public Builder() {
            $ = new AllocationSpecificSKUReservationArgs();
        }

        public Builder(AllocationSpecificSKUReservationArgs defaults) {
            $ = new AllocationSpecificSKUReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Specifies the number of resources that are allocated.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<String> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Specifies the number of resources that are allocated.
         * 
         * @return builder
         * 
         */
        public Builder count(String count) {
            return count(Output.of(count));
        }

        /**
         * @param instanceProperties The instance properties for the reservation.
         * 
         * @return builder
         * 
         */
        public Builder instanceProperties(@Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties) {
            $.instanceProperties = instanceProperties;
            return this;
        }

        /**
         * @param instanceProperties The instance properties for the reservation.
         * 
         * @return builder
         * 
         */
        public Builder instanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs instanceProperties) {
            return instanceProperties(Output.of(instanceProperties));
        }

        public AllocationSpecificSKUReservationArgs build() {
            return $;
        }
    }

}
