// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MysqlLayerEbsVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlLayerEbsVolumeArgs Empty = new MysqlLayerEbsVolumeArgs();

    @InputImport(name="encrypted")
      private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * The path to mount the EBS volume on the layer's instances.
     * 
     */
    @InputImport(name="mountPoint", required=true)
      private final Input<String> mountPoint;

    public Input<String> getMountPoint() {
        return this.mountPoint;
    }

    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    @InputImport(name="numberOfDisks", required=true)
      private final Input<Integer> numberOfDisks;

    public Input<Integer> getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * The RAID level to use for the volume.
     * 
     */
    @InputImport(name="raidLevel")
      private final @Nullable Input<String> raidLevel;

    public Input<String> getRaidLevel() {
        return this.raidLevel == null ? Input.empty() : this.raidLevel;
    }

    /**
     * The size of the volume in gigabytes.
     * 
     */
    @InputImport(name="size", required=true)
      private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public MysqlLayerEbsVolumeArgs(
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        Input<String> mountPoint,
        Input<Integer> numberOfDisks,
        @Nullable Input<String> raidLevel,
        Input<Integer> size,
        @Nullable Input<String> type) {
        this.encrypted = encrypted;
        this.iops = iops;
        this.mountPoint = Objects.requireNonNull(mountPoint, "expected parameter 'mountPoint' to be non-null");
        this.numberOfDisks = Objects.requireNonNull(numberOfDisks, "expected parameter 'numberOfDisks' to be non-null");
        this.raidLevel = raidLevel;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = type;
    }

    private MysqlLayerEbsVolumeArgs() {
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.mountPoint = Input.empty();
        this.numberOfDisks = Input.empty();
        this.raidLevel = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlLayerEbsVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private Input<String> mountPoint;
        private Input<Integer> numberOfDisks;
        private @Nullable Input<String> raidLevel;
        private Input<Integer> size;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlLayerEbsVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.mountPoint = defaults.mountPoint;
    	      this.numberOfDisks = defaults.numberOfDisks;
    	      this.raidLevel = defaults.raidLevel;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
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

        public Builder mountPoint(Input<String> mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Input.of(Objects.requireNonNull(mountPoint));
            return this;
        }

        public Builder numberOfDisks(Input<Integer> numberOfDisks) {
            this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
            return this;
        }

        public Builder numberOfDisks(Integer numberOfDisks) {
            this.numberOfDisks = Input.of(Objects.requireNonNull(numberOfDisks));
            return this;
        }

        public Builder raidLevel(@Nullable Input<String> raidLevel) {
            this.raidLevel = raidLevel;
            return this;
        }

        public Builder raidLevel(@Nullable String raidLevel) {
            this.raidLevel = Input.ofNullable(raidLevel);
            return this;
        }

        public Builder size(Input<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Input.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public MysqlLayerEbsVolumeArgs build() {
            return new MysqlLayerEbsVolumeArgs(encrypted, iops, mountPoint, numberOfDisks, raidLevel, size, type);
        }
    }
}
