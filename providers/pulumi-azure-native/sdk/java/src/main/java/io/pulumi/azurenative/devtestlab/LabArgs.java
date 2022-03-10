// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.EnvironmentPermission;
import io.pulumi.azurenative.devtestlab.enums.PremiumDataDisk;
import io.pulumi.azurenative.devtestlab.enums.StorageType;
import io.pulumi.azurenative.devtestlab.inputs.LabAnnouncementPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.LabSupportPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabArgs Empty = new LabArgs();

    /**
     * The properties of any lab announcement associated with this lab
     * 
     */
    @InputImport(name="announcement")
      private final @Nullable Input<LabAnnouncementPropertiesArgs> announcement;

    public Input<LabAnnouncementPropertiesArgs> getAnnouncement() {
        return this.announcement == null ? Input.empty() : this.announcement;
    }

    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
     */
    @InputImport(name="environmentPermission")
      private final @Nullable Input<Either<String,EnvironmentPermission>> environmentPermission;

    public Input<Either<String,EnvironmentPermission>> getEnvironmentPermission() {
        return this.environmentPermission == null ? Input.empty() : this.environmentPermission;
    }

    /**
     * Extended properties of the lab used for experimental features
     * 
     */
    @InputImport(name="extendedProperties")
      private final @Nullable Input<Map<String,String>> extendedProperties;

    public Input<Map<String,String>> getExtendedProperties() {
        return this.extendedProperties == null ? Input.empty() : this.extendedProperties;
    }

    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    @InputImport(name="labStorageType")
      private final @Nullable Input<Either<String,StorageType>> labStorageType;

    public Input<Either<String,StorageType>> getLabStorageType() {
        return this.labStorageType == null ? Input.empty() : this.labStorageType;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @InputImport(name="mandatoryArtifactsResourceIdsLinux")
      private final @Nullable Input<List<String>> mandatoryArtifactsResourceIdsLinux;

    public Input<List<String>> getMandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux == null ? Input.empty() : this.mandatoryArtifactsResourceIdsLinux;
    }

    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @InputImport(name="mandatoryArtifactsResourceIdsWindows")
      private final @Nullable Input<List<String>> mandatoryArtifactsResourceIdsWindows;

    public Input<List<String>> getMandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows == null ? Input.empty() : this.mandatoryArtifactsResourceIdsWindows;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks is allowed.
     * When its value is 'Disabled', only creation of standard data disks is allowed.
     * 
     */
    @InputImport(name="premiumDataDisks")
      private final @Nullable Input<Either<String,PremiumDataDisk>> premiumDataDisks;

    public Input<Either<String,PremiumDataDisk>> getPremiumDataDisks() {
        return this.premiumDataDisks == null ? Input.empty() : this.premiumDataDisks;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The properties of any lab support message associated with this lab
     * 
     */
    @InputImport(name="support")
      private final @Nullable Input<LabSupportPropertiesArgs> support;

    public Input<LabSupportPropertiesArgs> getSupport() {
        return this.support == null ? Input.empty() : this.support;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LabArgs(
        @Nullable Input<LabAnnouncementPropertiesArgs> announcement,
        @Nullable Input<Either<String,EnvironmentPermission>> environmentPermission,
        @Nullable Input<Map<String,String>> extendedProperties,
        @Nullable Input<Either<String,StorageType>> labStorageType,
        @Nullable Input<String> location,
        @Nullable Input<List<String>> mandatoryArtifactsResourceIdsLinux,
        @Nullable Input<List<String>> mandatoryArtifactsResourceIdsWindows,
        @Nullable Input<String> name,
        @Nullable Input<Either<String,PremiumDataDisk>> premiumDataDisks,
        Input<String> resourceGroupName,
        @Nullable Input<LabSupportPropertiesArgs> support,
        @Nullable Input<Map<String,String>> tags) {
        this.announcement = announcement;
        this.environmentPermission = environmentPermission;
        this.extendedProperties = extendedProperties;
        this.labStorageType = labStorageType == null ? Input.ofLeft("Premium") : labStorageType;
        this.location = location;
        this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
        this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
        this.name = name;
        this.premiumDataDisks = premiumDataDisks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.support = support;
        this.tags = tags;
    }

    private LabArgs() {
        this.announcement = Input.empty();
        this.environmentPermission = Input.empty();
        this.extendedProperties = Input.empty();
        this.labStorageType = Input.empty();
        this.location = Input.empty();
        this.mandatoryArtifactsResourceIdsLinux = Input.empty();
        this.mandatoryArtifactsResourceIdsWindows = Input.empty();
        this.name = Input.empty();
        this.premiumDataDisks = Input.empty();
        this.resourceGroupName = Input.empty();
        this.support = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LabAnnouncementPropertiesArgs> announcement;
        private @Nullable Input<Either<String,EnvironmentPermission>> environmentPermission;
        private @Nullable Input<Map<String,String>> extendedProperties;
        private @Nullable Input<Either<String,StorageType>> labStorageType;
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> mandatoryArtifactsResourceIdsLinux;
        private @Nullable Input<List<String>> mandatoryArtifactsResourceIdsWindows;
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,PremiumDataDisk>> premiumDataDisks;
        private Input<String> resourceGroupName;
        private @Nullable Input<LabSupportPropertiesArgs> support;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.announcement = defaults.announcement;
    	      this.environmentPermission = defaults.environmentPermission;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.labStorageType = defaults.labStorageType;
    	      this.location = defaults.location;
    	      this.mandatoryArtifactsResourceIdsLinux = defaults.mandatoryArtifactsResourceIdsLinux;
    	      this.mandatoryArtifactsResourceIdsWindows = defaults.mandatoryArtifactsResourceIdsWindows;
    	      this.name = defaults.name;
    	      this.premiumDataDisks = defaults.premiumDataDisks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.support = defaults.support;
    	      this.tags = defaults.tags;
        }

        public Builder announcement(@Nullable Input<LabAnnouncementPropertiesArgs> announcement) {
            this.announcement = announcement;
            return this;
        }

        public Builder announcement(@Nullable LabAnnouncementPropertiesArgs announcement) {
            this.announcement = Input.ofNullable(announcement);
            return this;
        }

        public Builder environmentPermission(@Nullable Input<Either<String,EnvironmentPermission>> environmentPermission) {
            this.environmentPermission = environmentPermission;
            return this;
        }

        public Builder environmentPermission(@Nullable Either<String,EnvironmentPermission> environmentPermission) {
            this.environmentPermission = Input.ofNullable(environmentPermission);
            return this;
        }

        public Builder extendedProperties(@Nullable Input<Map<String,String>> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder extendedProperties(@Nullable Map<String,String> extendedProperties) {
            this.extendedProperties = Input.ofNullable(extendedProperties);
            return this;
        }

        public Builder labStorageType(@Nullable Input<Either<String,StorageType>> labStorageType) {
            this.labStorageType = labStorageType;
            return this;
        }

        public Builder labStorageType(@Nullable Either<String,StorageType> labStorageType) {
            this.labStorageType = Input.ofNullable(labStorageType);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder mandatoryArtifactsResourceIdsLinux(@Nullable Input<List<String>> mandatoryArtifactsResourceIdsLinux) {
            this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
            return this;
        }

        public Builder mandatoryArtifactsResourceIdsLinux(@Nullable List<String> mandatoryArtifactsResourceIdsLinux) {
            this.mandatoryArtifactsResourceIdsLinux = Input.ofNullable(mandatoryArtifactsResourceIdsLinux);
            return this;
        }

        public Builder mandatoryArtifactsResourceIdsWindows(@Nullable Input<List<String>> mandatoryArtifactsResourceIdsWindows) {
            this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
            return this;
        }

        public Builder mandatoryArtifactsResourceIdsWindows(@Nullable List<String> mandatoryArtifactsResourceIdsWindows) {
            this.mandatoryArtifactsResourceIdsWindows = Input.ofNullable(mandatoryArtifactsResourceIdsWindows);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder premiumDataDisks(@Nullable Input<Either<String,PremiumDataDisk>> premiumDataDisks) {
            this.premiumDataDisks = premiumDataDisks;
            return this;
        }

        public Builder premiumDataDisks(@Nullable Either<String,PremiumDataDisk> premiumDataDisks) {
            this.premiumDataDisks = Input.ofNullable(premiumDataDisks);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder support(@Nullable Input<LabSupportPropertiesArgs> support) {
            this.support = support;
            return this;
        }

        public Builder support(@Nullable LabSupportPropertiesArgs support) {
            this.support = Input.ofNullable(support);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LabArgs build() {
            return new LabArgs(announcement, environmentPermission, extendedProperties, labStorageType, location, mandatoryArtifactsResourceIdsLinux, mandatoryArtifactsResourceIdsWindows, name, premiumDataDisks, resourceGroupName, support, tags);
        }
    }
}
