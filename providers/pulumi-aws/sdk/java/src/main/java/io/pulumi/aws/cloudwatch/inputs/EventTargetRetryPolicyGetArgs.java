// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetRetryPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetRetryPolicyGetArgs Empty = new EventTargetRetryPolicyGetArgs();

    /**
     * The age in seconds to continue to make retry attempts.
     * 
     */
    @InputImport(name="maximumEventAgeInSeconds")
      private final @Nullable Input<Integer> maximumEventAgeInSeconds;

    public Input<Integer> getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds == null ? Input.empty() : this.maximumEventAgeInSeconds;
    }

    /**
     * maximum number of retry attempts to make before the request fails
     * 
     */
    @InputImport(name="maximumRetryAttempts")
      private final @Nullable Input<Integer> maximumRetryAttempts;

    public Input<Integer> getMaximumRetryAttempts() {
        return this.maximumRetryAttempts == null ? Input.empty() : this.maximumRetryAttempts;
    }

    public EventTargetRetryPolicyGetArgs(
        @Nullable Input<Integer> maximumEventAgeInSeconds,
        @Nullable Input<Integer> maximumRetryAttempts) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    private EventTargetRetryPolicyGetArgs() {
        this.maximumEventAgeInSeconds = Input.empty();
        this.maximumRetryAttempts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maximumEventAgeInSeconds;
        private @Nullable Input<Integer> maximumRetryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRetryPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumEventAgeInSeconds = defaults.maximumEventAgeInSeconds;
    	      this.maximumRetryAttempts = defaults.maximumRetryAttempts;
        }

        public Builder maximumEventAgeInSeconds(@Nullable Input<Integer> maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        public Builder maximumEventAgeInSeconds(@Nullable Integer maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = Input.ofNullable(maximumEventAgeInSeconds);
            return this;
        }

        public Builder maximumRetryAttempts(@Nullable Input<Integer> maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        public Builder maximumRetryAttempts(@Nullable Integer maximumRetryAttempts) {
            this.maximumRetryAttempts = Input.ofNullable(maximumRetryAttempts);
            return this;
        }
        public EventTargetRetryPolicyGetArgs build() {
            return new EventTargetRetryPolicyGetArgs(maximumEventAgeInSeconds, maximumRetryAttempts);
        }
    }
}
