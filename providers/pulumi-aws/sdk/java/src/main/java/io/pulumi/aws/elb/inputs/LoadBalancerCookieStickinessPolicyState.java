// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerCookieStickinessPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerCookieStickinessPolicyState Empty = new LoadBalancerCookieStickinessPolicyState();

    /**
     * The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    @InputImport(name="cookieExpirationPeriod")
      private final @Nullable Input<Integer> cookieExpirationPeriod;

    public Input<Integer> getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod == null ? Input.empty() : this.cookieExpirationPeriod;
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @InputImport(name="lbPort")
      private final @Nullable Input<Integer> lbPort;

    public Input<Integer> getLbPort() {
        return this.lbPort == null ? Input.empty() : this.lbPort;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @InputImport(name="loadBalancer")
      private final @Nullable Input<String> loadBalancer;

    public Input<String> getLoadBalancer() {
        return this.loadBalancer == null ? Input.empty() : this.loadBalancer;
    }

    /**
     * The name of the stickiness policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public LoadBalancerCookieStickinessPolicyState(
        @Nullable Input<Integer> cookieExpirationPeriod,
        @Nullable Input<Integer> lbPort,
        @Nullable Input<String> loadBalancer,
        @Nullable Input<String> name) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
        this.lbPort = lbPort;
        this.loadBalancer = loadBalancer;
        this.name = name;
    }

    private LoadBalancerCookieStickinessPolicyState() {
        this.cookieExpirationPeriod = Input.empty();
        this.lbPort = Input.empty();
        this.loadBalancer = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerCookieStickinessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cookieExpirationPeriod;
        private @Nullable Input<Integer> lbPort;
        private @Nullable Input<String> loadBalancer;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerCookieStickinessPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieExpirationPeriod = defaults.cookieExpirationPeriod;
    	      this.lbPort = defaults.lbPort;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
        }

        public Builder cookieExpirationPeriod(@Nullable Input<Integer> cookieExpirationPeriod) {
            this.cookieExpirationPeriod = cookieExpirationPeriod;
            return this;
        }

        public Builder cookieExpirationPeriod(@Nullable Integer cookieExpirationPeriod) {
            this.cookieExpirationPeriod = Input.ofNullable(cookieExpirationPeriod);
            return this;
        }

        public Builder lbPort(@Nullable Input<Integer> lbPort) {
            this.lbPort = lbPort;
            return this;
        }

        public Builder lbPort(@Nullable Integer lbPort) {
            this.lbPort = Input.ofNullable(lbPort);
            return this;
        }

        public Builder loadBalancer(@Nullable Input<String> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        public Builder loadBalancer(@Nullable String loadBalancer) {
            this.loadBalancer = Input.ofNullable(loadBalancer);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public LoadBalancerCookieStickinessPolicyState build() {
            return new LoadBalancerCookieStickinessPolicyState(cookieExpirationPeriod, lbPort, loadBalancer, name);
        }
    }
}
