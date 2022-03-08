// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse {
    /**
     * An email address to send alerts to.
     * 
     */
    private final String email;
    /**
     * A number between 0 and 1 that describes a minimum mean average precision threshold. When the evaluation job runs, if it calculates that your model version's predictions from the recent interval have meanAveragePrecision below this threshold, then it sends an alert to your specified email.
     * 
     */
    private final Double minAcceptableMeanAveragePrecision;

    @OutputCustomType.Constructor({"email","minAcceptableMeanAveragePrecision"})
    private GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse(
        String email,
        Double minAcceptableMeanAveragePrecision) {
        this.email = email;
        this.minAcceptableMeanAveragePrecision = minAcceptableMeanAveragePrecision;
    }

    /**
     * An email address to send alerts to.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * A number between 0 and 1 that describes a minimum mean average precision threshold. When the evaluation job runs, if it calculates that your model version's predictions from the recent interval have meanAveragePrecision below this threshold, then it sends an alert to your specified email.
     * 
    */
    public Double getMinAcceptableMeanAveragePrecision() {
        return this.minAcceptableMeanAveragePrecision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private Double minAcceptableMeanAveragePrecision;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.minAcceptableMeanAveragePrecision = defaults.minAcceptableMeanAveragePrecision;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setMinAcceptableMeanAveragePrecision(Double minAcceptableMeanAveragePrecision) {
            this.minAcceptableMeanAveragePrecision = Objects.requireNonNull(minAcceptableMeanAveragePrecision);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1EvaluationJobAlertConfigResponse(email, minAcceptableMeanAveragePrecision);
        }
    }
}
