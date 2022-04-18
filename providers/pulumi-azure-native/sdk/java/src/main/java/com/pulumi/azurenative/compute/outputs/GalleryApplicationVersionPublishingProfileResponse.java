// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.TargetRegionResponse;
import com.pulumi.azurenative.compute.outputs.UserArtifactManageResponse;
import com.pulumi.azurenative.compute.outputs.UserArtifactSourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GalleryApplicationVersionPublishingProfileResponse {
    /**
     * Optional. Whether or not this application reports health.
     * 
     */
    private final @Nullable Boolean enableHealthCheck;
    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    private final @Nullable String endOfLifeDate;
    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
     */
    private final @Nullable Boolean excludeFromLatest;
    private final @Nullable UserArtifactManageResponse manageActions;
    /**
     * The timestamp for when the gallery image version is published.
     * 
     */
    private final String publishedDate;
    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    private final @Nullable Integer replicaCount;
    /**
     * The source image from which the Image Version is going to be created.
     * 
     */
    private final UserArtifactSourceResponse source;
    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    private final @Nullable String storageAccountType;
    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    private final @Nullable List<TargetRegionResponse> targetRegions;

    @CustomType.Constructor
    private GalleryApplicationVersionPublishingProfileResponse(
        @CustomType.Parameter("enableHealthCheck") @Nullable Boolean enableHealthCheck,
        @CustomType.Parameter("endOfLifeDate") @Nullable String endOfLifeDate,
        @CustomType.Parameter("excludeFromLatest") @Nullable Boolean excludeFromLatest,
        @CustomType.Parameter("manageActions") @Nullable UserArtifactManageResponse manageActions,
        @CustomType.Parameter("publishedDate") String publishedDate,
        @CustomType.Parameter("replicaCount") @Nullable Integer replicaCount,
        @CustomType.Parameter("source") UserArtifactSourceResponse source,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType,
        @CustomType.Parameter("targetRegions") @Nullable List<TargetRegionResponse> targetRegions) {
        this.enableHealthCheck = enableHealthCheck;
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.manageActions = manageActions;
        this.publishedDate = publishedDate;
        this.replicaCount = replicaCount;
        this.source = source;
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    /**
     * Optional. Whether or not this application reports health.
     * 
    */
    public Optional<Boolean> enableHealthCheck() {
        return Optional.ofNullable(this.enableHealthCheck);
    }
    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
    */
    public Optional<String> endOfLifeDate() {
        return Optional.ofNullable(this.endOfLifeDate);
    }
    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
    */
    public Optional<Boolean> excludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }
    public Optional<UserArtifactManageResponse> manageActions() {
        return Optional.ofNullable(this.manageActions);
    }
    /**
     * The timestamp for when the gallery image version is published.
     * 
    */
    public String publishedDate() {
        return this.publishedDate;
    }
    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
    */
    public Optional<Integer> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    /**
     * The source image from which the Image Version is going to be created.
     * 
    */
    public UserArtifactSourceResponse source() {
        return this.source;
    }
    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
    */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }
    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
    */
    public List<TargetRegionResponse> targetRegions() {
        return this.targetRegions == null ? List.of() : this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableHealthCheck;
        private @Nullable String endOfLifeDate;
        private @Nullable Boolean excludeFromLatest;
        private @Nullable UserArtifactManageResponse manageActions;
        private String publishedDate;
        private @Nullable Integer replicaCount;
        private UserArtifactSourceResponse source;
        private @Nullable String storageAccountType;
        private @Nullable List<TargetRegionResponse> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryApplicationVersionPublishingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHealthCheck = defaults.enableHealthCheck;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.manageActions = defaults.manageActions;
    	      this.publishedDate = defaults.publishedDate;
    	      this.replicaCount = defaults.replicaCount;
    	      this.source = defaults.source;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder enableHealthCheck(@Nullable Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }
        public Builder endOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }
        public Builder excludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }
        public Builder manageActions(@Nullable UserArtifactManageResponse manageActions) {
            this.manageActions = manageActions;
            return this;
        }
        public Builder publishedDate(String publishedDate) {
            this.publishedDate = Objects.requireNonNull(publishedDate);
            return this;
        }
        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Builder source(UserArtifactSourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public Builder targetRegions(@Nullable List<TargetRegionResponse> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }
        public Builder targetRegions(TargetRegionResponse... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }        public GalleryApplicationVersionPublishingProfileResponse build() {
            return new GalleryApplicationVersionPublishingProfileResponse(enableHealthCheck, endOfLifeDate, excludeFromLatest, manageActions, publishedDate, replicaCount, source, storageAccountType, targetRegions);
        }
    }
}
