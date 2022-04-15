// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticWebLayerEbsVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticWebLayerEbsVolumeGetArgs Empty = new StaticWebLayerEbsVolumeGetArgs();

    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> encrypted() {
        return this.encrypted == null ? Codegen.empty() : this.encrypted;
    }

    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> iops() {
        return this.iops == null ? Codegen.empty() : this.iops;
    }

    /**
     * The path to mount the EBS volume on the layer's instances.
     * 
     */
    @Import(name="mountPoint", required=true)
      private final Output<String> mountPoint;

    public Output<String> mountPoint() {
        return this.mountPoint;
    }

    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    @Import(name="numberOfDisks", required=true)
      private final Output<Integer> numberOfDisks;

    public Output<Integer> numberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * The RAID level to use for the volume.
     * 
     */
    @Import(name="raidLevel")
      private final @Nullable Output<String> raidLevel;

    public Output<String> raidLevel() {
        return this.raidLevel == null ? Codegen.empty() : this.raidLevel;
    }

    /**
     * The size of the volume in gigabytes.
     * 
     */
    @Import(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public StaticWebLayerEbsVolumeGetArgs(
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        Output<String> mountPoint,
        Output<Integer> numberOfDisks,
        @Nullable Output<String> raidLevel,
        Output<Integer> size,
        @Nullable Output<String> type) {
        this.encrypted = encrypted;
        this.iops = iops;
        this.mountPoint = Objects.requireNonNull(mountPoint, "expected parameter 'mountPoint' to be non-null");
        this.numberOfDisks = Objects.requireNonNull(numberOfDisks, "expected parameter 'numberOfDisks' to be non-null");
        this.raidLevel = raidLevel;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = type;
    }

    private StaticWebLayerEbsVolumeGetArgs() {
        this.encrypted = Codegen.empty();
        this.iops = Codegen.empty();
        this.mountPoint = Codegen.empty();
        this.numberOfDisks = Codegen.empty();
        this.raidLevel = Codegen.empty();
        this.size = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticWebLayerEbsVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private Output<String> mountPoint;
        private Output<Integer> numberOfDisks;
        private @Nullable Output<String> raidLevel;
        private Output<Integer> size;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticWebLayerEbsVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.mountPoint = defaults.mountPoint;
    	      this.numberOfDisks = defaults.numberOfDisks;
    	      this.raidLevel = defaults.raidLevel;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Codegen.ofNullable(encrypted);
            return this;
        }
        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Codegen.ofNullable(iops);
            return this;
        }
        public Builder mountPoint(Output<String> mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Output.of(Objects.requireNonNull(mountPoint));
            return this;
        }
        public Builder numberOfDisks(Output<Integer> numberOfDisks) {
            this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
            return this;
        }
        public Builder numberOfDisks(Integer numberOfDisks) {
            this.numberOfDisks = Output.of(Objects.requireNonNull(numberOfDisks));
            return this;
        }
        public Builder raidLevel(@Nullable Output<String> raidLevel) {
            this.raidLevel = raidLevel;
            return this;
        }
        public Builder raidLevel(@Nullable String raidLevel) {
            this.raidLevel = Codegen.ofNullable(raidLevel);
            return this;
        }
        public Builder size(Output<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public StaticWebLayerEbsVolumeGetArgs build() {
            return new StaticWebLayerEbsVolumeGetArgs(encrypted, iops, mountPoint, numberOfDisks, raidLevel, size, type);
        }
    }
}
