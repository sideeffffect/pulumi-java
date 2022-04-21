// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a secondary IP range of a subnetwork.
 * 
 */
public final class SubnetworkSecondaryRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkSecondaryRangeArgs Empty = new SubnetworkSecondaryRangeArgs();

    /**
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    @Import(name="ipCidrRange")
    private @Nullable Output<String> ipCidrRange;

    public Optional<Output<String>> ipCidrRange() {
        return Optional.ofNullable(this.ipCidrRange);
    }

    /**
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    @Import(name="rangeName")
    private @Nullable Output<String> rangeName;

    public Optional<Output<String>> rangeName() {
        return Optional.ofNullable(this.rangeName);
    }

    private SubnetworkSecondaryRangeArgs() {}

    private SubnetworkSecondaryRangeArgs(SubnetworkSecondaryRangeArgs $) {
        this.ipCidrRange = $.ipCidrRange;
        this.rangeName = $.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkSecondaryRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkSecondaryRangeArgs $;

        public Builder() {
            $ = new SubnetworkSecondaryRangeArgs();
        }

        public Builder(SubnetworkSecondaryRangeArgs defaults) {
            $ = new SubnetworkSecondaryRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        public Builder rangeName(@Nullable Output<String> rangeName) {
            $.rangeName = rangeName;
            return this;
        }

        public Builder rangeName(String rangeName) {
            return rangeName(Output.of(rangeName));
        }

        public SubnetworkSecondaryRangeArgs build() {
            return $;
        }
    }

}
