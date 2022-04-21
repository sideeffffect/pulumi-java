// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.ManagedPrometheusConfigArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.MonitoringComponentConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MonitoringConfig is cluster monitoring configuration.
 * 
 */
public final class MonitoringConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringConfigArgs Empty = new MonitoringConfigArgs();

    /**
     * Monitoring components configuration
     * 
     */
    @Import(name="componentConfig")
    private @Nullable Output<MonitoringComponentConfigArgs> componentConfig;

    public Optional<Output<MonitoringComponentConfigArgs>> componentConfig() {
        return Optional.ofNullable(this.componentConfig);
    }

    /**
     * Enable Google Cloud Managed Service for Prometheus in the cluster.
     * 
     */
    @Import(name="managedPrometheusConfig")
    private @Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig;

    public Optional<Output<ManagedPrometheusConfigArgs>> managedPrometheusConfig() {
        return Optional.ofNullable(this.managedPrometheusConfig);
    }

    private MonitoringConfigArgs() {}

    private MonitoringConfigArgs(MonitoringConfigArgs $) {
        this.componentConfig = $.componentConfig;
        this.managedPrometheusConfig = $.managedPrometheusConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringConfigArgs $;

        public Builder() {
            $ = new MonitoringConfigArgs();
        }

        public Builder(MonitoringConfigArgs defaults) {
            $ = new MonitoringConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder componentConfig(@Nullable Output<MonitoringComponentConfigArgs> componentConfig) {
            $.componentConfig = componentConfig;
            return this;
        }

        public Builder componentConfig(MonitoringComponentConfigArgs componentConfig) {
            return componentConfig(Output.of(componentConfig));
        }

        public Builder managedPrometheusConfig(@Nullable Output<ManagedPrometheusConfigArgs> managedPrometheusConfig) {
            $.managedPrometheusConfig = managedPrometheusConfig;
            return this;
        }

        public Builder managedPrometheusConfig(ManagedPrometheusConfigArgs managedPrometheusConfig) {
            return managedPrometheusConfig(Output.of(managedPrometheusConfig));
        }

        public MonitoringConfigArgs build() {
            return $;
        }
    }

}
