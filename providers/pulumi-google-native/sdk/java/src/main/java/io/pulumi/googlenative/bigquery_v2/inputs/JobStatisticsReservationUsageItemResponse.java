// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class JobStatisticsReservationUsageItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStatisticsReservationUsageItemResponse Empty = new JobStatisticsReservationUsageItemResponse();

    /**
     * Reservation name or "unreserved" for on-demand resources usage.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Slot-milliseconds the job spent in the given reservation.
     * 
     */
    @InputImport(name="slotMs", required=true)
      private final String slotMs;

    public String getSlotMs() {
        return this.slotMs;
    }

    public JobStatisticsReservationUsageItemResponse(
        String name,
        String slotMs) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.slotMs = Objects.requireNonNull(slotMs, "expected parameter 'slotMs' to be non-null");
    }

    private JobStatisticsReservationUsageItemResponse() {
        this.name = null;
        this.slotMs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticsReservationUsageItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String slotMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticsReservationUsageItemResponse defaults) {
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
        public JobStatisticsReservationUsageItemResponse build() {
            return new JobStatisticsReservationUsageItemResponse(name, slotMs);
        }
    }
}
