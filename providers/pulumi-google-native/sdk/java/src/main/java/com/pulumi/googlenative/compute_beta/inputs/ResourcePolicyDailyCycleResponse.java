// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Time window specified for daily operations.
 * 
 */
public final class ResourcePolicyDailyCycleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyDailyCycleResponse Empty = new ResourcePolicyDailyCycleResponse();

    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
     */
    @Import(name="daysInCycle", required=true)
    private Integer daysInCycle;

    public Integer daysInCycle() {
        return this.daysInCycle;
    }

    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    @Import(name="duration", required=true)
    private String duration;

    public String duration() {
        return this.duration;
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    private ResourcePolicyDailyCycleResponse() {}

    private ResourcePolicyDailyCycleResponse(ResourcePolicyDailyCycleResponse $) {
        this.daysInCycle = $.daysInCycle;
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyDailyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleResponse $;

        public Builder() {
            $ = new ResourcePolicyDailyCycleResponse();
        }

        public Builder(ResourcePolicyDailyCycleResponse defaults) {
            $ = new ResourcePolicyDailyCycleResponse(Objects.requireNonNull(defaults));
        }

        public Builder daysInCycle(Integer daysInCycle) {
            $.daysInCycle = daysInCycle;
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

        public ResourcePolicyDailyCycleResponse build() {
            $.daysInCycle = Objects.requireNonNull($.daysInCycle, "expected parameter 'daysInCycle' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
