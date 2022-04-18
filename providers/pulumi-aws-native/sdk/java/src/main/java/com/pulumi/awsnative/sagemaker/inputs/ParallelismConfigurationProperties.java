// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ParallelismConfigurationProperties extends com.pulumi.resources.InvokeArgs {

    public static final ParallelismConfigurationProperties Empty = new ParallelismConfigurationProperties();

    /**
     * Maximum parallel execution steps
     * 
     */
    @Import(name="maxParallelExecutionSteps", required=true)
      private final Integer maxParallelExecutionSteps;

    public Integer maxParallelExecutionSteps() {
        return this.maxParallelExecutionSteps;
    }

    public ParallelismConfigurationProperties(Integer maxParallelExecutionSteps) {
        this.maxParallelExecutionSteps = Objects.requireNonNull(maxParallelExecutionSteps, "expected parameter 'maxParallelExecutionSteps' to be non-null");
    }

    private ParallelismConfigurationProperties() {
        this.maxParallelExecutionSteps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParallelismConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxParallelExecutionSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(ParallelismConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxParallelExecutionSteps = defaults.maxParallelExecutionSteps;
        }

        public Builder maxParallelExecutionSteps(Integer maxParallelExecutionSteps) {
            this.maxParallelExecutionSteps = Objects.requireNonNull(maxParallelExecutionSteps);
            return this;
        }        public ParallelismConfigurationProperties build() {
            return new ParallelismConfigurationProperties(maxParallelExecutionSteps);
        }
    }
}
