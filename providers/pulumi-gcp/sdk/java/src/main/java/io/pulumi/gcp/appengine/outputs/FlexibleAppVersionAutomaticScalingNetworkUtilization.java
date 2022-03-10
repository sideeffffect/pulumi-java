// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionAutomaticScalingNetworkUtilization {
    /**
     * Target bytes received per second.
     * 
     */
    private final @Nullable Integer targetReceivedBytesPerSecond;
    /**
     * Target packets received per second.
     * 
     */
    private final @Nullable Integer targetReceivedPacketsPerSecond;
    /**
     * Target bytes sent per second.
     * 
     */
    private final @Nullable Integer targetSentBytesPerSecond;
    /**
     * Target packets sent per second.
     * 
     */
    private final @Nullable Integer targetSentPacketsPerSecond;

    @OutputCustomType.Constructor
    private FlexibleAppVersionAutomaticScalingNetworkUtilization(
        @OutputCustomType.Parameter("targetReceivedBytesPerSecond") @Nullable Integer targetReceivedBytesPerSecond,
        @OutputCustomType.Parameter("targetReceivedPacketsPerSecond") @Nullable Integer targetReceivedPacketsPerSecond,
        @OutputCustomType.Parameter("targetSentBytesPerSecond") @Nullable Integer targetSentBytesPerSecond,
        @OutputCustomType.Parameter("targetSentPacketsPerSecond") @Nullable Integer targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
    }

    /**
     * Target bytes received per second.
     * 
    */
    public Optional<Integer> getTargetReceivedBytesPerSecond() {
        return Optional.ofNullable(this.targetReceivedBytesPerSecond);
    }
    /**
     * Target packets received per second.
     * 
    */
    public Optional<Integer> getTargetReceivedPacketsPerSecond() {
        return Optional.ofNullable(this.targetReceivedPacketsPerSecond);
    }
    /**
     * Target bytes sent per second.
     * 
    */
    public Optional<Integer> getTargetSentBytesPerSecond() {
        return Optional.ofNullable(this.targetSentBytesPerSecond);
    }
    /**
     * Target packets sent per second.
     * 
    */
    public Optional<Integer> getTargetSentPacketsPerSecond() {
        return Optional.ofNullable(this.targetSentPacketsPerSecond);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScalingNetworkUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer targetReceivedBytesPerSecond;
        private @Nullable Integer targetReceivedPacketsPerSecond;
        private @Nullable Integer targetSentBytesPerSecond;
        private @Nullable Integer targetSentPacketsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScalingNetworkUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReceivedBytesPerSecond = defaults.targetReceivedBytesPerSecond;
    	      this.targetReceivedPacketsPerSecond = defaults.targetReceivedPacketsPerSecond;
    	      this.targetSentBytesPerSecond = defaults.targetSentBytesPerSecond;
    	      this.targetSentPacketsPerSecond = defaults.targetSentPacketsPerSecond;
        }

        public Builder targetReceivedBytesPerSecond(@Nullable Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
            return this;
        }

        public Builder targetReceivedPacketsPerSecond(@Nullable Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
            return this;
        }

        public Builder targetSentBytesPerSecond(@Nullable Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = targetSentBytesPerSecond;
            return this;
        }

        public Builder targetSentPacketsPerSecond(@Nullable Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
            return this;
        }
        public FlexibleAppVersionAutomaticScalingNetworkUtilization build() {
            return new FlexibleAppVersionAutomaticScalingNetworkUtilization(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}
