// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_StudyConfig_MetricSpecResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_StudyConfig_ParameterSpecResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AutomatedStoppingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__StudyConfigResponse {
    /**
     * @return The search algorithm specified for the study.
     * 
     */
    private final String algorithm;
    /**
     * @return Configuration for automated stopping of unpromising Trials.
     * 
     */
    private final GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;
    /**
     * @return Metric specs for the study.
     * 
     */
    private final List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;
    /**
     * @return The set of parameters to tune.
     * 
     */
    private final List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

    @CustomType.Constructor
    private GoogleCloudMlV1__StudyConfigResponse(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("automatedStoppingConfig") GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig,
        @CustomType.Parameter("metrics") List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics,
        @CustomType.Parameter("parameters") List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
        this.algorithm = algorithm;
        this.automatedStoppingConfig = automatedStoppingConfig;
        this.metrics = metrics;
        this.parameters = parameters;
    }

    /**
     * @return The search algorithm specified for the study.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return Configuration for automated stopping of unpromising Trials.
     * 
     */
    public GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig() {
        return this.automatedStoppingConfig;
    }
    /**
     * @return Metric specs for the study.
     * 
     */
    public List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics() {
        return this.metrics;
    }
    /**
     * @return The set of parameters to tune.
     * 
     */
    public List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;
        private List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;
        private List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.automatedStoppingConfig = defaults.automatedStoppingConfig;
    	      this.metrics = defaults.metrics;
    	      this.parameters = defaults.parameters;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder automatedStoppingConfig(GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig) {
            this.automatedStoppingConfig = Objects.requireNonNull(automatedStoppingConfig);
            return this;
        }
        public Builder metrics(List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GoogleCloudMlV1_StudyConfig_MetricSpecResponse... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder parameters(List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudMlV1_StudyConfig_ParameterSpecResponse... parameters) {
            return parameters(List.of(parameters));
        }        public GoogleCloudMlV1__StudyConfigResponse build() {
            return new GoogleCloudMlV1__StudyConfigResponse(algorithm, automatedStoppingConfig, metrics, parameters);
        }
    }
}
