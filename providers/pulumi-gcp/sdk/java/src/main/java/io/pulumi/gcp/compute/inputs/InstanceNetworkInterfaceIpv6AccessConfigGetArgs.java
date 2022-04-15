// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceIpv6AccessConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceIpv6AccessConfigGetArgs Empty = new InstanceNetworkInterfaceIpv6AccessConfigGetArgs();

    @Import(name="externalIpv6")
      private final @Nullable Output<String> externalIpv6;

    public Output<String> externalIpv6() {
        return this.externalIpv6 == null ? Codegen.empty() : this.externalIpv6;
    }

    @Import(name="externalIpv6PrefixLength")
      private final @Nullable Output<String> externalIpv6PrefixLength;

    public Output<String> externalIpv6PrefixLength() {
        return this.externalIpv6PrefixLength == null ? Codegen.empty() : this.externalIpv6PrefixLength;
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM tier is valid for IPv6.
     * 
     */
    @Import(name="networkTier", required=true)
      private final Output<String> networkTier;

    public Output<String> networkTier() {
        return this.networkTier;
    }

    /**
     * The domain name to be used when creating DNSv6
     * records for the external IPv6 ranges..
     * 
     */
    @Import(name="publicPtrDomainName")
      private final @Nullable Output<String> publicPtrDomainName;

    public Output<String> publicPtrDomainName() {
        return this.publicPtrDomainName == null ? Codegen.empty() : this.publicPtrDomainName;
    }

    public InstanceNetworkInterfaceIpv6AccessConfigGetArgs(
        @Nullable Output<String> externalIpv6,
        @Nullable Output<String> externalIpv6PrefixLength,
        Output<String> networkTier,
        @Nullable Output<String> publicPtrDomainName) {
        this.externalIpv6 = externalIpv6;
        this.externalIpv6PrefixLength = externalIpv6PrefixLength;
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = publicPtrDomainName;
    }

    private InstanceNetworkInterfaceIpv6AccessConfigGetArgs() {
        this.externalIpv6 = Codegen.empty();
        this.externalIpv6PrefixLength = Codegen.empty();
        this.networkTier = Codegen.empty();
        this.publicPtrDomainName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceIpv6AccessConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> externalIpv6;
        private @Nullable Output<String> externalIpv6PrefixLength;
        private Output<String> networkTier;
        private @Nullable Output<String> publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceIpv6AccessConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIpv6 = defaults.externalIpv6;
    	      this.externalIpv6PrefixLength = defaults.externalIpv6PrefixLength;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder externalIpv6(@Nullable Output<String> externalIpv6) {
            this.externalIpv6 = externalIpv6;
            return this;
        }
        public Builder externalIpv6(@Nullable String externalIpv6) {
            this.externalIpv6 = Codegen.ofNullable(externalIpv6);
            return this;
        }
        public Builder externalIpv6PrefixLength(@Nullable Output<String> externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = externalIpv6PrefixLength;
            return this;
        }
        public Builder externalIpv6PrefixLength(@Nullable String externalIpv6PrefixLength) {
            this.externalIpv6PrefixLength = Codegen.ofNullable(externalIpv6PrefixLength);
            return this;
        }
        public Builder networkTier(Output<String> networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        public Builder networkTier(String networkTier) {
            this.networkTier = Output.of(Objects.requireNonNull(networkTier));
            return this;
        }
        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            this.publicPtrDomainName = publicPtrDomainName;
            return this;
        }
        public Builder publicPtrDomainName(@Nullable String publicPtrDomainName) {
            this.publicPtrDomainName = Codegen.ofNullable(publicPtrDomainName);
            return this;
        }        public InstanceNetworkInterfaceIpv6AccessConfigGetArgs build() {
            return new InstanceNetworkInterfaceIpv6AccessConfigGetArgs(externalIpv6, externalIpv6PrefixLength, networkTier, publicPtrDomainName);
        }
    }
}
