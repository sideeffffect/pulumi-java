// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InsightFiltersResourceAwsEc2InstanceImageId {
    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private final String comparison;
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"comparison","value"})
    private InsightFiltersResourceAwsEc2InstanceImageId(
        String comparison,
        String value) {
        this.comparison = comparison;
        this.value = value;
    }

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
    */
    public String getComparison() {
        return this.comparison;
    }
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsEc2InstanceImageId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparison;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceImageId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersResourceAwsEc2InstanceImageId build() {
            return new InsightFiltersResourceAwsEc2InstanceImageId(comparison, value);
        }
    }
}
