// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Target scaling by network usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkUtilizationArgs Empty = new NetworkUtilizationArgs();

    /**
     * Target bytes received per second.
     * 
     */
    @Import(name="targetReceivedBytesPerSecond")
    private @Nullable Output<Integer> targetReceivedBytesPerSecond;

    /**
     * @return Target bytes received per second.
     * 
     */
    public Optional<Output<Integer>> targetReceivedBytesPerSecond() {
        return Optional.ofNullable(this.targetReceivedBytesPerSecond);
    }

    /**
     * Target packets received per second.
     * 
     */
    @Import(name="targetReceivedPacketsPerSecond")
    private @Nullable Output<Integer> targetReceivedPacketsPerSecond;

    /**
     * @return Target packets received per second.
     * 
     */
    public Optional<Output<Integer>> targetReceivedPacketsPerSecond() {
        return Optional.ofNullable(this.targetReceivedPacketsPerSecond);
    }

    /**
     * Target bytes sent per second.
     * 
     */
    @Import(name="targetSentBytesPerSecond")
    private @Nullable Output<Integer> targetSentBytesPerSecond;

    /**
     * @return Target bytes sent per second.
     * 
     */
    public Optional<Output<Integer>> targetSentBytesPerSecond() {
        return Optional.ofNullable(this.targetSentBytesPerSecond);
    }

    /**
     * Target packets sent per second.
     * 
     */
    @Import(name="targetSentPacketsPerSecond")
    private @Nullable Output<Integer> targetSentPacketsPerSecond;

    /**
     * @return Target packets sent per second.
     * 
     */
    public Optional<Output<Integer>> targetSentPacketsPerSecond() {
        return Optional.ofNullable(this.targetSentPacketsPerSecond);
    }

    private NetworkUtilizationArgs() {}

    private NetworkUtilizationArgs(NetworkUtilizationArgs $) {
        this.targetReceivedBytesPerSecond = $.targetReceivedBytesPerSecond;
        this.targetReceivedPacketsPerSecond = $.targetReceivedPacketsPerSecond;
        this.targetSentBytesPerSecond = $.targetSentBytesPerSecond;
        this.targetSentPacketsPerSecond = $.targetSentPacketsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkUtilizationArgs $;

        public Builder() {
            $ = new NetworkUtilizationArgs();
        }

        public Builder(NetworkUtilizationArgs defaults) {
            $ = new NetworkUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetReceivedBytesPerSecond Target bytes received per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReceivedBytesPerSecond(@Nullable Output<Integer> targetReceivedBytesPerSecond) {
            $.targetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
            return this;
        }

        /**
         * @param targetReceivedBytesPerSecond Target bytes received per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReceivedBytesPerSecond(Integer targetReceivedBytesPerSecond) {
            return targetReceivedBytesPerSecond(Output.of(targetReceivedBytesPerSecond));
        }

        /**
         * @param targetReceivedPacketsPerSecond Target packets received per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReceivedPacketsPerSecond(@Nullable Output<Integer> targetReceivedPacketsPerSecond) {
            $.targetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
            return this;
        }

        /**
         * @param targetReceivedPacketsPerSecond Target packets received per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReceivedPacketsPerSecond(Integer targetReceivedPacketsPerSecond) {
            return targetReceivedPacketsPerSecond(Output.of(targetReceivedPacketsPerSecond));
        }

        /**
         * @param targetSentBytesPerSecond Target bytes sent per second.
         * 
         * @return builder
         * 
         */
        public Builder targetSentBytesPerSecond(@Nullable Output<Integer> targetSentBytesPerSecond) {
            $.targetSentBytesPerSecond = targetSentBytesPerSecond;
            return this;
        }

        /**
         * @param targetSentBytesPerSecond Target bytes sent per second.
         * 
         * @return builder
         * 
         */
        public Builder targetSentBytesPerSecond(Integer targetSentBytesPerSecond) {
            return targetSentBytesPerSecond(Output.of(targetSentBytesPerSecond));
        }

        /**
         * @param targetSentPacketsPerSecond Target packets sent per second.
         * 
         * @return builder
         * 
         */
        public Builder targetSentPacketsPerSecond(@Nullable Output<Integer> targetSentPacketsPerSecond) {
            $.targetSentPacketsPerSecond = targetSentPacketsPerSecond;
            return this;
        }

        /**
         * @param targetSentPacketsPerSecond Target packets sent per second.
         * 
         * @return builder
         * 
         */
        public Builder targetSentPacketsPerSecond(Integer targetSentPacketsPerSecond) {
            return targetSentPacketsPerSecond(Output.of(targetSentPacketsPerSecond));
        }

        public NetworkUtilizationArgs build() {
            return $;
        }
    }

}
