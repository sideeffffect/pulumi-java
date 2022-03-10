// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GoogleTypeDateResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GoogleTypeTimeOfDayResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ValueResponse {
    /**
     * boolean
     * 
     */
    private final Boolean booleanValue;
    /**
     * date
     * 
     */
    private final GoogleTypeDateResponse dateValue;
    /**
     * day of week
     * 
     */
    private final String dayOfWeekValue;
    /**
     * float
     * 
     */
    private final Double floatValue;
    /**
     * integer
     * 
     */
    private final String integerValue;
    /**
     * string
     * 
     */
    private final String stringValue;
    /**
     * time of day
     * 
     */
    private final GoogleTypeTimeOfDayResponse timeValue;
    /**
     * timestamp
     * 
     */
    private final String timestampValue;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2ValueResponse(
        @OutputCustomType.Parameter("booleanValue") Boolean booleanValue,
        @OutputCustomType.Parameter("dateValue") GoogleTypeDateResponse dateValue,
        @OutputCustomType.Parameter("dayOfWeekValue") String dayOfWeekValue,
        @OutputCustomType.Parameter("floatValue") Double floatValue,
        @OutputCustomType.Parameter("integerValue") String integerValue,
        @OutputCustomType.Parameter("stringValue") String stringValue,
        @OutputCustomType.Parameter("timeValue") GoogleTypeTimeOfDayResponse timeValue,
        @OutputCustomType.Parameter("timestampValue") String timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.dayOfWeekValue = dayOfWeekValue;
        this.floatValue = floatValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timeValue = timeValue;
        this.timestampValue = timestampValue;
    }

    /**
     * boolean
     * 
    */
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }
    /**
     * date
     * 
    */
    public GoogleTypeDateResponse getDateValue() {
        return this.dateValue;
    }
    /**
     * day of week
     * 
    */
    public String getDayOfWeekValue() {
        return this.dayOfWeekValue;
    }
    /**
     * float
     * 
    */
    public Double getFloatValue() {
        return this.floatValue;
    }
    /**
     * integer
     * 
    */
    public String getIntegerValue() {
        return this.integerValue;
    }
    /**
     * string
     * 
    */
    public String getStringValue() {
        return this.stringValue;
    }
    /**
     * time of day
     * 
    */
    public GoogleTypeTimeOfDayResponse getTimeValue() {
        return this.timeValue;
    }
    /**
     * timestamp
     * 
    */
    public String getTimestampValue() {
        return this.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean booleanValue;
        private GoogleTypeDateResponse dateValue;
        private String dayOfWeekValue;
        private Double floatValue;
        private String integerValue;
        private String stringValue;
        private GoogleTypeTimeOfDayResponse timeValue;
        private String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.dayOfWeekValue = defaults.dayOfWeekValue;
    	      this.floatValue = defaults.floatValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timeValue = defaults.timeValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = Objects.requireNonNull(booleanValue);
            return this;
        }

        public Builder dateValue(GoogleTypeDateResponse dateValue) {
            this.dateValue = Objects.requireNonNull(dateValue);
            return this;
        }

        public Builder dayOfWeekValue(String dayOfWeekValue) {
            this.dayOfWeekValue = Objects.requireNonNull(dayOfWeekValue);
            return this;
        }

        public Builder floatValue(Double floatValue) {
            this.floatValue = Objects.requireNonNull(floatValue);
            return this;
        }

        public Builder integerValue(String integerValue) {
            this.integerValue = Objects.requireNonNull(integerValue);
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public Builder timeValue(GoogleTypeTimeOfDayResponse timeValue) {
            this.timeValue = Objects.requireNonNull(timeValue);
            return this;
        }

        public Builder timestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }
        public GooglePrivacyDlpV2ValueResponse build() {
            return new GooglePrivacyDlpV2ValueResponse(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
