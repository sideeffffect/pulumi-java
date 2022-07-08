// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.QueuingPolicyResponse;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerResizeRequestStatusResponse {
    /**
     * @return Constraints for the time when the instances start provisioning. Always exposed as absolute time.
     * 
     */
    private final QueuingPolicyResponse queuingPolicy;

    @CustomType.Constructor
    private InstanceGroupManagerResizeRequestStatusResponse(@CustomType.Parameter("queuingPolicy") QueuingPolicyResponse queuingPolicy) {
        this.queuingPolicy = queuingPolicy;
    }

    /**
     * @return Constraints for the time when the instances start provisioning. Always exposed as absolute time.
     * 
     */
    public QueuingPolicyResponse queuingPolicy() {
        return this.queuingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerResizeRequestStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueuingPolicyResponse queuingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerResizeRequestStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuingPolicy = defaults.queuingPolicy;
        }

        public Builder queuingPolicy(QueuingPolicyResponse queuingPolicy) {
            this.queuingPolicy = Objects.requireNonNull(queuingPolicy);
            return this;
        }        public InstanceGroupManagerResizeRequestStatusResponse build() {
            return new InstanceGroupManagerResizeRequestStatusResponse(queuingPolicy);
        }
    }
}
