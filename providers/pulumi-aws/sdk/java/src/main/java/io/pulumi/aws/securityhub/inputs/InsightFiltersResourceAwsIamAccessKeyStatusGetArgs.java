// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsIamAccessKeyStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsIamAccessKeyStatusGetArgs Empty = new InsightFiltersResourceAwsIamAccessKeyStatusGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @InputImport(name="comparison", required=true)
      private final Input<String> comparison;

    public Input<String> getComparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public InsightFiltersResourceAwsIamAccessKeyStatusGetArgs(
        Input<String> comparison,
        Input<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersResourceAwsIamAccessKeyStatusGetArgs() {
        this.comparison = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsIamAccessKeyStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparison;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsIamAccessKeyStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder comparison(Input<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder comparison(String comparison) {
            this.comparison = Input.of(Objects.requireNonNull(comparison));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public InsightFiltersResourceAwsIamAccessKeyStatusGetArgs build() {
            return new InsightFiltersResourceAwsIamAccessKeyStatusGetArgs(comparison, value);
        }
    }
}
