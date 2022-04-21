// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration settings for Cloud Composer maintenance window. The following example: ```{ &#34;startTime&#34;:&#34;2019-08-01T01:00:00Z&#34; &#34;endTime&#34;:&#34;2019-08-01T07:00:00Z&#34; &#34;recurrence&#34;:&#34;FREQ=WEEKLY;BYDAY=TU,WE&#34; }``` would define a maintenance window between 01 and 07 hours UTC during each Tuesday and Wednesday.
 * 
 */
public final class MaintenanceWindowResponse extends com.pulumi.resources.InvokeArgs {

    public static final MaintenanceWindowResponse Empty = new MaintenanceWindowResponse();

    /**
     * Maintenance window end time. It is used only to calculate the duration of the maintenance window. The value for end_time must be in the future, relative to `start_time`.
     * 
     */
    @Import(name="endTime", required=true)
    private String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Maintenance window recurrence. Format is a subset of [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...` Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
     * 
     */
    @Import(name="recurrence", required=true)
    private String recurrence;

    public String recurrence() {
        return this.recurrence;
    }

    /**
     * Start time of the first recurrence of the maintenance window.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    private MaintenanceWindowResponse() {}

    private MaintenanceWindowResponse(MaintenanceWindowResponse $) {
        this.endTime = $.endTime;
        this.recurrence = $.recurrence;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowResponse $;

        public Builder() {
            $ = new MaintenanceWindowResponse();
        }

        public Builder(MaintenanceWindowResponse defaults) {
            $ = new MaintenanceWindowResponse(Objects.requireNonNull(defaults));
        }

        public Builder endTime(String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder recurrence(String recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public MaintenanceWindowResponse build() {
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.recurrence = Objects.requireNonNull($.recurrence, "expected parameter 'recurrence' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
