// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceRootBlockDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceRootBlockDeviceArgs Empty = new InstanceRootBlockDeviceArgs();

    @Import(name="deleteOnTermination")
    private @Nullable Output<Boolean> deleteOnTermination;

    public Optional<Output<Boolean>> deleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }

    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
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

    private InstanceRootBlockDeviceArgs() {}

    private InstanceRootBlockDeviceArgs(InstanceRootBlockDeviceArgs $) {
        this.deleteOnTermination = $.deleteOnTermination;
        this.iops = $.iops;
        this.volumeSize = $.volumeSize;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceRootBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceRootBlockDeviceArgs $;

        public Builder() {
            $ = new InstanceRootBlockDeviceArgs();
        }

        public Builder(InstanceRootBlockDeviceArgs defaults) {
            $ = new InstanceRootBlockDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            $.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            return deleteOnTermination(Output.of(deleteOnTermination));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
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

        public InstanceRootBlockDeviceArgs build() {
            return $;
        }
    }

}
