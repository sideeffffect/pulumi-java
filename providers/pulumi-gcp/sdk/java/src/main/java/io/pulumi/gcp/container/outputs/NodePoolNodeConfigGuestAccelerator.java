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
public final class NodePoolNodeConfigGuestAccelerator {
    private final Integer count;
    private final @Nullable String gpuPartitionSize;
    private final String type;

    @OutputCustomType.Constructor
    private NodePoolNodeConfigGuestAccelerator(
        @OutputCustomType.Parameter("count") Integer count,
        @OutputCustomType.Parameter("gpuPartitionSize") @Nullable String gpuPartitionSize,
        @OutputCustomType.Parameter("type") String type) {
        this.count = count;
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = type;
    }

    public Integer getCount() {
        return this.count;
    }
    public Optional<String> getGpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private @Nullable String gpuPartitionSize;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder gpuPartitionSize(@Nullable String gpuPartitionSize) {
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public NodePoolNodeConfigGuestAccelerator build() {
            return new NodePoolNodeConfigGuestAccelerator(count, gpuPartitionSize, type);
        }
    }
}
