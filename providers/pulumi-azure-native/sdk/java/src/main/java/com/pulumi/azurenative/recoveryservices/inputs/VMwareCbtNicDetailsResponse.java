// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt NIC details.
 * 
 */
public final class VMwareCbtNicDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMwareCbtNicDetailsResponse Empty = new VMwareCbtNicDetailsResponse();

    /**
     * A value indicating whether this is the primary NIC.
     * 
     */
    @Import(name="isPrimaryNic")
    private @Nullable String isPrimaryNic;

    public Optional<String> isPrimaryNic() {
        return Optional.ofNullable(this.isPrimaryNic);
    }

    /**
     * A value indicating whether this NIC is selected for migration.
     * 
     */
    @Import(name="isSelectedForMigration")
    private @Nullable String isSelectedForMigration;

    public Optional<String> isSelectedForMigration() {
        return Optional.ofNullable(this.isSelectedForMigration);
    }

    /**
     * The NIC Id.
     * 
     */
    @Import(name="nicId", required=true)
    private String nicId;

    public String nicId() {
        return this.nicId;
    }

    /**
     * The source IP address.
     * 
     */
    @Import(name="sourceIPAddress", required=true)
    private String sourceIPAddress;

    public String sourceIPAddress() {
        return this.sourceIPAddress;
    }

    /**
     * The source IP address type.
     * 
     */
    @Import(name="sourceIPAddressType", required=true)
    private String sourceIPAddressType;

    public String sourceIPAddressType() {
        return this.sourceIPAddressType;
    }

    /**
     * Source network Id.
     * 
     */
    @Import(name="sourceNetworkId", required=true)
    private String sourceNetworkId;

    public String sourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * The target IP address.
     * 
     */
    @Import(name="targetIPAddress")
    private @Nullable String targetIPAddress;

    public Optional<String> targetIPAddress() {
        return Optional.ofNullable(this.targetIPAddress);
    }

    /**
     * The target IP address type.
     * 
     */
    @Import(name="targetIPAddressType")
    private @Nullable String targetIPAddressType;

    public Optional<String> targetIPAddressType() {
        return Optional.ofNullable(this.targetIPAddressType);
    }

    /**
     * Target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
    private @Nullable String targetSubnetName;

    public Optional<String> targetSubnetName() {
        return Optional.ofNullable(this.targetSubnetName);
    }

    private VMwareCbtNicDetailsResponse() {}

    private VMwareCbtNicDetailsResponse(VMwareCbtNicDetailsResponse $) {
        this.isPrimaryNic = $.isPrimaryNic;
        this.isSelectedForMigration = $.isSelectedForMigration;
        this.nicId = $.nicId;
        this.sourceIPAddress = $.sourceIPAddress;
        this.sourceIPAddressType = $.sourceIPAddressType;
        this.sourceNetworkId = $.sourceNetworkId;
        this.targetIPAddress = $.targetIPAddress;
        this.targetIPAddressType = $.targetIPAddressType;
        this.targetSubnetName = $.targetSubnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareCbtNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareCbtNicDetailsResponse $;

        public Builder() {
            $ = new VMwareCbtNicDetailsResponse();
        }

        public Builder(VMwareCbtNicDetailsResponse defaults) {
            $ = new VMwareCbtNicDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder isPrimaryNic(@Nullable String isPrimaryNic) {
            $.isPrimaryNic = isPrimaryNic;
            return this;
        }

        public Builder isSelectedForMigration(@Nullable String isSelectedForMigration) {
            $.isSelectedForMigration = isSelectedForMigration;
            return this;
        }

        public Builder nicId(String nicId) {
            $.nicId = nicId;
            return this;
        }

        public Builder sourceIPAddress(String sourceIPAddress) {
            $.sourceIPAddress = sourceIPAddress;
            return this;
        }

        public Builder sourceIPAddressType(String sourceIPAddressType) {
            $.sourceIPAddressType = sourceIPAddressType;
            return this;
        }

        public Builder sourceNetworkId(String sourceNetworkId) {
            $.sourceNetworkId = sourceNetworkId;
            return this;
        }

        public Builder targetIPAddress(@Nullable String targetIPAddress) {
            $.targetIPAddress = targetIPAddress;
            return this;
        }

        public Builder targetIPAddressType(@Nullable String targetIPAddressType) {
            $.targetIPAddressType = targetIPAddressType;
            return this;
        }

        public Builder targetSubnetName(@Nullable String targetSubnetName) {
            $.targetSubnetName = targetSubnetName;
            return this;
        }

        public VMwareCbtNicDetailsResponse build() {
            $.nicId = Objects.requireNonNull($.nicId, "expected parameter 'nicId' to be non-null");
            $.sourceIPAddress = Objects.requireNonNull($.sourceIPAddress, "expected parameter 'sourceIPAddress' to be non-null");
            $.sourceIPAddressType = Objects.requireNonNull($.sourceIPAddressType, "expected parameter 'sourceIPAddressType' to be non-null");
            $.sourceNetworkId = Objects.requireNonNull($.sourceNetworkId, "expected parameter 'sourceNetworkId' to be non-null");
            return $;
        }
    }

}
