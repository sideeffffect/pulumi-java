// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ParameterSpecResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a set of hyperparameters to optimize.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__HyperparameterSpecResponse Empty = new GoogleCloudMlV1__HyperparameterSpecResponse();

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    @Import(name="enableTrialEarlyStopping", required=true)
    private Boolean enableTrialEarlyStopping;

    public Boolean enableTrialEarlyStopping() {
        return this.enableTrialEarlyStopping;
    }

    /**
     * The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    @Import(name="goal", required=true)
    private String goal;

    public String goal() {
        return this.goal;
    }

    /**
     * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, &#34;training/hptuning/metric&#34; will be used.
     * 
     */
    @Import(name="hyperparameterMetricTag", required=true)
    private String hyperparameterMetricTag;

    public String hyperparameterMetricTag() {
        return this.hyperparameterMetricTag;
    }

    /**
     * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    @Import(name="maxFailedTrials", required=true)
    private Integer maxFailedTrials;

    public Integer maxFailedTrials() {
        return this.maxFailedTrials;
    }

    /**
     * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    @Import(name="maxParallelTrials", required=true)
    private Integer maxParallelTrials;

    public Integer maxParallelTrials() {
        return this.maxParallelTrials;
    }

    /**
     * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    @Import(name="maxTrials", required=true)
    private Integer maxTrials;

    public Integer maxTrials() {
        return this.maxTrials;
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="params", required=true)
    private List<GoogleCloudMlV1__ParameterSpecResponse> params;

    public List<GoogleCloudMlV1__ParameterSpecResponse> params() {
        return this.params;
    }

    /**
     * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    @Import(name="resumePreviousJobId", required=true)
    private String resumePreviousJobId;

    public String resumePreviousJobId() {
        return this.resumePreviousJobId;
    }

    private GoogleCloudMlV1__HyperparameterSpecResponse() {}

    private GoogleCloudMlV1__HyperparameterSpecResponse(GoogleCloudMlV1__HyperparameterSpecResponse $) {
        this.algorithm = $.algorithm;
        this.enableTrialEarlyStopping = $.enableTrialEarlyStopping;
        this.goal = $.goal;
        this.hyperparameterMetricTag = $.hyperparameterMetricTag;
        this.maxFailedTrials = $.maxFailedTrials;
        this.maxParallelTrials = $.maxParallelTrials;
        this.maxTrials = $.maxTrials;
        this.params = $.params;
        this.resumePreviousJobId = $.resumePreviousJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__HyperparameterSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__HyperparameterSpecResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__HyperparameterSpecResponse();
        }

        public Builder(GoogleCloudMlV1__HyperparameterSpecResponse defaults) {
            $ = new GoogleCloudMlV1__HyperparameterSpecResponse(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder enableTrialEarlyStopping(Boolean enableTrialEarlyStopping) {
            $.enableTrialEarlyStopping = enableTrialEarlyStopping;
            return this;
        }

        public Builder goal(String goal) {
            $.goal = goal;
            return this;
        }

        public Builder hyperparameterMetricTag(String hyperparameterMetricTag) {
            $.hyperparameterMetricTag = hyperparameterMetricTag;
            return this;
        }

        public Builder maxFailedTrials(Integer maxFailedTrials) {
            $.maxFailedTrials = maxFailedTrials;
            return this;
        }

        public Builder maxParallelTrials(Integer maxParallelTrials) {
            $.maxParallelTrials = maxParallelTrials;
            return this;
        }

        public Builder maxTrials(Integer maxTrials) {
            $.maxTrials = maxTrials;
            return this;
        }

        public Builder params(List<GoogleCloudMlV1__ParameterSpecResponse> params) {
            $.params = params;
            return this;
        }

        public Builder params(GoogleCloudMlV1__ParameterSpecResponse... params) {
            return params(List.of(params));
        }

        public Builder resumePreviousJobId(String resumePreviousJobId) {
            $.resumePreviousJobId = resumePreviousJobId;
            return this;
        }

        public GoogleCloudMlV1__HyperparameterSpecResponse build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.enableTrialEarlyStopping = Objects.requireNonNull($.enableTrialEarlyStopping, "expected parameter 'enableTrialEarlyStopping' to be non-null");
            $.goal = Objects.requireNonNull($.goal, "expected parameter 'goal' to be non-null");
            $.hyperparameterMetricTag = Objects.requireNonNull($.hyperparameterMetricTag, "expected parameter 'hyperparameterMetricTag' to be non-null");
            $.maxFailedTrials = Objects.requireNonNull($.maxFailedTrials, "expected parameter 'maxFailedTrials' to be non-null");
            $.maxParallelTrials = Objects.requireNonNull($.maxParallelTrials, "expected parameter 'maxParallelTrials' to be non-null");
            $.maxTrials = Objects.requireNonNull($.maxTrials, "expected parameter 'maxTrials' to be non-null");
            $.params = Objects.requireNonNull($.params, "expected parameter 'params' to be non-null");
            $.resumePreviousJobId = Objects.requireNonNull($.resumePreviousJobId, "expected parameter 'resumePreviousJobId' to be non-null");
            return $;
        }
    }

}
