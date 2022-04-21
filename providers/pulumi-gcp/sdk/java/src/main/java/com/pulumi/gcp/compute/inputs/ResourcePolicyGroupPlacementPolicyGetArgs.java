// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePolicyGroupPlacementPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyGroupPlacementPolicyGetArgs Empty = new ResourcePolicyGroupPlacementPolicyGetArgs();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different
     * availability domain, they will not be put in the same low latency network
     * 
     */
    @Import(name="availabilityDomainCount")
    private @Nullable Output<Integer> availabilityDomainCount;

    public Optional<Output<Integer>> availabilityDomainCount() {
        return Optional.ofNullable(this.availabilityDomainCount);
    }

    /**
     * Collocation specifies whether to place VMs inside the same availability domain on the same low-latency network.
     * Specify `COLLOCATED` to enable collocation. Can only be specified with `vm_count`. If compute instances are created
     * with a COLLOCATED policy, then exactly `vm_count` instances must be created at the same time with the resource policy
     * attached.
     * Possible values are `COLLOCATED`.
     * 
     */
    @Import(name="collocation")
    private @Nullable Output<String> collocation;

    public Optional<Output<String>> collocation() {
        return Optional.ofNullable(this.collocation);
    }

    /**
     * Number of vms in this placement group.
     * 
     */
    @Import(name="vmCount")
    private @Nullable Output<Integer> vmCount;

    public Optional<Output<Integer>> vmCount() {
        return Optional.ofNullable(this.vmCount);
    }

    private ResourcePolicyGroupPlacementPolicyGetArgs() {}

    private ResourcePolicyGroupPlacementPolicyGetArgs(ResourcePolicyGroupPlacementPolicyGetArgs $) {
        this.availabilityDomainCount = $.availabilityDomainCount;
        this.collocation = $.collocation;
        this.vmCount = $.vmCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyGroupPlacementPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyGroupPlacementPolicyGetArgs $;

        public Builder() {
            $ = new ResourcePolicyGroupPlacementPolicyGetArgs();
        }

        public Builder(ResourcePolicyGroupPlacementPolicyGetArgs defaults) {
            $ = new ResourcePolicyGroupPlacementPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityDomainCount(@Nullable Output<Integer> availabilityDomainCount) {
            $.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            return availabilityDomainCount(Output.of(availabilityDomainCount));
        }

        public Builder collocation(@Nullable Output<String> collocation) {
            $.collocation = collocation;
            return this;
        }

        public Builder collocation(String collocation) {
            return collocation(Output.of(collocation));
        }

        public Builder vmCount(@Nullable Output<Integer> vmCount) {
            $.vmCount = vmCount;
            return this;
        }

        public Builder vmCount(Integer vmCount) {
            return vmCount(Output.of(vmCount));
        }

        public ResourcePolicyGroupPlacementPolicyGetArgs build() {
            return $;
        }
    }

}
