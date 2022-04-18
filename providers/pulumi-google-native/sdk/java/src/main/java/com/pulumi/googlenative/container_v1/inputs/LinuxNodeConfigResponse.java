// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Parameters that can be configured on Linux nodes.
 * 
 */
public final class LinuxNodeConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LinuxNodeConfigResponse Empty = new LinuxNodeConfigResponse();

    /**
     * The Linux kernel parameters to be applied to the nodes and all pods running on the nodes. The following parameters are supported. net.core.netdev_max_backlog net.core.rmem_max net.core.wmem_default net.core.wmem_max net.core.optmem_max net.core.somaxconn net.ipv4.tcp_rmem net.ipv4.tcp_wmem net.ipv4.tcp_tw_reuse
     * 
     */
    @Import(name="sysctls", required=true)
      private final Map<String,String> sysctls;

    public Map<String,String> sysctls() {
        return this.sysctls;
    }

    public LinuxNodeConfigResponse(Map<String,String> sysctls) {
        this.sysctls = Objects.requireNonNull(sysctls, "expected parameter 'sysctls' to be non-null");
    }

    private LinuxNodeConfigResponse() {
        this.sysctls = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxNodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> sysctls;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxNodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sysctls = defaults.sysctls;
        }

        public Builder sysctls(Map<String,String> sysctls) {
            this.sysctls = Objects.requireNonNull(sysctls);
            return this;
        }        public LinuxNodeConfigResponse build() {
            return new LinuxNodeConfigResponse(sysctls);
        }
    }
}
