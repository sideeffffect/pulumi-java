// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeVNetPropertiesResponse {
    /**
     * @return Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    private final @Nullable List<String> publicIPs;
    /**
     * @return The name of the subnet this integration runtime will join.
     * 
     */
    private final @Nullable String subnet;
    /**
     * @return The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * @return The ID of the VNet that this integration runtime will join.
     * 
     */
    private final @Nullable String vNetId;

    @CustomType.Constructor
    private IntegrationRuntimeVNetPropertiesResponse(
        @CustomType.Parameter("publicIPs") @Nullable List<String> publicIPs,
        @CustomType.Parameter("subnet") @Nullable String subnet,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("vNetId") @Nullable String vNetId) {
        this.publicIPs = publicIPs;
        this.subnet = subnet;
        this.subnetId = subnetId;
        this.vNetId = vNetId;
    }

    /**
     * @return Resource IDs of the public IP addresses that this integration runtime will use.
     * 
     */
    public List<String> publicIPs() {
        return this.publicIPs == null ? List.of() : this.publicIPs;
    }
    /**
     * @return The name of the subnet this integration runtime will join.
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The ID of the VNet that this integration runtime will join.
     * 
     */
    public Optional<String> vNetId() {
        return Optional.ofNullable(this.vNetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeVNetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> publicIPs;
        private @Nullable String subnet;
        private @Nullable String subnetId;
        private @Nullable String vNetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeVNetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
    	      this.subnet = defaults.subnet;
    	      this.subnetId = defaults.subnetId;
    	      this.vNetId = defaults.vNetId;
        }

        public Builder publicIPs(@Nullable List<String> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }
        public Builder publicIPs(String... publicIPs) {
            return publicIPs(List.of(publicIPs));
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder vNetId(@Nullable String vNetId) {
            this.vNetId = vNetId;
            return this;
        }        public IntegrationRuntimeVNetPropertiesResponse build() {
            return new IntegrationRuntimeVNetPropertiesResponse(publicIPs, subnet, subnetId, vNetId);
        }
    }
}
