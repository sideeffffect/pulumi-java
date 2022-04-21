// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ClusterNodeConfigLinuxNodeConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigLinuxNodeConfigGetArgs Empty = new ClusterNodeConfigLinuxNodeConfigGetArgs();

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    @Import(name="sysctls", required=true)
    private Output<Map<String,String>> sysctls;

    public Output<Map<String,String>> sysctls() {
        return this.sysctls;
    }

    private ClusterNodeConfigLinuxNodeConfigGetArgs() {}

    private ClusterNodeConfigLinuxNodeConfigGetArgs(ClusterNodeConfigLinuxNodeConfigGetArgs $) {
        this.sysctls = $.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigLinuxNodeConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigLinuxNodeConfigGetArgs $;

        public Builder() {
            $ = new ClusterNodeConfigLinuxNodeConfigGetArgs();
        }

        public Builder(ClusterNodeConfigLinuxNodeConfigGetArgs defaults) {
            $ = new ClusterNodeConfigLinuxNodeConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder sysctls(Output<Map<String,String>> sysctls) {
            $.sysctls = sysctls;
            return this;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            return sysctls(Output.of(sysctls));
        }

        public ClusterNodeConfigLinuxNodeConfigGetArgs build() {
            $.sysctls = Objects.requireNonNull($.sysctls, "expected parameter 'sysctls' to be non-null");
            return $;
        }
    }

}
