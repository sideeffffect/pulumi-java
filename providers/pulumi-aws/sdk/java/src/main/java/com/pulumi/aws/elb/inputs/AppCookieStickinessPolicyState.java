// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCookieStickinessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AppCookieStickinessPolicyState Empty = new AppCookieStickinessPolicyState();

    /**
     * The application cookie whose lifetime the ELB&#39;s cookie should follow.
     * 
     */
    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Import(name="lbPort")
    private @Nullable Output<Integer> lbPort;

    public Optional<Output<Integer>> lbPort() {
        return Optional.ofNullable(this.lbPort);
    }

    /**
     * The name of load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<String> loadBalancer;

    public Optional<Output<String>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * The name of the stickiness policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AppCookieStickinessPolicyState() {}

    private AppCookieStickinessPolicyState(AppCookieStickinessPolicyState $) {
        this.cookieName = $.cookieName;
        this.lbPort = $.lbPort;
        this.loadBalancer = $.loadBalancer;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCookieStickinessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCookieStickinessPolicyState $;

        public Builder() {
            $ = new AppCookieStickinessPolicyState();
        }

        public Builder(AppCookieStickinessPolicyState defaults) {
            $ = new AppCookieStickinessPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        public Builder lbPort(@Nullable Output<Integer> lbPort) {
            $.lbPort = lbPort;
            return this;
        }

        public Builder lbPort(Integer lbPort) {
            return lbPort(Output.of(lbPort));
        }

        public Builder loadBalancer(@Nullable Output<String> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        public Builder loadBalancer(String loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AppCookieStickinessPolicyState build() {
            return $;
        }
    }

}
