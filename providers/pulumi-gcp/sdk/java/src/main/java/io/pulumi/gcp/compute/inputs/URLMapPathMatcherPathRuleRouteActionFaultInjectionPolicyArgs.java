// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;

    public Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort() {
        return this.abort == null ? Codegen.empty() : this.abort;
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
      private final @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

    public Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort,
        @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
        this.abort = abort;
        this.delay = delay;
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs() {
        this.abort = Codegen.empty();
        this.delay = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort;
        private @Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        public Builder abort(@Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs> abort) {
            this.abort = abort;
            return this;
        }
        public Builder abort(@Nullable URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortArgs abort) {
            this.abort = Codegen.ofNullable(abort);
            return this;
        }
        public Builder delay(@Nullable Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs(abort, delay);
        }
    }
}
