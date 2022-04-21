// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleBaselineConfig;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringAppSpecification;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringInput;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringOutputConfig;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleMonitoringResources;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleNetworkConfig;
import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleStoppingCondition;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringJobDefinition extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleMonitoringJobDefinition Empty = new MonitoringScheduleMonitoringJobDefinition();

    @Import(name="baselineConfig")
    private @Nullable MonitoringScheduleBaselineConfig baselineConfig;

    public Optional<MonitoringScheduleBaselineConfig> baselineConfig() {
        return Optional.ofNullable(this.baselineConfig);
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
    private @Nullable Object environment;

    public Optional<Object> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="monitoringAppSpecification", required=true)
    private MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;

    public MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }

    @Import(name="monitoringInputs", required=true)
    private List<MonitoringScheduleMonitoringInput> monitoringInputs;

    public List<MonitoringScheduleMonitoringInput> monitoringInputs() {
        return this.monitoringInputs;
    }

    @Import(name="monitoringOutputConfig", required=true)
    private MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;

    public MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }

    @Import(name="monitoringResources", required=true)
    private MonitoringScheduleMonitoringResources monitoringResources;

    public MonitoringScheduleMonitoringResources monitoringResources() {
        return this.monitoringResources;
    }

    @Import(name="networkConfig")
    private @Nullable MonitoringScheduleNetworkConfig networkConfig;

    public Optional<MonitoringScheduleNetworkConfig> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="stoppingCondition")
    private @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

    public Optional<MonitoringScheduleStoppingCondition> stoppingCondition() {
        return Optional.ofNullable(this.stoppingCondition);
    }

    private MonitoringScheduleMonitoringJobDefinition() {}

    private MonitoringScheduleMonitoringJobDefinition(MonitoringScheduleMonitoringJobDefinition $) {
        this.baselineConfig = $.baselineConfig;
        this.environment = $.environment;
        this.monitoringAppSpecification = $.monitoringAppSpecification;
        this.monitoringInputs = $.monitoringInputs;
        this.monitoringOutputConfig = $.monitoringOutputConfig;
        this.monitoringResources = $.monitoringResources;
        this.networkConfig = $.networkConfig;
        this.roleArn = $.roleArn;
        this.stoppingCondition = $.stoppingCondition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleMonitoringJobDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleMonitoringJobDefinition $;

        public Builder() {
            $ = new MonitoringScheduleMonitoringJobDefinition();
        }

        public Builder(MonitoringScheduleMonitoringJobDefinition defaults) {
            $ = new MonitoringScheduleMonitoringJobDefinition(Objects.requireNonNull(defaults));
        }

        public Builder baselineConfig(@Nullable MonitoringScheduleBaselineConfig baselineConfig) {
            $.baselineConfig = baselineConfig;
            return this;
        }

        public Builder environment(@Nullable Object environment) {
            $.environment = environment;
            return this;
        }

        public Builder monitoringAppSpecification(MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification) {
            $.monitoringAppSpecification = monitoringAppSpecification;
            return this;
        }

        public Builder monitoringInputs(List<MonitoringScheduleMonitoringInput> monitoringInputs) {
            $.monitoringInputs = monitoringInputs;
            return this;
        }

        public Builder monitoringInputs(MonitoringScheduleMonitoringInput... monitoringInputs) {
            return monitoringInputs(List.of(monitoringInputs));
        }

        public Builder monitoringOutputConfig(MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig) {
            $.monitoringOutputConfig = monitoringOutputConfig;
            return this;
        }

        public Builder monitoringResources(MonitoringScheduleMonitoringResources monitoringResources) {
            $.monitoringResources = monitoringResources;
            return this;
        }

        public Builder networkConfig(@Nullable MonitoringScheduleNetworkConfig networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder stoppingCondition(@Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
            $.stoppingCondition = stoppingCondition;
            return this;
        }

        public MonitoringScheduleMonitoringJobDefinition build() {
            $.monitoringAppSpecification = Objects.requireNonNull($.monitoringAppSpecification, "expected parameter 'monitoringAppSpecification' to be non-null");
            $.monitoringInputs = Objects.requireNonNull($.monitoringInputs, "expected parameter 'monitoringInputs' to be non-null");
            $.monitoringOutputConfig = Objects.requireNonNull($.monitoringOutputConfig, "expected parameter 'monitoringOutputConfig' to be non-null");
            $.monitoringResources = Objects.requireNonNull($.monitoringResources, "expected parameter 'monitoringResources' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
