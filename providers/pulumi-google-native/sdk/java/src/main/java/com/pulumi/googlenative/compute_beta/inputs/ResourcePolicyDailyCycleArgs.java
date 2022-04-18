// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
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
      private final @Nullable Output<Integer> daysInCycle;

    public Output<Integer> daysInCycle() {
        return this.daysInCycle == null ? Codegen.empty() : this.daysInCycle;
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    public ResourcePolicyDailyCycleArgs(
        @Nullable Output<Integer> daysInCycle,
        @Nullable Output<String> startTime) {
        this.daysInCycle = daysInCycle;
        this.startTime = startTime;
    }

    private ResourcePolicyDailyCycleArgs() {
        this.daysInCycle = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyDailyCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> daysInCycle;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyDailyCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder daysInCycle(@Nullable Output<Integer> daysInCycle) {
            this.daysInCycle = daysInCycle;
            return this;
        }
        public Builder daysInCycle(@Nullable Integer daysInCycle) {
            this.daysInCycle = Codegen.ofNullable(daysInCycle);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }        public ResourcePolicyDailyCycleArgs build() {
            return new ResourcePolicyDailyCycleArgs(daysInCycle, startTime);
        }
    }
}
