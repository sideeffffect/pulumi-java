// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringInput;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleStoppingCondition;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitoringScheduleMonitoringJobDefinition {
    private final @Nullable MonitoringScheduleBaselineConfig baselineConfig;
    /**
     * Sets the environment variables in the Docker container
     * 
     */
    private final @Nullable Object environment;
    private final MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;
    private final List<MonitoringScheduleMonitoringInput> monitoringInputs;
    private final MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;
    private final MonitoringScheduleMonitoringResources monitoringResources;
    private final @Nullable MonitoringScheduleNetworkConfig networkConfig;
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    private final String roleArn;
    private final @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

    @OutputCustomType.Constructor({"baselineConfig","environment","monitoringAppSpecification","monitoringInputs","monitoringOutputConfig","monitoringResources","networkConfig","roleArn","stoppingCondition"})
    private MonitoringScheduleMonitoringJobDefinition(
        @Nullable MonitoringScheduleBaselineConfig baselineConfig,
        @Nullable Object environment,
        MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification,
        List<MonitoringScheduleMonitoringInput> monitoringInputs,
        MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig,
        MonitoringScheduleMonitoringResources monitoringResources,
        @Nullable MonitoringScheduleNetworkConfig networkConfig,
        String roleArn,
        @Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
        this.baselineConfig = baselineConfig;
        this.environment = environment;
        this.monitoringAppSpecification = monitoringAppSpecification;
        this.monitoringInputs = monitoringInputs;
        this.monitoringOutputConfig = monitoringOutputConfig;
        this.monitoringResources = monitoringResources;
        this.networkConfig = networkConfig;
        this.roleArn = roleArn;
        this.stoppingCondition = stoppingCondition;
    }

    public Optional<MonitoringScheduleBaselineConfig> getBaselineConfig() {
        return Optional.ofNullable(this.baselineConfig);
    }
    /**
     * Sets the environment variables in the Docker container
     * 
    */
    public Optional<Object> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    public MonitoringScheduleMonitoringAppSpecification getMonitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }
    public List<MonitoringScheduleMonitoringInput> getMonitoringInputs() {
        return this.monitoringInputs;
    }
    public MonitoringScheduleMonitoringOutputConfig getMonitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }
    public MonitoringScheduleMonitoringResources getMonitoringResources() {
        return this.monitoringResources;
    }
    public Optional<MonitoringScheduleNetworkConfig> getNetworkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    public Optional<MonitoringScheduleStoppingCondition> getStoppingCondition() {
        return Optional.ofNullable(this.stoppingCondition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringJobDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MonitoringScheduleBaselineConfig baselineConfig;
        private @Nullable Object environment;
        private MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;
        private List<MonitoringScheduleMonitoringInput> monitoringInputs;
        private MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;
        private MonitoringScheduleMonitoringResources monitoringResources;
        private @Nullable MonitoringScheduleNetworkConfig networkConfig;
        private String roleArn;
        private @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringJobDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselineConfig = defaults.baselineConfig;
    	      this.environment = defaults.environment;
    	      this.monitoringAppSpecification = defaults.monitoringAppSpecification;
    	      this.monitoringInputs = defaults.monitoringInputs;
    	      this.monitoringOutputConfig = defaults.monitoringOutputConfig;
    	      this.monitoringResources = defaults.monitoringResources;
    	      this.networkConfig = defaults.networkConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.stoppingCondition = defaults.stoppingCondition;
        }

        public Builder setBaselineConfig(@Nullable MonitoringScheduleBaselineConfig baselineConfig) {
            this.baselineConfig = baselineConfig;
            return this;
        }

        public Builder setEnvironment(@Nullable Object environment) {
            this.environment = environment;
            return this;
        }

        public Builder setMonitoringAppSpecification(MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification) {
            this.monitoringAppSpecification = Objects.requireNonNull(monitoringAppSpecification);
            return this;
        }

        public Builder setMonitoringInputs(List<MonitoringScheduleMonitoringInput> monitoringInputs) {
            this.monitoringInputs = Objects.requireNonNull(monitoringInputs);
            return this;
        }

        public Builder setMonitoringOutputConfig(MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig) {
            this.monitoringOutputConfig = Objects.requireNonNull(monitoringOutputConfig);
            return this;
        }

        public Builder setMonitoringResources(MonitoringScheduleMonitoringResources monitoringResources) {
            this.monitoringResources = Objects.requireNonNull(monitoringResources);
            return this;
        }

        public Builder setNetworkConfig(@Nullable MonitoringScheduleNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStoppingCondition(@Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }
        public MonitoringScheduleMonitoringJobDefinition build() {
            return new MonitoringScheduleMonitoringJobDefinition(baselineConfig, environment, monitoringAppSpecification, monitoringInputs, monitoringOutputConfig, monitoringResources, networkConfig, roleArn, stoppingCondition);
        }
    }
}
