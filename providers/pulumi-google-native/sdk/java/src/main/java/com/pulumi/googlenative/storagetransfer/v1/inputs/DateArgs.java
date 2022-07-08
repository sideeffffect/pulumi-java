// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone are either specified elsewhere or are insignificant. The date is relative to the Gregorian Calendar. This can represent one of the following: * A full date, with non-zero year, month, and day values. * A month and day, with a zero year (for example, an anniversary). * A year on its own, with a zero month and a zero day. * A year and month, with a zero day (for example, a credit card expiration date). Related types: * google.type.TimeOfDay * google.type.DateTime * google.protobuf.Timestamp
 * 
 */
public final class DateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DateArgs Empty = new DateArgs();

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    @Import(name="day")
    private @Nullable Output<Integer> day;

    /**
     * @return Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    public Optional<Output<Integer>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    @Import(name="month")
    private @Nullable Output<Integer> month;

    /**
     * @return Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    public Optional<Output<Integer>> month() {
        return Optional.ofNullable(this.month);
    }

    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    @Import(name="year")
    private @Nullable Output<Integer> year;

    /**
     * @return Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    public Optional<Output<Integer>> year() {
        return Optional.ofNullable(this.year);
    }

    private DateArgs() {}

    private DateArgs(DateArgs $) {
        this.day = $.day;
        this.month = $.month;
        this.year = $.year;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DateArgs $;

        public Builder() {
            $ = new DateArgs();
        }

        public Builder(DateArgs defaults) {
            $ = new DateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable Output<Integer> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
         * 
         * @return builder
         * 
         */
        public Builder day(Integer day) {
            return day(Output.of(day));
        }

        /**
         * @param month Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
         * 
         * @return builder
         * 
         */
        public Builder month(@Nullable Output<Integer> month) {
            $.month = month;
            return this;
        }

        /**
         * @param month Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
         * 
         * @return builder
         * 
         */
        public Builder month(Integer month) {
            return month(Output.of(month));
        }

        /**
         * @param year Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
         * 
         * @return builder
         * 
         */
        public Builder year(@Nullable Output<Integer> year) {
            $.year = year;
            return this;
        }

        /**
         * @param year Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
         * 
         * @return builder
         * 
         */
        public Builder year(Integer year) {
            return year(Output.of(year));
        }

        public DateArgs build() {
            return $;
        }
    }

}
