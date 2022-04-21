// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * AcceleratorConfig represents a Hardware Accelerator request.
 * 
 */
public final class AcceleratorConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AcceleratorConfigResponse Empty = new AcceleratorConfigResponse();

    /**
     * The number of the accelerator cards exposed to an instance.
     * 
     */
    @Import(name="acceleratorCount", required=true)
    private String acceleratorCount;

    public String acceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus)
     * 
     */
    @Import(name="acceleratorType", required=true)
    private String acceleratorType;

    public String acceleratorType() {
        return this.acceleratorType;
    }

    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA [mig user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    @Import(name="gpuPartitionSize", required=true)
    private String gpuPartitionSize;

    public String gpuPartitionSize() {
        return this.gpuPartitionSize;
    }

    private AcceleratorConfigResponse() {}

    private AcceleratorConfigResponse(AcceleratorConfigResponse $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
        this.gpuPartitionSize = $.gpuPartitionSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorConfigResponse $;

        public Builder() {
            $ = new AcceleratorConfigResponse();
        }

        public Builder(AcceleratorConfigResponse defaults) {
            $ = new AcceleratorConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorCount(String acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder gpuPartitionSize(String gpuPartitionSize) {
            $.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public AcceleratorConfigResponse build() {
            $.acceleratorCount = Objects.requireNonNull($.acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            $.gpuPartitionSize = Objects.requireNonNull($.gpuPartitionSize, "expected parameter 'gpuPartitionSize' to be non-null");
            return $;
        }
    }

}
