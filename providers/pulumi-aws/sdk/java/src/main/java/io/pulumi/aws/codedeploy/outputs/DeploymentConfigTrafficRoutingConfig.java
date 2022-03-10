// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.aws.codedeploy.outputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanary;
import io.pulumi.aws.codedeploy.outputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinear;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentConfigTrafficRoutingConfig {
    /**
     * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
     */
    private final @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanary timeBasedCanary;
    /**
     * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
     */
    private final @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinear timeBasedLinear;
    /**
     * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private DeploymentConfigTrafficRoutingConfig(
        @OutputCustomType.Parameter("timeBasedCanary") @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanary timeBasedCanary,
        @OutputCustomType.Parameter("timeBasedLinear") @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinear timeBasedLinear,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.timeBasedCanary = timeBasedCanary;
        this.timeBasedLinear = timeBasedLinear;
        this.type = type;
    }

    /**
     * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
    */
    public Optional<DeploymentConfigTrafficRoutingConfigTimeBasedCanary> getTimeBasedCanary() {
        return Optional.ofNullable(this.timeBasedCanary);
    }
    /**
     * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
    */
    public Optional<DeploymentConfigTrafficRoutingConfigTimeBasedLinear> getTimeBasedLinear() {
        return Optional.ofNullable(this.timeBasedLinear);
    }
    /**
     * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanary timeBasedCanary;
        private @Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinear timeBasedLinear;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeBasedCanary = defaults.timeBasedCanary;
    	      this.timeBasedLinear = defaults.timeBasedLinear;
    	      this.type = defaults.type;
        }

        public Builder timeBasedCanary(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanary timeBasedCanary) {
            this.timeBasedCanary = timeBasedCanary;
            return this;
        }

        public Builder timeBasedLinear(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinear timeBasedLinear) {
            this.timeBasedLinear = timeBasedLinear;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DeploymentConfigTrafficRoutingConfig build() {
            return new DeploymentConfigTrafficRoutingConfig(timeBasedCanary, timeBasedLinear, type);
        }
    }
}
