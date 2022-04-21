// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an edge within the web service&#39;s graph.
 * 
 */
public final class GraphEdgeResponse extends com.pulumi.resources.InvokeArgs {

    public static final GraphEdgeResponse Empty = new GraphEdgeResponse();

    /**
     * The source graph node&#39;s identifier.
     * 
     */
    @Import(name="sourceNodeId")
    private @Nullable String sourceNodeId;

    public Optional<String> sourceNodeId() {
        return Optional.ofNullable(this.sourceNodeId);
    }

    /**
     * The identifier of the source node&#39;s port that the edge connects from.
     * 
     */
    @Import(name="sourcePortId")
    private @Nullable String sourcePortId;

    public Optional<String> sourcePortId() {
        return Optional.ofNullable(this.sourcePortId);
    }

    /**
     * The destination graph node&#39;s identifier.
     * 
     */
    @Import(name="targetNodeId")
    private @Nullable String targetNodeId;

    public Optional<String> targetNodeId() {
        return Optional.ofNullable(this.targetNodeId);
    }

    /**
     * The identifier of the destination node&#39;s port that the edge connects into.
     * 
     */
    @Import(name="targetPortId")
    private @Nullable String targetPortId;

    public Optional<String> targetPortId() {
        return Optional.ofNullable(this.targetPortId);
    }

    private GraphEdgeResponse() {}

    private GraphEdgeResponse(GraphEdgeResponse $) {
        this.sourceNodeId = $.sourceNodeId;
        this.sourcePortId = $.sourcePortId;
        this.targetNodeId = $.targetNodeId;
        this.targetPortId = $.targetPortId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphEdgeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphEdgeResponse $;

        public Builder() {
            $ = new GraphEdgeResponse();
        }

        public Builder(GraphEdgeResponse defaults) {
            $ = new GraphEdgeResponse(Objects.requireNonNull(defaults));
        }

        public Builder sourceNodeId(@Nullable String sourceNodeId) {
            $.sourceNodeId = sourceNodeId;
            return this;
        }

        public Builder sourcePortId(@Nullable String sourcePortId) {
            $.sourcePortId = sourcePortId;
            return this;
        }

        public Builder targetNodeId(@Nullable String targetNodeId) {
            $.targetNodeId = targetNodeId;
            return this;
        }

        public Builder targetPortId(@Nullable String targetPortId) {
            $.targetPortId = targetPortId;
            return this;
        }

        public GraphEdgeResponse build() {
            return $;
        }
    }

}
