// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy {
    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort;
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay;

    @CustomType.Constructor
    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy(
        @CustomType.Parameter("abort") @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort,
        @CustomType.Parameter("delay") @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay) {
        this.abort = abort;
        this.delay = delay;
    }

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort> abort() {
        return Optional.ofNullable(this.abort);
    }
    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
    */
    public Optional<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay> delay() {
        return Optional.ofNullable(this.delay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbort abort) {
            this.abort = abort;
            return this;
        }
        public Builder delay(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay delay) {
            this.delay = delay;
            return this;
        }        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy build() {
            return new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy(abort, delay);
        }
    }
}
