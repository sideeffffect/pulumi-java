// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration details about the monitoring schedule.
 * 
 */
public final class MonitoringScheduleScheduleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleScheduleConfigArgs Empty = new MonitoringScheduleScheduleConfigArgs();

    /**
     * A cron expression that describes details about the monitoring schedule.
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
      private final Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public MonitoringScheduleScheduleConfigArgs(Input<String> scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private MonitoringScheduleScheduleConfigArgs() {
        this.scheduleExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleScheduleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder scheduleExpression(Input<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Input.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }
        public MonitoringScheduleScheduleConfigArgs build() {
            return new MonitoringScheduleScheduleConfigArgs(scheduleExpression);
        }
    }
}
