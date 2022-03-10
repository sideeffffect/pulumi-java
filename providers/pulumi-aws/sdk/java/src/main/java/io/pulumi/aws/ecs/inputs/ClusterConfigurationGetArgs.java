// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ClusterConfigurationExecuteCommandConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationGetArgs Empty = new ClusterConfigurationGetArgs();

    /**
     * The details of the execute command configuration. Detailed below.
     * 
     */
    @InputImport(name="executeCommandConfiguration")
      private final @Nullable Input<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration;

    public Input<ClusterConfigurationExecuteCommandConfigurationGetArgs> getExecuteCommandConfiguration() {
        return this.executeCommandConfiguration == null ? Input.empty() : this.executeCommandConfiguration;
    }

    public ClusterConfigurationGetArgs(@Nullable Input<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration) {
        this.executeCommandConfiguration = executeCommandConfiguration;
    }

    private ClusterConfigurationGetArgs() {
        this.executeCommandConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeCommandConfiguration = defaults.executeCommandConfiguration;
        }

        public Builder executeCommandConfiguration(@Nullable Input<ClusterConfigurationExecuteCommandConfigurationGetArgs> executeCommandConfiguration) {
            this.executeCommandConfiguration = executeCommandConfiguration;
            return this;
        }

        public Builder executeCommandConfiguration(@Nullable ClusterConfigurationExecuteCommandConfigurationGetArgs executeCommandConfiguration) {
            this.executeCommandConfiguration = Input.ofNullable(executeCommandConfiguration);
            return this;
        }
        public ClusterConfigurationGetArgs build() {
            return new ClusterConfigurationGetArgs(executeCommandConfiguration);
        }
    }
}
