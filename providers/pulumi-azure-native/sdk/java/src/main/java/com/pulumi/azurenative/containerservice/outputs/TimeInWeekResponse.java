// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TimeInWeekResponse {
    /**
     * A day in a week.
     * 
     */
    private final @Nullable String day;
    /**
     * hour slots in a day.
     * 
     */
    private final @Nullable List<Integer> hourSlots;

    @CustomType.Constructor
    private TimeInWeekResponse(
        @CustomType.Parameter("day") @Nullable String day,
        @CustomType.Parameter("hourSlots") @Nullable List<Integer> hourSlots) {
        this.day = day;
        this.hourSlots = hourSlots;
    }

    /**
     * A day in a week.
     * 
    */
    public Optional<String> day() {
        return Optional.ofNullable(this.day);
    }
    /**
     * hour slots in a day.
     * 
    */
    public List<Integer> hourSlots() {
        return this.hourSlots == null ? List.of() : this.hourSlots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeInWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable List<Integer> hourSlots;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeInWeekResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hourSlots = defaults.hourSlots;
        }

        public Builder day(@Nullable String day) {
            this.day = day;
            return this;
        }
        public Builder hourSlots(@Nullable List<Integer> hourSlots) {
            this.hourSlots = hourSlots;
            return this;
        }
        public Builder hourSlots(Integer... hourSlots) {
            return hourSlots(List.of(hourSlots));
        }        public TimeInWeekResponse build() {
            return new TimeInWeekResponse(day, hourSlots);
        }
    }
}
