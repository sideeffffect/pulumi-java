// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterScalingConfiguration {
    /**
     * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean autoPause;
    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     * 
     */
    private final @Nullable Integer maxCapacity;
    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     * 
     */
    private final @Nullable Integer minCapacity;
    /**
     * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
     * 
     */
    private final @Nullable Integer secondsUntilAutoPause;
    /**
     * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
     * 
     */
    private final @Nullable String timeoutAction;

    @CustomType.Constructor
    private ClusterScalingConfiguration(
        @CustomType.Parameter("autoPause") @Nullable Boolean autoPause,
        @CustomType.Parameter("maxCapacity") @Nullable Integer maxCapacity,
        @CustomType.Parameter("minCapacity") @Nullable Integer minCapacity,
        @CustomType.Parameter("secondsUntilAutoPause") @Nullable Integer secondsUntilAutoPause,
        @CustomType.Parameter("timeoutAction") @Nullable String timeoutAction) {
        this.autoPause = autoPause;
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        this.timeoutAction = timeoutAction;
    }

    /**
     * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
     * 
    */
    public Optional<Boolean> autoPause() {
        return Optional.ofNullable(this.autoPause);
    }
    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     * 
    */
    public Optional<Integer> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     * 
    */
    public Optional<Integer> minCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }
    /**
     * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
     * 
    */
    public Optional<Integer> secondsUntilAutoPause() {
        return Optional.ofNullable(this.secondsUntilAutoPause);
    }
    /**
     * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
     * 
    */
    public Optional<String> timeoutAction() {
        return Optional.ofNullable(this.timeoutAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterScalingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoPause;
        private @Nullable Integer maxCapacity;
        private @Nullable Integer minCapacity;
        private @Nullable Integer secondsUntilAutoPause;
        private @Nullable String timeoutAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterScalingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.secondsUntilAutoPause = defaults.secondsUntilAutoPause;
    	      this.timeoutAction = defaults.timeoutAction;
        }

        public Builder autoPause(@Nullable Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder minCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Builder secondsUntilAutoPause(@Nullable Integer secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }
        public Builder timeoutAction(@Nullable String timeoutAction) {
            this.timeoutAction = timeoutAction;
            return this;
        }        public ClusterScalingConfiguration build() {
            return new ClusterScalingConfiguration(autoPause, maxCapacity, minCapacity, secondsUntilAutoPause, timeoutAction);
        }
    }
}
