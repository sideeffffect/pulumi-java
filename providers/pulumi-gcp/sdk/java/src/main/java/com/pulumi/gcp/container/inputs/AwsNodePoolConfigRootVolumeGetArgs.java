// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsNodePoolConfigRootVolumeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigRootVolumeGetArgs Empty = new AwsNodePoolConfigRootVolumeGetArgs();

    /**
     * Optional. The number of I/O operations per second (IOPS) to provision for GP3 volume.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * Optional. The size of the volume, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @Import(name="sizeGib")
    private @Nullable Output<Integer> sizeGib;

    public Optional<Output<Integer>> sizeGib() {
        return Optional.ofNullable(this.sizeGib);
    }

    /**
     * Optional. Type of the EBS volume. When unspecified, it defaults to GP2 volume. Possible values: VOLUME_TYPE_UNSPECIFIED, GP2, GP3
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private AwsNodePoolConfigRootVolumeGetArgs() {}

    private AwsNodePoolConfigRootVolumeGetArgs(AwsNodePoolConfigRootVolumeGetArgs $) {
        this.iops = $.iops;
        this.kmsKeyArn = $.kmsKeyArn;
        this.sizeGib = $.sizeGib;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsNodePoolConfigRootVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsNodePoolConfigRootVolumeGetArgs $;

        public Builder() {
            $ = new AwsNodePoolConfigRootVolumeGetArgs();
        }

        public Builder(AwsNodePoolConfigRootVolumeGetArgs defaults) {
            $ = new AwsNodePoolConfigRootVolumeGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public Builder sizeGib(@Nullable Output<Integer> sizeGib) {
            $.sizeGib = sizeGib;
            return this;
        }

        public Builder sizeGib(Integer sizeGib) {
            return sizeGib(Output.of(sizeGib));
        }

        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public AwsNodePoolConfigRootVolumeGetArgs build() {
            return $;
        }
    }

}
