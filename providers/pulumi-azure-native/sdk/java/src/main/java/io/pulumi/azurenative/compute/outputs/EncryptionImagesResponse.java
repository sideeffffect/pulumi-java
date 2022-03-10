// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DataDiskImageEncryptionResponse;
import io.pulumi.azurenative.compute.outputs.OSDiskImageEncryptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionImagesResponse {
    /**
     * A list of encryption specifications for data disk images.
     * 
     */
    private final @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages;
    /**
     * Contains encryption settings for an OS disk image.
     * 
     */
    private final @Nullable OSDiskImageEncryptionResponse osDiskImage;

    @OutputCustomType.Constructor
    private EncryptionImagesResponse(
        @OutputCustomType.Parameter("dataDiskImages") @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages,
        @OutputCustomType.Parameter("osDiskImage") @Nullable OSDiskImageEncryptionResponse osDiskImage) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
    }

    /**
     * A list of encryption specifications for data disk images.
     * 
    */
    public List<DataDiskImageEncryptionResponse> getDataDiskImages() {
        return this.dataDiskImages == null ? List.of() : this.dataDiskImages;
    }
    /**
     * Contains encryption settings for an OS disk image.
     * 
    */
    public Optional<OSDiskImageEncryptionResponse> getOsDiskImage() {
        return Optional.ofNullable(this.osDiskImage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionImagesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages;
        private @Nullable OSDiskImageEncryptionResponse osDiskImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionImagesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
        }

        public Builder dataDiskImages(@Nullable List<DataDiskImageEncryptionResponse> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }

        public Builder osDiskImage(@Nullable OSDiskImageEncryptionResponse osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }
        public EncryptionImagesResponse build() {
            return new EncryptionImagesResponse(dataDiskImages, osDiskImage);
        }
    }
}
