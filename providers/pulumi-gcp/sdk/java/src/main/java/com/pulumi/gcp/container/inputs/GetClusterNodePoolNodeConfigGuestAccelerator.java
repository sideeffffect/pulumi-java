// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolNodeConfigGuestAccelerator extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolNodeConfigGuestAccelerator Empty = new GetClusterNodePoolNodeConfigGuestAccelerator();

    @Import(name="count", required=true)
    private Integer count;

    public Integer count() {
        return this.count;
    }

    @Import(name="gpuPartitionSize", required=true)
    private String gpuPartitionSize;

    public String gpuPartitionSize() {
        return this.gpuPartitionSize;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetClusterNodePoolNodeConfigGuestAccelerator() {}

    private GetClusterNodePoolNodeConfigGuestAccelerator(GetClusterNodePoolNodeConfigGuestAccelerator $) {
        this.count = $.count;
        this.gpuPartitionSize = $.gpuPartitionSize;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterNodePoolNodeConfigGuestAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterNodePoolNodeConfigGuestAccelerator $;

        public Builder() {
            $ = new GetClusterNodePoolNodeConfigGuestAccelerator();
        }

        public Builder(GetClusterNodePoolNodeConfigGuestAccelerator defaults) {
            $ = new GetClusterNodePoolNodeConfigGuestAccelerator(Objects.requireNonNull(defaults));
        }

        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        public Builder gpuPartitionSize(String gpuPartitionSize) {
            $.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetClusterNodePoolNodeConfigGuestAccelerator build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.gpuPartitionSize = Objects.requireNonNull($.gpuPartitionSize, "expected parameter 'gpuPartitionSize' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
