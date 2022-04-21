// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__StudyConfigAlgorithm;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfig_MetricSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfig_ParameterSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AutomatedStoppingConfigArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration of a study.
 * 
 */
public final class GoogleCloudMlV1__StudyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__StudyConfigArgs Empty = new GoogleCloudMlV1__StudyConfigArgs();

    /**
     * The search algorithm specified for the study.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<GoogleCloudMlV1__StudyConfigAlgorithm> algorithm;

    public Optional<Output<GoogleCloudMlV1__StudyConfigAlgorithm>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * Configuration for automated stopping of unpromising Trials.
     * 
     */
    @Import(name="automatedStoppingConfig")
    private @Nullable Output<GoogleCloudMlV1__AutomatedStoppingConfigArgs> automatedStoppingConfig;

    public Optional<Output<GoogleCloudMlV1__AutomatedStoppingConfigArgs>> automatedStoppingConfig() {
        return Optional.ofNullable(this.automatedStoppingConfig);
    }

    /**
     * Metric specs for the study.
     * 
     */
    @Import(name="metrics")
    private @Nullable Output<List<GoogleCloudMlV1_StudyConfig_MetricSpecArgs>> metrics;

    public Optional<Output<List<GoogleCloudMlV1_StudyConfig_MetricSpecArgs>>> metrics() {
        return Optional.ofNullable(this.metrics);
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>> parameters;

    public Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>> parameters() {
        return this.parameters;
    }

    private GoogleCloudMlV1__StudyConfigArgs() {}

    private GoogleCloudMlV1__StudyConfigArgs(GoogleCloudMlV1__StudyConfigArgs $) {
        this.algorithm = $.algorithm;
        this.automatedStoppingConfig = $.automatedStoppingConfig;
        this.metrics = $.metrics;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__StudyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__StudyConfigArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1__StudyConfigArgs();
        }

        public Builder(GoogleCloudMlV1__StudyConfigArgs defaults) {
            $ = new GoogleCloudMlV1__StudyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<GoogleCloudMlV1__StudyConfigAlgorithm> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(GoogleCloudMlV1__StudyConfigAlgorithm algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder automatedStoppingConfig(@Nullable Output<GoogleCloudMlV1__AutomatedStoppingConfigArgs> automatedStoppingConfig) {
            $.automatedStoppingConfig = automatedStoppingConfig;
            return this;
        }

        public Builder automatedStoppingConfig(GoogleCloudMlV1__AutomatedStoppingConfigArgs automatedStoppingConfig) {
            return automatedStoppingConfig(Output.of(automatedStoppingConfig));
        }

        public Builder metrics(@Nullable Output<List<GoogleCloudMlV1_StudyConfig_MetricSpecArgs>> metrics) {
            $.metrics = metrics;
            return this;
        }

        public Builder metrics(List<GoogleCloudMlV1_StudyConfig_MetricSpecArgs> metrics) {
            return metrics(Output.of(metrics));
        }

        public Builder metrics(GoogleCloudMlV1_StudyConfig_MetricSpecArgs... metrics) {
            return metrics(List.of(metrics));
        }

        public Builder parameters(Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(GoogleCloudMlV1_StudyConfig_ParameterSpecArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public GoogleCloudMlV1__StudyConfigArgs build() {
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
