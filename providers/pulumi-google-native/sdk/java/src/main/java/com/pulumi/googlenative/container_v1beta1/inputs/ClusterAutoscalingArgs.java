// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.enums.ClusterAutoscalingAutoscalingProfile;
import com.pulumi.googlenative.container_v1beta1.inputs.AutoprovisioningNodePoolDefaultsArgs;
import com.pulumi.googlenative.container_v1beta1.inputs.ResourceLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ClusterAutoscaling contains global, per-cluster information required by Cluster Autoscaler to automatically adjust the size of the cluster and create/delete node pools based on the current needs.
 * 
 */
public final class ClusterAutoscalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterAutoscalingArgs Empty = new ClusterAutoscalingArgs();

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool&#39;s nodes can be created by NAP.
     * 
     */
    @Import(name="autoprovisioningLocations")
    private @Nullable Output<List<String>> autoprovisioningLocations;

    public Optional<Output<List<String>>> autoprovisioningLocations() {
        return Optional.ofNullable(this.autoprovisioningLocations);
    }

    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
     */
    @Import(name="autoprovisioningNodePoolDefaults")
    private @Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults;

    public Optional<Output<AutoprovisioningNodePoolDefaultsArgs>> autoprovisioningNodePoolDefaults() {
        return Optional.ofNullable(this.autoprovisioningNodePoolDefaults);
    }

    /**
     * Defines autoscaling behaviour.
     * 
     */
    @Import(name="autoscalingProfile")
    private @Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile;

    public Optional<Output<ClusterAutoscalingAutoscalingProfile>> autoscalingProfile() {
        return Optional.ofNullable(this.autoscalingProfile);
    }

    /**
     * Enables automatic node pool creation and deletion.
     * 
     */
    @Import(name="enableNodeAutoprovisioning")
    private @Nullable Output<Boolean> enableNodeAutoprovisioning;

    public Optional<Output<Boolean>> enableNodeAutoprovisioning() {
        return Optional.ofNullable(this.enableNodeAutoprovisioning);
    }

    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
     */
    @Import(name="resourceLimits")
    private @Nullable Output<List<ResourceLimitArgs>> resourceLimits;

    public Optional<Output<List<ResourceLimitArgs>>> resourceLimits() {
        return Optional.ofNullable(this.resourceLimits);
    }

    private ClusterAutoscalingArgs() {}

    private ClusterAutoscalingArgs(ClusterAutoscalingArgs $) {
        this.autoprovisioningLocations = $.autoprovisioningLocations;
        this.autoprovisioningNodePoolDefaults = $.autoprovisioningNodePoolDefaults;
        this.autoscalingProfile = $.autoscalingProfile;
        this.enableNodeAutoprovisioning = $.enableNodeAutoprovisioning;
        this.resourceLimits = $.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterAutoscalingArgs $;

        public Builder() {
            $ = new ClusterAutoscalingArgs();
        }

        public Builder(ClusterAutoscalingArgs defaults) {
            $ = new ClusterAutoscalingArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoprovisioningLocations(@Nullable Output<List<String>> autoprovisioningLocations) {
            $.autoprovisioningLocations = autoprovisioningLocations;
            return this;
        }

        public Builder autoprovisioningLocations(List<String> autoprovisioningLocations) {
            return autoprovisioningLocations(Output.of(autoprovisioningLocations));
        }

        public Builder autoprovisioningLocations(String... autoprovisioningLocations) {
            return autoprovisioningLocations(List.of(autoprovisioningLocations));
        }

        public Builder autoprovisioningNodePoolDefaults(@Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults) {
            $.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
            return this;
        }

        public Builder autoprovisioningNodePoolDefaults(AutoprovisioningNodePoolDefaultsArgs autoprovisioningNodePoolDefaults) {
            return autoprovisioningNodePoolDefaults(Output.of(autoprovisioningNodePoolDefaults));
        }

        public Builder autoscalingProfile(@Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile) {
            $.autoscalingProfile = autoscalingProfile;
            return this;
        }

        public Builder autoscalingProfile(ClusterAutoscalingAutoscalingProfile autoscalingProfile) {
            return autoscalingProfile(Output.of(autoscalingProfile));
        }

        public Builder enableNodeAutoprovisioning(@Nullable Output<Boolean> enableNodeAutoprovisioning) {
            $.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
            return this;
        }

        public Builder enableNodeAutoprovisioning(Boolean enableNodeAutoprovisioning) {
            return enableNodeAutoprovisioning(Output.of(enableNodeAutoprovisioning));
        }

        public Builder resourceLimits(@Nullable Output<List<ResourceLimitArgs>> resourceLimits) {
            $.resourceLimits = resourceLimits;
            return this;
        }

        public Builder resourceLimits(List<ResourceLimitArgs> resourceLimits) {
            return resourceLimits(Output.of(resourceLimits));
        }

        public Builder resourceLimits(ResourceLimitArgs... resourceLimits) {
            return resourceLimits(List.of(resourceLimits));
        }

        public ClusterAutoscalingArgs build() {
            return $;
        }
    }

}
