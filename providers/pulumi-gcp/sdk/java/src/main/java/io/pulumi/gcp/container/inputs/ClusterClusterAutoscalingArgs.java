// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs;
import io.pulumi.gcp.container.inputs.ClusterClusterAutoscalingResourceLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingArgs Empty = new ClusterClusterAutoscalingArgs();

    /**
     * Contains defaults for a node pool created by NAP.
     * Structure is documented below.
     * 
     */
    @InputImport(name="autoProvisioningDefaults")
      private final @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsArgs> autoProvisioningDefaults;

    public Input<ClusterClusterAutoscalingAutoProvisioningDefaultsArgs> getAutoProvisioningDefaults() {
        return this.autoProvisioningDefaults == null ? Input.empty() : this.autoProvisioningDefaults;
    }

    /**
     * ) Configuration
     * options for the [Autoscaling profile](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-autoscaler#autoscaling_profiles)
     * feature, which lets you choose whether the cluster autoscaler should optimize for resource utilization or resource availability
     * when deciding to remove nodes from a cluster. Can be `BALANCED` or `OPTIMIZE_UTILIZATION`. Defaults to `BALANCED`.
     * 
     */
    @InputImport(name="autoscalingProfile")
      private final @Nullable Input<String> autoscalingProfile;

    public Input<String> getAutoscalingProfile() {
        return this.autoscalingProfile == null ? Input.empty() : this.autoscalingProfile;
    }

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Global constraints for machine resources in the
     * cluster. Configuring the `cpu` and `memory` types is required if node
     * auto-provisioning is enabled. These limits will apply to node pool autoscaling
     * in addition to node auto-provisioning. Structure is documented below.
     * 
     */
    @InputImport(name="resourceLimits")
      private final @Nullable Input<List<ClusterClusterAutoscalingResourceLimitArgs>> resourceLimits;

    public Input<List<ClusterClusterAutoscalingResourceLimitArgs>> getResourceLimits() {
        return this.resourceLimits == null ? Input.empty() : this.resourceLimits;
    }

    public ClusterClusterAutoscalingArgs(
        @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsArgs> autoProvisioningDefaults,
        @Nullable Input<String> autoscalingProfile,
        Input<Boolean> enabled,
        @Nullable Input<List<ClusterClusterAutoscalingResourceLimitArgs>> resourceLimits) {
        this.autoProvisioningDefaults = autoProvisioningDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.resourceLimits = resourceLimits;
    }

    private ClusterClusterAutoscalingArgs() {
        this.autoProvisioningDefaults = Input.empty();
        this.autoscalingProfile = Input.empty();
        this.enabled = Input.empty();
        this.resourceLimits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsArgs> autoProvisioningDefaults;
        private @Nullable Input<String> autoscalingProfile;
        private Input<Boolean> enabled;
        private @Nullable Input<List<ClusterClusterAutoscalingResourceLimitArgs>> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoProvisioningDefaults(@Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsArgs> autoProvisioningDefaults) {
            this.autoProvisioningDefaults = autoProvisioningDefaults;
            return this;
        }

        public Builder autoProvisioningDefaults(@Nullable ClusterClusterAutoscalingAutoProvisioningDefaultsArgs autoProvisioningDefaults) {
            this.autoProvisioningDefaults = Input.ofNullable(autoProvisioningDefaults);
            return this;
        }

        public Builder autoscalingProfile(@Nullable Input<String> autoscalingProfile) {
            this.autoscalingProfile = autoscalingProfile;
            return this;
        }

        public Builder autoscalingProfile(@Nullable String autoscalingProfile) {
            this.autoscalingProfile = Input.ofNullable(autoscalingProfile);
            return this;
        }

        public Builder enabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder resourceLimits(@Nullable Input<List<ClusterClusterAutoscalingResourceLimitArgs>> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        public Builder resourceLimits(@Nullable List<ClusterClusterAutoscalingResourceLimitArgs> resourceLimits) {
            this.resourceLimits = Input.ofNullable(resourceLimits);
            return this;
        }
        public ClusterClusterAutoscalingArgs build() {
            return new ClusterClusterAutoscalingArgs(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
