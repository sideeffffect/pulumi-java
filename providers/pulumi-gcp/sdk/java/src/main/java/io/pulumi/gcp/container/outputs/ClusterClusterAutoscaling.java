// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.container.outputs.ClusterClusterAutoscalingAutoProvisioningDefaults;
import io.pulumi.gcp.container.outputs.ClusterClusterAutoscalingResourceLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterAutoscaling {
    /**
     * Contains defaults for a node pool created by NAP.
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterClusterAutoscalingAutoProvisioningDefaults autoProvisioningDefaults;
    /**
     * ) Configuration
     * options for the [Autoscaling profile](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-autoscaler#autoscaling_profiles)
     * feature, which lets you choose whether the cluster autoscaler should optimize for resource utilization or resource availability
     * when deciding to remove nodes from a cluster. Can be `BALANCED` or `OPTIMIZE_UTILIZATION`. Defaults to `BALANCED`.
     * 
     */
    private final @Nullable String autoscalingProfile;
    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    private final Boolean enabled;
    /**
     * Global constraints for machine resources in the
     * cluster. Configuring the `cpu` and `memory` types is required if node
     * auto-provisioning is enabled. These limits will apply to node pool autoscaling
     * in addition to node auto-provisioning. Structure is documented below.
     * 
     */
    private final @Nullable List<ClusterClusterAutoscalingResourceLimit> resourceLimits;

    @CustomType.Constructor
    private ClusterClusterAutoscaling(
        @CustomType.Parameter("autoProvisioningDefaults") @Nullable ClusterClusterAutoscalingAutoProvisioningDefaults autoProvisioningDefaults,
        @CustomType.Parameter("autoscalingProfile") @Nullable String autoscalingProfile,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("resourceLimits") @Nullable List<ClusterClusterAutoscalingResourceLimit> resourceLimits) {
        this.autoProvisioningDefaults = autoProvisioningDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enabled = enabled;
        this.resourceLimits = resourceLimits;
    }

    /**
     * Contains defaults for a node pool created by NAP.
     * Structure is documented below.
     * 
    */
    public Optional<ClusterClusterAutoscalingAutoProvisioningDefaults> autoProvisioningDefaults() {
        return Optional.ofNullable(this.autoProvisioningDefaults);
    }
    /**
     * ) Configuration
     * options for the [Autoscaling profile](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-autoscaler#autoscaling_profiles)
     * feature, which lets you choose whether the cluster autoscaler should optimize for resource utilization or resource availability
     * when deciding to remove nodes from a cluster. Can be `BALANCED` or `OPTIMIZE_UTILIZATION`. Defaults to `BALANCED`.
     * 
    */
    public Optional<String> autoscalingProfile() {
        return Optional.ofNullable(this.autoscalingProfile);
    }
    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * Global constraints for machine resources in the
     * cluster. Configuring the `cpu` and `memory` types is required if node
     * auto-provisioning is enabled. These limits will apply to node pool autoscaling
     * in addition to node auto-provisioning. Structure is documented below.
     * 
    */
    public List<ClusterClusterAutoscalingResourceLimit> resourceLimits() {
        return this.resourceLimits == null ? List.of() : this.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterClusterAutoscalingAutoProvisioningDefaults autoProvisioningDefaults;
        private @Nullable String autoscalingProfile;
        private Boolean enabled;
        private @Nullable List<ClusterClusterAutoscalingResourceLimit> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoProvisioningDefaults(@Nullable ClusterClusterAutoscalingAutoProvisioningDefaults autoProvisioningDefaults) {
            this.autoProvisioningDefaults = autoProvisioningDefaults;
            return this;
        }
        public Builder autoscalingProfile(@Nullable String autoscalingProfile) {
            this.autoscalingProfile = autoscalingProfile;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder resourceLimits(@Nullable List<ClusterClusterAutoscalingResourceLimit> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }
        public Builder resourceLimits(ClusterClusterAutoscalingResourceLimit... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }        public ClusterClusterAutoscaling build() {
            return new ClusterClusterAutoscaling(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
