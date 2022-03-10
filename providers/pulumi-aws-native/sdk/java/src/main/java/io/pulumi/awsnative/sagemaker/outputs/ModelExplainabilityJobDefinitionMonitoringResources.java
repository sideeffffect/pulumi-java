// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelExplainabilityJobDefinitionClusterConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ModelExplainabilityJobDefinitionMonitoringResources {
    private final ModelExplainabilityJobDefinitionClusterConfig clusterConfig;

    @OutputCustomType.Constructor
    private ModelExplainabilityJobDefinitionMonitoringResources(@OutputCustomType.Parameter("clusterConfig") ModelExplainabilityJobDefinitionClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public ModelExplainabilityJobDefinitionClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionMonitoringResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelExplainabilityJobDefinitionClusterConfig clusterConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionMonitoringResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
        }

        public Builder clusterConfig(ModelExplainabilityJobDefinitionClusterConfig clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }
        public ModelExplainabilityJobDefinitionMonitoringResources build() {
            return new ModelExplainabilityJobDefinitionMonitoringResources(clusterConfig);
        }
    }
}
