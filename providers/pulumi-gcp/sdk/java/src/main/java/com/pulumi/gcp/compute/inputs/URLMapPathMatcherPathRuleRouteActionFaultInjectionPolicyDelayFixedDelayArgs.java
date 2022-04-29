// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs extends ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs();

    /**
     * Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    /**
     * @return Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @Import(name="seconds", required=true)
    private Output<String> seconds;

    /**
     * @return Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    public Output<String> seconds() {
        return this.seconds;
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs() {}

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs $) {
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nanos Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations less than one second are
         * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        /**
         * @param nanos Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations less than one second are
         * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        /**
         * @param seconds Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
         * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
         * 
         * @return builder
         * 
         */
        public Builder seconds(Output<String> seconds) {
            $.seconds = seconds;
            return this;
        }

        /**
         * @param seconds Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
         * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
         * 
         * @return builder
         * 
         */
        public Builder seconds(String seconds) {
            return seconds(Output.of(seconds));
        }

        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs build() {
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
