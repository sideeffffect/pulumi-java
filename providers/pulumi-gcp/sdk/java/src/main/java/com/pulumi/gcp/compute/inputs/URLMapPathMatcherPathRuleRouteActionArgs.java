// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionArgs extends ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionArgs Empty = new URLMapPathMatcherPathRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;

    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs>> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs>> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;

    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs>> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
    private @Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private URLMapPathMatcherPathRuleRouteActionArgs() {}

    private URLMapPathMatcherPathRuleRouteActionArgs(URLMapPathMatcherPathRuleRouteActionArgs $) {
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
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(URLMapPathMatcherPathRuleRouteActionCorsPolicyArgs corsPolicy) {
            return corsPolicy(Output.of(corsPolicy));
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
         * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
         * by the Loadbalancer for a percentage of requests.
         * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
         * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
         * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
         * by the Loadbalancer for a percentage of requests.
         * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            return faultInjectionPolicy(Output.of(faultInjectionPolicy));
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
         * the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
         * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
         * the host / authority header is suffixed with -shadow.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy) {
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
        public Builder retryPolicy(URLMapPathMatcherPathRuleRouteActionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
         * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
         * If not specified, will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<URLMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been
         * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
         * If not specified, will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(URLMapPathMatcherPathRuleRouteActionTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(URLMapPathMatcherPathRuleRouteActionUrlRewriteArgs urlRewrite) {
            return urlRewrite(Output.of(urlRewrite));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            return weightedBackendServices(Output.of(weightedBackendServices));
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs.
         * The weights determine the fraction of traffic that flows to their corresponding backend service.
         * If all traffic needs to go to a single backend service, there must be one weightedBackendService
         * with weight set to a non 0 number.
         * Once a backendService is identified and before forwarding the request to the backend service,
         * advanced routing actions like Url rewrites and header transformations are applied depending on
         * additional settings specified in this HttpRouteAction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public URLMapPathMatcherPathRuleRouteActionArgs build() {
            return $;
        }
    }

}
