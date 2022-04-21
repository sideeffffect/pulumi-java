// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs();

    /**
     * Span of time that&#39;s a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @Import(name="seconds")
    private @Nullable Output<String> seconds;

    public Optional<Output<String>> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs() {}

    private URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs(URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs $) {
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs $;

        public Builder() {
            $ = new URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs();
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs defaults) {
            $ = new URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        public Builder seconds(@Nullable Output<String> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(String seconds) {
            return seconds(Output.of(seconds));
        }

        public URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs build() {
            return $;
        }
    }

}
