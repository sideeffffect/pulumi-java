// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1RevenueShareRangeResponse {
    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    private final String end;
    /**
     * Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
     * 
     */
    private final Double sharePercentage;
    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    private final String start;

    @OutputCustomType.Constructor
    private GoogleCloudApigeeV1RevenueShareRangeResponse(
        @OutputCustomType.Parameter("end") String end,
        @OutputCustomType.Parameter("sharePercentage") Double sharePercentage,
        @OutputCustomType.Parameter("start") String start) {
        this.end = end;
        this.sharePercentage = sharePercentage;
        this.start = start;
    }

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
    */
    public String getEnd() {
        return this.end;
    }
    /**
     * Percentage of the revenue to be shared with the developer. For example, to share 21 percent of the total revenue with the developer, set this value to 21. Specify a decimal number with a maximum of two digits following the decimal point.
     * 
    */
    public Double getSharePercentage() {
        return this.sharePercentage;
    }
    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
    */
    public String getStart() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1RevenueShareRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String end;
        private Double sharePercentage;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1RevenueShareRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.sharePercentage = defaults.sharePercentage;
    	      this.start = defaults.start;
        }

        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder sharePercentage(Double sharePercentage) {
            this.sharePercentage = Objects.requireNonNull(sharePercentage);
            return this;
        }

        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public GoogleCloudApigeeV1RevenueShareRangeResponse build() {
            return new GoogleCloudApigeeV1RevenueShareRangeResponse(end, sharePercentage, start);
        }
    }
}
