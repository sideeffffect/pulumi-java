// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionClusterConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;


/**
 * Identifies the resources to deploy for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionMonitoringResourcesArgs extends ResourceArgs {

    public static final ModelQualityJobDefinitionMonitoringResourcesArgs Empty = new ModelQualityJobDefinitionMonitoringResourcesArgs();

    @Import(name="clusterConfig", required=true)
    private Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig;

    public Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig() {
        return this.clusterConfig;
    }

    private ModelQualityJobDefinitionMonitoringResourcesArgs() {}

    private ModelQualityJobDefinitionMonitoringResourcesArgs(ModelQualityJobDefinitionMonitoringResourcesArgs $) {
        this.clusterConfig = $.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionMonitoringResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionMonitoringResourcesArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionMonitoringResourcesArgs();
        }

        public Builder(ModelQualityJobDefinitionMonitoringResourcesArgs defaults) {
            $ = new ModelQualityJobDefinitionMonitoringResourcesArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterConfig(Output<ModelQualityJobDefinitionClusterConfigArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        public Builder clusterConfig(ModelQualityJobDefinitionClusterConfigArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        public ModelQualityJobDefinitionMonitoringResourcesArgs build() {
            $.clusterConfig = Objects.requireNonNull($.clusterConfig, "expected parameter 'clusterConfig' to be non-null");
            return $;
        }
    }

}
