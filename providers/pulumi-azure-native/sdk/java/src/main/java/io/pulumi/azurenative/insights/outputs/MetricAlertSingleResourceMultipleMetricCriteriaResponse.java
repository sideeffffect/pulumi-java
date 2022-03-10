// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MetricCriteriaResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricAlertSingleResourceMultipleMetricCriteriaResponse {
    /**
     * The list of metric criteria for this 'all of' operation.
     * 
     */
    private final @Nullable List<MetricCriteriaResponse> allOf;
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor
    private MetricAlertSingleResourceMultipleMetricCriteriaResponse(
        @OutputCustomType.Parameter("allOf") @Nullable List<MetricCriteriaResponse> allOf,
        @OutputCustomType.Parameter("odataType") String odataType) {
        this.allOf = allOf;
        this.odataType = odataType;
    }

    /**
     * The list of metric criteria for this 'all of' operation.
     * 
    */
    public List<MetricCriteriaResponse> getAllOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }
    /**
     * specifies the type of the alert criteria.
     * Expected value is 'Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricCriteriaResponse> allOf;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertSingleResourceMultipleMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
    	      this.odataType = defaults.odataType;
        }

        public Builder allOf(@Nullable List<MetricCriteriaResponse> allOf) {
            this.allOf = allOf;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public MetricAlertSingleResourceMultipleMetricCriteriaResponse build() {
            return new MetricAlertSingleResourceMultipleMetricCriteriaResponse(allOf, odataType);
        }
    }
}
