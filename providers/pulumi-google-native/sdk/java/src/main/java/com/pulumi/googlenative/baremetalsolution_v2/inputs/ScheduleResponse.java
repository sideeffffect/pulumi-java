// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A snapshot schedule.
 * 
 */
public final class ScheduleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduleResponse Empty = new ScheduleResponse();

    /**
     * A crontab-like specification that the schedule uses to take snapshots.
     * 
     */
    @Import(name="crontabSpec", required=true)
      private final String crontabSpec;

    public String crontabSpec() {
        return this.crontabSpec;
    }

    /**
     * A list of snapshot names created in this schedule.
     * 
     */
    @Import(name="prefix", required=true)
      private final String prefix;

    public String prefix() {
        return this.prefix;
    }

    /**
     * The maximum number of snapshots to retain in this schedule.
     * 
     */
    @Import(name="retentionCount", required=true)
      private final Integer retentionCount;

    public Integer retentionCount() {
        return this.retentionCount;
    }

    public ScheduleResponse(
        String crontabSpec,
        String prefix,
        Integer retentionCount) {
        this.crontabSpec = Objects.requireNonNull(crontabSpec, "expected parameter 'crontabSpec' to be non-null");
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.retentionCount = Objects.requireNonNull(retentionCount, "expected parameter 'retentionCount' to be non-null");
    }

    private ScheduleResponse() {
        this.crontabSpec = null;
        this.prefix = null;
        this.retentionCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crontabSpec;
        private String prefix;
        private Integer retentionCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crontabSpec = defaults.crontabSpec;
    	      this.prefix = defaults.prefix;
    	      this.retentionCount = defaults.retentionCount;
        }

        public Builder crontabSpec(String crontabSpec) {
            this.crontabSpec = Objects.requireNonNull(crontabSpec);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder retentionCount(Integer retentionCount) {
            this.retentionCount = Objects.requireNonNull(retentionCount);
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(crontabSpec, prefix, retentionCount);
        }
    }
}
