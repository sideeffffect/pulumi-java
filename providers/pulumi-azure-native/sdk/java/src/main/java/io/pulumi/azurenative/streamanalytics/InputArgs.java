// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.streamanalytics.inputs.ReferenceInputPropertiesArgs;
import io.pulumi.azurenative.streamanalytics.inputs.StreamInputPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputArgs Empty = new InputArgs();

    /**
     * The name of the input.
     * 
     */
    @InputImport(name="inputName")
      private final @Nullable Input<String> inputName;

    public Input<String> getInputName() {
        return this.inputName == null ? Input.empty() : this.inputName;
    }

    /**
     * The name of the streaming job.
     * 
     */
    @InputImport(name="jobName", required=true)
      private final Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName;
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties;

    public Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public InputArgs(
        @Nullable Input<String> inputName,
        Input<String> jobName,
        @Nullable Input<String> name,
        @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties,
        Input<String> resourceGroupName) {
        this.inputName = inputName;
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private InputArgs() {
        this.inputName = Input.empty();
        this.jobName = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> inputName;
        private Input<String> jobName;
        private @Nullable Input<String> name;
        private @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(InputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputName = defaults.inputName;
    	      this.jobName = defaults.jobName;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder inputName(@Nullable Input<String> inputName) {
            this.inputName = inputName;
            return this;
        }

        public Builder inputName(@Nullable String inputName) {
            this.inputName = Input.ofNullable(inputName);
            return this;
        }

        public Builder jobName(Input<String> jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }

        public Builder jobName(String jobName) {
            this.jobName = Input.of(Objects.requireNonNull(jobName));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder properties(@Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public InputArgs build() {
            return new InputArgs(inputName, jobName, name, properties, resourceGroupName);
        }
    }
}
