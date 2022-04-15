// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFromTemplateNetworkInterfaceAliasIpRange {
    private final String ipCidrRange;
    private final @Nullable String subnetworkRangeName;

    @CustomType.Constructor
    private InstanceFromTemplateNetworkInterfaceAliasIpRange(
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("subnetworkRangeName") @Nullable String subnetworkRangeName) {
        this.ipCidrRange = ipCidrRange;
        this.subnetworkRangeName = subnetworkRangeName;
    }

    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    public Optional<String> subnetworkRangeName() {
        return Optional.ofNullable(this.subnetworkRangeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private @Nullable String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder subnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }        public InstanceFromTemplateNetworkInterfaceAliasIpRange build() {
            return new InstanceFromTemplateNetworkInterfaceAliasIpRange(ipCidrRange, subnetworkRangeName);
        }
    }
}
