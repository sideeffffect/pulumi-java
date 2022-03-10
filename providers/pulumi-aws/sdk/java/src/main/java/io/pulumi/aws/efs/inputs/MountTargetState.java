// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MountTargetState extends io.pulumi.resources.ResourceArgs {

    public static final MountTargetState Empty = new MountTargetState();

    /**
     * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
     * 
     */
    @InputImport(name="availabilityZoneId")
      private final @Nullable Input<String> availabilityZoneId;

    public Input<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Input.empty() : this.availabilityZoneId;
    }

    /**
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * 
     */
    @InputImport(name="availabilityZoneName")
      private final @Nullable Input<String> availabilityZoneName;

    public Input<String> getAvailabilityZoneName() {
        return this.availabilityZoneName == null ? Input.empty() : this.availabilityZoneName;
    }

    /**
     * The DNS name for the EFS file system.
     * 
     */
    @InputImport(name="dnsName")
      private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @InputImport(name="fileSystemArn")
      private final @Nullable Input<String> fileSystemArn;

    public Input<String> getFileSystemArn() {
        return this.fileSystemArn == null ? Input.empty() : this.fileSystemArn;
    }

    /**
     * The ID of the file system for which the mount target is intended.
     * 
     */
    @InputImport(name="fileSystemId")
      private final @Nullable Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId == null ? Input.empty() : this.fileSystemId;
    }

    /**
     * The address (within the address range of the specified subnet) at
     * which the file system may be mounted via the mount target.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    @InputImport(name="mountTargetDnsName")
      private final @Nullable Input<String> mountTargetDnsName;

    public Input<String> getMountTargetDnsName() {
        return this.mountTargetDnsName == null ? Input.empty() : this.mountTargetDnsName;
    }

    /**
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * AWS account ID that owns the resource.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * A list of up to 5 VPC security group IDs (that must
     * be for the same VPC as subnet specified) in effect for the mount target.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The ID of the subnet to add the mount target in.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public MountTargetState(
        @Nullable Input<String> availabilityZoneId,
        @Nullable Input<String> availabilityZoneName,
        @Nullable Input<String> dnsName,
        @Nullable Input<String> fileSystemArn,
        @Nullable Input<String> fileSystemId,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> mountTargetDnsName,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<String> ownerId,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<String> subnetId) {
        this.availabilityZoneId = availabilityZoneId;
        this.availabilityZoneName = availabilityZoneName;
        this.dnsName = dnsName;
        this.fileSystemArn = fileSystemArn;
        this.fileSystemId = fileSystemId;
        this.ipAddress = ipAddress;
        this.mountTargetDnsName = mountTargetDnsName;
        this.networkInterfaceId = networkInterfaceId;
        this.ownerId = ownerId;
        this.securityGroups = securityGroups;
        this.subnetId = subnetId;
    }

    private MountTargetState() {
        this.availabilityZoneId = Input.empty();
        this.availabilityZoneName = Input.empty();
        this.dnsName = Input.empty();
        this.fileSystemArn = Input.empty();
        this.fileSystemId = Input.empty();
        this.ipAddress = Input.empty();
        this.mountTargetDnsName = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.ownerId = Input.empty();
        this.securityGroups = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZoneId;
        private @Nullable Input<String> availabilityZoneName;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<String> fileSystemArn;
        private @Nullable Input<String> fileSystemId;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> mountTargetDnsName;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountTargetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.availabilityZoneName = defaults.availabilityZoneName;
    	      this.dnsName = defaults.dnsName;
    	      this.fileSystemArn = defaults.fileSystemArn;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.mountTargetDnsName = defaults.mountTargetDnsName;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.ownerId = defaults.ownerId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder availabilityZoneId(@Nullable Input<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }

        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Input.ofNullable(availabilityZoneId);
            return this;
        }

        public Builder availabilityZoneName(@Nullable Input<String> availabilityZoneName) {
            this.availabilityZoneName = availabilityZoneName;
            return this;
        }

        public Builder availabilityZoneName(@Nullable String availabilityZoneName) {
            this.availabilityZoneName = Input.ofNullable(availabilityZoneName);
            return this;
        }

        public Builder dnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder fileSystemArn(@Nullable Input<String> fileSystemArn) {
            this.fileSystemArn = fileSystemArn;
            return this;
        }

        public Builder fileSystemArn(@Nullable String fileSystemArn) {
            this.fileSystemArn = Input.ofNullable(fileSystemArn);
            return this;
        }

        public Builder fileSystemId(@Nullable Input<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Input.ofNullable(fileSystemId);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder mountTargetDnsName(@Nullable Input<String> mountTargetDnsName) {
            this.mountTargetDnsName = mountTargetDnsName;
            return this;
        }

        public Builder mountTargetDnsName(@Nullable String mountTargetDnsName) {
            this.mountTargetDnsName = Input.ofNullable(mountTargetDnsName);
            return this;
        }

        public Builder networkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder ownerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder securityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }
        public MountTargetState build() {
            return new MountTargetState(availabilityZoneId, availabilityZoneName, dnsName, fileSystemArn, fileSystemId, ipAddress, mountTargetDnsName, networkInterfaceId, ownerId, securityGroups, subnetId);
        }
    }
}
