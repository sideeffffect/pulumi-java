// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apps_v1beta1.inputs.RollingUpdateDeploymentArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 * 
 */
public final class DeploymentStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentStrategyArgs Empty = new DeploymentStrategyArgs();

    /**
     * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
     * 
     */
    @Import(name="rollingUpdate")
      private final @Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate;

    public Output<RollingUpdateDeploymentArgs> rollingUpdate() {
        return this.rollingUpdate == null ? Codegen.empty() : this.rollingUpdate;
    }

    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public DeploymentStrategyArgs(
        @Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate,
        @Nullable Output<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private DeploymentStrategyArgs() {
        this.rollingUpdate = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable Output<RollingUpdateDeploymentArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        public Builder rollingUpdate(@Nullable RollingUpdateDeploymentArgs rollingUpdate) {
            this.rollingUpdate = Codegen.ofNullable(rollingUpdate);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public DeploymentStrategyArgs build() {
            return new DeploymentStrategyArgs(rollingUpdate, type);
        }
    }
}
