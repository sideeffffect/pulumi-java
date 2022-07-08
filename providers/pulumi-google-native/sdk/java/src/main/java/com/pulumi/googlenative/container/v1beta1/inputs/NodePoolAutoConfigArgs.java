// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.inputs.NetworkTagsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * node pool configs that apply to all auto-provisioned node pools in autopilot clusters and node auto-provisioning enabled clusters
 * 
 */
public final class NodePoolAutoConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolAutoConfigArgs Empty = new NodePoolAutoConfigArgs();

    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation. Each tag within the list must comply with RFC1035.
     * 
     */
    @Import(name="networkTags")
    private @Nullable Output<NetworkTagsArgs> networkTags;

    /**
     * @return The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation. Each tag within the list must comply with RFC1035.
     * 
     */
    public Optional<Output<NetworkTagsArgs>> networkTags() {
        return Optional.ofNullable(this.networkTags);
    }

    private NodePoolAutoConfigArgs() {}

    private NodePoolAutoConfigArgs(NodePoolAutoConfigArgs $) {
        this.networkTags = $.networkTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolAutoConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolAutoConfigArgs $;

        public Builder() {
            $ = new NodePoolAutoConfigArgs();
        }

        public Builder(NodePoolAutoConfigArgs defaults) {
            $ = new NodePoolAutoConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkTags The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation. Each tag within the list must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder networkTags(@Nullable Output<NetworkTagsArgs> networkTags) {
            $.networkTags = networkTags;
            return this;
        }

        /**
         * @param networkTags The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation. Each tag within the list must comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder networkTags(NetworkTagsArgs networkTags) {
            return networkTags(Output.of(networkTags));
        }

        public NodePoolAutoConfigArgs build() {
            return $;
        }
    }

}
