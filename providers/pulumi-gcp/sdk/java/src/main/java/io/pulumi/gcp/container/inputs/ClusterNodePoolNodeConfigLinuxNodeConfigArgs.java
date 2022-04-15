// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigLinuxNodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigLinuxNodeConfigArgs Empty = new ClusterNodePoolNodeConfigLinuxNodeConfigArgs();

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    @Import(name="sysctls", required=true)
      private final Output<Map<String,String>> sysctls;

    public Output<Map<String,String>> sysctls() {
        return this.sysctls;
    }

    public ClusterNodePoolNodeConfigLinuxNodeConfigArgs(Output<Map<String,String>> sysctls) {
        this.sysctls = Objects.requireNonNull(sysctls, "expected parameter 'sysctls' to be non-null");
    }

    private ClusterNodePoolNodeConfigLinuxNodeConfigArgs() {
        this.sysctls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigLinuxNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigLinuxNodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Output<Map<String,String>> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }
        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Output.of(Objects.requireNonNull(sysctls));
            return this;
        }        public ClusterNodePoolNodeConfigLinuxNodeConfigArgs build() {
            return new ClusterNodePoolNodeConfigLinuxNodeConfigArgs(sysctls);
        }
    }
}
