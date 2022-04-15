// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.GetDomainAutoTuneOptionMaintenanceScheduleDuration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDomainAutoTuneOptionMaintenanceSchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainAutoTuneOptionMaintenanceSchedule Empty = new GetDomainAutoTuneOptionMaintenanceSchedule();

    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    @Import(name="cronExpressionForRecurrence", required=true)
      private final String cronExpressionForRecurrence;

    public String cronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }

    /**
     * Configuration block for the duration of the Auto-Tune maintenance window.
     * 
     */
    @Import(name="durations", required=true)
      private final List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations;

    public List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations() {
        return this.durations;
    }

    /**
     * Date and time at which the Auto-Tune maintenance schedule starts in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="startAt", required=true)
      private final String startAt;

    public String startAt() {
        return this.startAt;
    }

    public GetDomainAutoTuneOptionMaintenanceSchedule(
        String cronExpressionForRecurrence,
        List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations,
        String startAt) {
        this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence, "expected parameter 'cronExpressionForRecurrence' to be non-null");
        this.durations = Objects.requireNonNull(durations, "expected parameter 'durations' to be non-null");
        this.startAt = Objects.requireNonNull(startAt, "expected parameter 'startAt' to be non-null");
    }

    private GetDomainAutoTuneOptionMaintenanceSchedule() {
        this.cronExpressionForRecurrence = null;
        this.durations = List.of();
        this.startAt = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAutoTuneOptionMaintenanceSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cronExpressionForRecurrence;
        private List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations;
        private String startAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAutoTuneOptionMaintenanceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpressionForRecurrence = defaults.cronExpressionForRecurrence;
    	      this.durations = defaults.durations;
    	      this.startAt = defaults.startAt;
        }

        public Builder cronExpressionForRecurrence(String cronExpressionForRecurrence) {
            this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence);
            return this;
        }
        public Builder durations(List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations) {
            this.durations = Objects.requireNonNull(durations);
            return this;
        }
        public Builder durations(GetDomainAutoTuneOptionMaintenanceScheduleDuration... durations) {
            return durations(List.of(durations));
        }
        public Builder startAt(String startAt) {
            this.startAt = Objects.requireNonNull(startAt);
            return this;
        }        public GetDomainAutoTuneOptionMaintenanceSchedule build() {
            return new GetDomainAutoTuneOptionMaintenanceSchedule(cronExpressionForRecurrence, durations, startAt);
        }
    }
}
