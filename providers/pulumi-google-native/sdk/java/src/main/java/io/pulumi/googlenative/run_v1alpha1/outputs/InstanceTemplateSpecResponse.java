// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.InstanceSpecResponse;
import java.util.Objects;

@OutputCustomType
public final class InstanceTemplateSpecResponse {
    /**
     * Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    private final InstanceSpecResponse spec;

    @OutputCustomType.Constructor
    private InstanceTemplateSpecResponse(@OutputCustomType.Parameter("spec") InstanceSpecResponse spec) {
        this.spec = spec;
    }

    /**
     * Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
    */
    public InstanceSpecResponse getSpec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSpecResponse spec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spec = defaults.spec;
        }

        public Builder spec(InstanceSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public InstanceTemplateSpecResponse build() {
            return new InstanceTemplateSpecResponse(spec);
        }
    }
}
