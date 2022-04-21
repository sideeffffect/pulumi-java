// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchConfigurationRootBlockDeviceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationRootBlockDeviceGetArgs Empty = new LaunchConfigurationRootBlockDeviceGetArgs();

    @Import(name="deleteOnTermination")
    private @Nullable Output<Boolean> deleteOnTermination;

    public Optional<Output<Boolean>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    @Import(name="volumeSize")
    private @Nullable Output<Integer> volumeSize;

    public Optional<Output<Integer>> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private LaunchConfigurationRootBlockDeviceGetArgs() {}

    private LaunchConfigurationRootBlockDeviceGetArgs(LaunchConfigurationRootBlockDeviceGetArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.encrypted = $.encrypted;
        this.iops = $.iops;
        this.throughput = $.throughput;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchConfigurationRootBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchConfigurationRootBlockDeviceGetArgs $;

        public Builder() {
            $ = new LaunchConfigurationRootBlockDeviceGetArgs();
        }

        public Builder(LaunchConfigurationRootBlockDeviceGetArgs defaults) {
            $ = new LaunchConfigurationRootBlockDeviceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
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

        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
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

        public LaunchConfigurationRootBlockDeviceGetArgs build() {
            return $;
        }
    }

}
