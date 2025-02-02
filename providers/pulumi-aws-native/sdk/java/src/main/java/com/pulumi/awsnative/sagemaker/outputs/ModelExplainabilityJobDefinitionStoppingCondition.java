// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ModelExplainabilityJobDefinitionStoppingCondition {
    /**
     * @return The maximum runtime allowed in seconds.
     * 
     */
    private final Integer maxRuntimeInSeconds;

    @CustomType.Constructor
    private ModelExplainabilityJobDefinitionStoppingCondition(@CustomType.Parameter("maxRuntimeInSeconds") Integer maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = maxRuntimeInSeconds;
    }

    /**
     * @return The maximum runtime allowed in seconds.
     * 
     */
    public Integer maxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelExplainabilityJobDefinitionStoppingCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelExplainabilityJobDefinitionStoppingCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder maxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }        public ModelExplainabilityJobDefinitionStoppingCondition build() {
            return new ModelExplainabilityJobDefinitionStoppingCondition(maxRuntimeInSeconds);
        }
    }
}
