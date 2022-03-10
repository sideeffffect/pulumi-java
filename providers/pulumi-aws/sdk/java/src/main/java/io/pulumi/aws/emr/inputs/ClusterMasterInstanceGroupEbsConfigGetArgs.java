// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceGroupEbsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceGroupEbsConfigGetArgs Empty = new ClusterMasterInstanceGroupEbsConfigGetArgs();

    /**
     * Number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * Volume size, in gibibytes (GiB).
     * 
     */
    @InputImport(name="size", required=true)
      private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * Volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
     */
    @InputImport(name="volumesPerInstance")
      private final @Nullable Input<Integer> volumesPerInstance;

    public Input<Integer> getVolumesPerInstance() {
        return this.volumesPerInstance == null ? Input.empty() : this.volumesPerInstance;
    }

    public ClusterMasterInstanceGroupEbsConfigGetArgs(
        @Nullable Input<Integer> iops,
        Input<Integer> size,
        Input<String> type,
        @Nullable Input<Integer> volumesPerInstance) {
        this.iops = iops;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.volumesPerInstance = volumesPerInstance;
    }

    private ClusterMasterInstanceGroupEbsConfigGetArgs() {
        this.iops = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
        this.volumesPerInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceGroupEbsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> iops;
        private Input<Integer> size;
        private Input<String> type;
        private @Nullable Input<Integer> volumesPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceGroupEbsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        public Builder iops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
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

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder volumesPerInstance(@Nullable Input<Integer> volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }

        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = Input.ofNullable(volumesPerInstance);
            return this;
        }
        public ClusterMasterInstanceGroupEbsConfigGetArgs build() {
            return new ClusterMasterInstanceGroupEbsConfigGetArgs(iops, size, type, volumesPerInstance);
        }
    }
}
