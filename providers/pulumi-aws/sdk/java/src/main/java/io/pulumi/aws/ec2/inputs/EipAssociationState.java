// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EipAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final EipAssociationState Empty = new EipAssociationState();

    /**
     * The allocation ID. This is required for EC2-VPC.
     * 
     */
    @Import(name="allocationId")
      private final @Nullable Output<String> allocationId;

    public Output<String> allocationId() {
        return this.allocationId == null ? Codegen.empty() : this.allocationId;
    }

    /**
     * Whether to allow an Elastic IP to
     * be re-associated. Defaults to `true` in VPC.
     * 
     */
    @Import(name="allowReassociation")
      private final @Nullable Output<Boolean> allowReassociation;

    public Output<Boolean> allowReassociation() {
        return this.allowReassociation == null ? Codegen.empty() : this.allowReassociation;
    }

    /**
     * The ID of the instance. This is required for
     * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
     * network interface ID, but not both. The operation fails if you specify an
     * instance ID unless exactly one network interface is attached.
     * 
     */
    @Import(name="instanceId")
      private final @Nullable Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId == null ? Codegen.empty() : this.instanceId;
    }

    /**
     * The ID of the network interface. If the
     * instance has more than one network interface, you must specify a network
     * interface ID.
     * 
     */
    @Import(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId == null ? Codegen.empty() : this.networkInterfaceId;
    }

    /**
     * The primary or secondary private IP address
     * to associate with the Elastic IP address. If no private IP address is
     * specified, the Elastic IP address is associated with the primary private IP
     * address.
     * 
     */
    @Import(name="privateIpAddress")
      private final @Nullable Output<String> privateIpAddress;

    public Output<String> privateIpAddress() {
        return this.privateIpAddress == null ? Codegen.empty() : this.privateIpAddress;
    }

    /**
     * The Elastic IP address. This is required for EC2-Classic.
     * 
     */
    @Import(name="publicIp")
      private final @Nullable Output<String> publicIp;

    public Output<String> publicIp() {
        return this.publicIp == null ? Codegen.empty() : this.publicIp;
    }

    public EipAssociationState(
        @Nullable Output<String> allocationId,
        @Nullable Output<Boolean> allowReassociation,
        @Nullable Output<String> instanceId,
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<String> privateIpAddress,
        @Nullable Output<String> publicIp) {
        this.allocationId = allocationId;
        this.allowReassociation = allowReassociation;
        this.instanceId = instanceId;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIpAddress = privateIpAddress;
        this.publicIp = publicIp;
    }

    private EipAssociationState() {
        this.allocationId = Codegen.empty();
        this.allowReassociation = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
        this.privateIpAddress = Codegen.empty();
        this.publicIp = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EipAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationId;
        private @Nullable Output<Boolean> allowReassociation;
        private @Nullable Output<String> instanceId;
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<String> privateIpAddress;
        private @Nullable Output<String> publicIp;

        public Builder() {
    	      // Empty
        }

        public Builder(EipAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.allowReassociation = defaults.allowReassociation;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIp = defaults.publicIp;
        }

        public Builder allocationId(@Nullable Output<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public Builder allocationId(@Nullable String allocationId) {
            this.allocationId = Codegen.ofNullable(allocationId);
            return this;
        }
        public Builder allowReassociation(@Nullable Output<Boolean> allowReassociation) {
            this.allowReassociation = allowReassociation;
            return this;
        }
        public Builder allowReassociation(@Nullable Boolean allowReassociation) {
            this.allowReassociation = Codegen.ofNullable(allowReassociation);
            return this;
        }
        public Builder instanceId(@Nullable Output<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Codegen.ofNullable(instanceId);
            return this;
        }
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Codegen.ofNullable(networkInterfaceId);
            return this;
        }
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Codegen.ofNullable(privateIpAddress);
            return this;
        }
        public Builder publicIp(@Nullable Output<String> publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public Builder publicIp(@Nullable String publicIp) {
            this.publicIp = Codegen.ofNullable(publicIp);
            return this;
        }        public EipAssociationState build() {
            return new EipAssociationState(allocationId, allowReassociation, instanceId, networkInterfaceId, privateIpAddress, publicIp);
        }
    }
}
