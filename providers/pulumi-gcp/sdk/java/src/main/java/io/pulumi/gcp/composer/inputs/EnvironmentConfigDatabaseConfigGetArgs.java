// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigDatabaseConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigDatabaseConfigGetArgs Empty = new EnvironmentConfigDatabaseConfigGetArgs();

    @InputImport(name="machineType", required=true)
      private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    public EnvironmentConfigDatabaseConfigGetArgs(Input<String> machineType) {
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
    }

    private EnvironmentConfigDatabaseConfigGetArgs() {
        this.machineType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigDatabaseConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigDatabaseConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }
        public EnvironmentConfigDatabaseConfigGetArgs build() {
            return new EnvironmentConfigDatabaseConfigGetArgs(machineType);
        }
    }
}
