// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyWeeklyCycleDayOfWeekResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyWeeklyCycleDayOfWeekResponse Empty = new ResourcePolicyWeeklyCycleDayOfWeekResponse();

    /**
     * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    @Import(name="day", required=true)
    private String day;

    public String day() {
        return this.day;
    }

    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    @Import(name="duration", required=true)
    private String duration;

    public String duration() {
        return this.duration;
    }

    /**
     * Time within the window to start the operations. It must be in format &#34;HH:MM&#34;, where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    private ResourcePolicyWeeklyCycleDayOfWeekResponse() {}

    private ResourcePolicyWeeklyCycleDayOfWeekResponse(ResourcePolicyWeeklyCycleDayOfWeekResponse $) {
        this.day = $.day;
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyWeeklyCycleDayOfWeekResponse $;

        public Builder() {
            $ = new ResourcePolicyWeeklyCycleDayOfWeekResponse();
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
            $ = new ResourcePolicyWeeklyCycleDayOfWeekResponse(Objects.requireNonNull(defaults));
        }

        public Builder day(String day) {
            $.day = day;
            return this;
        }

        public Builder duration(String duration) {
            $.duration = duration;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public ResourcePolicyWeeklyCycleDayOfWeekResponse build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
