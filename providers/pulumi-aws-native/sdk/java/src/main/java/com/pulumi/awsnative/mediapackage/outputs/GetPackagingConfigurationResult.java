// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationCmafPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationHlsPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationMssPackage;
import com.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPackagingConfigurationResult {
    /**
     * @return The ARN of the PackagingConfiguration.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return A CMAF packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationCmafPackage cmafPackage;
    /**
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationDashPackage dashPackage;
    /**
     * @return An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    private final @Nullable PackagingConfigurationHlsPackage hlsPackage;
    /**
     * @return A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    private final @Nullable PackagingConfigurationMssPackage mssPackage;
    /**
     * @return The ID of a PackagingGroup.
     * 
     */
    private final @Nullable String packagingGroupId;
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    private final @Nullable List<PackagingConfigurationTag> tags;

    @CustomType.Constructor
    private GetPackagingConfigurationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("cmafPackage") @Nullable PackagingConfigurationCmafPackage cmafPackage,
        @CustomType.Parameter("dashPackage") @Nullable PackagingConfigurationDashPackage dashPackage,
        @CustomType.Parameter("hlsPackage") @Nullable PackagingConfigurationHlsPackage hlsPackage,
        @CustomType.Parameter("mssPackage") @Nullable PackagingConfigurationMssPackage mssPackage,
        @CustomType.Parameter("packagingGroupId") @Nullable String packagingGroupId,
        @CustomType.Parameter("tags") @Nullable List<PackagingConfigurationTag> tags) {
        this.arn = arn;
        this.cmafPackage = cmafPackage;
        this.dashPackage = dashPackage;
        this.hlsPackage = hlsPackage;
        this.mssPackage = mssPackage;
        this.packagingGroupId = packagingGroupId;
        this.tags = tags;
    }

    /**
     * @return The ARN of the PackagingConfiguration.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return A CMAF packaging configuration.
     * 
     */
    public Optional<PackagingConfigurationCmafPackage> cmafPackage() {
        return Optional.ofNullable(this.cmafPackage);
    }
    /**
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    public Optional<PackagingConfigurationDashPackage> dashPackage() {
        return Optional.ofNullable(this.dashPackage);
    }
    /**
     * @return An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    public Optional<PackagingConfigurationHlsPackage> hlsPackage() {
        return Optional.ofNullable(this.hlsPackage);
    }
    /**
     * @return A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    public Optional<PackagingConfigurationMssPackage> mssPackage() {
        return Optional.ofNullable(this.mssPackage);
    }
    /**
     * @return The ID of a PackagingGroup.
     * 
     */
    public Optional<String> packagingGroupId() {
        return Optional.ofNullable(this.packagingGroupId);
    }
    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public List<PackagingConfigurationTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackagingConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable PackagingConfigurationCmafPackage cmafPackage;
        private @Nullable PackagingConfigurationDashPackage dashPackage;
        private @Nullable PackagingConfigurationHlsPackage hlsPackage;
        private @Nullable PackagingConfigurationMssPackage mssPackage;
        private @Nullable String packagingGroupId;
        private @Nullable List<PackagingConfigurationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackagingConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cmafPackage = defaults.cmafPackage;
    	      this.dashPackage = defaults.dashPackage;
    	      this.hlsPackage = defaults.hlsPackage;
    	      this.mssPackage = defaults.mssPackage;
    	      this.packagingGroupId = defaults.packagingGroupId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder cmafPackage(@Nullable PackagingConfigurationCmafPackage cmafPackage) {
            this.cmafPackage = cmafPackage;
            return this;
        }
        public Builder dashPackage(@Nullable PackagingConfigurationDashPackage dashPackage) {
            this.dashPackage = dashPackage;
            return this;
        }
        public Builder hlsPackage(@Nullable PackagingConfigurationHlsPackage hlsPackage) {
            this.hlsPackage = hlsPackage;
            return this;
        }
        public Builder mssPackage(@Nullable PackagingConfigurationMssPackage mssPackage) {
            this.mssPackage = mssPackage;
            return this;
        }
        public Builder packagingGroupId(@Nullable String packagingGroupId) {
            this.packagingGroupId = packagingGroupId;
            return this;
        }
        public Builder tags(@Nullable List<PackagingConfigurationTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(PackagingConfigurationTag... tags) {
            return tags(List.of(tags));
        }        public GetPackagingConfigurationResult build() {
            return new GetPackagingConfigurationResult(arn, cmafPackage, dashPackage, hlsPackage, mssPackage, packagingGroupId, tags);
        }
    }
}
