// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigKerberosConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


public final class ClusterClusterConfigSecurityConfigArgs extends ResourceArgs {

    public static final ClusterClusterConfigSecurityConfigArgs Empty = new ClusterClusterConfigSecurityConfigArgs();

    /**
     * Kerberos Configuration
     * 
     */
    @Import(name="kerberosConfig", required=true)
    private Output<ClusterClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig;

    /**
     * @return Kerberos Configuration
     * 
     */
    public Output<ClusterClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig() {
        return this.kerberosConfig;
    }

    private ClusterClusterConfigSecurityConfigArgs() {}

    private ClusterClusterConfigSecurityConfigArgs(ClusterClusterConfigSecurityConfigArgs $) {
        this.kerberosConfig = $.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigSecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigSecurityConfigArgs $;

        public Builder() {
            $ = new ClusterClusterConfigSecurityConfigArgs();
        }

        public Builder(ClusterClusterConfigSecurityConfigArgs defaults) {
            $ = new ClusterClusterConfigSecurityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kerberosConfig Kerberos Configuration
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(Output<ClusterClusterConfigSecurityConfigKerberosConfigArgs> kerberosConfig) {
            $.kerberosConfig = kerberosConfig;
            return this;
        }

        /**
         * @param kerberosConfig Kerberos Configuration
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(ClusterClusterConfigSecurityConfigKerberosConfigArgs kerberosConfig) {
            return kerberosConfig(Output.of(kerberosConfig));
        }

        public ClusterClusterConfigSecurityConfigArgs build() {
            $.kerberosConfig = Objects.requireNonNull($.kerberosConfig, "expected parameter 'kerberosConfig' to be non-null");
            return $;
        }
    }

}
