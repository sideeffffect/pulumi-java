// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Used for time-dependent conditions. Example: Want to have rule applied for week long sale.
 * 
 */
public final class GoogleCloudRetailV2alphaConditionTimeRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaConditionTimeRangeResponse Empty = new GoogleCloudRetailV2alphaConditionTimeRangeResponse();

    /**
     * End of time range. Range is inclusive.
     * 
     */
    @InputImport(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Start of time range. Range is inclusive.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public GoogleCloudRetailV2alphaConditionTimeRangeResponse(
        String endTime,
        String startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private GoogleCloudRetailV2alphaConditionTimeRangeResponse() {
        this.endTime = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaConditionTimeRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaConditionTimeRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GoogleCloudRetailV2alphaConditionTimeRangeResponse build() {
            return new GoogleCloudRetailV2alphaConditionTimeRangeResponse(endTime, startTime);
        }
    }
}
