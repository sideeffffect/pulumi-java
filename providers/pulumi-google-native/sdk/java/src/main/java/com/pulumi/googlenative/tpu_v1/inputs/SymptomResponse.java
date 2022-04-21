// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A Symptom instance.
 * 
 */
public final class SymptomResponse extends com.pulumi.resources.InvokeArgs {

    public static final SymptomResponse Empty = new SymptomResponse();

    /**
     * Timestamp when the Symptom is created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Detailed information of the current Symptom.
     * 
     */
    @Import(name="details", required=true)
    private String details;

    public String details() {
        return this.details;
    }

    /**
     * Type of the Symptom.
     * 
     */
    @Import(name="symptomType", required=true)
    private String symptomType;

    public String symptomType() {
        return this.symptomType;
    }

    /**
     * A string used to uniquely distinguish a worker within a TPU node.
     * 
     */
    @Import(name="workerId", required=true)
    private String workerId;

    public String workerId() {
        return this.workerId;
    }

    private SymptomResponse() {}

    private SymptomResponse(SymptomResponse $) {
        this.createTime = $.createTime;
        this.details = $.details;
        this.symptomType = $.symptomType;
        this.workerId = $.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SymptomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SymptomResponse $;

        public Builder() {
            $ = new SymptomResponse();
        }

        public Builder(SymptomResponse defaults) {
            $ = new SymptomResponse(Objects.requireNonNull(defaults));
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder details(String details) {
            $.details = details;
            return this;
        }

        public Builder symptomType(String symptomType) {
            $.symptomType = symptomType;
            return this;
        }

        public Builder workerId(String workerId) {
            $.workerId = workerId;
            return this;
        }

        public SymptomResponse build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.symptomType = Objects.requireNonNull($.symptomType, "expected parameter 'symptomType' to be non-null");
            $.workerId = Objects.requireNonNull($.workerId, "expected parameter 'workerId' to be non-null");
            return $;
        }
    }

}
