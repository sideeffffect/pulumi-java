// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.VPCTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VPCArgs extends io.pulumi.resources.ResourceArgs {

    public static final VPCArgs Empty = new VPCArgs();

    /**
     * The primary IPv4 CIDR block for the VPC.
     * 
     */
    @InputImport(name="cidrBlock", required=true)
      private final Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. Disabled by default for nondefault VPCs.
     * 
     */
    @InputImport(name="enableDnsHostnames")
      private final @Nullable Input<Boolean> enableDnsHostnames;

    public Input<Boolean> getEnableDnsHostnames() {
        return this.enableDnsHostnames == null ? Input.empty() : this.enableDnsHostnames;
    }

    /**
     * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. Enabled by default.
     * 
     */
    @InputImport(name="enableDnsSupport")
      private final @Nullable Input<Boolean> enableDnsSupport;

    public Input<Boolean> getEnableDnsSupport() {
        return this.enableDnsSupport == null ? Input.empty() : this.enableDnsSupport;
    }

    /**
     * The allowed tenancy of instances launched into the VPC.
     * 
     * "default": An instance launched into the VPC runs on shared hardware by default, unless you explicitly specify a different tenancy during instance launch.
     * 
     * "dedicated": An instance launched into the VPC is a Dedicated Instance by default, unless you explicitly specify a tenancy of host during instance launch. You cannot specify a tenancy of default during instance launch.
     * 
     * Updating InstanceTenancy requires no replacement only if you are updating its value from "dedicated" to "default". Updating InstanceTenancy from "default" to "dedicated" requires replacement.
     * 
     */
    @InputImport(name="instanceTenancy")
      private final @Nullable Input<String> instanceTenancy;

    public Input<String> getInstanceTenancy() {
        return this.instanceTenancy == null ? Input.empty() : this.instanceTenancy;
    }

    /**
     * The tags for the VPC.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<VPCTagArgs>> tags;

    public Input<List<VPCTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VPCArgs(
        Input<String> cidrBlock,
        @Nullable Input<Boolean> enableDnsHostnames,
        @Nullable Input<Boolean> enableDnsSupport,
        @Nullable Input<String> instanceTenancy,
        @Nullable Input<List<VPCTagArgs>> tags) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.enableDnsHostnames = enableDnsHostnames;
        this.enableDnsSupport = enableDnsSupport;
        this.instanceTenancy = instanceTenancy;
        this.tags = tags;
    }

    private VPCArgs() {
        this.cidrBlock = Input.empty();
        this.enableDnsHostnames = Input.empty();
        this.enableDnsSupport = Input.empty();
        this.instanceTenancy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VPCArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidrBlock;
        private @Nullable Input<Boolean> enableDnsHostnames;
        private @Nullable Input<Boolean> enableDnsSupport;
        private @Nullable Input<String> instanceTenancy;
        private @Nullable Input<List<VPCTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VPCArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.enableDnsHostnames = defaults.enableDnsHostnames;
    	      this.enableDnsSupport = defaults.enableDnsSupport;
    	      this.instanceTenancy = defaults.instanceTenancy;
    	      this.tags = defaults.tags;
        }

        public Builder cidrBlock(Input<String> cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Input.of(Objects.requireNonNull(cidrBlock));
            return this;
        }

        public Builder enableDnsHostnames(@Nullable Input<Boolean> enableDnsHostnames) {
            this.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        public Builder enableDnsHostnames(@Nullable Boolean enableDnsHostnames) {
            this.enableDnsHostnames = Input.ofNullable(enableDnsHostnames);
            return this;
        }

        public Builder enableDnsSupport(@Nullable Input<Boolean> enableDnsSupport) {
            this.enableDnsSupport = enableDnsSupport;
            return this;
        }

        public Builder enableDnsSupport(@Nullable Boolean enableDnsSupport) {
            this.enableDnsSupport = Input.ofNullable(enableDnsSupport);
            return this;
        }

        public Builder instanceTenancy(@Nullable Input<String> instanceTenancy) {
            this.instanceTenancy = instanceTenancy;
            return this;
        }

        public Builder instanceTenancy(@Nullable String instanceTenancy) {
            this.instanceTenancy = Input.ofNullable(instanceTenancy);
            return this;
        }

        public Builder tags(@Nullable Input<List<VPCTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<VPCTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public VPCArgs build() {
            return new VPCArgs(cidrBlock, enableDnsHostnames, enableDnsSupport, instanceTenancy, tags);
        }
    }
}
