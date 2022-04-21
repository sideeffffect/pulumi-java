// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs();

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    @Import(name="httpStatus", required=true)
    private Output<Integer> httpStatus;

    public Output<Integer> httpStatus() {
        return this.httpStatus;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @Import(name="percentage", required=true)
    private Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage;
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs() {}

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs $) {
        this.httpStatus = $.httpStatus;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpStatus(Output<Integer> httpStatus) {
            $.httpStatus = httpStatus;
            return this;
        }

        public Builder httpStatus(Integer httpStatus) {
            return httpStatus(Output.of(httpStatus));
        }

        public Builder percentage(Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs build() {
            $.httpStatus = Objects.requireNonNull($.httpStatus, "expected parameter 'httpStatus' to be non-null");
            $.percentage = Objects.requireNonNull($.percentage, "expected parameter 'percentage' to be non-null");
            return $;
        }
    }

}
