// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1.enums.MonitoringComponentConfigEnableComponentsItem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MonitoringComponentConfig is cluster monitoring component configuration.
 * 
 */
public final class MonitoringComponentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringComponentConfigArgs Empty = new MonitoringComponentConfigArgs();

    /**
     * Select components to collect metrics. An empty set would disable all monitoring.
     * 
     */
    @Import(name="enableComponents")
    private @Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents;

    /**
     * @return Select components to collect metrics. An empty set would disable all monitoring.
     * 
     */
    public Optional<Output<List<MonitoringComponentConfigEnableComponentsItem>>> enableComponents() {
        return Optional.ofNullable(this.enableComponents);
    }

    private MonitoringComponentConfigArgs() {}

    private MonitoringComponentConfigArgs(MonitoringComponentConfigArgs $) {
        this.enableComponents = $.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringComponentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringComponentConfigArgs $;

        public Builder() {
            $ = new MonitoringComponentConfigArgs();
        }

        public Builder(MonitoringComponentConfigArgs defaults) {
            $ = new MonitoringComponentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableComponents Select components to collect metrics. An empty set would disable all monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(@Nullable Output<List<MonitoringComponentConfigEnableComponentsItem>> enableComponents) {
            $.enableComponents = enableComponents;
            return this;
        }

        /**
         * @param enableComponents Select components to collect metrics. An empty set would disable all monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(List<MonitoringComponentConfigEnableComponentsItem> enableComponents) {
            return enableComponents(Output.of(enableComponents));
        }

        /**
         * @param enableComponents Select components to collect metrics. An empty set would disable all monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(MonitoringComponentConfigEnableComponentsItem... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }

        public MonitoringComponentConfigArgs build() {
            return $;
        }
    }

}
