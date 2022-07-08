// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.inputs.NodeConfigDefaultsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subset of Nodepool message that has defaults.
 * 
 */
public final class NodePoolDefaultsArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolDefaultsArgs Empty = new NodePoolDefaultsArgs();

    /**
     * Subset of NodeConfig message that has defaults.
     * 
     */
    @Import(name="nodeConfigDefaults")
    private @Nullable Output<NodeConfigDefaultsArgs> nodeConfigDefaults;

    /**
     * @return Subset of NodeConfig message that has defaults.
     * 
     */
    public Optional<Output<NodeConfigDefaultsArgs>> nodeConfigDefaults() {
        return Optional.ofNullable(this.nodeConfigDefaults);
    }

    private NodePoolDefaultsArgs() {}

    private NodePoolDefaultsArgs(NodePoolDefaultsArgs $) {
        this.nodeConfigDefaults = $.nodeConfigDefaults;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolDefaultsArgs $;

        public Builder() {
            $ = new NodePoolDefaultsArgs();
        }

        public Builder(NodePoolDefaultsArgs defaults) {
            $ = new NodePoolDefaultsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeConfigDefaults Subset of NodeConfig message that has defaults.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfigDefaults(@Nullable Output<NodeConfigDefaultsArgs> nodeConfigDefaults) {
            $.nodeConfigDefaults = nodeConfigDefaults;
            return this;
        }

        /**
         * @param nodeConfigDefaults Subset of NodeConfig message that has defaults.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfigDefaults(NodeConfigDefaultsArgs nodeConfigDefaults) {
            return nodeConfigDefaults(Output.of(nodeConfigDefaults));
        }

        public NodePoolDefaultsArgs build() {
            return $;
        }
    }

}
