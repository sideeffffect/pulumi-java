// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobStatistics2ReservationUsageItemResponse {
    /**
     * Reservation name or "unreserved" for on-demand resources usage.
     * 
     */
    private final String name;
    /**
     * Slot-milliseconds the job spent in the given reservation.
     * 
     */
    private final String slotMs;

    @OutputCustomType.Constructor
    private JobStatistics2ReservationUsageItemResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("slotMs") String slotMs) {
        this.name = name;
        this.slotMs = slotMs;
    }

    /**
     * Reservation name or "unreserved" for on-demand resources usage.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Slot-milliseconds the job spent in the given reservation.
     * 
    */
    public String getSlotMs() {
        return this.slotMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics2ReservationUsageItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String slotMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics2ReservationUsageItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.slotMs = defaults.slotMs;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder slotMs(String slotMs) {
            this.slotMs = Objects.requireNonNull(slotMs);
            return this;
        }
        public JobStatistics2ReservationUsageItemResponse build() {
            return new JobStatistics2ReservationUsageItemResponse(name, slotMs);
        }
    }
}
