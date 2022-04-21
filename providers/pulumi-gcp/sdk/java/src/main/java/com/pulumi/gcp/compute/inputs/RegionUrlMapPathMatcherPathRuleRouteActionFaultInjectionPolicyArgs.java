// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs>> abort() {
        return Optional.ofNullable(this.abort);
    }

    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Optional<Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs>> delay() {
        return Optional.ofNullable(this.delay);
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs() {}

    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs $) {
        this.abort = $.abort;
        this.delay = $.delay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs();
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder abort(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort) {
            $.abort = abort;
            return this;
        }

        public Builder abort(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs abort) {
            return abort(Output.of(abort));
        }

        public Builder delay(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
            $.delay = delay;
            return this;
        }

        public Builder delay(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs delay) {
            return delay(Output.of(delay));
        }

        public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs build() {
            return $;
        }
    }

}
