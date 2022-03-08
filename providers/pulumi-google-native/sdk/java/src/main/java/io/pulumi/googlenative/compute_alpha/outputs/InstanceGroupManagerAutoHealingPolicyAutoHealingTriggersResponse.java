// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse {
    /**
     * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
     */
    private final String onHealthCheck;

    @OutputCustomType.Constructor({"onHealthCheck"})
    private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse(String onHealthCheck) {
        this.onHealthCheck = onHealthCheck;
    }

    /**
     * If you have configured an application-based health check for the group, this field controls whether to trigger VM autohealing based on a failed health check. Valid values are: - ON (default): The group recreates running VMs that fail the application-based health check. - OFF: When set to OFF, you can still observe instance health state, but the group does not recreate VMs that fail the application-based health check. This is useful for troubleshooting and setting up your health check configuration.
     * 
    */
    public String getOnHealthCheck() {
        return this.onHealthCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String onHealthCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onHealthCheck = defaults.onHealthCheck;
        }

        public Builder setOnHealthCheck(String onHealthCheck) {
            this.onHealthCheck = Objects.requireNonNull(onHealthCheck);
            return this;
        }
        public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse(onHealthCheck);
        }
    }
}
