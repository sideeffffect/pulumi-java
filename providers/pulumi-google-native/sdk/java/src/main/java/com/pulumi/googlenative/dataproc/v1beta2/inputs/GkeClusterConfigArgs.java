// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.NamespacedGkeDeploymentTargetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The GKE config for this cluster.
 * 
 */
public final class GkeClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeClusterConfigArgs Empty = new GkeClusterConfigArgs();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @Import(name="namespacedGkeDeploymentTarget")
    private @Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

    /**
     * @return Optional. A target for the deployment.
     * 
     */
    public Optional<Output<NamespacedGkeDeploymentTargetArgs>> namespacedGkeDeploymentTarget() {
        return Optional.ofNullable(this.namespacedGkeDeploymentTarget);
    }

    private GkeClusterConfigArgs() {}

    private GkeClusterConfigArgs(GkeClusterConfigArgs $) {
        this.namespacedGkeDeploymentTarget = $.namespacedGkeDeploymentTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterConfigArgs $;

        public Builder() {
            $ = new GkeClusterConfigArgs();
        }

        public Builder(GkeClusterConfigArgs defaults) {
            $ = new GkeClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. A target for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder namespacedGkeDeploymentTarget(@Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
            $.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. A target for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder namespacedGkeDeploymentTarget(NamespacedGkeDeploymentTargetArgs namespacedGkeDeploymentTarget) {
            return namespacedGkeDeploymentTarget(Output.of(namespacedGkeDeploymentTarget));
        }

        public GkeClusterConfigArgs build() {
            return $;
        }
    }

}
