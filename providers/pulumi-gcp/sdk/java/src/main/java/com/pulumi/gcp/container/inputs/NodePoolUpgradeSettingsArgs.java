// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolUpgradeSettingsArgs extends ResourceArgs {

    public static final NodePoolUpgradeSettingsArgs Empty = new NodePoolUpgradeSettingsArgs();

    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    @Import(name="maxSurge", required=true)
    private Output<Integer> maxSurge;

    /**
     * @return The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    public Output<Integer> maxSurge() {
        return this.maxSurge;
    }

    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    @Import(name="maxUnavailable", required=true)
    private Output<Integer> maxUnavailable;

    /**
     * @return The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    public Output<Integer> maxUnavailable() {
        return this.maxUnavailable;
    }

    private NodePoolUpgradeSettingsArgs() {}

    private NodePoolUpgradeSettingsArgs(NodePoolUpgradeSettingsArgs $) {
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolUpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolUpgradeSettingsArgs $;

        public Builder() {
            $ = new NodePoolUpgradeSettingsArgs();
        }

        public Builder(NodePoolUpgradeSettingsArgs defaults) {
            $ = new NodePoolUpgradeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxSurge The number of additional nodes that can be added to the node pool during
         * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
         * Can be set to 0 or greater.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(Output<Integer> maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxSurge The number of additional nodes that can be added to the node pool during
         * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
         * Can be set to 0 or greater.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(Integer maxSurge) {
            return maxSurge(Output.of(maxSurge));
        }

        /**
         * @param maxUnavailable The number of nodes that can be simultaneously unavailable during
         * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
         * parallel. Can be set to 0 or greater.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Output<Integer> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable The number of nodes that can be simultaneously unavailable during
         * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
         * parallel. Can be set to 0 or greater.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        public NodePoolUpgradeSettingsArgs build() {
            $.maxSurge = Objects.requireNonNull($.maxSurge, "expected parameter 'maxSurge' to be non-null");
            $.maxUnavailable = Objects.requireNonNull($.maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
            return $;
        }
    }

}
