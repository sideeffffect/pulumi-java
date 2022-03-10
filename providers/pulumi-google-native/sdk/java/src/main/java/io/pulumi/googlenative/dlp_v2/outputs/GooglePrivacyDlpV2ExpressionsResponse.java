// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ConditionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ExpressionsResponse {
    /**
     * Conditions to apply to the expression.
     * 
     */
    private final GooglePrivacyDlpV2ConditionsResponse conditions;
    /**
     * The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
     * 
     */
    private final String logicalOperator;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2ExpressionsResponse(
        @OutputCustomType.Parameter("conditions") GooglePrivacyDlpV2ConditionsResponse conditions,
        @OutputCustomType.Parameter("logicalOperator") String logicalOperator) {
        this.conditions = conditions;
        this.logicalOperator = logicalOperator;
    }

    /**
     * Conditions to apply to the expression.
     * 
    */
    public GooglePrivacyDlpV2ConditionsResponse getConditions() {
        return this.conditions;
    }
    /**
     * The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
     * 
    */
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExpressionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ConditionsResponse conditions;
        private String logicalOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExpressionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.logicalOperator = defaults.logicalOperator;
        }

        public Builder conditions(GooglePrivacyDlpV2ConditionsResponse conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder logicalOperator(String logicalOperator) {
            this.logicalOperator = Objects.requireNonNull(logicalOperator);
            return this;
        }
        public GooglePrivacyDlpV2ExpressionsResponse build() {
            return new GooglePrivacyDlpV2ExpressionsResponse(conditions, logicalOperator);
        }
    }
}
