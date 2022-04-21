// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schedule for an instance operation.
 * 
 */
public final class ResourcePolicyInstanceSchedulePolicyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyInstanceSchedulePolicyScheduleArgs Empty = new ResourcePolicyInstanceSchedulePolicyScheduleArgs();

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    private ResourcePolicyInstanceSchedulePolicyScheduleArgs() {}

    private ResourcePolicyInstanceSchedulePolicyScheduleArgs(ResourcePolicyInstanceSchedulePolicyScheduleArgs $) {
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyInstanceSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyInstanceSchedulePolicyScheduleArgs $;

        public Builder() {
            $ = new ResourcePolicyInstanceSchedulePolicyScheduleArgs();
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyScheduleArgs defaults) {
            $ = new ResourcePolicyInstanceSchedulePolicyScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        public ResourcePolicyInstanceSchedulePolicyScheduleArgs build() {
            return $;
        }
    }

}
