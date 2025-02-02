// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ImageDiskReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CreationDataResponse {
    /**
     * @return This enumerates the possible sources of a disk&#39;s creation.
     * 
     */
    private final String createOption;
    /**
     * @return Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    private final @Nullable ImageDiskReferenceResponse galleryImageReference;
    /**
     * @return Disk source information.
     * 
     */
    private final @Nullable ImageDiskReferenceResponse imageReference;
    /**
     * @return Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    private final @Nullable Integer logicalSectorSize;
    /**
     * @return If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * @return If this field is set, this is the unique id identifying the source of this resource.
     * 
     */
    private final String sourceUniqueId;
    /**
     * @return If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    private final @Nullable String sourceUri;
    /**
     * @return Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    private final @Nullable String storageAccountId;
    /**
     * @return If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    private final @Nullable Double uploadSizeBytes;

    @CustomType.Constructor
    private CreationDataResponse(
        @CustomType.Parameter("createOption") String createOption,
        @CustomType.Parameter("galleryImageReference") @Nullable ImageDiskReferenceResponse galleryImageReference,
        @CustomType.Parameter("imageReference") @Nullable ImageDiskReferenceResponse imageReference,
        @CustomType.Parameter("logicalSectorSize") @Nullable Integer logicalSectorSize,
        @CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @CustomType.Parameter("sourceUniqueId") String sourceUniqueId,
        @CustomType.Parameter("sourceUri") @Nullable String sourceUri,
        @CustomType.Parameter("storageAccountId") @Nullable String storageAccountId,
        @CustomType.Parameter("uploadSizeBytes") @Nullable Double uploadSizeBytes) {
        this.createOption = createOption;
        this.galleryImageReference = galleryImageReference;
        this.imageReference = imageReference;
        this.logicalSectorSize = logicalSectorSize;
        this.sourceResourceId = sourceResourceId;
        this.sourceUniqueId = sourceUniqueId;
        this.sourceUri = sourceUri;
        this.storageAccountId = storageAccountId;
        this.uploadSizeBytes = uploadSizeBytes;
    }

    /**
     * @return This enumerates the possible sources of a disk&#39;s creation.
     * 
     */
    public String createOption() {
        return this.createOption;
    }
    /**
     * @return Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    public Optional<ImageDiskReferenceResponse> galleryImageReference() {
        return Optional.ofNullable(this.galleryImageReference);
    }
    /**
     * @return Disk source information.
     * 
     */
    public Optional<ImageDiskReferenceResponse> imageReference() {
        return Optional.ofNullable(this.imageReference);
    }
    /**
     * @return Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    public Optional<Integer> logicalSectorSize() {
        return Optional.ofNullable(this.logicalSectorSize);
    }
    /**
     * @return If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * @return If this field is set, this is the unique id identifying the source of this resource.
     * 
     */
    public String sourceUniqueId() {
        return this.sourceUniqueId;
    }
    /**
     * @return If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    public Optional<String> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }
    /**
     * @return Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    public Optional<String> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }
    /**
     * @return If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    public Optional<Double> uploadSizeBytes() {
        return Optional.ofNullable(this.uploadSizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createOption;
        private @Nullable ImageDiskReferenceResponse galleryImageReference;
        private @Nullable ImageDiskReferenceResponse imageReference;
        private @Nullable Integer logicalSectorSize;
        private @Nullable String sourceResourceId;
        private String sourceUniqueId;
        private @Nullable String sourceUri;
        private @Nullable String storageAccountId;
        private @Nullable Double uploadSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.imageReference = defaults.imageReference;
    	      this.logicalSectorSize = defaults.logicalSectorSize;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.sourceUniqueId = defaults.sourceUniqueId;
    	      this.sourceUri = defaults.sourceUri;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.uploadSizeBytes = defaults.uploadSizeBytes;
        }

        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }
        public Builder galleryImageReference(@Nullable ImageDiskReferenceResponse galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }
        public Builder imageReference(@Nullable ImageDiskReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }
        public Builder logicalSectorSize(@Nullable Integer logicalSectorSize) {
            this.logicalSectorSize = logicalSectorSize;
            return this;
        }
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public Builder sourceUniqueId(String sourceUniqueId) {
            this.sourceUniqueId = Objects.requireNonNull(sourceUniqueId);
            return this;
        }
        public Builder sourceUri(@Nullable String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder uploadSizeBytes(@Nullable Double uploadSizeBytes) {
            this.uploadSizeBytes = uploadSizeBytes;
            return this;
        }        public CreationDataResponse build() {
            return new CreationDataResponse(createOption, galleryImageReference, imageReference, logicalSectorSize, sourceResourceId, sourceUniqueId, sourceUri, storageAccountId, uploadSizeBytes);
        }
    }
}
