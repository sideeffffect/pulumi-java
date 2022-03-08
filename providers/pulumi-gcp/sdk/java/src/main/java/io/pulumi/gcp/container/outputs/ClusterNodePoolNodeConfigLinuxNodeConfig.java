// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodePoolNodeConfigLinuxNodeConfig {
    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
     */
    private final Map<String,String> sysctls;

    @OutputCustomType.Constructor({"sysctls"})
    private ClusterNodePoolNodeConfigLinuxNodeConfig(Map<String,String> sysctls) {
        this.sysctls = sysctls;
    }

    /**
     * The Linux kernel parameters to be applied to the nodes
     * and all pods running on the nodes. Specified as a map from the key, such as
     * `net.core.wmem_max`, to a string value.
     * 
    */
    public Map<String,String> getSysctls() {
        return this.sysctls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigLinuxNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigLinuxNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder setSysctls(Map<String,String> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }
        public ClusterNodePoolNodeConfigLinuxNodeConfig build() {
            return new ClusterNodePoolNodeConfigLinuxNodeConfig(sysctls);
        }
    }
}
