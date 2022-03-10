// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeDockerVolumeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeDockerVolumeConfigurationGetArgs Empty = new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs();

    /**
     * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    @InputImport(name="autoprovision")
      private final @Nullable Input<Boolean> autoprovision;

    public Input<Boolean> getAutoprovision() {
        return this.autoprovision == null ? Input.empty() : this.autoprovision;
    }

    /**
     * Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    @InputImport(name="driver")
      private final @Nullable Input<String> driver;

    public Input<String> getDriver() {
        return this.driver == null ? Input.empty() : this.driver;
    }

    /**
     * Map of Docker driver specific options.
     * 
     */
    @InputImport(name="driverOpts")
      private final @Nullable Input<Map<String,String>> driverOpts;

    public Input<Map<String,String>> getDriverOpts() {
        return this.driverOpts == null ? Input.empty() : this.driverOpts;
    }

    /**
     * Map of custom metadata to add to your Docker volume.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(
        @Nullable Input<Boolean> autoprovision,
        @Nullable Input<String> driver,
        @Nullable Input<Map<String,String>> driverOpts,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> scope) {
        this.autoprovision = autoprovision;
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.scope = scope;
    }

    private TaskDefinitionVolumeDockerVolumeConfigurationGetArgs() {
        this.autoprovision = Input.empty();
        this.driver = Input.empty();
        this.driverOpts = Input.empty();
        this.labels = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoprovision;
        private @Nullable Input<String> driver;
        private @Nullable Input<Map<String,String>> driverOpts;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovision = defaults.autoprovision;
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.scope = defaults.scope;
        }

        public Builder autoprovision(@Nullable Input<Boolean> autoprovision) {
            this.autoprovision = autoprovision;
            return this;
        }

        public Builder autoprovision(@Nullable Boolean autoprovision) {
            this.autoprovision = Input.ofNullable(autoprovision);
            return this;
        }

        public Builder driver(@Nullable Input<String> driver) {
            this.driver = driver;
            return this;
        }

        public Builder driver(@Nullable String driver) {
            this.driver = Input.ofNullable(driver);
            return this;
        }

        public Builder driverOpts(@Nullable Input<Map<String,String>> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }

        public Builder driverOpts(@Nullable Map<String,String> driverOpts) {
            this.driverOpts = Input.ofNullable(driverOpts);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder scope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public TaskDefinitionVolumeDockerVolumeConfigurationGetArgs build() {
            return new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(autoprovision, driver, driverOpts, labels, scope);
        }
    }
}
