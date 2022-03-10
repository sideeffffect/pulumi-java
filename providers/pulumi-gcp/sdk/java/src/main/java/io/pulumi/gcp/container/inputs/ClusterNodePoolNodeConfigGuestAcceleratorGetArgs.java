// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigGuestAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigGuestAcceleratorGetArgs Empty = new ClusterNodePoolNodeConfigGuestAcceleratorGetArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    @InputImport(name="gpuPartitionSize")
      private final @Nullable Input<String> gpuPartitionSize;

    public Input<String> getGpuPartitionSize() {
        return this.gpuPartitionSize == null ? Input.empty() : this.gpuPartitionSize;
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ClusterNodePoolNodeConfigGuestAcceleratorGetArgs(
        Input<Integer> count,
        @Nullable Input<String> gpuPartitionSize,
        Input<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ClusterNodePoolNodeConfigGuestAcceleratorGetArgs() {
        this.count = Input.empty();
        this.gpuPartitionSize = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private @Nullable Input<String> gpuPartitionSize;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder count(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder gpuPartitionSize(@Nullable Input<String> gpuPartitionSize) {
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder gpuPartitionSize(@Nullable String gpuPartitionSize) {
            this.gpuPartitionSize = Input.ofNullable(gpuPartitionSize);
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
        public ClusterNodePoolNodeConfigGuestAcceleratorGetArgs build() {
            return new ClusterNodePoolNodeConfigGuestAcceleratorGetArgs(count, gpuPartitionSize, type);
        }
    }
}
