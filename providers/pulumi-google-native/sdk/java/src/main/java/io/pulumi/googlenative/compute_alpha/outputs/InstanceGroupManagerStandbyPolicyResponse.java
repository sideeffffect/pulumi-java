// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerStandbyPolicyResponse {
    private final Integer initialDelaySec;

    @OutputCustomType.Constructor({"initialDelaySec"})
    private InstanceGroupManagerStandbyPolicyResponse(Integer initialDelaySec) {
        this.initialDelaySec = initialDelaySec;
    }

    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder setInitialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }
        public InstanceGroupManagerStandbyPolicyResponse build() {
            return new InstanceGroupManagerStandbyPolicyResponse(initialDelaySec);
        }
    }
}
