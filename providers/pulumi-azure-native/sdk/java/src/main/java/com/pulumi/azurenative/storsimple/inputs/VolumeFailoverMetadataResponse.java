// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metadata of a volume that has valid cloud snapshot.
 * 
 */
public final class VolumeFailoverMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final VolumeFailoverMetadataResponse Empty = new VolumeFailoverMetadataResponse();

    /**
     * The date at which the snapshot was taken.
     * 
     */
    @Import(name="backupCreatedDate")
    private @Nullable String backupCreatedDate;

    public Optional<String> backupCreatedDate() {
        return Optional.ofNullable(this.backupCreatedDate);
    }

    /**
     * The path ID of the backup-element for this volume, inside the backup set.
     * 
     */
    @Import(name="backupElementId")
    private @Nullable String backupElementId;

    public Optional<String> backupElementId() {
        return Optional.ofNullable(this.backupElementId);
    }

    /**
     * The path ID of the backup set.
     * 
     */
    @Import(name="backupId")
    private @Nullable String backupId;

    public Optional<String> backupId() {
        return Optional.ofNullable(this.backupId);
    }

    /**
     * The path ID of the backup policy using which the snapshot was taken.
     * 
     */
    @Import(name="backupPolicyId")
    private @Nullable String backupPolicyId;

    public Optional<String> backupPolicyId() {
        return Optional.ofNullable(this.backupPolicyId);
    }

    /**
     * The size of the volume in bytes at the time the snapshot was taken.
     * 
     */
    @Import(name="sizeInBytes")
    private @Nullable Double sizeInBytes;

    public Optional<Double> sizeInBytes() {
        return Optional.ofNullable(this.sizeInBytes);
    }

    /**
     * The path ID of the volume.
     * 
     */
    @Import(name="volumeId")
    private @Nullable String volumeId;

    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    /**
     * The type of the volume.
     * 
     */
    @Import(name="volumeType")
    private @Nullable String volumeType;

    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private VolumeFailoverMetadataResponse() {}

    private VolumeFailoverMetadataResponse(VolumeFailoverMetadataResponse $) {
        this.backupCreatedDate = $.backupCreatedDate;
        this.backupElementId = $.backupElementId;
        this.backupId = $.backupId;
        this.backupPolicyId = $.backupPolicyId;
        this.sizeInBytes = $.sizeInBytes;
        this.volumeId = $.volumeId;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeFailoverMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeFailoverMetadataResponse $;

        public Builder() {
            $ = new VolumeFailoverMetadataResponse();
        }

        public Builder(VolumeFailoverMetadataResponse defaults) {
            $ = new VolumeFailoverMetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder backupCreatedDate(@Nullable String backupCreatedDate) {
            $.backupCreatedDate = backupCreatedDate;
            return this;
        }

        public Builder backupElementId(@Nullable String backupElementId) {
            $.backupElementId = backupElementId;
            return this;
        }

        public Builder backupId(@Nullable String backupId) {
            $.backupId = backupId;
            return this;
        }

        public Builder backupPolicyId(@Nullable String backupPolicyId) {
            $.backupPolicyId = backupPolicyId;
            return this;
        }

        public Builder sizeInBytes(@Nullable Double sizeInBytes) {
            $.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder volumeId(@Nullable String volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public VolumeFailoverMetadataResponse build() {
            return $;
        }
    }

}
