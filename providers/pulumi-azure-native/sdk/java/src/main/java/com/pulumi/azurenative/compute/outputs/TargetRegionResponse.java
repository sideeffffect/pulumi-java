// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.EncryptionImagesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetRegionResponse {
    /**
     * @return Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
     * 
     */
    private final @Nullable EncryptionImagesResponse encryption;
    /**
     * @return The name of the region.
     * 
     */
    private final String name;
    /**
     * @return The number of replicas of the Image Version to be created per region. This property is updatable.
     * 
     */
    private final @Nullable Integer regionalReplicaCount;
    /**
     * @return Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    private final @Nullable String storageAccountType;

    @CustomType.Constructor
    private TargetRegionResponse(
        @CustomType.Parameter("encryption") @Nullable EncryptionImagesResponse encryption,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("regionalReplicaCount") @Nullable Integer regionalReplicaCount,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType) {
        this.encryption = encryption;
        this.name = name;
        this.regionalReplicaCount = regionalReplicaCount;
        this.storageAccountType = storageAccountType;
    }

    /**
     * @return Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
     * 
     */
    public Optional<EncryptionImagesResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * @return The name of the region.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The number of replicas of the Image Version to be created per region. This property is updatable.
     * 
     */
    public Optional<Integer> regionalReplicaCount() {
        return Optional.ofNullable(this.regionalReplicaCount);
    }
    /**
     * @return Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    public Optional<String> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetRegionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionImagesResponse encryption;
        private String name;
        private @Nullable Integer regionalReplicaCount;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetRegionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.name = defaults.name;
    	      this.regionalReplicaCount = defaults.regionalReplicaCount;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder encryption(@Nullable EncryptionImagesResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder regionalReplicaCount(@Nullable Integer regionalReplicaCount) {
            this.regionalReplicaCount = regionalReplicaCount;
            return this;
        }
        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }        public TargetRegionResponse build() {
            return new TargetRegionResponse(encryption, name, regionalReplicaCount, storageAccountType);
        }
    }
}
