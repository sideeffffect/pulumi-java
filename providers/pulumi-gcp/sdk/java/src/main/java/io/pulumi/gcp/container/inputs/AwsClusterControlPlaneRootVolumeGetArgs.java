// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneRootVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneRootVolumeGetArgs Empty = new AwsClusterControlPlaneRootVolumeGetArgs();

    /**
     * Optional. The number of I/O operations per second (IOPS) to provision for GP3 volume.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    /**
     * Optional. The size of the volume, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @Import(name="sizeGib")
      private final @Nullable Output<Integer> sizeGib;

    public Output<Integer> sizeGib() {
        return this.sizeGib == null ? Codegen.empty() : this.sizeGib;
    }

    /**
     * Optional. Type of the EBS volume. When unspecified, it defaults to GP2 volume. Possible values: VOLUME_TYPE_UNSPECIFIED, GP2, GP3
     * 
     */
    @Import(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> volumeType() {
        return this.volumeType == null ? Codegen.empty() : this.volumeType;
    }

    public AwsClusterControlPlaneRootVolumeGetArgs(
        @Nullable Output<Integer> iops,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<Integer> sizeGib,
        @Nullable Output<String> volumeType) {
        this.iops = iops;
        this.kmsKeyArn = kmsKeyArn;
        this.sizeGib = sizeGib;
        this.volumeType = volumeType;
    }

    private AwsClusterControlPlaneRootVolumeGetArgs() {
        this.iops = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
        this.sizeGib = Codegen.empty();
        this.volumeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneRootVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<Integer> sizeGib;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneRootVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.sizeGib = defaults.sizeGib;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder sizeGib(@Nullable Output<Integer> sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }
        public Builder sizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = Codegen.ofNullable(sizeGib);
            return this;
        }
        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Codegen.ofNullable(volumeType);
            return this;
        }        public AwsClusterControlPlaneRootVolumeGetArgs build() {
            return new AwsClusterControlPlaneRootVolumeGetArgs(iops, kmsKeyArn, sizeGib, volumeType);
        }
    }
}
