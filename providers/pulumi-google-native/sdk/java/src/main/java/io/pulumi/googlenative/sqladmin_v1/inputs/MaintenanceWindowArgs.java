// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.enums.MaintenanceWindowUpdateTrack;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maintenance window. This specifies when a Cloud SQL instance is restarted for system maintenance purposes.
 * 
 */
public final class MaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowArgs Empty = new MaintenanceWindowArgs();

    /**
     * day of week (1-7), starting on Monday.
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<Integer> day;

    public Input<Integer> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * hour of day - 0 to 23.
     * 
     */
    @InputImport(name="hour")
      private final @Nullable Input<Integer> hour;

    public Input<Integer> getHour() {
        return this.hour == null ? Input.empty() : this.hour;
    }

    /**
     * This is always `sql#maintenanceWindow`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
     */
    @InputImport(name="updateTrack")
      private final @Nullable Input<MaintenanceWindowUpdateTrack> updateTrack;

    public Input<MaintenanceWindowUpdateTrack> getUpdateTrack() {
        return this.updateTrack == null ? Input.empty() : this.updateTrack;
    }

    public MaintenanceWindowArgs(
        @Nullable Input<Integer> day,
        @Nullable Input<Integer> hour,
        @Nullable Input<String> kind,
        @Nullable Input<MaintenanceWindowUpdateTrack> updateTrack) {
        this.day = day;
        this.hour = hour;
        this.kind = kind;
        this.updateTrack = updateTrack;
    }

    private MaintenanceWindowArgs() {
        this.day = Input.empty();
        this.hour = Input.empty();
        this.kind = Input.empty();
        this.updateTrack = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> day;
        private @Nullable Input<Integer> hour;
        private @Nullable Input<String> kind;
        private @Nullable Input<MaintenanceWindowUpdateTrack> updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.kind = defaults.kind;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder day(@Nullable Input<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable Integer day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder hour(@Nullable Input<Integer> hour) {
            this.hour = hour;
            return this;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = Input.ofNullable(hour);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder updateTrack(@Nullable Input<MaintenanceWindowUpdateTrack> updateTrack) {
            this.updateTrack = updateTrack;
            return this;
        }

        public Builder updateTrack(@Nullable MaintenanceWindowUpdateTrack updateTrack) {
            this.updateTrack = Input.ofNullable(updateTrack);
            return this;
        }
        public MaintenanceWindowArgs build() {
            return new MaintenanceWindowArgs(day, hour, kind, updateTrack);
        }
    }
}
