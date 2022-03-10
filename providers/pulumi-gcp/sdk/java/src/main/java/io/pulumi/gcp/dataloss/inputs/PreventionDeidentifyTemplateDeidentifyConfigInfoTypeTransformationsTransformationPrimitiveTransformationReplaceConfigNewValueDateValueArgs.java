// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a
     * year by itself or a year and month where the day is not significant.
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<Integer> day;

    public Input<Integer> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Month of year. Must be from 1 to 12, or 0 if specifying a year without a month and day.
     * 
     */
    @InputImport(name="month")
      private final @Nullable Input<Integer> month;

    public Input<Integer> getMonth() {
        return this.month == null ? Input.empty() : this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a year.
     * 
     */
    @InputImport(name="year")
      private final @Nullable Input<Integer> year;

    public Input<Integer> getYear() {
        return this.year == null ? Input.empty() : this.year;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs(
        @Nullable Input<Integer> day,
        @Nullable Input<Integer> month,
        @Nullable Input<Integer> year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs() {
        this.day = Input.empty();
        this.month = Input.empty();
        this.year = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> day;
        private @Nullable Input<Integer> month;
        private @Nullable Input<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(@Nullable Input<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable Integer day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder month(@Nullable Input<Integer> month) {
            this.month = month;
            return this;
        }

        public Builder month(@Nullable Integer month) {
            this.month = Input.ofNullable(month);
            return this;
        }

        public Builder year(@Nullable Input<Integer> year) {
            this.year = year;
            return this;
        }

        public Builder year(@Nullable Integer year) {
            this.year = Input.ofNullable(year);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs(day, month, year);
        }
    }
}
