// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class InstanceTemplateConfidentialInstanceConfig {
    /**
     * Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
     */
    private final Boolean enableConfidentialCompute;

    @OutputCustomType.Constructor
    private InstanceTemplateConfidentialInstanceConfig(@OutputCustomType.Parameter("enableConfidentialCompute") Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    /**
     * Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
    */
    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }
        public InstanceTemplateConfidentialInstanceConfig build() {
            return new InstanceTemplateConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
