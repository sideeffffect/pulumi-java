// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotInstanceRequestRootBlockDeviceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestRootBlockDeviceGetArgs Empty = new SpotInstanceRequestRootBlockDeviceGetArgs();

    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    @Import(name="deleteOnTermination")
    private @Nullable Output<Boolean> deleteOnTermination;

    public Optional<Output<Boolean>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    /**
     * Name of the device to mount.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * A map of tags to assign to the device.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    @Import(name="volumeId")
    private @Nullable Output<String> volumeId;

    public Optional<Output<String>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private SpotInstanceRequestRootBlockDeviceGetArgs() {}

    private SpotInstanceRequestRootBlockDeviceGetArgs(SpotInstanceRequestRootBlockDeviceGetArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.deviceName = $.deviceName;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.kmsKeyId = $.kmsKeyId;
        this.tags = $.tags;
        this.throughput = $.throughput;
        this.volumeId = $.volumeId;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotInstanceRequestRootBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotInstanceRequestRootBlockDeviceGetArgs $;

        public Builder() {
            $ = new SpotInstanceRequestRootBlockDeviceGetArgs();
        }

        public Builder(SpotInstanceRequestRootBlockDeviceGetArgs defaults) {
            $ = new SpotInstanceRequestRootBlockDeviceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
        }

        public Builder volumeId(@Nullable Output<String> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(String volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            $.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(Integer volumeSize) {
            return volumeSize(Output.of(volumeSize));
        }

        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public SpotInstanceRequestRootBlockDeviceGetArgs build() {
            return $;
        }
    }

}
