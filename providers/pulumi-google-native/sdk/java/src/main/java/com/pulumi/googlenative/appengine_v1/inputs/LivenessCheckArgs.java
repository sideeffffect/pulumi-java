// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * 
 */
public final class LivenessCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final LivenessCheckArgs Empty = new LivenessCheckArgs();

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
    private @Nullable Output<String> checkInterval;

    public Optional<Output<String>> checkInterval() {
        return Optional.ofNullable(this.checkInterval);
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * Host header to send when performing a HTTP Liveness check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    @Import(name="initialDelay")
    private @Nullable Output<String> initialDelay;

    public Optional<Output<String>> initialDelay() {
        return Optional.ofNullable(this.initialDelay);
    }

    /**
     * The request path.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private LivenessCheckArgs() {}

    private LivenessCheckArgs(LivenessCheckArgs $) {
        this.checkInterval = $.checkInterval;
        this.failureThreshold = $.failureThreshold;
        this.host = $.host;
        this.initialDelay = $.initialDelay;
        this.path = $.path;
        this.successThreshold = $.successThreshold;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LivenessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LivenessCheckArgs $;

        public Builder() {
            $ = new LivenessCheckArgs();
        }

        public Builder(LivenessCheckArgs defaults) {
            $ = new LivenessCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            $.checkInterval = checkInterval;
            return this;
        }

        public Builder checkInterval(String checkInterval) {
            return checkInterval(Output.of(checkInterval));
        }

        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder initialDelay(@Nullable Output<String> initialDelay) {
            $.initialDelay = initialDelay;
            return this;
        }

        public Builder initialDelay(String initialDelay) {
            return initialDelay(Output.of(initialDelay));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public LivenessCheckArgs build() {
            return $;
        }
    }

}
