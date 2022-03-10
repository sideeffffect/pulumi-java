// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AwsClusterControlPlaneRootVolume {
    /**
     * Optional. The number of I/O operations per second (IOPS) to provision for GP3 volume.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * Optional. The size of the volume, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    private final @Nullable Integer sizeGib;
    /**
     * Optional. Type of the EBS volume. When unspecified, it defaults to GP2 volume. Possible values: VOLUME_TYPE_UNSPECIFIED, GP2, GP3
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor
    private AwsClusterControlPlaneRootVolume(
        @OutputCustomType.Parameter("iops") @Nullable Integer iops,
        @OutputCustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @OutputCustomType.Parameter("sizeGib") @Nullable Integer sizeGib,
        @OutputCustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.iops = iops;
        this.kmsKeyArn = kmsKeyArn;
        this.sizeGib = sizeGib;
        this.volumeType = volumeType;
    }

    /**
     * Optional. The number of I/O operations per second (IOPS) to provision for GP3 volume.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * Optional. The size of the volume, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
    */
    public Optional<Integer> getSizeGib() {
        return Optional.ofNullable(this.sizeGib);
    }
    /**
     * Optional. Type of the EBS volume. When unspecified, it defaults to GP2 volume. Possible values: VOLUME_TYPE_UNSPECIFIED, GP2, GP3
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneRootVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer iops;
        private @Nullable String kmsKeyArn;
        private @Nullable Integer sizeGib;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneRootVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.sizeGib = defaults.sizeGib;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder sizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public AwsClusterControlPlaneRootVolume build() {
            return new AwsClusterControlPlaneRootVolume(iops, kmsKeyArn, sizeGib, volumeType);
        }
    }
}
