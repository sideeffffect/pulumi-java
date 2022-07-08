// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of a specific billing destination (Currently only support bill against consumer project).
 * 
 */
public final class BillingDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BillingDestinationArgs Empty = new BillingDestinationArgs();

    /**
     * Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<String>> metrics;

    /**
     * @return Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    public Optional<Output<List<String>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    @Import(name="monitoredResource")
    private @Nullable Output<String> monitoredResource;

    /**
     * @return The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    public Optional<Output<String>> monitoredResource() {
        return Optional.ofNullable(this.monitoredResource);
    }

    private BillingDestinationArgs() {}

    private BillingDestinationArgs(BillingDestinationArgs $) {
        this.metrics = $.metrics;
        this.monitoredResource = $.monitoredResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingDestinationArgs $;

        public Builder() {
            $ = new BillingDestinationArgs();
        }

        public Builder(BillingDestinationArgs defaults) {
            $ = new BillingDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metrics Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
         * 
         * @return builder
         * 
         */
        public Builder metrics(@Nullable Output<List<String>> metrics) {
            $.metrics = metrics;
            return this;
        }

        /**
         * @param metrics Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
         * 
         * @return builder
         * 
         */
        public Builder metrics(List<String> metrics) {
            return metrics(Output.of(metrics));
        }

        /**
         * @param metrics Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
         * 
         * @return builder
         * 
         */
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }

        /**
         * @param monitoredResource The monitored resource type. The type must be defined in Service.monitored_resources section.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(@Nullable Output<String> monitoredResource) {
            $.monitoredResource = monitoredResource;
            return this;
        }

        /**
         * @param monitoredResource The monitored resource type. The type must be defined in Service.monitored_resources section.
         * 
         * @return builder
         * 
         */
        public Builder monitoredResource(String monitoredResource) {
            return monitoredResource(Output.of(monitoredResource));
        }

        public BillingDestinationArgs build() {
            return $;
        }
    }

}
