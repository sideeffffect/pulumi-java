// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerHealthCheckArgs Empty = new LoadBalancerHealthCheckArgs();

    /**
     * The number of checks before the instance is declared healthy.
     * 
     */
    @InputImport(name="healthyThreshold", required=true)
      private final Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * The interval between checks.
     * 
     */
    @InputImport(name="interval", required=true)
      private final Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
     */
    @InputImport(name="target", required=true)
      private final Input<String> target;

    public Input<String> getTarget() {
        return this.target;
    }

    /**
     * The length of time before the check times out.
     * 
     */
    @InputImport(name="timeout", required=true)
      private final Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout;
    }

    /**
     * The number of checks before the instance is declared unhealthy.
     * 
     */
    @InputImport(name="unhealthyThreshold", required=true)
      private final Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public LoadBalancerHealthCheckArgs(
        Input<Integer> healthyThreshold,
        Input<Integer> interval,
        Input<String> target,
        Input<Integer> timeout,
        Input<Integer> unhealthyThreshold) {
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
    }

    private LoadBalancerHealthCheckArgs() {
        this.healthyThreshold = Input.empty();
        this.interval = Input.empty();
        this.target = Input.empty();
        this.timeout = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> healthyThreshold;
        private Input<Integer> interval;
        private Input<String> target;
        private Input<Integer> timeout;
        private Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(Input<Integer> healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Input.of(Objects.requireNonNull(healthyThreshold));
            return this;
        }

        public Builder interval(Input<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder interval(Integer interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }

        public Builder target(Input<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder target(String target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }

        public Builder timeout(Input<Integer> timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = Input.of(Objects.requireNonNull(timeout));
            return this;
        }

        public Builder unhealthyThreshold(Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.of(Objects.requireNonNull(unhealthyThreshold));
            return this;
        }
        public LoadBalancerHealthCheckArgs build() {
            return new LoadBalancerHealthCheckArgs(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }
}
