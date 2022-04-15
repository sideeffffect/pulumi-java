// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteArgs Empty = new RouteSpecHttpRouteArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RouteSpecHttpRouteActionArgs> action;

    public Output<RouteSpecHttpRouteActionArgs> action() {
        return this.action;
    }

    /**
     * The criteria for determining an HTTP request match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<RouteSpecHttpRouteMatchArgs> match;

    public Output<RouteSpecHttpRouteMatchArgs> match() {
        return this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RouteSpecHttpRouteRetryPolicyArgs> retryPolicy;

    public Output<RouteSpecHttpRouteRetryPolicyArgs> retryPolicy() {
        return this.retryPolicy == null ? Codegen.empty() : this.retryPolicy;
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RouteSpecHttpRouteTimeoutArgs> timeout;

    public Output<RouteSpecHttpRouteTimeoutArgs> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    public RouteSpecHttpRouteArgs(
        Output<RouteSpecHttpRouteActionArgs> action,
        Output<RouteSpecHttpRouteMatchArgs> match,
        @Nullable Output<RouteSpecHttpRouteRetryPolicyArgs> retryPolicy,
        @Nullable Output<RouteSpecHttpRouteTimeoutArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    private RouteSpecHttpRouteArgs() {
        this.action = Codegen.empty();
        this.match = Codegen.empty();
        this.retryPolicy = Codegen.empty();
        this.timeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteSpecHttpRouteActionArgs> action;
        private Output<RouteSpecHttpRouteMatchArgs> match;
        private @Nullable Output<RouteSpecHttpRouteRetryPolicyArgs> retryPolicy;
        private @Nullable Output<RouteSpecHttpRouteTimeoutArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Output<RouteSpecHttpRouteActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RouteSpecHttpRouteActionArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(Output<RouteSpecHttpRouteMatchArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(RouteSpecHttpRouteMatchArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RouteSpecHttpRouteRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RouteSpecHttpRouteRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Codegen.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RouteSpecHttpRouteTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecHttpRouteTimeoutArgs timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }        public RouteSpecHttpRouteArgs build() {
            return new RouteSpecHttpRouteArgs(action, match, retryPolicy, timeout);
        }
    }
}
