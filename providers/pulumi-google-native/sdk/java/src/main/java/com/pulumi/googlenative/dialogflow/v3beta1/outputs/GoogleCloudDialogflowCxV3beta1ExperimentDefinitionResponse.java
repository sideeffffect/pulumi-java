// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1VersionVariantsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse {
    /**
     * @return The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    private final String condition;
    /**
     * @return The flow versions as the variants of this experiment.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("versionVariants") GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
        this.condition = condition;
        this.versionVariants = versionVariants;
    }

    /**
     * @return The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return The flow versions as the variants of this experiment.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants() {
        return this.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.versionVariants = defaults.versionVariants;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder versionVariants(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse versionVariants) {
            this.versionVariants = Objects.requireNonNull(versionVariants);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentDefinitionResponse(condition, versionVariants);
        }
    }
}
