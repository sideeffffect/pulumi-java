// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Time window specified for daily operations.
 * 
 */
public final class ResourcePolicyDailyCycleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyDailyCycleArgs Empty = new ResourcePolicyDailyCycleArgs();

    /**
     * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
     * 
     */
    @Import(name="daysInCycle")
    private @Nullable Output<Integer> daysInCycle;

    public Optional<Output<Integer>> daysInCycle() {
        return Optional.ofNullable(this.daysInCycle);
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private ResourcePolicyDailyCycleArgs() {}

    private ResourcePolicyDailyCycleArgs(ResourcePolicyDailyCycleArgs $) {
        this.daysInCycle = $.daysInCycle;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyDailyCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleArgs $;

        public Builder() {
            $ = new ResourcePolicyDailyCycleArgs();
        }

        public Builder(ResourcePolicyDailyCycleArgs defaults) {
            $ = new ResourcePolicyDailyCycleArgs(Objects.requireNonNull(defaults));
        }

        public Builder daysInCycle(@Nullable Output<Integer> daysInCycle) {
            $.daysInCycle = daysInCycle;
            return this;
        }

        public Builder daysInCycle(Integer daysInCycle) {
            return daysInCycle(Output.of(daysInCycle));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public ResourcePolicyDailyCycleArgs build() {
            return $;
        }
    }

}
