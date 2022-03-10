// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scaling by network usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkUtilizationArgs Empty = new NetworkUtilizationArgs();

    /**
     * Target bytes received per second.
     * 
     */
    @InputImport(name="targetReceivedBytesPerSecond")
      private final @Nullable Input<Integer> targetReceivedBytesPerSecond;

    public Input<Integer> getTargetReceivedBytesPerSecond() {
        return this.targetReceivedBytesPerSecond == null ? Input.empty() : this.targetReceivedBytesPerSecond;
    }

    /**
     * Target packets received per second.
     * 
     */
    @InputImport(name="targetReceivedPacketsPerSecond")
      private final @Nullable Input<Integer> targetReceivedPacketsPerSecond;

    public Input<Integer> getTargetReceivedPacketsPerSecond() {
        return this.targetReceivedPacketsPerSecond == null ? Input.empty() : this.targetReceivedPacketsPerSecond;
    }

    /**
     * Target bytes sent per second.
     * 
     */
    @InputImport(name="targetSentBytesPerSecond")
      private final @Nullable Input<Integer> targetSentBytesPerSecond;

    public Input<Integer> getTargetSentBytesPerSecond() {
        return this.targetSentBytesPerSecond == null ? Input.empty() : this.targetSentBytesPerSecond;
    }

    /**
     * Target packets sent per second.
     * 
     */
    @InputImport(name="targetSentPacketsPerSecond")
      private final @Nullable Input<Integer> targetSentPacketsPerSecond;

    public Input<Integer> getTargetSentPacketsPerSecond() {
        return this.targetSentPacketsPerSecond == null ? Input.empty() : this.targetSentPacketsPerSecond;
    }

    public NetworkUtilizationArgs(
        @Nullable Input<Integer> targetReceivedBytesPerSecond,
        @Nullable Input<Integer> targetReceivedPacketsPerSecond,
        @Nullable Input<Integer> targetSentBytesPerSecond,
        @Nullable Input<Integer> targetSentPacketsPerSecond) {
        this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
    }

    private NetworkUtilizationArgs() {
        this.targetReceivedBytesPerSecond = Input.empty();
        this.targetReceivedPacketsPerSecond = Input.empty();
        this.targetSentBytesPerSecond = Input.empty();
        this.targetSentPacketsPerSecond = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> targetReceivedBytesPerSecond;
        private @Nullable Input<Integer> targetReceivedPacketsPerSecond;
        private @Nullable Input<Integer> targetSentBytesPerSecond;
        private @Nullable Input<Integer> targetSentPacketsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReceivedBytesPerSecond = defaults.targetReceivedBytesPerSecond;
    	      this.targetReceivedPacketsPerSecond = defaults.targetReceivedPacketsPerSecond;
    	      this.targetSentBytesPerSecond = defaults.targetSentBytesPerSecond;
    	      this.targetSentPacketsPerSecond = defaults.targetSentPacketsPerSecond;
        }

        public Builder targetReceivedBytesPerSecond(@Nullable Input<Integer> targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
            return this;
        }

        public Builder targetReceivedBytesPerSecond(@Nullable Integer targetReceivedBytesPerSecond) {
            this.targetReceivedBytesPerSecond = Input.ofNullable(targetReceivedBytesPerSecond);
            return this;
        }

        public Builder targetReceivedPacketsPerSecond(@Nullable Input<Integer> targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
            return this;
        }

        public Builder targetReceivedPacketsPerSecond(@Nullable Integer targetReceivedPacketsPerSecond) {
            this.targetReceivedPacketsPerSecond = Input.ofNullable(targetReceivedPacketsPerSecond);
            return this;
        }

        public Builder targetSentBytesPerSecond(@Nullable Input<Integer> targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = targetSentBytesPerSecond;
            return this;
        }

        public Builder targetSentBytesPerSecond(@Nullable Integer targetSentBytesPerSecond) {
            this.targetSentBytesPerSecond = Input.ofNullable(targetSentBytesPerSecond);
            return this;
        }

        public Builder targetSentPacketsPerSecond(@Nullable Input<Integer> targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
            return this;
        }

        public Builder targetSentPacketsPerSecond(@Nullable Integer targetSentPacketsPerSecond) {
            this.targetSentPacketsPerSecond = Input.ofNullable(targetSentPacketsPerSecond);
            return this;
        }
        public NetworkUtilizationArgs build() {
            return new NetworkUtilizationArgs(targetReceivedBytesPerSecond, targetReceivedPacketsPerSecond, targetSentBytesPerSecond, targetSentPacketsPerSecond);
        }
    }
}
