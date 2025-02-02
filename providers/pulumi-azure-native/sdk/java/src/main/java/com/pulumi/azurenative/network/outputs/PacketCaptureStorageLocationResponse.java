// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PacketCaptureStorageLocationResponse {
    /**
     * @return A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     * 
     */
    private final @Nullable String filePath;
    /**
     * @return The ID of the storage account to save the packet capture session. Required if no local file path is provided.
     * 
     */
    private final @Nullable String storageId;
    /**
     * @return The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     * 
     */
    private final @Nullable String storagePath;

    @CustomType.Constructor
    private PacketCaptureStorageLocationResponse(
        @CustomType.Parameter("filePath") @Nullable String filePath,
        @CustomType.Parameter("storageId") @Nullable String storageId,
        @CustomType.Parameter("storagePath") @Nullable String storagePath) {
        this.filePath = filePath;
        this.storageId = storageId;
        this.storagePath = storagePath;
    }

    /**
     * @return A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     * 
     */
    public Optional<String> filePath() {
        return Optional.ofNullable(this.filePath);
    }
    /**
     * @return The ID of the storage account to save the packet capture session. Required if no local file path is provided.
     * 
     */
    public Optional<String> storageId() {
        return Optional.ofNullable(this.storageId);
    }
    /**
     * @return The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     * 
     */
    public Optional<String> storagePath() {
        return Optional.ofNullable(this.storagePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureStorageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filePath;
        private @Nullable String storageId;
        private @Nullable String storagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureStorageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.storageId = defaults.storageId;
    	      this.storagePath = defaults.storagePath;
        }

        public Builder filePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }
        public Builder storageId(@Nullable String storageId) {
            this.storageId = storageId;
            return this;
        }
        public Builder storagePath(@Nullable String storagePath) {
            this.storagePath = storagePath;
            return this;
        }        public PacketCaptureStorageLocationResponse build() {
            return new PacketCaptureStorageLocationResponse(filePath, storageId, storagePath);
        }
    }
}
