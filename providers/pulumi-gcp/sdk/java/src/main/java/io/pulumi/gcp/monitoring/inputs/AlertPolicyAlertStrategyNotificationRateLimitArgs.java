// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyAlertStrategyNotificationRateLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyAlertStrategyNotificationRateLimitArgs Empty = new AlertPolicyAlertStrategyNotificationRateLimitArgs();

    /**
     * Not more than one notification per period.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> period() {
        return this.period == null ? Codegen.empty() : this.period;
    }

    public AlertPolicyAlertStrategyNotificationRateLimitArgs(@Nullable Output<String> period) {
        this.period = period;
    }

    private AlertPolicyAlertStrategyNotificationRateLimitArgs() {
        this.period = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyNotificationRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyNotificationRateLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = Codegen.ofNullable(period);
            return this;
        }        public AlertPolicyAlertStrategyNotificationRateLimitArgs build() {
            return new AlertPolicyAlertStrategyNotificationRateLimitArgs(period);
        }
    }
}
