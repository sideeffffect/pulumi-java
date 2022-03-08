// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudsearch_v1.outputs.DateResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ValueResponse {
    private final Boolean booleanValue;
    private final DateResponse dateValue;
    private final Double doubleValue;
    private final String integerValue;
    private final String stringValue;
    private final String timestampValue;

    @OutputCustomType.Constructor({"booleanValue","dateValue","doubleValue","integerValue","stringValue","timestampValue"})
    private ValueResponse(
        Boolean booleanValue,
        DateResponse dateValue,
        Double doubleValue,
        String integerValue,
        String stringValue,
        String timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }
    public DateResponse getDateValue() {
        return this.dateValue;
    }
    public Double getDoubleValue() {
        return this.doubleValue;
    }
    public String getIntegerValue() {
        return this.integerValue;
    }
    public String getStringValue() {
        return this.stringValue;
    }
    public String getTimestampValue() {
        return this.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean booleanValue;
        private DateResponse dateValue;
        private Double doubleValue;
        private String integerValue;
        private String stringValue;
        private String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder setBooleanValue(Boolean booleanValue) {
            this.booleanValue = Objects.requireNonNull(booleanValue);
            return this;
        }

        public Builder setDateValue(DateResponse dateValue) {
            this.dateValue = Objects.requireNonNull(dateValue);
            return this;
        }

        public Builder setDoubleValue(Double doubleValue) {
            this.doubleValue = Objects.requireNonNull(doubleValue);
            return this;
        }

        public Builder setIntegerValue(String integerValue) {
            this.integerValue = Objects.requireNonNull(integerValue);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public Builder setTimestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }
        public ValueResponse build() {
            return new ValueResponse(booleanValue, dateValue, doubleValue, integerValue, stringValue, timestampValue);
        }
    }
}
