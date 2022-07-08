// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.enums.LoggingComponentConfigEnableComponentsItem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * LoggingComponentConfig is cluster logging component configuration.
 * 
 */
public final class LoggingComponentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingComponentConfigArgs Empty = new LoggingComponentConfigArgs();

    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
     */
    @Import(name="enableComponents")
    private @Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents;

    /**
     * @return Select components to collect logs. An empty set would disable all logging.
     * 
     */
    public Optional<Output<List<LoggingComponentConfigEnableComponentsItem>>> enableComponents() {
        return Optional.ofNullable(this.enableComponents);
    }

    private LoggingComponentConfigArgs() {}

    private LoggingComponentConfigArgs(LoggingComponentConfigArgs $) {
        this.enableComponents = $.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingComponentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingComponentConfigArgs $;

        public Builder() {
            $ = new LoggingComponentConfigArgs();
        }

        public Builder(LoggingComponentConfigArgs defaults) {
            $ = new LoggingComponentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableComponents Select components to collect logs. An empty set would disable all logging.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(@Nullable Output<List<LoggingComponentConfigEnableComponentsItem>> enableComponents) {
            $.enableComponents = enableComponents;
            return this;
        }

        /**
         * @param enableComponents Select components to collect logs. An empty set would disable all logging.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(List<LoggingComponentConfigEnableComponentsItem> enableComponents) {
            return enableComponents(Output.of(enableComponents));
        }

        /**
         * @param enableComponents Select components to collect logs. An empty set would disable all logging.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(LoggingComponentConfigEnableComponentsItem... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }

        public LoggingComponentConfigArgs build() {
            return $;
        }
    }

}
