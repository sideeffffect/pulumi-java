// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodeConfigSandboxConfigArgs extends ResourceArgs {

    public static final ClusterNodeConfigSandboxConfigArgs Empty = new ClusterNodeConfigSandboxConfigArgs();

    /**
     * Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    @Import(name="sandboxType", required=true)
    private Output<String> sandboxType;

    /**
     * @return Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    public Output<String> sandboxType() {
        return this.sandboxType;
    }

    private ClusterNodeConfigSandboxConfigArgs() {}

    private ClusterNodeConfigSandboxConfigArgs(ClusterNodeConfigSandboxConfigArgs $) {
        this.sandboxType = $.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigSandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigSandboxConfigArgs $;

        public Builder() {
            $ = new ClusterNodeConfigSandboxConfigArgs();
        }

        public Builder(ClusterNodeConfigSandboxConfigArgs defaults) {
            $ = new ClusterNodeConfigSandboxConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sandboxType Which sandbox to use for pods in the node pool.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder sandboxType(Output<String> sandboxType) {
            $.sandboxType = sandboxType;
            return this;
        }

        /**
         * @param sandboxType Which sandbox to use for pods in the node pool.
         * Accepted values are:
         * 
         * @return builder
         * 
         */
        public Builder sandboxType(String sandboxType) {
            return sandboxType(Output.of(sandboxType));
        }

        public ClusterNodeConfigSandboxConfigArgs build() {
            $.sandboxType = Objects.requireNonNull($.sandboxType, "expected parameter 'sandboxType' to be non-null");
            return $;
        }
    }

}
