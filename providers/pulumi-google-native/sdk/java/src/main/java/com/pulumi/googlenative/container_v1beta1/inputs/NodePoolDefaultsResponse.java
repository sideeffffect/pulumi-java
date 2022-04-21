// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.NodeConfigDefaultsResponse;
import java.util.Objects;


/**
 * Subset of Nodepool message that has defaults.
 * 
 */
public final class NodePoolDefaultsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NodePoolDefaultsResponse Empty = new NodePoolDefaultsResponse();

    /**
     * Subset of NodeConfig message that has defaults.
     * 
     */
    @Import(name="nodeConfigDefaults", required=true)
    private NodeConfigDefaultsResponse nodeConfigDefaults;

    public NodeConfigDefaultsResponse nodeConfigDefaults() {
        return this.nodeConfigDefaults;
    }

    private NodePoolDefaultsResponse() {}

    private NodePoolDefaultsResponse(NodePoolDefaultsResponse $) {
        this.nodeConfigDefaults = $.nodeConfigDefaults;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolDefaultsResponse $;

        public Builder() {
            $ = new NodePoolDefaultsResponse();
        }

        public Builder(NodePoolDefaultsResponse defaults) {
            $ = new NodePoolDefaultsResponse(Objects.requireNonNull(defaults));
        }

        public Builder nodeConfigDefaults(NodeConfigDefaultsResponse nodeConfigDefaults) {
            $.nodeConfigDefaults = nodeConfigDefaults;
            return this;
        }

        public NodePoolDefaultsResponse build() {
            $.nodeConfigDefaults = Objects.requireNonNull($.nodeConfigDefaults, "expected parameter 'nodeConfigDefaults' to be non-null");
            return $;
        }
    }

}
