// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigWebServerConfigArgs extends ResourceArgs {

    public static final EnvironmentConfigWebServerConfigArgs Empty = new EnvironmentConfigWebServerConfigArgs();

    @Import(name="machineType", required=true)
    private Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    private EnvironmentConfigWebServerConfigArgs() {}

    private EnvironmentConfigWebServerConfigArgs(EnvironmentConfigWebServerConfigArgs $) {
        this.machineType = $.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigWebServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigWebServerConfigArgs $;

        public Builder() {
            $ = new EnvironmentConfigWebServerConfigArgs();
        }

        public Builder(EnvironmentConfigWebServerConfigArgs defaults) {
            $ = new EnvironmentConfigWebServerConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public EnvironmentConfigWebServerConfigArgs build() {
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}
