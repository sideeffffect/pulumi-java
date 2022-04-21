// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HsmState extends com.pulumi.resources.ResourceArgs {

    public static final HsmState Empty = new HsmState();

    /**
     * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The ID of Cloud HSM v2 cluster to which HSM will be added.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The id of the ENI interface allocated for HSM module.
     * 
     */
    @Import(name="hsmEniId")
    private @Nullable Output<String> hsmEniId;

    public Optional<Output<String>> hsmEniId() {
        return Optional.ofNullable(this.hsmEniId);
    }

    /**
     * The id of the HSM module.
     * 
     */
    @Import(name="hsmId")
    private @Nullable Output<String> hsmId;

    public Optional<Output<String>> hsmId() {
        return Optional.ofNullable(this.hsmId);
    }

    /**
     * The state of the HSM module.
     * 
     */
    @Import(name="hsmState")
    private @Nullable Output<String> hsmState;

    public Optional<Output<String>> hsmState() {
        return Optional.ofNullable(this.hsmState);
    }

    /**
     * The IP address of HSM module. Must be within the CIDR of selected subnet.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The ID of subnet in which HSM module will be located.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private HsmState() {}

    private HsmState(HsmState $) {
        this.availabilityZone = $.availabilityZone;
        this.clusterId = $.clusterId;
        this.hsmEniId = $.hsmEniId;
        this.hsmId = $.hsmId;
        this.hsmState = $.hsmState;
        this.ipAddress = $.ipAddress;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HsmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HsmState $;

        public Builder() {
            $ = new HsmState();
        }

        public Builder(HsmState defaults) {
            $ = new HsmState(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder hsmEniId(@Nullable Output<String> hsmEniId) {
            $.hsmEniId = hsmEniId;
            return this;
        }

        public Builder hsmEniId(String hsmEniId) {
            return hsmEniId(Output.of(hsmEniId));
        }

        public Builder hsmId(@Nullable Output<String> hsmId) {
            $.hsmId = hsmId;
            return this;
        }

        public Builder hsmId(String hsmId) {
            return hsmId(Output.of(hsmId));
        }

        public Builder hsmState(@Nullable Output<String> hsmState) {
            $.hsmState = hsmState;
            return this;
        }

        public Builder hsmState(String hsmState) {
            return hsmState(Output.of(hsmState));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public HsmState build() {
            return $;
        }
    }

}
