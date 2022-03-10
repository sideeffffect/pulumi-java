// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue {
    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
     * year by itself or a year and month where the day is not significant.
     * 
     */
    private final @Nullable Integer day;
    /**
     * Month of year. Must be from 1 to 12, or 0 if specifying a year without a month and day.
     * 
     */
    private final @Nullable Integer month;
    /**
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
     * 
     */
    private final @Nullable Integer year;

    @OutputCustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue(
        @OutputCustomType.Parameter("day") @Nullable Integer day,
        @OutputCustomType.Parameter("month") @Nullable Integer month,
        @OutputCustomType.Parameter("year") @Nullable Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
     * year by itself or a year and month where the day is not significant.
     * 
    */
    public Optional<Integer> getDay() {
        return Optional.ofNullable(this.day);
    }
    /**
     * Month of year. Must be from 1 to 12, or 0 if specifying a year without a month and day.
     * 
    */
    public Optional<Integer> getMonth() {
        return Optional.ofNullable(this.month);
    }
    /**
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
     * 
    */
    public Optional<Integer> getYear() {
        return Optional.ofNullable(this.year);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer day;
        private @Nullable Integer month;
        private @Nullable Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(@Nullable Integer day) {
            this.day = day;
            return this;
        }

        public Builder month(@Nullable Integer month) {
            this.month = month;
            return this;
        }

        public Builder year(@Nullable Integer year) {
            this.year = year;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValue(day, month, year);
        }
    }
}
