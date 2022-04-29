// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigDatabaseConfigArgs extends ResourceArgs {

    public static final EnvironmentConfigDatabaseConfigArgs Empty = new EnvironmentConfigDatabaseConfigArgs();

    @Import(name="machineType", required=true)
    private Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    private EnvironmentConfigDatabaseConfigArgs() {}

    private EnvironmentConfigDatabaseConfigArgs(EnvironmentConfigDatabaseConfigArgs $) {
        this.machineType = $.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigDatabaseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigDatabaseConfigArgs $;

        public Builder() {
            $ = new EnvironmentConfigDatabaseConfigArgs();
        }

        public Builder(EnvironmentConfigDatabaseConfigArgs defaults) {
            $ = new EnvironmentConfigDatabaseConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public EnvironmentConfigDatabaseConfigArgs build() {
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
