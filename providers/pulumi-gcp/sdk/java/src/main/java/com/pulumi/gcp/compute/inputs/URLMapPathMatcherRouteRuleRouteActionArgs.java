// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionArgs extends ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionArgs Empty = new URLMapPathMatcherRouteRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs>> corsPolicy() {
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
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs>> faultInjectionPolicy() {
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
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs>> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs>> retryPolicy() {
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
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs>> urlRewrite() {
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
    private @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

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
    public Optional<Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>>> weightedBackendServices() {
        return Optional.ofNullable(this.weightedBackendServices);
    }

    private URLMapPathMatcherRouteRuleRouteActionArgs() {}

    private URLMapPathMatcherRouteRuleRouteActionArgs(URLMapPathMatcherRouteRuleRouteActionArgs $) {
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
    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleRouteActionArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleRouteActionArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleRouteActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client side cross-origin requests. Please see
         * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
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
        public Builder corsPolicy(URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
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
        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
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
        public Builder faultInjectionPolicy(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
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
        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
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
        public Builder requestMirrorPolicy(URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            return requestMirrorPolicy(Output.of(requestMirrorPolicy));
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy) {
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
        public Builder retryPolicy(URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs retryPolicy) {
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
        public Builder timeout(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout) {
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
        public Builder timeout(URLMapPathMatcherRouteRuleRouteActionTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, prior to forwarding the request to the matched service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
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
        public Builder urlRewrite(URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
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
        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
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
        public Builder weightedBackendServices(List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
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
        public Builder weightedBackendServices(URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public URLMapPathMatcherRouteRuleRouteActionArgs build() {
            return $;
        }
    }

}
