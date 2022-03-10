// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.GetDomainAutoTuneOptionMaintenanceScheduleDuration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDomainAutoTuneOptionMaintenanceSchedule {
    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    private final String cronExpressionForRecurrence;
    /**
     * Configuration block for the duration of the Auto-Tune maintenance window.
     * 
     */
    private final List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations;
    /**
     * Date and time at which the Auto-Tune maintenance schedule starts in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final String startAt;

    @OutputCustomType.Constructor
    private GetDomainAutoTuneOptionMaintenanceSchedule(
        @OutputCustomType.Parameter("cronExpressionForRecurrence") String cronExpressionForRecurrence,
        @OutputCustomType.Parameter("durations") List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> durations,
        @OutputCustomType.Parameter("startAt") String startAt) {
        this.cronExpressionForRecurrence = cronExpressionForRecurrence;
        this.durations = durations;
        this.startAt = startAt;
    }

    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
    */
    public String getCronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }
    /**
     * Configuration block for the duration of the Auto-Tune maintenance window.
     * 
    */
    public List<GetDomainAutoTuneOptionMaintenanceScheduleDuration> getDurations() {
        return this.durations;
    }
    /**
     * Date and time at which the Auto-Tune maintenance schedule starts in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public String getStartAt() {
        return this.startAt;
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

        public Builder startAt(String startAt) {
            this.startAt = Objects.requireNonNull(startAt);
            return this;
        }
        public GetDomainAutoTuneOptionMaintenanceSchedule build() {
            return new GetDomainAutoTuneOptionMaintenanceSchedule(cronExpressionForRecurrence, durations, startAt);
        }
    }
}
