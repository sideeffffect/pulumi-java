// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionArgs extends ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;

    /**
     * @return The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs>> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }

    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs>> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;

    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
    private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    /**
     * @return A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionArgs() {}

    private RegionUrlMapPathMatcherPathRuleRouteActionArgs(RegionUrlMapPathMatcherPathRuleRouteActionArgs $) {
        this.corsPolicy = $.corsPolicy;
        this.faultInjectionPolicy = $.faultInjectionPolicy;
        this.requestMirrorPolicy = $.requestMirrorPolicy;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
        this.urlRewrite = $.urlRewrite;
        this.weightedBackendServices = $.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherPathRuleRouteActionArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionArgs();
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
         * Recommendation for Cross Origin Resource Sharing
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see W3C
         * Recommendation for Cross Origin Resource Sharing
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs corsPolicy) {
            return corsPolicy(Output.of(corsPolicy));
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
         * resiliency of clients to backend service failure. As part of fault injection,
         * when clients send requests to a backend service, delays can be introduced by
         * Loadbalancer on a percentage of requests before sending those request to the
         * backend service. Similarly requests from clients can be aborted by the
         * Loadbalancer for a percentage of requests. timeout and retry_policy will be
         * ignored by clients that are configured with a fault_injection_policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the
         * resiliency of clients to backend service failure. As part of fault injection,
         * when clients send requests to a backend service, delays can be introduced by
         * Loadbalancer on a percentage of requests before sending those request to the
         * backend service. Similarly requests from clients can be aborted by the
         * Loadbalancer for a percentage of requests. timeout and retry_policy will be
         * ignored by clients that are configured with a fault_injection_policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            return faultInjectionPolicy(Output.of(faultInjectionPolicy));
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
         * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
         * responses from the shadow service. Prior to sending traffic to the shadow
         * service, the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are
         * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
         * responses from the shadow service. Prior to sending traffic to the shadow
         * service, the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
         * the request is has been fully processed (i.e. end-of-stream) up until the
         * response has been completely processed. Timeout includes all retries. If not
         * specified, the default value is 15 seconds.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time
         * the request is has been fully processed (i.e. end-of-stream) up until the
         * response has been completely processed. Timeout includes all retries. If not
         * specified, the default value is 15 seconds.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
         * the matched service
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to
         * the matched service
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
         * occurs. The weights determine the fraction of traffic that flows to their
         * corresponding backend service. If all traffic needs to go to a single backend
         * service, there must be one  weightedBackendService with weight set to a non 0
         * number. Once a backendService is identified and before forwarding the request to
         * the backend service, advanced routing actions like Url rewrites and header
         * transformations are applied depending on additional settings specified in this
         * HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
         * occurs. The weights determine the fraction of traffic that flows to their
         * corresponding backend service. If all traffic needs to go to a single backend
         * service, there must be one  weightedBackendService with weight set to a non 0
         * number. Once a backendService is identified and before forwarding the request to
         * the backend service, advanced routing actions like Url rewrites and header
         * transformations are applied depending on additional settings specified in this
         * HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            return weightedBackendServices(Output.of(weightedBackendServices));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match
         * occurs. The weights determine the fraction of traffic that flows to their
         * corresponding backend service. If all traffic needs to go to a single backend
         * service, there must be one  weightedBackendService with weight set to a non 0
         * number. Once a backendService is identified and before forwarding the request to
         * the backend service, advanced routing actions like Url rewrites and header
         * transformations are applied depending on additional settings specified in this
         * HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public RegionUrlMapPathMatcherPathRuleRouteActionArgs build() {
            return $;
        }
    }

}
