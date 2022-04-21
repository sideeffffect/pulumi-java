// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.enums.WeekDay;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Time in a week.
 * 
 */
public final class TimeInWeekArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeInWeekArgs Empty = new TimeInWeekArgs();

    /**
     * A day in a week.
     * 
     */
    @Import(name="day")
    private @Nullable Output<Either<String,WeekDay>> day;

    public Optional<Output<Either<String,WeekDay>>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * hour slots in a day.
     * 
     */
    @Import(name="hourSlots")
    private @Nullable Output<List<Integer>> hourSlots;

    public Optional<Output<List<Integer>>> hourSlots() {
        return Optional.ofNullable(this.hourSlots);
    }

    private TimeInWeekArgs() {}

    private TimeInWeekArgs(TimeInWeekArgs $) {
        this.day = $.day;
        this.hourSlots = $.hourSlots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeInWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeInWeekArgs $;

        public Builder() {
            $ = new TimeInWeekArgs();
        }

        public Builder(TimeInWeekArgs defaults) {
            $ = new TimeInWeekArgs(Objects.requireNonNull(defaults));
        }

        public Builder day(@Nullable Output<Either<String,WeekDay>> day) {
            $.day = day;
            return this;
        }

        public Builder day(Either<String,WeekDay> day) {
            return day(Output.of(day));
        }

        public Builder hourSlots(@Nullable Output<List<Integer>> hourSlots) {
            $.hourSlots = hourSlots;
            return this;
        }

        public Builder hourSlots(List<Integer> hourSlots) {
            return hourSlots(Output.of(hourSlots));
        }

        public Builder hourSlots(Integer... hourSlots) {
            return hourSlots(List.of(hourSlots));
        }

        public TimeInWeekArgs build() {
            return $;
        }
    }

}
