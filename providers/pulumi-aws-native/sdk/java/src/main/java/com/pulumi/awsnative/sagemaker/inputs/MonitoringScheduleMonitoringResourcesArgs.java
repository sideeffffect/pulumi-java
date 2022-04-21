// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleClusterConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringResourcesArgs Empty = new MonitoringScheduleMonitoringResourcesArgs();

    @Import(name="clusterConfig", required=true)
    private Output<MonitoringScheduleClusterConfigArgs> clusterConfig;

    public Output<MonitoringScheduleClusterConfigArgs> clusterConfig() {
        return this.clusterConfig;
    }

    private MonitoringScheduleMonitoringResourcesArgs() {}

    private MonitoringScheduleMonitoringResourcesArgs(MonitoringScheduleMonitoringResourcesArgs $) {
        this.clusterConfig = $.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleMonitoringResourcesArgs $;

        public Builder() {
            $ = new MonitoringScheduleMonitoringResourcesArgs();
        }

        public Builder(MonitoringScheduleMonitoringResourcesArgs defaults) {
            $ = new MonitoringScheduleMonitoringResourcesArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterConfig(Output<MonitoringScheduleClusterConfigArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        public Builder clusterConfig(MonitoringScheduleClusterConfigArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        public MonitoringScheduleMonitoringResourcesArgs build() {
            $.clusterConfig = Objects.requireNonNull($.clusterConfig, "expected parameter 'clusterConfig' to be non-null");
            return $;
        }
    }

}
