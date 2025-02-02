// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleBaselineConfig;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringAppSpecification;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringInput;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringOutputConfig;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleMonitoringResources;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleNetworkConfig;
import com.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleStoppingCondition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoringScheduleMonitoringJobDefinition {
    private final @Nullable MonitoringScheduleBaselineConfig baselineConfig;
    /**
     * @return Sets the environment variables in the Docker container
     * 
     */
    private final @Nullable Object environment;
    private final MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification;
    private final List<MonitoringScheduleMonitoringInput> monitoringInputs;
    private final MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig;
    private final MonitoringScheduleMonitoringResources monitoringResources;
    private final @Nullable MonitoringScheduleNetworkConfig networkConfig;
    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    private final String roleArn;
    private final @Nullable MonitoringScheduleStoppingCondition stoppingCondition;

    @CustomType.Constructor
    private MonitoringScheduleMonitoringJobDefinition(
        @CustomType.Parameter("baselineConfig") @Nullable MonitoringScheduleBaselineConfig baselineConfig,
        @CustomType.Parameter("environment") @Nullable Object environment,
        @CustomType.Parameter("monitoringAppSpecification") MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification,
        @CustomType.Parameter("monitoringInputs") List<MonitoringScheduleMonitoringInput> monitoringInputs,
        @CustomType.Parameter("monitoringOutputConfig") MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig,
        @CustomType.Parameter("monitoringResources") MonitoringScheduleMonitoringResources monitoringResources,
        @CustomType.Parameter("networkConfig") @Nullable MonitoringScheduleNetworkConfig networkConfig,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("stoppingCondition") @Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
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

    public Optional<MonitoringScheduleBaselineConfig> baselineConfig() {
        return Optional.ofNullable(this.baselineConfig);
    }
    /**
     * @return Sets the environment variables in the Docker container
     * 
     */
    public Optional<Object> environment() {
        return Optional.ofNullable(this.environment);
    }
    public MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }
    public List<MonitoringScheduleMonitoringInput> monitoringInputs() {
        return this.monitoringInputs;
    }
    public MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }
    public MonitoringScheduleMonitoringResources monitoringResources() {
        return this.monitoringResources;
    }
    public Optional<MonitoringScheduleNetworkConfig> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }
    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    public Optional<MonitoringScheduleStoppingCondition> stoppingCondition() {
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

        public Builder baselineConfig(@Nullable MonitoringScheduleBaselineConfig baselineConfig) {
            this.baselineConfig = baselineConfig;
            return this;
        }
        public Builder environment(@Nullable Object environment) {
            this.environment = environment;
            return this;
        }
        public Builder monitoringAppSpecification(MonitoringScheduleMonitoringAppSpecification monitoringAppSpecification) {
            this.monitoringAppSpecification = Objects.requireNonNull(monitoringAppSpecification);
            return this;
        }
        public Builder monitoringInputs(List<MonitoringScheduleMonitoringInput> monitoringInputs) {
            this.monitoringInputs = Objects.requireNonNull(monitoringInputs);
            return this;
        }
        public Builder monitoringInputs(MonitoringScheduleMonitoringInput... monitoringInputs) {
            return monitoringInputs(List.of(monitoringInputs));
        }
        public Builder monitoringOutputConfig(MonitoringScheduleMonitoringOutputConfig monitoringOutputConfig) {
            this.monitoringOutputConfig = Objects.requireNonNull(monitoringOutputConfig);
            return this;
        }
        public Builder monitoringResources(MonitoringScheduleMonitoringResources monitoringResources) {
            this.monitoringResources = Objects.requireNonNull(monitoringResources);
            return this;
        }
        public Builder networkConfig(@Nullable MonitoringScheduleNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder stoppingCondition(@Nullable MonitoringScheduleStoppingCondition stoppingCondition) {
            this.stoppingCondition = stoppingCondition;
            return this;
        }        public MonitoringScheduleMonitoringJobDefinition build() {
            return new MonitoringScheduleMonitoringJobDefinition(baselineConfig, environment, monitoringAppSpecification, monitoringInputs, monitoringOutputConfig, monitoringResources, networkConfig, roleArn, stoppingCondition);
        }
    }
}
