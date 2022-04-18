// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.AutoprovisioningNodePoolDefaultsResponse;
import com.pulumi.googlenative.container_v1.inputs.ResourceLimitResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * ClusterAutoscaling contains global, per-cluster information required by Cluster Autoscaler to automatically adjust the size of the cluster and create/delete node pools based on the current needs.
 * 
 */
public final class ClusterAutoscalingResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterAutoscalingResponse Empty = new ClusterAutoscalingResponse();

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
     * 
     */
    @Import(name="autoprovisioningLocations", required=true)
      private final List<String> autoprovisioningLocations;

    public List<String> autoprovisioningLocations() {
        return this.autoprovisioningLocations;
    }

    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
     */
    @Import(name="autoprovisioningNodePoolDefaults", required=true)
      private final AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults;

    public AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults() {
        return this.autoprovisioningNodePoolDefaults;
    }

    /**
     * Defines autoscaling behaviour.
     * 
     */
    @Import(name="autoscalingProfile", required=true)
      private final String autoscalingProfile;

    public String autoscalingProfile() {
        return this.autoscalingProfile;
    }

    /**
     * Enables automatic node pool creation and deletion.
     * 
     */
    @Import(name="enableNodeAutoprovisioning", required=true)
      private final Boolean enableNodeAutoprovisioning;

    public Boolean enableNodeAutoprovisioning() {
        return this.enableNodeAutoprovisioning;
    }

    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
     */
    @Import(name="resourceLimits", required=true)
      private final List<ResourceLimitResponse> resourceLimits;

    public List<ResourceLimitResponse> resourceLimits() {
        return this.resourceLimits;
    }

    public ClusterAutoscalingResponse(
        List<String> autoprovisioningLocations,
        AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults,
        String autoscalingProfile,
        Boolean enableNodeAutoprovisioning,
        List<ResourceLimitResponse> resourceLimits) {
        this.autoprovisioningLocations = Objects.requireNonNull(autoprovisioningLocations, "expected parameter 'autoprovisioningLocations' to be non-null");
        this.autoprovisioningNodePoolDefaults = Objects.requireNonNull(autoprovisioningNodePoolDefaults, "expected parameter 'autoprovisioningNodePoolDefaults' to be non-null");
        this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile, "expected parameter 'autoscalingProfile' to be non-null");
        this.enableNodeAutoprovisioning = Objects.requireNonNull(enableNodeAutoprovisioning, "expected parameter 'enableNodeAutoprovisioning' to be non-null");
        this.resourceLimits = Objects.requireNonNull(resourceLimits, "expected parameter 'resourceLimits' to be non-null");
    }

    private ClusterAutoscalingResponse() {
        this.autoprovisioningLocations = List.of();
        this.autoprovisioningNodePoolDefaults = null;
        this.autoscalingProfile = null;
        this.enableNodeAutoprovisioning = null;
        this.resourceLimits = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> autoprovisioningLocations;
        private AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults;
        private String autoscalingProfile;
        private Boolean enableNodeAutoprovisioning;
        private List<ResourceLimitResponse> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioningLocations = defaults.autoprovisioningLocations;
    	      this.autoprovisioningNodePoolDefaults = defaults.autoprovisioningNodePoolDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enableNodeAutoprovisioning = defaults.enableNodeAutoprovisioning;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoprovisioningLocations(List<String> autoprovisioningLocations) {
            this.autoprovisioningLocations = Objects.requireNonNull(autoprovisioningLocations);
            return this;
        }
        public Builder autoprovisioningLocations(String... autoprovisioningLocations) {
            return autoprovisioningLocations(List.of(autoprovisioningLocations));
        }
        public Builder autoprovisioningNodePoolDefaults(AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = Objects.requireNonNull(autoprovisioningNodePoolDefaults);
            return this;
        }
        public Builder autoscalingProfile(String autoscalingProfile) {
            this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
            return this;
        }
        public Builder enableNodeAutoprovisioning(Boolean enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = Objects.requireNonNull(enableNodeAutoprovisioning);
            return this;
        }
        public Builder resourceLimits(List<ResourceLimitResponse> resourceLimits) {
            this.resourceLimits = Objects.requireNonNull(resourceLimits);
            return this;
        }
        public Builder resourceLimits(ResourceLimitResponse... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }        public ClusterAutoscalingResponse build() {
            return new ClusterAutoscalingResponse(autoprovisioningLocations, autoprovisioningNodePoolDefaults, autoscalingProfile, enableNodeAutoprovisioning, resourceLimits);
        }
    }
}
