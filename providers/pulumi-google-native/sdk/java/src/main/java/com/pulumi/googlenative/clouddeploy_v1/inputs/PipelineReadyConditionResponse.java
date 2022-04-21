// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * PipelineReadyCondition contains information around the status of the Pipeline.
 * 
 */
public final class PipelineReadyConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final PipelineReadyConditionResponse Empty = new PipelineReadyConditionResponse();

    /**
     * True if the Pipeline is in a valid state. Otherwise at least one condition in `PipelineCondition` is in an invalid state. Iterate over those conditions and see which condition(s) has status = false to find out what is wrong with the Pipeline.
     * 
     */
    @Import(name="status", required=true)
    private Boolean status;

    public Boolean status() {
        return this.status;
    }

    /**
     * Last time the condition was updated.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    private PipelineReadyConditionResponse() {}

    private PipelineReadyConditionResponse(PipelineReadyConditionResponse $) {
        this.status = $.status;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineReadyConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineReadyConditionResponse $;

        public Builder() {
            $ = new PipelineReadyConditionResponse();
        }

        public Builder(PipelineReadyConditionResponse defaults) {
            $ = new PipelineReadyConditionResponse(Objects.requireNonNull(defaults));
        }

        public Builder status(Boolean status) {
            $.status = status;
            return this;
        }

        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public PipelineReadyConditionResponse build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
