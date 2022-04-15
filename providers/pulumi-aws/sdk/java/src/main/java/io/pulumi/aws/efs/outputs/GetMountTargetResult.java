// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMountTargetResult {
    private final @Nullable String accessPointId;
    /**
     * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
     * 
     */
    private final String availabilityZoneId;
    /**
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * 
     */
    private final String availabilityZoneName;
    /**
     * The DNS name for the EFS file system.
     * 
     */
    private final String dnsName;
    /**
     * Amazon Resource Name of the file system for which the mount target is intended.
     * 
     */
    private final String fileSystemArn;
    private final String fileSystemId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Address at which the file system may be mounted via the mount target.
     * 
     */
    private final String ipAddress;
    /**
     * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    private final String mountTargetDnsName;
    private final String mountTargetId;
    /**
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * 
     */
    private final String networkInterfaceId;
    /**
     * AWS account ID that owns the resource.
     * 
     */
    private final String ownerId;
    /**
     * List of VPC security group IDs attached to the mount target.
     * 
     */
    private final List<String> securityGroups;
    /**
     * ID of the mount target's subnet.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private GetMountTargetResult(
        @CustomType.Parameter("accessPointId") @Nullable String accessPointId,
        @CustomType.Parameter("availabilityZoneId") String availabilityZoneId,
        @CustomType.Parameter("availabilityZoneName") String availabilityZoneName,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("fileSystemArn") String fileSystemArn,
        @CustomType.Parameter("fileSystemId") String fileSystemId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("mountTargetDnsName") String mountTargetDnsName,
        @CustomType.Parameter("mountTargetId") String mountTargetId,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.accessPointId = accessPointId;
        this.availabilityZoneId = availabilityZoneId;
        this.availabilityZoneName = availabilityZoneName;
        this.dnsName = dnsName;
        this.fileSystemArn = fileSystemArn;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.ipAddress = ipAddress;
        this.mountTargetDnsName = mountTargetDnsName;
        this.mountTargetId = mountTargetId;
        this.networkInterfaceId = networkInterfaceId;
        this.ownerId = ownerId;
        this.securityGroups = securityGroups;
        this.subnetId = subnetId;
    }

    public Optional<String> accessPointId() {
        return Optional.ofNullable(this.accessPointId);
    }
    /**
     * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
     * 
    */
    public String availabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * The name of the Availability Zone (AZ) that the mount target resides in.
     * 
    */
    public String availabilityZoneName() {
        return this.availabilityZoneName;
    }
    /**
     * The DNS name for the EFS file system.
     * 
    */
    public String dnsName() {
        return this.dnsName;
    }
    /**
     * Amazon Resource Name of the file system for which the mount target is intended.
     * 
    */
    public String fileSystemArn() {
        return this.fileSystemArn;
    }
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Address at which the file system may be mounted via the mount target.
     * 
    */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
    */
    public String mountTargetDnsName() {
        return this.mountTargetDnsName;
    }
    public String mountTargetId() {
        return this.mountTargetId;
    }
    /**
     * The ID of the network interface that Amazon EFS created when it created the mount target.
     * 
    */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * AWS account ID that owns the resource.
     * 
    */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * List of VPC security group IDs attached to the mount target.
     * 
    */
    public List<String> securityGroups() {
        return this.securityGroups;
    }
    /**
     * ID of the mount target's subnet.
     * 
    */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMountTargetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPointId;
        private String availabilityZoneId;
        private String availabilityZoneName;
        private String dnsName;
        private String fileSystemArn;
        private String fileSystemId;
        private String id;
        private String ipAddress;
        private String mountTargetDnsName;
        private String mountTargetId;
        private String networkInterfaceId;
        private String ownerId;
        private List<String> securityGroups;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMountTargetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointId = defaults.accessPointId;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.availabilityZoneName = defaults.availabilityZoneName;
    	      this.dnsName = defaults.dnsName;
    	      this.fileSystemArn = defaults.fileSystemArn;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.mountTargetDnsName = defaults.mountTargetDnsName;
    	      this.mountTargetId = defaults.mountTargetId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.ownerId = defaults.ownerId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder accessPointId(@Nullable String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public Builder availabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }
        public Builder availabilityZoneName(String availabilityZoneName) {
            this.availabilityZoneName = Objects.requireNonNull(availabilityZoneName);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder fileSystemArn(String fileSystemArn) {
            this.fileSystemArn = Objects.requireNonNull(fileSystemArn);
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder mountTargetDnsName(String mountTargetDnsName) {
            this.mountTargetDnsName = Objects.requireNonNull(mountTargetDnsName);
            return this;
        }
        public Builder mountTargetId(String mountTargetId) {
            this.mountTargetId = Objects.requireNonNull(mountTargetId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public GetMountTargetResult build() {
            return new GetMountTargetResult(accessPointId, availabilityZoneId, availabilityZoneName, dnsName, fileSystemArn, fileSystemId, id, ipAddress, mountTargetDnsName, mountTargetId, networkInterfaceId, ownerId, securityGroups, subnetId);
        }
    }
}
