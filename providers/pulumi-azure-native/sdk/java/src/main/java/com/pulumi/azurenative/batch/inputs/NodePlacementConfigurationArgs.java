// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.NodePlacementPolicyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allocation configuration used by Batch Service to provision the nodes.
 * 
 */
public final class NodePlacementConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePlacementConfigurationArgs Empty = new NodePlacementConfigurationArgs();

    /**
     * Allocation policy used by Batch Service to provision the nodes. If not specified, Batch will use the regional policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<NodePlacementPolicyType> policy;

    public Optional<Output<NodePlacementPolicyType>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private NodePlacementConfigurationArgs() {}

    private NodePlacementConfigurationArgs(NodePlacementConfigurationArgs $) {
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePlacementConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePlacementConfigurationArgs $;

        public Builder() {
            $ = new NodePlacementConfigurationArgs();
        }

        public Builder(NodePlacementConfigurationArgs defaults) {
            $ = new NodePlacementConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder policy(@Nullable Output<NodePlacementPolicyType> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(NodePlacementPolicyType policy) {
            return policy(Output.of(policy));
        }

        public NodePlacementConfigurationArgs build() {
            return $;
        }
    }

}
