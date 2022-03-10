// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetBlockDeviceMapping;
import io.pulumi.awsnative.ec2.inputs.SpotFleetGroupIdentifier;
import io.pulumi.awsnative.ec2.inputs.SpotFleetIamInstanceProfileSpecification;
import io.pulumi.awsnative.ec2.inputs.SpotFleetInstanceNetworkInterfaceSpecification;
import io.pulumi.awsnative.ec2.inputs.SpotFleetInstanceRequirementsRequest;
import io.pulumi.awsnative.ec2.inputs.SpotFleetMonitoring;
import io.pulumi.awsnative.ec2.inputs.SpotFleetSpotPlacement;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTagSpecification;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetLaunchSpecification extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetLaunchSpecification Empty = new SpotFleetLaunchSpecification();

    @InputImport(name="blockDeviceMappings")
      private final @Nullable List<SpotFleetBlockDeviceMapping> blockDeviceMappings;

    public List<SpotFleetBlockDeviceMapping> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? List.of() : this.blockDeviceMappings;
    }

    @InputImport(name="ebsOptimized")
      private final @Nullable Boolean ebsOptimized;

    public Optional<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Optional.empty() : Optional.ofNullable(this.ebsOptimized);
    }

    @InputImport(name="iamInstanceProfile")
      private final @Nullable SpotFleetIamInstanceProfileSpecification iamInstanceProfile;

    public Optional<SpotFleetIamInstanceProfileSpecification> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Optional.empty() : Optional.ofNullable(this.iamInstanceProfile);
    }

    @InputImport(name="imageId", required=true)
      private final String imageId;

    public String getImageId() {
        return this.imageId;
    }

    @InputImport(name="instanceRequirements")
      private final @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements;

    public Optional<SpotFleetInstanceRequirementsRequest> getInstanceRequirements() {
        return this.instanceRequirements == null ? Optional.empty() : Optional.ofNullable(this.instanceRequirements);
    }

    @InputImport(name="instanceType")
      private final @Nullable String instanceType;

    public Optional<String> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    @InputImport(name="kernelId")
      private final @Nullable String kernelId;

    public Optional<String> getKernelId() {
        return this.kernelId == null ? Optional.empty() : Optional.ofNullable(this.kernelId);
    }

    @InputImport(name="keyName")
      private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    @InputImport(name="monitoring")
      private final @Nullable SpotFleetMonitoring monitoring;

    public Optional<SpotFleetMonitoring> getMonitoring() {
        return this.monitoring == null ? Optional.empty() : Optional.ofNullable(this.monitoring);
    }

    @InputImport(name="networkInterfaces")
      private final @Nullable List<SpotFleetInstanceNetworkInterfaceSpecification> networkInterfaces;

    public List<SpotFleetInstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    @InputImport(name="placement")
      private final @Nullable SpotFleetSpotPlacement placement;

    public Optional<SpotFleetSpotPlacement> getPlacement() {
        return this.placement == null ? Optional.empty() : Optional.ofNullable(this.placement);
    }

    @InputImport(name="ramdiskId")
      private final @Nullable String ramdiskId;

    public Optional<String> getRamdiskId() {
        return this.ramdiskId == null ? Optional.empty() : Optional.ofNullable(this.ramdiskId);
    }

    @InputImport(name="securityGroups")
      private final @Nullable List<SpotFleetGroupIdentifier> securityGroups;

    public List<SpotFleetGroupIdentifier> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }

    @InputImport(name="spotPrice")
      private final @Nullable String spotPrice;

    public Optional<String> getSpotPrice() {
        return this.spotPrice == null ? Optional.empty() : Optional.ofNullable(this.spotPrice);
    }

    @InputImport(name="subnetId")
      private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    @InputImport(name="tagSpecifications")
      private final @Nullable List<SpotFleetTagSpecification> tagSpecifications;

    public List<SpotFleetTagSpecification> getTagSpecifications() {
        return this.tagSpecifications == null ? List.of() : this.tagSpecifications;
    }

    @InputImport(name="userData")
      private final @Nullable String userData;

    public Optional<String> getUserData() {
        return this.userData == null ? Optional.empty() : Optional.ofNullable(this.userData);
    }

    @InputImport(name="weightedCapacity")
      private final @Nullable Double weightedCapacity;

    public Optional<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Optional.empty() : Optional.ofNullable(this.weightedCapacity);
    }

    public SpotFleetLaunchSpecification(
        @Nullable List<SpotFleetBlockDeviceMapping> blockDeviceMappings,
        @Nullable Boolean ebsOptimized,
        @Nullable SpotFleetIamInstanceProfileSpecification iamInstanceProfile,
        String imageId,
        @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements,
        @Nullable String instanceType,
        @Nullable String kernelId,
        @Nullable String keyName,
        @Nullable SpotFleetMonitoring monitoring,
        @Nullable List<SpotFleetInstanceNetworkInterfaceSpecification> networkInterfaces,
        @Nullable SpotFleetSpotPlacement placement,
        @Nullable String ramdiskId,
        @Nullable List<SpotFleetGroupIdentifier> securityGroups,
        @Nullable String spotPrice,
        @Nullable String subnetId,
        @Nullable List<SpotFleetTagSpecification> tagSpecifications,
        @Nullable String userData,
        @Nullable Double weightedCapacity) {
        this.blockDeviceMappings = blockDeviceMappings;
        this.ebsOptimized = ebsOptimized;
        this.iamInstanceProfile = iamInstanceProfile;
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
        this.instanceRequirements = instanceRequirements;
        this.instanceType = instanceType;
        this.kernelId = kernelId;
        this.keyName = keyName;
        this.monitoring = monitoring;
        this.networkInterfaces = networkInterfaces;
        this.placement = placement;
        this.ramdiskId = ramdiskId;
        this.securityGroups = securityGroups;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.tagSpecifications = tagSpecifications;
        this.userData = userData;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetLaunchSpecification() {
        this.blockDeviceMappings = List.of();
        this.ebsOptimized = null;
        this.iamInstanceProfile = null;
        this.imageId = null;
        this.instanceRequirements = null;
        this.instanceType = null;
        this.kernelId = null;
        this.keyName = null;
        this.monitoring = null;
        this.networkInterfaces = List.of();
        this.placement = null;
        this.ramdiskId = null;
        this.securityGroups = List.of();
        this.spotPrice = null;
        this.subnetId = null;
        this.tagSpecifications = List.of();
        this.userData = null;
        this.weightedCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLaunchSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SpotFleetBlockDeviceMapping> blockDeviceMappings;
        private @Nullable Boolean ebsOptimized;
        private @Nullable SpotFleetIamInstanceProfileSpecification iamInstanceProfile;
        private String imageId;
        private @Nullable SpotFleetInstanceRequirementsRequest instanceRequirements;
        private @Nullable String instanceType;
        private @Nullable String kernelId;
        private @Nullable String keyName;
        private @Nullable SpotFleetMonitoring monitoring;
        private @Nullable List<SpotFleetInstanceNetworkInterfaceSpecification> networkInterfaces;
        private @Nullable SpotFleetSpotPlacement placement;
        private @Nullable String ramdiskId;
        private @Nullable List<SpotFleetGroupIdentifier> securityGroups;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable List<SpotFleetTagSpecification> tagSpecifications;
        private @Nullable String userData;
        private @Nullable Double weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLaunchSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.imageId = defaults.imageId;
    	      this.instanceRequirements = defaults.instanceRequirements;
    	      this.instanceType = defaults.instanceType;
    	      this.kernelId = defaults.kernelId;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.placement = defaults.placement;
    	      this.ramdiskId = defaults.ramdiskId;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tagSpecifications = defaults.tagSpecifications;
    	      this.userData = defaults.userData;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder blockDeviceMappings(@Nullable List<SpotFleetBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder iamInstanceProfile(@Nullable SpotFleetIamInstanceProfileSpecification iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder instanceRequirements(@Nullable SpotFleetInstanceRequirementsRequest instanceRequirements) {
            this.instanceRequirements = instanceRequirements;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder kernelId(@Nullable String kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder monitoring(@Nullable SpotFleetMonitoring monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<SpotFleetInstanceNetworkInterfaceSpecification> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder placement(@Nullable SpotFleetSpotPlacement placement) {
            this.placement = placement;
            return this;
        }

        public Builder ramdiskId(@Nullable String ramdiskId) {
            this.ramdiskId = ramdiskId;
            return this;
        }

        public Builder securityGroups(@Nullable List<SpotFleetGroupIdentifier> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder tagSpecifications(@Nullable List<SpotFleetTagSpecification> tagSpecifications) {
            this.tagSpecifications = tagSpecifications;
            return this;
        }

        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }

        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public SpotFleetLaunchSpecification build() {
            return new SpotFleetLaunchSpecification(blockDeviceMappings, ebsOptimized, iamInstanceProfile, imageId, instanceRequirements, instanceType, kernelId, keyName, monitoring, networkInterfaces, placement, ramdiskId, securityGroups, spotPrice, subnetId, tagSpecifications, userData, weightedCapacity);
        }
    }
}
