// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of a TLS certificate provider instance. Workloads may have one or more CertificateProvider instances (plugins) and one of them is enabled and configured by specifying this message. Workloads use the values from this message to locate and load the CertificateProvider instance configuration.
 * 
 */
public final class CertificateProviderInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateProviderInstanceArgs Empty = new CertificateProviderInstanceArgs();

    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
     */
    @InputImport(name="pluginInstance", required=true)
      private final Input<String> pluginInstance;

    public Input<String> getPluginInstance() {
        return this.pluginInstance;
    }

    public CertificateProviderInstanceArgs(Input<String> pluginInstance) {
        this.pluginInstance = Objects.requireNonNull(pluginInstance, "expected parameter 'pluginInstance' to be non-null");
    }

    private CertificateProviderInstanceArgs() {
        this.pluginInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateProviderInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> pluginInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateProviderInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pluginInstance = defaults.pluginInstance;
        }

        public Builder pluginInstance(Input<String> pluginInstance) {
            this.pluginInstance = Objects.requireNonNull(pluginInstance);
            return this;
        }

        public Builder pluginInstance(String pluginInstance) {
            this.pluginInstance = Input.of(Objects.requireNonNull(pluginInstance));
            return this;
        }
        public CertificateProviderInstanceArgs build() {
            return new CertificateProviderInstanceArgs(pluginInstance);
        }
    }
}
