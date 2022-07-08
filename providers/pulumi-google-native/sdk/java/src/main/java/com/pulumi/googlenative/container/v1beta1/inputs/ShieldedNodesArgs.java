// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of Shielded Nodes feature.
 * 
 */
public final class ShieldedNodesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedNodesArgs Empty = new ShieldedNodesArgs();

    /**
     * Whether Shielded Nodes features are enabled on all nodes in this cluster.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether Shielded Nodes features are enabled on all nodes in this cluster.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ShieldedNodesArgs() {}

    private ShieldedNodesArgs(ShieldedNodesArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedNodesArgs $;

        public Builder() {
            $ = new ShieldedNodesArgs();
        }

        public Builder(ShieldedNodesArgs defaults) {
            $ = new ShieldedNodesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Shielded Nodes features are enabled on all nodes in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether Shielded Nodes features are enabled on all nodes in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ShieldedNodesArgs build() {
            return $;
        }
    }

}
