// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information of DPM Protected item.
 * 
 */
public final class DPMProtectedItemExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final DPMProtectedItemExtendedInfoResponse Empty = new DPMProtectedItemExtendedInfoResponse();

    /**
     * Used Disk storage in bytes.
     * 
     */
    @Import(name="diskStorageUsedInBytes")
    private @Nullable String diskStorageUsedInBytes;

    public Optional<String> diskStorageUsedInBytes() {
        return Optional.ofNullable(this.diskStorageUsedInBytes);
    }

    /**
     * To check if backup item is collocated.
     * 
     */
    @Import(name="isCollocated")
    private @Nullable Boolean isCollocated;

    public Optional<Boolean> isCollocated() {
        return Optional.ofNullable(this.isCollocated);
    }

    /**
     * To check if backup item is cloud protected.
     * 
     */
    @Import(name="isPresentOnCloud")
    private @Nullable Boolean isPresentOnCloud;

    public Optional<Boolean> isPresentOnCloud() {
        return Optional.ofNullable(this.isPresentOnCloud);
    }

    /**
     * Last backup status information on backup item.
     * 
     */
    @Import(name="lastBackupStatus")
    private @Nullable String lastBackupStatus;

    public Optional<String> lastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Last refresh time on backup item.
     * 
     */
    @Import(name="lastRefreshedAt")
    private @Nullable String lastRefreshedAt;

    public Optional<String> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }

    /**
     * Oldest cloud recovery point time.
     * 
     */
    @Import(name="oldestRecoveryPoint")
    private @Nullable String oldestRecoveryPoint;

    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * latest disk recovery point time.
     * 
     */
    @Import(name="onPremiseLatestRecoveryPoint")
    private @Nullable String onPremiseLatestRecoveryPoint;

    public Optional<String> onPremiseLatestRecoveryPoint() {
        return Optional.ofNullable(this.onPremiseLatestRecoveryPoint);
    }

    /**
     * Oldest disk recovery point time.
     * 
     */
    @Import(name="onPremiseOldestRecoveryPoint")
    private @Nullable String onPremiseOldestRecoveryPoint;

    public Optional<String> onPremiseOldestRecoveryPoint() {
        return Optional.ofNullable(this.onPremiseOldestRecoveryPoint);
    }

    /**
     * disk recovery point count.
     * 
     */
    @Import(name="onPremiseRecoveryPointCount")
    private @Nullable Integer onPremiseRecoveryPointCount;

    public Optional<Integer> onPremiseRecoveryPointCount() {
        return Optional.ofNullable(this.onPremiseRecoveryPointCount);
    }

    /**
     * Attribute to provide information on various DBs.
     * 
     */
    @Import(name="protectableObjectLoadPath")
    private @Nullable Map<String,String> protectableObjectLoadPath;

    public Optional<Map<String,String>> protectableObjectLoadPath() {
        return Optional.ofNullable(this.protectableObjectLoadPath);
    }

    /**
     * To check if backup item is disk protected.
     * 
     */
    @Import(name="protected")
    private @Nullable Boolean protected_;

    public Optional<Boolean> protected_() {
        return Optional.ofNullable(this.protected_);
    }

    /**
     * Protection group name of the backup item.
     * 
     */
    @Import(name="protectionGroupName")
    private @Nullable String protectionGroupName;

    public Optional<String> protectionGroupName() {
        return Optional.ofNullable(this.protectionGroupName);
    }

    /**
     * cloud recovery point count.
     * 
     */
    @Import(name="recoveryPointCount")
    private @Nullable Integer recoveryPointCount;

    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    /**
     * total Disk storage in bytes.
     * 
     */
    @Import(name="totalDiskStorageSizeInBytes")
    private @Nullable String totalDiskStorageSizeInBytes;

    public Optional<String> totalDiskStorageSizeInBytes() {
        return Optional.ofNullable(this.totalDiskStorageSizeInBytes);
    }

    private DPMProtectedItemExtendedInfoResponse() {}

    private DPMProtectedItemExtendedInfoResponse(DPMProtectedItemExtendedInfoResponse $) {
        this.diskStorageUsedInBytes = $.diskStorageUsedInBytes;
        this.isCollocated = $.isCollocated;
        this.isPresentOnCloud = $.isPresentOnCloud;
        this.lastBackupStatus = $.lastBackupStatus;
        this.lastRefreshedAt = $.lastRefreshedAt;
        this.oldestRecoveryPoint = $.oldestRecoveryPoint;
        this.onPremiseLatestRecoveryPoint = $.onPremiseLatestRecoveryPoint;
        this.onPremiseOldestRecoveryPoint = $.onPremiseOldestRecoveryPoint;
        this.onPremiseRecoveryPointCount = $.onPremiseRecoveryPointCount;
        this.protectableObjectLoadPath = $.protectableObjectLoadPath;
        this.protected_ = $.protected_;
        this.protectionGroupName = $.protectionGroupName;
        this.recoveryPointCount = $.recoveryPointCount;
        this.totalDiskStorageSizeInBytes = $.totalDiskStorageSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DPMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DPMProtectedItemExtendedInfoResponse $;

        public Builder() {
            $ = new DPMProtectedItemExtendedInfoResponse();
        }

        public Builder(DPMProtectedItemExtendedInfoResponse defaults) {
            $ = new DPMProtectedItemExtendedInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder diskStorageUsedInBytes(@Nullable String diskStorageUsedInBytes) {
            $.diskStorageUsedInBytes = diskStorageUsedInBytes;
            return this;
        }

        public Builder isCollocated(@Nullable Boolean isCollocated) {
            $.isCollocated = isCollocated;
            return this;
        }

        public Builder isPresentOnCloud(@Nullable Boolean isPresentOnCloud) {
            $.isPresentOnCloud = isPresentOnCloud;
            return this;
        }

        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            $.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            $.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            $.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder onPremiseLatestRecoveryPoint(@Nullable String onPremiseLatestRecoveryPoint) {
            $.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
            return this;
        }

        public Builder onPremiseOldestRecoveryPoint(@Nullable String onPremiseOldestRecoveryPoint) {
            $.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
            return this;
        }

        public Builder onPremiseRecoveryPointCount(@Nullable Integer onPremiseRecoveryPointCount) {
            $.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
            return this;
        }

        public Builder protectableObjectLoadPath(@Nullable Map<String,String> protectableObjectLoadPath) {
            $.protectableObjectLoadPath = protectableObjectLoadPath;
            return this;
        }

        public Builder protected_(@Nullable Boolean protected_) {
            $.protected_ = protected_;
            return this;
        }

        public Builder protectionGroupName(@Nullable String protectionGroupName) {
            $.protectionGroupName = protectionGroupName;
            return this;
        }

        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            $.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder totalDiskStorageSizeInBytes(@Nullable String totalDiskStorageSizeInBytes) {
            $.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
            return this;
        }

        public DPMProtectedItemExtendedInfoResponse build() {
            return $;
        }
    }

}
