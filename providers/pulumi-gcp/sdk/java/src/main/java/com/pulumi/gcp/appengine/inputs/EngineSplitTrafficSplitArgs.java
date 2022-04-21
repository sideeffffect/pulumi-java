// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EngineSplitTrafficSplitArgs extends com.pulumi.resources.ResourceArgs {

    public static final EngineSplitTrafficSplitArgs Empty = new EngineSplitTrafficSplitArgs();

    /**
     * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits.
     * 
     */
    @Import(name="allocations", required=true)
    private Output<Map<String,String>> allocations;

    public Output<Map<String,String>> allocations() {
        return this.allocations;
    }

    /**
     * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed.
     * Possible values are `UNSPECIFIED`, `COOKIE`, `IP`, and `RANDOM`.
     * 
     */
    @Import(name="shardBy")
    private @Nullable Output<String> shardBy;

    public Optional<Output<String>> shardBy() {
        return Optional.ofNullable(this.shardBy);
    }

    private EngineSplitTrafficSplitArgs() {}

    private EngineSplitTrafficSplitArgs(EngineSplitTrafficSplitArgs $) {
        this.allocations = $.allocations;
        this.shardBy = $.shardBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EngineSplitTrafficSplitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EngineSplitTrafficSplitArgs $;

        public Builder() {
            $ = new EngineSplitTrafficSplitArgs();
        }

        public Builder(EngineSplitTrafficSplitArgs defaults) {
            $ = new EngineSplitTrafficSplitArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocations(Output<Map<String,String>> allocations) {
            $.allocations = allocations;
            return this;
        }

        public Builder allocations(Map<String,String> allocations) {
            return allocations(Output.of(allocations));
        }

        public Builder shardBy(@Nullable Output<String> shardBy) {
            $.shardBy = shardBy;
            return this;
        }

        public Builder shardBy(String shardBy) {
            return shardBy(Output.of(shardBy));
        }

        public EngineSplitTrafficSplitArgs build() {
            $.allocations = Objects.requireNonNull($.allocations, "expected parameter 'allocations' to be non-null");
            return $;
        }
    }

}
