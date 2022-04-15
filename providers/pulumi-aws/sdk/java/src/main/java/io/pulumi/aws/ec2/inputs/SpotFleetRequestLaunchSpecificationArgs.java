// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestLaunchSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchSpecificationArgs Empty = new SpotFleetRequestLaunchSpecificationArgs();

    @Import(name="ami", required=true)
      private final Output<String> ami;

    public Output<String> ami() {
        return this.ami;
    }

    @Import(name="associatePublicIpAddress")
      private final @Nullable Output<Boolean> associatePublicIpAddress;

    public Output<Boolean> associatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Codegen.empty() : this.associatePublicIpAddress;
    }

    /**
     * The availability zone in which to place the request.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    @Import(name="ebsBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices() {
        return this.ebsBlockDevices == null ? Codegen.empty() : this.ebsBlockDevices;
    }

    @Import(name="ebsOptimized")
      private final @Nullable Output<Boolean> ebsOptimized;

    public Output<Boolean> ebsOptimized() {
        return this.ebsOptimized == null ? Codegen.empty() : this.ebsOptimized;
    }

    @Import(name="ephemeralBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Codegen.empty() : this.ephemeralBlockDevices;
    }

    @Import(name="iamInstanceProfile")
      private final @Nullable Output<String> iamInstanceProfile;

    public Output<String> iamInstanceProfile() {
        return this.iamInstanceProfile == null ? Codegen.empty() : this.iamInstanceProfile;
    }

    @Import(name="iamInstanceProfileArn")
      private final @Nullable Output<String> iamInstanceProfileArn;

    public Output<String> iamInstanceProfileArn() {
        return this.iamInstanceProfileArn == null ? Codegen.empty() : this.iamInstanceProfileArn;
    }

    /**
     * The type of instance to request.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName == null ? Codegen.empty() : this.keyName;
    }

    @Import(name="monitoring")
      private final @Nullable Output<Boolean> monitoring;

    public Output<Boolean> monitoring() {
        return this.monitoring == null ? Codegen.empty() : this.monitoring;
    }

    @Import(name="placementGroup")
      private final @Nullable Output<String> placementGroup;

    public Output<String> placementGroup() {
        return this.placementGroup == null ? Codegen.empty() : this.placementGroup;
    }

    @Import(name="placementTenancy")
      private final @Nullable Output<String> placementTenancy;

    public Output<String> placementTenancy() {
        return this.placementTenancy == null ? Codegen.empty() : this.placementTenancy;
    }

    @Import(name="rootBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices() {
        return this.rootBlockDevices == null ? Codegen.empty() : this.rootBlockDevices;
    }

    /**
     * The maximum spot bid for this override request.
     * 
     */
    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> spotPrice() {
        return this.spotPrice == null ? Codegen.empty() : this.spotPrice;
    }

    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> userData() {
        return this.userData == null ? Codegen.empty() : this.userData;
    }

    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Codegen.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    @Import(name="weightedCapacity")
      private final @Nullable Output<String> weightedCapacity;

    public Output<String> weightedCapacity() {
        return this.weightedCapacity == null ? Codegen.empty() : this.weightedCapacity;
    }

    public SpotFleetRequestLaunchSpecificationArgs(
        Output<String> ami,
        @Nullable Output<Boolean> associatePublicIpAddress,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices,
        @Nullable Output<Boolean> ebsOptimized,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices,
        @Nullable Output<String> iamInstanceProfile,
        @Nullable Output<String> iamInstanceProfileArn,
        Output<String> instanceType,
        @Nullable Output<String> keyName,
        @Nullable Output<Boolean> monitoring,
        @Nullable Output<String> placementGroup,
        @Nullable Output<String> placementTenancy,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices,
        @Nullable Output<String> spotPrice,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userData,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        @Nullable Output<String> weightedCapacity) {
        this.ami = Objects.requireNonNull(ami, "expected parameter 'ami' to be non-null");
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.availabilityZone = availabilityZone;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.iamInstanceProfileArn = iamInstanceProfileArn;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyName = keyName;
        this.monitoring = monitoring;
        this.placementGroup = placementGroup;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevices = rootBlockDevices;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.tags = tags;
        this.userData = userData;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetRequestLaunchSpecificationArgs() {
        this.ami = Codegen.empty();
        this.associatePublicIpAddress = Codegen.empty();
        this.availabilityZone = Codegen.empty();
        this.ebsBlockDevices = Codegen.empty();
        this.ebsOptimized = Codegen.empty();
        this.ephemeralBlockDevices = Codegen.empty();
        this.iamInstanceProfile = Codegen.empty();
        this.iamInstanceProfileArn = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.keyName = Codegen.empty();
        this.monitoring = Codegen.empty();
        this.placementGroup = Codegen.empty();
        this.placementTenancy = Codegen.empty();
        this.rootBlockDevices = Codegen.empty();
        this.spotPrice = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.userData = Codegen.empty();
        this.vpcSecurityGroupIds = Codegen.empty();
        this.weightedCapacity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ami;
        private @Nullable Output<Boolean> associatePublicIpAddress;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices;
        private @Nullable Output<Boolean> ebsOptimized;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;
        private @Nullable Output<String> iamInstanceProfile;
        private @Nullable Output<String> iamInstanceProfileArn;
        private Output<String> instanceType;
        private @Nullable Output<String> keyName;
        private @Nullable Output<Boolean> monitoring;
        private @Nullable Output<String> placementGroup;
        private @Nullable Output<String> placementTenancy;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices;
        private @Nullable Output<String> spotPrice;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userData;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private @Nullable Output<String> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.iamInstanceProfileArn = defaults.iamInstanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder ami(Output<String> ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }
        public Builder ami(String ami) {
            this.ami = Output.of(Objects.requireNonNull(ami));
            return this;
        }
        public Builder associatePublicIpAddress(@Nullable Output<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }
        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Codegen.ofNullable(associatePublicIpAddress);
            return this;
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder ebsBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }
        public Builder ebsBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Codegen.ofNullable(ebsBlockDevices);
            return this;
        }
        public Builder ebsBlockDevices(SpotFleetRequestLaunchSpecificationEbsBlockDeviceArgs... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }
        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }
        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Codegen.ofNullable(ebsOptimized);
            return this;
        }
        public Builder ephemeralBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }
        public Builder ephemeralBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Codegen.ofNullable(ephemeralBlockDevices);
            return this;
        }
        public Builder ephemeralBlockDevices(SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceArgs... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }
        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = Codegen.ofNullable(iamInstanceProfile);
            return this;
        }
        public Builder iamInstanceProfileArn(@Nullable Output<String> iamInstanceProfileArn) {
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }
        public Builder iamInstanceProfileArn(@Nullable String iamInstanceProfileArn) {
            this.iamInstanceProfileArn = Codegen.ofNullable(iamInstanceProfileArn);
            return this;
        }
        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }
        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Codegen.ofNullable(keyName);
            return this;
        }
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = Codegen.ofNullable(monitoring);
            return this;
        }
        public Builder placementGroup(@Nullable Output<String> placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }
        public Builder placementGroup(@Nullable String placementGroup) {
            this.placementGroup = Codegen.ofNullable(placementGroup);
            return this;
        }
        public Builder placementTenancy(@Nullable Output<String> placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }
        public Builder placementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = Codegen.ofNullable(placementTenancy);
            return this;
        }
        public Builder rootBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs>> rootBlockDevices) {
            this.rootBlockDevices = rootBlockDevices;
            return this;
        }
        public Builder rootBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs> rootBlockDevices) {
            this.rootBlockDevices = Codegen.ofNullable(rootBlockDevices);
            return this;
        }
        public Builder rootBlockDevices(SpotFleetRequestLaunchSpecificationRootBlockDeviceArgs... rootBlockDevices) {
            return rootBlockDevices(List.of(rootBlockDevices));
        }
        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Codegen.ofNullable(spotPrice);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = Codegen.ofNullable(userData);
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Codegen.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        public Builder weightedCapacity(@Nullable Output<String> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = Codegen.ofNullable(weightedCapacity);
            return this;
        }        public SpotFleetRequestLaunchSpecificationArgs build() {
            return new SpotFleetRequestLaunchSpecificationArgs(ami, associatePublicIpAddress, availabilityZone, ebsBlockDevices, ebsOptimized, ephemeralBlockDevices, iamInstanceProfile, iamInstanceProfileArn, instanceType, keyName, monitoring, placementGroup, placementTenancy, rootBlockDevices, spotPrice, subnetId, tags, userData, vpcSecurityGroupIds, weightedCapacity);
        }
    }
}
