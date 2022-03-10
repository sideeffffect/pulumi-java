// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MulticastGroupLoRaWAN {
    /**
     * Multicast group LoRaWAN DL Class
     * 
     */
    private final String dlClass;
    /**
     * Multicast group number of devices in group. Returned after successful read.
     * 
     */
    private final @Nullable Integer numberOfDevicesInGroup;
    /**
     * Multicast group number of devices requested. Returned after successful read.
     * 
     */
    private final @Nullable Integer numberOfDevicesRequested;
    /**
     * Multicast group LoRaWAN RF region
     * 
     */
    private final String rfRegion;

    @OutputCustomType.Constructor
    private MulticastGroupLoRaWAN(
        @OutputCustomType.Parameter("dlClass") String dlClass,
        @OutputCustomType.Parameter("numberOfDevicesInGroup") @Nullable Integer numberOfDevicesInGroup,
        @OutputCustomType.Parameter("numberOfDevicesRequested") @Nullable Integer numberOfDevicesRequested,
        @OutputCustomType.Parameter("rfRegion") String rfRegion) {
        this.dlClass = dlClass;
        this.numberOfDevicesInGroup = numberOfDevicesInGroup;
        this.numberOfDevicesRequested = numberOfDevicesRequested;
        this.rfRegion = rfRegion;
    }

    /**
     * Multicast group LoRaWAN DL Class
     * 
    */
    public String getDlClass() {
        return this.dlClass;
    }
    /**
     * Multicast group number of devices in group. Returned after successful read.
     * 
    */
    public Optional<Integer> getNumberOfDevicesInGroup() {
        return Optional.ofNullable(this.numberOfDevicesInGroup);
    }
    /**
     * Multicast group number of devices requested. Returned after successful read.
     * 
    */
    public Optional<Integer> getNumberOfDevicesRequested() {
        return Optional.ofNullable(this.numberOfDevicesRequested);
    }
    /**
     * Multicast group LoRaWAN RF region
     * 
    */
    public String getRfRegion() {
        return this.rfRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MulticastGroupLoRaWAN defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dlClass;
        private @Nullable Integer numberOfDevicesInGroup;
        private @Nullable Integer numberOfDevicesRequested;
        private String rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(MulticastGroupLoRaWAN defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dlClass = defaults.dlClass;
    	      this.numberOfDevicesInGroup = defaults.numberOfDevicesInGroup;
    	      this.numberOfDevicesRequested = defaults.numberOfDevicesRequested;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder dlClass(String dlClass) {
            this.dlClass = Objects.requireNonNull(dlClass);
            return this;
        }

        public Builder numberOfDevicesInGroup(@Nullable Integer numberOfDevicesInGroup) {
            this.numberOfDevicesInGroup = numberOfDevicesInGroup;
            return this;
        }

        public Builder numberOfDevicesRequested(@Nullable Integer numberOfDevicesRequested) {
            this.numberOfDevicesRequested = numberOfDevicesRequested;
            return this;
        }

        public Builder rfRegion(String rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }
        public MulticastGroupLoRaWAN build() {
            return new MulticastGroupLoRaWAN(dlClass, numberOfDevicesInGroup, numberOfDevicesRequested, rfRegion);
        }
    }
}
