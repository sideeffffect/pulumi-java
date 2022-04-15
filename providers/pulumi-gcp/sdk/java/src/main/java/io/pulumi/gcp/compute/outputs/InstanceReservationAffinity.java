// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.InstanceReservationAffinitySpecificReservation;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceReservationAffinity {
    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
     */
    private final @Nullable InstanceReservationAffinitySpecificReservation specificReservation;
    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private InstanceReservationAffinity(
        @CustomType.Parameter("specificReservation") @Nullable InstanceReservationAffinitySpecificReservation specificReservation,
        @CustomType.Parameter("type") String type) {
        this.specificReservation = specificReservation;
        this.type = type;
    }

    /**
     * Specifies the label selector for the reservation to use..
     * Structure is documented below.
     * 
    */
    public Optional<InstanceReservationAffinitySpecificReservation> specificReservation() {
        return Optional.ofNullable(this.specificReservation);
    }
    /**
     * The type of reservation from which this instance can consume resources.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InstanceReservationAffinitySpecificReservation specificReservation;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservation = defaults.specificReservation;
    	      this.type = defaults.type;
        }

        public Builder specificReservation(@Nullable InstanceReservationAffinitySpecificReservation specificReservation) {
            this.specificReservation = specificReservation;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public InstanceReservationAffinity build() {
            return new InstanceReservationAffinity(specificReservation, type);
        }
    }
}
