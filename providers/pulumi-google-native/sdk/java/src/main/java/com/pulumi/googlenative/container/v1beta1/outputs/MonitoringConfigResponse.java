// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1beta1.outputs.ManagedPrometheusConfigResponse;
import com.pulumi.googlenative.container.v1beta1.outputs.MonitoringComponentConfigResponse;
import java.util.Objects;

@CustomType
public final class MonitoringConfigResponse {
    /**
     * @return Monitoring components configuration
     * 
     */
    private final MonitoringComponentConfigResponse componentConfig;
    /**
     * @return Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
     */
    private final ManagedPrometheusConfigResponse managedPrometheusConfig;

    @CustomType.Constructor
    private MonitoringConfigResponse(
        @CustomType.Parameter("componentConfig") MonitoringComponentConfigResponse componentConfig,
        @CustomType.Parameter("managedPrometheusConfig") ManagedPrometheusConfigResponse managedPrometheusConfig) {
        this.componentConfig = componentConfig;
        this.managedPrometheusConfig = managedPrometheusConfig;
    }

    /**
     * @return Monitoring components configuration
     * 
     */
    public MonitoringComponentConfigResponse componentConfig() {
        return this.componentConfig;
    }
    /**
     * @return Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
     */
    public ManagedPrometheusConfigResponse managedPrometheusConfig() {
        return this.managedPrometheusConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringComponentConfigResponse componentConfig;
        private ManagedPrometheusConfigResponse managedPrometheusConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
    	      this.managedPrometheusConfig = defaults.managedPrometheusConfig;
        }

        public Builder componentConfig(MonitoringComponentConfigResponse componentConfig) {
            this.componentConfig = Objects.requireNonNull(componentConfig);
            return this;
        }
        public Builder managedPrometheusConfig(ManagedPrometheusConfigResponse managedPrometheusConfig) {
            this.managedPrometheusConfig = Objects.requireNonNull(managedPrometheusConfig);
            return this;
        }        public MonitoringConfigResponse build() {
            return new MonitoringConfigResponse(componentConfig, managedPrometheusConfig);
        }
    }
}
