// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.inputs.DayDetailsResponse;
import com.pulumi.azurenative.devtestlab.inputs.HourDetailsResponse;
import com.pulumi.azurenative.devtestlab.inputs.NotificationSettingsResponse;
import com.pulumi.azurenative.devtestlab.inputs.WeekDetailsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for creating a schedule.
 * 
 */
public final class ScheduleCreationParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleCreationParameterResponse Empty = new ScheduleCreationParameterResponse();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Import(name="dailyRecurrence")
    private @Nullable DayDetailsResponse dailyRecurrence;

    public Optional<DayDetailsResponse> dailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Import(name="hourlyRecurrence")
    private @Nullable HourDetailsResponse hourlyRecurrence;

    public Optional<HourDetailsResponse> hourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }

    /**
     * The location of the new virtual machine or environment
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Notification settings.
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable NotificationSettingsResponse notificationSettings;

    public Optional<NotificationSettingsResponse> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Import(name="targetResourceId")
    private @Nullable String targetResourceId;

    public Optional<String> targetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Import(name="taskType")
    private @Nullable String taskType;

    public Optional<String> taskType() {
        return Optional.ofNullable(this.taskType);
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId")
    private @Nullable String timeZoneId;

    public Optional<String> timeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Import(name="weeklyRecurrence")
    private @Nullable WeekDetailsResponse weeklyRecurrence;

    public Optional<WeekDetailsResponse> weeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    private ScheduleCreationParameterResponse() {}

    private ScheduleCreationParameterResponse(ScheduleCreationParameterResponse $) {
        this.dailyRecurrence = $.dailyRecurrence;
        this.hourlyRecurrence = $.hourlyRecurrence;
        this.location = $.location;
        this.name = $.name;
        this.notificationSettings = $.notificationSettings;
        this.status = $.status;
        this.tags = $.tags;
        this.targetResourceId = $.targetResourceId;
        this.taskType = $.taskType;
        this.timeZoneId = $.timeZoneId;
        this.weeklyRecurrence = $.weeklyRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleCreationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleCreationParameterResponse $;

        public Builder() {
            $ = new ScheduleCreationParameterResponse();
        }

        public Builder(ScheduleCreationParameterResponse defaults) {
            $ = new ScheduleCreationParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder dailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            $.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder hourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            $.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public Builder targetResourceId(@Nullable String targetResourceId) {
            $.targetResourceId = targetResourceId;
            return this;
        }

        public Builder taskType(@Nullable String taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder timeZoneId(@Nullable String timeZoneId) {
            $.timeZoneId = timeZoneId;
            return this;
        }

        public Builder weeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            $.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public ScheduleCreationParameterResponse build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.status = Codegen.stringProp("status").arg($.status).def("Disabled").getNullable();
            return $;
        }
    }

}
