// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.MonitoringScheduleMonitoringType;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringJobDefinitionArgs;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleScheduleConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration object that specifies the monitoring schedule and defines the monitoring job.
 * 
 */
public final class MonitoringScheduleConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleConfigArgs Empty = new MonitoringScheduleConfigArgs();

    @Import(name="monitoringJobDefinition")
    private @Nullable Output<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition;

    public Optional<Output<MonitoringScheduleMonitoringJobDefinitionArgs>> monitoringJobDefinition() {
        return Optional.ofNullable(this.monitoringJobDefinition);
    }

    /**
     * Name of the job definition
     * 
     */
    @Import(name="monitoringJobDefinitionName")
    private @Nullable Output<String> monitoringJobDefinitionName;

    public Optional<Output<String>> monitoringJobDefinitionName() {
        return Optional.ofNullable(this.monitoringJobDefinitionName);
    }

    @Import(name="monitoringType")
    private @Nullable Output<MonitoringScheduleMonitoringType> monitoringType;

    public Optional<Output<MonitoringScheduleMonitoringType>> monitoringType() {
        return Optional.ofNullable(this.monitoringType);
    }

    @Import(name="scheduleConfig")
    private @Nullable Output<MonitoringScheduleScheduleConfigArgs> scheduleConfig;

    public Optional<Output<MonitoringScheduleScheduleConfigArgs>> scheduleConfig() {
        return Optional.ofNullable(this.scheduleConfig);
    }

    private MonitoringScheduleConfigArgs() {}

    private MonitoringScheduleConfigArgs(MonitoringScheduleConfigArgs $) {
        this.monitoringJobDefinition = $.monitoringJobDefinition;
        this.monitoringJobDefinitionName = $.monitoringJobDefinitionName;
        this.monitoringType = $.monitoringType;
        this.scheduleConfig = $.scheduleConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleConfigArgs $;

        public Builder() {
            $ = new MonitoringScheduleConfigArgs();
        }

        public Builder(MonitoringScheduleConfigArgs defaults) {
            $ = new MonitoringScheduleConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder monitoringJobDefinition(@Nullable Output<MonitoringScheduleMonitoringJobDefinitionArgs> monitoringJobDefinition) {
            $.monitoringJobDefinition = monitoringJobDefinition;
            return this;
        }

        public Builder monitoringJobDefinition(MonitoringScheduleMonitoringJobDefinitionArgs monitoringJobDefinition) {
            return monitoringJobDefinition(Output.of(monitoringJobDefinition));
        }

        public Builder monitoringJobDefinitionName(@Nullable Output<String> monitoringJobDefinitionName) {
            $.monitoringJobDefinitionName = monitoringJobDefinitionName;
            return this;
        }

        public Builder monitoringJobDefinitionName(String monitoringJobDefinitionName) {
            return monitoringJobDefinitionName(Output.of(monitoringJobDefinitionName));
        }

        public Builder monitoringType(@Nullable Output<MonitoringScheduleMonitoringType> monitoringType) {
            $.monitoringType = monitoringType;
            return this;
        }

        public Builder monitoringType(MonitoringScheduleMonitoringType monitoringType) {
            return monitoringType(Output.of(monitoringType));
        }

        public Builder scheduleConfig(@Nullable Output<MonitoringScheduleScheduleConfigArgs> scheduleConfig) {
            $.scheduleConfig = scheduleConfig;
            return this;
        }

        public Builder scheduleConfig(MonitoringScheduleScheduleConfigArgs scheduleConfig) {
            return scheduleConfig(Output.of(scheduleConfig));
        }

        public MonitoringScheduleConfigArgs build() {
            return $;
        }
    }

}
