// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class NodePoolNodeConfigLinuxNodeConfigArgs extends ResourceArgs {

    public static final NodePoolNodeConfigLinuxNodeConfigArgs Empty = new NodePoolNodeConfigLinuxNodeConfigArgs();

    @Import(name="sysctls", required=true)
    private Output<Map<String,String>> sysctls;

    public Output<Map<String,String>> sysctls() {
        return this.sysctls;
    }

    private NodePoolNodeConfigLinuxNodeConfigArgs() {}

    private NodePoolNodeConfigLinuxNodeConfigArgs(NodePoolNodeConfigLinuxNodeConfigArgs $) {
        this.sysctls = $.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigLinuxNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigLinuxNodeConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigLinuxNodeConfigArgs();
        }

        public Builder(NodePoolNodeConfigLinuxNodeConfigArgs defaults) {
            $ = new NodePoolNodeConfigLinuxNodeConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder sysctls(Output<Map<String,String>> sysctls) {
            $.sysctls = sysctls;
            return this;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            return sysctls(Output.of(sysctls));
        }

        public NodePoolNodeConfigLinuxNodeConfigArgs build() {
            $.sysctls = Objects.requireNonNull($.sysctls, "expected parameter 'sysctls' to be non-null");
            return $;
        }
    }

}
