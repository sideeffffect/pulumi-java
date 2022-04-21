// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse;
import java.util.Objects;


/**
 * Configuration for Automated Early Stopping of Trials. If no implementation_config is set, automated early stopping will not be run.
 * 
 */
public final class GoogleCloudMlV1__AutomatedStoppingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__AutomatedStoppingConfigResponse Empty = new GoogleCloudMlV1__AutomatedStoppingConfigResponse();

    @Import(name="decayCurveStoppingConfig", required=true)
    private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig;

    public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig() {
        return this.decayCurveStoppingConfig;
    }

    @Import(name="medianAutomatedStoppingConfig", required=true)
    private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig;

    public GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig() {
        return this.medianAutomatedStoppingConfig;
    }

    private GoogleCloudMlV1__AutomatedStoppingConfigResponse() {}

    private GoogleCloudMlV1__AutomatedStoppingConfigResponse(GoogleCloudMlV1__AutomatedStoppingConfigResponse $) {
        this.decayCurveStoppingConfig = $.decayCurveStoppingConfig;
        this.medianAutomatedStoppingConfig = $.medianAutomatedStoppingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__AutomatedStoppingConfigResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__AutomatedStoppingConfigResponse();
        }

        public Builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
            $ = new GoogleCloudMlV1__AutomatedStoppingConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder decayCurveStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig) {
            $.decayCurveStoppingConfig = decayCurveStoppingConfig;
            return this;
        }

        public Builder medianAutomatedStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig) {
            $.medianAutomatedStoppingConfig = medianAutomatedStoppingConfig;
            return this;
        }

        public GoogleCloudMlV1__AutomatedStoppingConfigResponse build() {
            $.decayCurveStoppingConfig = Objects.requireNonNull($.decayCurveStoppingConfig, "expected parameter 'decayCurveStoppingConfig' to be non-null");
            $.medianAutomatedStoppingConfig = Objects.requireNonNull($.medianAutomatedStoppingConfig, "expected parameter 'medianAutomatedStoppingConfig' to be non-null");
            return $;
        }
    }

}
