// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeout;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherPathRuleRouteAction {
    /**
     * @return The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy;
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
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy;
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout;
    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite;
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
    private final @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherPathRuleRouteAction(
        @CustomType.Parameter("corsPolicy") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy,
        @CustomType.Parameter("faultInjectionPolicy") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @CustomType.Parameter("requestMirrorPolicy") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @CustomType.Parameter("retryPolicy") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy,
        @CustomType.Parameter("timeout") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout,
        @CustomType.Parameter("urlRewrite") @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite,
        @CustomType.Parameter("weightedBackendServices") @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    /**
     * @return The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
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
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionTimeout> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
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
    public List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite;
        private @Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder timeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder urlRewrite(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendService... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public RegionUrlMapPathMatcherPathRuleRouteAction build() {
            return new RegionUrlMapPathMatcherPathRuleRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
