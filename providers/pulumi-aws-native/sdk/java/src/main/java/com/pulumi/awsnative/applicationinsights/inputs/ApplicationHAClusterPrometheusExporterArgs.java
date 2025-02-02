// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The HA cluster Prometheus Exporter settings.
 * 
 */
public final class ApplicationHAClusterPrometheusExporterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationHAClusterPrometheusExporterArgs Empty = new ApplicationHAClusterPrometheusExporterArgs();

    /**
     * Prometheus exporter port.
     * 
     */
    @Import(name="prometheusPort")
    private @Nullable Output<String> prometheusPort;

    /**
     * @return Prometheus exporter port.
     * 
     */
    public Optional<Output<String>> prometheusPort() {
        return Optional.ofNullable(this.prometheusPort);
    }

    private ApplicationHAClusterPrometheusExporterArgs() {}

    private ApplicationHAClusterPrometheusExporterArgs(ApplicationHAClusterPrometheusExporterArgs $) {
        this.prometheusPort = $.prometheusPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationHAClusterPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationHAClusterPrometheusExporterArgs $;

        public Builder() {
            $ = new ApplicationHAClusterPrometheusExporterArgs();
        }

        public Builder(ApplicationHAClusterPrometheusExporterArgs defaults) {
            $ = new ApplicationHAClusterPrometheusExporterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prometheusPort Prometheus exporter port.
         * 
         * @return builder
         * 
         */
        public Builder prometheusPort(@Nullable Output<String> prometheusPort) {
            $.prometheusPort = prometheusPort;
            return this;
        }

        /**
         * @param prometheusPort Prometheus exporter port.
         * 
         * @return builder
         * 
         */
        public Builder prometheusPort(String prometheusPort) {
            return prometheusPort(Output.of(prometheusPort));
        }

        public ApplicationHAClusterPrometheusExporterArgs build() {
            return $;
        }
    }

}
