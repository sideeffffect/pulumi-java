// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationAlarmMetric;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLog;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationWindowsEvent;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of sub components.
 * 
 */
public final class ApplicationSubComponentConfigurationDetails extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationSubComponentConfigurationDetails Empty = new ApplicationSubComponentConfigurationDetails();

    /**
     * A list of metrics to monitor for the component.
     * 
     */
    @InputImport(name="alarmMetrics")
      private final @Nullable List<ApplicationAlarmMetric> alarmMetrics;

    public List<ApplicationAlarmMetric> getAlarmMetrics() {
        return this.alarmMetrics == null ? List.of() : this.alarmMetrics;
    }

    /**
     * A list of logs to monitor for the component.
     * 
     */
    @InputImport(name="logs")
      private final @Nullable List<ApplicationLog> logs;

    public List<ApplicationLog> getLogs() {
        return this.logs == null ? List.of() : this.logs;
    }

    /**
     * A list of Windows Events to log.
     * 
     */
    @InputImport(name="windowsEvents")
      private final @Nullable List<ApplicationWindowsEvent> windowsEvents;

    public List<ApplicationWindowsEvent> getWindowsEvents() {
        return this.windowsEvents == null ? List.of() : this.windowsEvents;
    }

    public ApplicationSubComponentConfigurationDetails(
        @Nullable List<ApplicationAlarmMetric> alarmMetrics,
        @Nullable List<ApplicationLog> logs,
        @Nullable List<ApplicationWindowsEvent> windowsEvents) {
        this.alarmMetrics = alarmMetrics;
        this.logs = logs;
        this.windowsEvents = windowsEvents;
    }

    private ApplicationSubComponentConfigurationDetails() {
        this.alarmMetrics = List.of();
        this.logs = List.of();
        this.windowsEvents = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSubComponentConfigurationDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationAlarmMetric> alarmMetrics;
        private @Nullable List<ApplicationLog> logs;
        private @Nullable List<ApplicationWindowsEvent> windowsEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSubComponentConfigurationDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetrics = defaults.alarmMetrics;
    	      this.logs = defaults.logs;
    	      this.windowsEvents = defaults.windowsEvents;
        }

        public Builder alarmMetrics(@Nullable List<ApplicationAlarmMetric> alarmMetrics) {
            this.alarmMetrics = alarmMetrics;
            return this;
        }

        public Builder logs(@Nullable List<ApplicationLog> logs) {
            this.logs = logs;
            return this;
        }

        public Builder windowsEvents(@Nullable List<ApplicationWindowsEvent> windowsEvents) {
            this.windowsEvents = windowsEvents;
            return this;
        }
        public ApplicationSubComponentConfigurationDetails build() {
            return new ApplicationSubComponentConfigurationDetails(alarmMetrics, logs, windowsEvents);
        }
    }
}
