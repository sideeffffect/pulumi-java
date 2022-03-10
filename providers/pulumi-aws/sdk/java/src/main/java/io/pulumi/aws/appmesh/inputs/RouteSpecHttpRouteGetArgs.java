// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteGetArgs Empty = new RouteSpecHttpRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<RouteSpecHttpRouteActionGetArgs> action;

    public Input<RouteSpecHttpRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining an HTTP request match.
     * 
     */
    @InputImport(name="match", required=true)
      private final Input<RouteSpecHttpRouteMatchGetArgs> match;

    public Input<RouteSpecHttpRouteMatchGetArgs> getMatch() {
        return this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @InputImport(name="retryPolicy")
      private final @Nullable Input<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy;

    public Input<RouteSpecHttpRouteRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * The types of timeouts.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<RouteSpecHttpRouteTimeoutGetArgs> timeout;

    public Input<RouteSpecHttpRouteTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public RouteSpecHttpRouteGetArgs(
        Input<RouteSpecHttpRouteActionGetArgs> action,
        Input<RouteSpecHttpRouteMatchGetArgs> match,
        @Nullable Input<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy,
        @Nullable Input<RouteSpecHttpRouteTimeoutGetArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    private RouteSpecHttpRouteGetArgs() {
        this.action = Input.empty();
        this.match = Input.empty();
        this.retryPolicy = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RouteSpecHttpRouteActionGetArgs> action;
        private Input<RouteSpecHttpRouteMatchGetArgs> match;
        private @Nullable Input<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy;
        private @Nullable Input<RouteSpecHttpRouteTimeoutGetArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Input<RouteSpecHttpRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(RouteSpecHttpRouteActionGetArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder match(Input<RouteSpecHttpRouteMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder match(RouteSpecHttpRouteMatchGetArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }

        public Builder retryPolicy(@Nullable Input<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable RouteSpecHttpRouteRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Input<RouteSpecHttpRouteTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable RouteSpecHttpRouteTimeoutGetArgs timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public RouteSpecHttpRouteGetArgs build() {
            return new RouteSpecHttpRouteGetArgs(action, match, retryPolicy, timeout);
        }
    }
}
