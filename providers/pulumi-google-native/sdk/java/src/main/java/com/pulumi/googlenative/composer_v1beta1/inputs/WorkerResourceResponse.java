// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for resources used by Airflow workers.
 * 
 */
public final class WorkerResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkerResourceResponse Empty = new WorkerResourceResponse();

    /**
     * Optional. CPU request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="cpu", required=true)
    private Double cpu;

    public Double cpu() {
        return this.cpu;
    }

    /**
     * Optional. Maximum number of workers for autoscaling.
     * 
     */
    @Import(name="maxCount", required=true)
    private Integer maxCount;

    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Optional. Memory (GB) request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="memoryGb", required=true)
    private Double memoryGb;

    public Double memoryGb() {
        return this.memoryGb;
    }

    /**
     * Optional. Minimum number of workers for autoscaling.
     * 
     */
    @Import(name="minCount", required=true)
    private Integer minCount;

    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Optional. Storage (GB) request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="storageGb", required=true)
    private Double storageGb;

    public Double storageGb() {
        return this.storageGb;
    }

    private WorkerResourceResponse() {}

    private WorkerResourceResponse(WorkerResourceResponse $) {
        this.cpu = $.cpu;
        this.maxCount = $.maxCount;
        this.memoryGb = $.memoryGb;
        this.minCount = $.minCount;
        this.storageGb = $.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerResourceResponse $;

        public Builder() {
            $ = new WorkerResourceResponse();
        }

        public Builder(WorkerResourceResponse defaults) {
            $ = new WorkerResourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder cpu(Double cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder maxCount(Integer maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        public Builder memoryGb(Double memoryGb) {
            $.memoryGb = memoryGb;
            return this;
        }

        public Builder minCount(Integer minCount) {
            $.minCount = minCount;
            return this;
        }

        public Builder storageGb(Double storageGb) {
            $.storageGb = storageGb;
            return this;
        }

        public WorkerResourceResponse build() {
            $.cpu = Objects.requireNonNull($.cpu, "expected parameter 'cpu' to be non-null");
            $.maxCount = Objects.requireNonNull($.maxCount, "expected parameter 'maxCount' to be non-null");
            $.memoryGb = Objects.requireNonNull($.memoryGb, "expected parameter 'memoryGb' to be non-null");
            $.minCount = Objects.requireNonNull($.minCount, "expected parameter 'minCount' to be non-null");
            $.storageGb = Objects.requireNonNull($.storageGb, "expected parameter 'storageGb' to be non-null");
            return $;
        }
    }

}
