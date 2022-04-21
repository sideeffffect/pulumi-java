// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pipeline ElapsedTime Metric Policy.
 * 
 */
public final class PipelineElapsedTimeMetricPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final PipelineElapsedTimeMetricPolicyResponse Empty = new PipelineElapsedTimeMetricPolicyResponse();

    /**
     * TimeSpan value, after which an Azure Monitoring Metric is fired.
     * 
     */
    @Import(name="duration")
    private @Nullable Object duration;

    public Optional<Object> duration() {
        return Optional.ofNullable(this.duration);
    }

    private PipelineElapsedTimeMetricPolicyResponse() {}

    private PipelineElapsedTimeMetricPolicyResponse(PipelineElapsedTimeMetricPolicyResponse $) {
        this.duration = $.duration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineElapsedTimeMetricPolicyResponse $;

        public Builder() {
            $ = new PipelineElapsedTimeMetricPolicyResponse();
        }

        public Builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
            $ = new PipelineElapsedTimeMetricPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Object duration) {
            $.duration = duration;
            return this;
        }

        public PipelineElapsedTimeMetricPolicyResponse build() {
            return $;
        }
    }

}
