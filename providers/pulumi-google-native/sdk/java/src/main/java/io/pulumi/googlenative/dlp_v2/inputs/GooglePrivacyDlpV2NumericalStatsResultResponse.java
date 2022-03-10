// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.util.List;
import java.util.Objects;


/**
 * Result of the numerical stats computation.
 * 
 */
public final class GooglePrivacyDlpV2NumericalStatsResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2NumericalStatsResultResponse Empty = new GooglePrivacyDlpV2NumericalStatsResultResponse();

    /**
     * Maximum value appearing in the column.
     * 
     */
    @InputImport(name="maxValue", required=true)
      private final GooglePrivacyDlpV2ValueResponse maxValue;

    public GooglePrivacyDlpV2ValueResponse getMaxValue() {
        return this.maxValue;
    }

    /**
     * Minimum value appearing in the column.
     * 
     */
    @InputImport(name="minValue", required=true)
      private final GooglePrivacyDlpV2ValueResponse minValue;

    public GooglePrivacyDlpV2ValueResponse getMinValue() {
        return this.minValue;
    }

    /**
     * List of 99 values that partition the set of field values into 100 equal sized buckets.
     * 
     */
    @InputImport(name="quantileValues", required=true)
      private final List<GooglePrivacyDlpV2ValueResponse> quantileValues;

    public List<GooglePrivacyDlpV2ValueResponse> getQuantileValues() {
        return this.quantileValues;
    }

    public GooglePrivacyDlpV2NumericalStatsResultResponse(
        GooglePrivacyDlpV2ValueResponse maxValue,
        GooglePrivacyDlpV2ValueResponse minValue,
        List<GooglePrivacyDlpV2ValueResponse> quantileValues) {
        this.maxValue = Objects.requireNonNull(maxValue, "expected parameter 'maxValue' to be non-null");
        this.minValue = Objects.requireNonNull(minValue, "expected parameter 'minValue' to be non-null");
        this.quantileValues = Objects.requireNonNull(quantileValues, "expected parameter 'quantileValues' to be non-null");
    }

    private GooglePrivacyDlpV2NumericalStatsResultResponse() {
        this.maxValue = null;
        this.minValue = null;
        this.quantileValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2NumericalStatsResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ValueResponse maxValue;
        private GooglePrivacyDlpV2ValueResponse minValue;
        private List<GooglePrivacyDlpV2ValueResponse> quantileValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2NumericalStatsResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
    	      this.quantileValues = defaults.quantileValues;
        }

        public Builder maxValue(GooglePrivacyDlpV2ValueResponse maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder minValue(GooglePrivacyDlpV2ValueResponse minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public Builder quantileValues(List<GooglePrivacyDlpV2ValueResponse> quantileValues) {
            this.quantileValues = Objects.requireNonNull(quantileValues);
            return this;
        }
        public GooglePrivacyDlpV2NumericalStatsResultResponse build() {
            return new GooglePrivacyDlpV2NumericalStatsResultResponse(maxValue, minValue, quantileValues);
        }
    }
}
