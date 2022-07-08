// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlScheduledMaintenanceResponse {
    private final Boolean canDefer;
    /**
     * @return If the scheduled maintenance can be rescheduled.
     * 
     */
    private final Boolean canReschedule;
    /**
     * @return Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    private final String scheduleDeadlineTime;
    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private SqlScheduledMaintenanceResponse(
        @CustomType.Parameter("canDefer") Boolean canDefer,
        @CustomType.Parameter("canReschedule") Boolean canReschedule,
        @CustomType.Parameter("scheduleDeadlineTime") String scheduleDeadlineTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.canDefer = canDefer;
        this.canReschedule = canReschedule;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    public Boolean canDefer() {
        return this.canDefer;
    }
    /**
     * @return If the scheduled maintenance can be rescheduled.
     * 
     */
    public Boolean canReschedule() {
        return this.canReschedule;
    }
    /**
     * @return Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    public String scheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlScheduledMaintenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canDefer;
        private Boolean canReschedule;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlScheduledMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canDefer = defaults.canDefer;
    	      this.canReschedule = defaults.canReschedule;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder canDefer(Boolean canDefer) {
            this.canDefer = Objects.requireNonNull(canDefer);
            return this;
        }
        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }
        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public SqlScheduledMaintenanceResponse build() {
            return new SqlScheduledMaintenanceResponse(canDefer, canReschedule, scheduleDeadlineTime, startTime);
        }
    }
}
