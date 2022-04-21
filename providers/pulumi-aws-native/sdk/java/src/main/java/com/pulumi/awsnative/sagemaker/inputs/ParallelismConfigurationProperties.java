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
    private Integer maxParallelExecutionSteps;

    public Integer maxParallelExecutionSteps() {
        return this.maxParallelExecutionSteps;
    }

    private ParallelismConfigurationProperties() {}

    private ParallelismConfigurationProperties(ParallelismConfigurationProperties $) {
        this.maxParallelExecutionSteps = $.maxParallelExecutionSteps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParallelismConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParallelismConfigurationProperties $;

        public Builder() {
            $ = new ParallelismConfigurationProperties();
        }

        public Builder(ParallelismConfigurationProperties defaults) {
            $ = new ParallelismConfigurationProperties(Objects.requireNonNull(defaults));
        }

        public Builder maxParallelExecutionSteps(Integer maxParallelExecutionSteps) {
            $.maxParallelExecutionSteps = maxParallelExecutionSteps;
            return this;
        }

        public ParallelismConfigurationProperties build() {
            $.maxParallelExecutionSteps = Objects.requireNonNull($.maxParallelExecutionSteps, "expected parameter 'maxParallelExecutionSteps' to be non-null");
            return $;
        }
    }

}
