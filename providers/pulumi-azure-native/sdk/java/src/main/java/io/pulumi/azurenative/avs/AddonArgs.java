// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.enums.AddonType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddonArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddonArgs Empty = new AddonArgs();

    /**
     * Name of the addon for the private cloud
     * 
     */
    @InputImport(name="addonName")
      private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    /**
     * The type of private cloud addon
     * 
     */
    @InputImport(name="addonType")
      private final @Nullable Input<Either<String,AddonType>> addonType;

    public Input<Either<String,AddonType>> getAddonType() {
        return this.addonType == null ? Input.empty() : this.addonType;
    }

    /**
     * The SRM license
     * 
     */
    @InputImport(name="licenseKey")
      private final @Nullable Input<String> licenseKey;

    public Input<String> getLicenseKey() {
        return this.licenseKey == null ? Input.empty() : this.licenseKey;
    }

    /**
     * The name of the private cloud.
     * 
     */
    @InputImport(name="privateCloudName", required=true)
      private final Input<String> privateCloudName;

    public Input<String> getPrivateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public AddonArgs(
        @Nullable Input<String> addonName,
        @Nullable Input<Either<String,AddonType>> addonType,
        @Nullable Input<String> licenseKey,
        Input<String> privateCloudName,
        Input<String> resourceGroupName) {
        this.addonName = addonName;
        this.addonType = addonType;
        this.licenseKey = licenseKey;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private AddonArgs() {
        this.addonName = Input.empty();
        this.addonType = Input.empty();
        this.licenseKey = Input.empty();
        this.privateCloudName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private @Nullable Input<Either<String,AddonType>> addonType;
        private @Nullable Input<String> licenseKey;
        private Input<String> privateCloudName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.addonType = defaults.addonType;
    	      this.licenseKey = defaults.licenseKey;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder addonName(@Nullable Input<String> addonName) {
            this.addonName = addonName;
            return this;
        }

        public Builder addonName(@Nullable String addonName) {
            this.addonName = Input.ofNullable(addonName);
            return this;
        }

        public Builder addonType(@Nullable Input<Either<String,AddonType>> addonType) {
            this.addonType = addonType;
            return this;
        }

        public Builder addonType(@Nullable Either<String,AddonType> addonType) {
            this.addonType = Input.ofNullable(addonType);
            return this;
        }

        public Builder licenseKey(@Nullable Input<String> licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public Builder licenseKey(@Nullable String licenseKey) {
            this.licenseKey = Input.ofNullable(licenseKey);
            return this;
        }

        public Builder privateCloudName(Input<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Input.of(Objects.requireNonNull(privateCloudName));
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
        public AddonArgs build() {
            return new AddonArgs(addonName, addonType, licenseKey, privateCloudName, resourceGroupName);
        }
    }
}
