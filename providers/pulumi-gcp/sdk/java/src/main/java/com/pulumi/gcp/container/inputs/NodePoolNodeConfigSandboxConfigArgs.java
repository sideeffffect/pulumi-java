// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class NodePoolNodeConfigSandboxConfigArgs extends ResourceArgs {

    public static final NodePoolNodeConfigSandboxConfigArgs Empty = new NodePoolNodeConfigSandboxConfigArgs();

    @Import(name="sandboxType", required=true)
    private Output<String> sandboxType;

    public Output<String> sandboxType() {
        return this.sandboxType;
    }

    private NodePoolNodeConfigSandboxConfigArgs() {}

    private NodePoolNodeConfigSandboxConfigArgs(NodePoolNodeConfigSandboxConfigArgs $) {
        this.sandboxType = $.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigSandboxConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigSandboxConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigSandboxConfigArgs();
        }

        public Builder(NodePoolNodeConfigSandboxConfigArgs defaults) {
            $ = new NodePoolNodeConfigSandboxConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder sandboxType(Output<String> sandboxType) {
            $.sandboxType = sandboxType;
            return this;
        }

        public Builder sandboxType(String sandboxType) {
            return sandboxType(Output.of(sandboxType));
        }

        public NodePoolNodeConfigSandboxConfigArgs build() {
            $.sandboxType = Objects.requireNonNull($.sandboxType, "expected parameter 'sandboxType' to be non-null");
            return $;
        }
    }

}
