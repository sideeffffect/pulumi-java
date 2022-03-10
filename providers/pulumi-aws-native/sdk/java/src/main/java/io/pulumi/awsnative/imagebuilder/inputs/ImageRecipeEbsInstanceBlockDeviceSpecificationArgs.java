// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Amazon EBS-specific block device mapping specifications.
 * 
 */
public final class ImageRecipeEbsInstanceBlockDeviceSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeEbsInstanceBlockDeviceSpecificationArgs Empty = new ImageRecipeEbsInstanceBlockDeviceSpecificationArgs();

    /**
     * Use to configure delete on termination of the associated device.
     * 
     */
    @InputImport(name="deleteOnTermination")
      private final @Nullable Input<Boolean> deleteOnTermination;

    public Input<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Input.empty() : this.deleteOnTermination;
    }

    /**
     * Use to configure device encryption.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * Use to configure device IOPS.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * Use to configure the KMS key to use when encrypting the device.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The snapshot that defines the device contents.
     * 
     */
    @InputImport(name="snapshotId")
      private final @Nullable Input<String> snapshotId;

    public Input<String> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    /**
     * For GP3 volumes only – The throughput in MiB/s that the volume supports.
     * 
     */
    @InputImport(name="throughput")
      private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    /**
     * Use to override the device's volume size.
     * 
     */
    @InputImport(name="volumeSize")
      private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    /**
     * Use to override the device's volume type.
     * 
     */
    @InputImport(name="volumeType")
      private final @Nullable Input<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> volumeType;

    public Input<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public ImageRecipeEbsInstanceBlockDeviceSpecificationArgs(
        @Nullable Input<Boolean> deleteOnTermination,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> snapshotId,
        @Nullable Input<Integer> throughput,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private ImageRecipeEbsInstanceBlockDeviceSpecificationArgs() {
        this.deleteOnTermination = Input.empty();
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.kmsKeyId = Input.empty();
        this.snapshotId = Input.empty();
        this.throughput = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeEbsInstanceBlockDeviceSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteOnTermination;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> snapshotId;
        private @Nullable Input<Integer> throughput;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeEbsInstanceBlockDeviceSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Input<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Input.ofNullable(deleteOnTermination);
            return this;
        }

        public Builder encrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder iops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder snapshotId(@Nullable Input<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
            return this;
        }

        public Builder throughput(@Nullable Input<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Input.ofNullable(throughput);
            return this;
        }

        public Builder volumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }

        public Builder volumeType(@Nullable Input<ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(@Nullable ImageRecipeEbsInstanceBlockDeviceSpecificationVolumeType volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public ImageRecipeEbsInstanceBlockDeviceSpecificationArgs build() {
            return new ImageRecipeEbsInstanceBlockDeviceSpecificationArgs(deleteOnTermination, encrypted, iops, kmsKeyId, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
