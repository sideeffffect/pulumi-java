// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort;

    public Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort() {
        return this.abort == null ? Codegen.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay;

    public Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs(
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs() {
        this.abort = Codegen.empty();
        this.delay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs abort) {
            this.abort = Codegen.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyGetArgs(abort, delay);
        }
    }
}
