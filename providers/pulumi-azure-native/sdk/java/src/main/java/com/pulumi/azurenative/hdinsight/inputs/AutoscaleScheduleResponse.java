// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.azurenative.hdinsight.inputs.AutoscaleTimeAndCapacityResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for a schedule-based autoscale rule, consisting of an array of days + a time and capacity
 * 
 */
public final class AutoscaleScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutoscaleScheduleResponse Empty = new AutoscaleScheduleResponse();

    /**
     * Days of the week for a schedule-based autoscale rule
     * 
     */
    @Import(name="days")
    private @Nullable List<String> days;

    public Optional<List<String>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * Time and capacity for a schedule-based autoscale rule
     * 
     */
    @Import(name="timeAndCapacity")
    private @Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity;

    public Optional<AutoscaleTimeAndCapacityResponse> timeAndCapacity() {
        return Optional.ofNullable(this.timeAndCapacity);
    }

    private AutoscaleScheduleResponse() {}

    private AutoscaleScheduleResponse(AutoscaleScheduleResponse $) {
        this.days = $.days;
        this.timeAndCapacity = $.timeAndCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleScheduleResponse $;

        public Builder() {
            $ = new AutoscaleScheduleResponse();
        }

        public Builder(AutoscaleScheduleResponse defaults) {
            $ = new AutoscaleScheduleResponse(Objects.requireNonNull(defaults));
        }

        public Builder days(@Nullable List<String> days) {
            $.days = days;
            return this;
        }

        public Builder days(String... days) {
            return days(List.of(days));
        }

        public Builder timeAndCapacity(@Nullable AutoscaleTimeAndCapacityResponse timeAndCapacity) {
            $.timeAndCapacity = timeAndCapacity;
            return this;
        }

        public AutoscaleScheduleResponse build() {
            return $;
        }
    }

}
