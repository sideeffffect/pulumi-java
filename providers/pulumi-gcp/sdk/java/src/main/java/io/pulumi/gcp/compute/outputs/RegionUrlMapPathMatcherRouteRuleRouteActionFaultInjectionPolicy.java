// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy {
    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort;
    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay;

    @OutputCustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy(
        @OutputCustomType.Parameter("abort") @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort,
        @OutputCustomType.Parameter("delay") @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * The specification for how client requests are aborted as part of fault
     * injection.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort> getAbort() {
        return Optional.ofNullable(this.abort);
    }
    /**
     * The specification for how client requests are delayed as part of fault
     * injection, before being sent to a backend service.
     * Structure is documented below.
     * 
    */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay> getDelay() {
        return Optional.ofNullable(this.delay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort) {
            this.abort = abort;
            return this;
        }

        public Builder delay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay) {
            this.delay = delay;
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy(abort, delay);
        }
    }
}
