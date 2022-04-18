// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceFleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceFleetArgs Empty = new DeviceFleetArgs();

    /**
     * A description of the fleet.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The name of the Device Fleet (must be unique).
     * 
     */
    @Import(name="deviceFleetName", required=true)
      private final Output<String> deviceFleetName;

    public Output<String> deviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * Whether to create an AWS IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * 
     */
    @Import(name="enableIotRoleAlias")
      private final @Nullable Output<Boolean> enableIotRoleAlias;

    public Output<Boolean> enableIotRoleAlias() {
        return this.enableIotRoleAlias == null ? Codegen.empty() : this.enableIotRoleAlias;
    }

    /**
     * Specifies details about the repository. see Output Config details below.
     * 
     */
    @Import(name="outputConfig", required=true)
      private final Output<DeviceFleetOutputConfigArgs> outputConfig;

    public Output<DeviceFleetOutputConfigArgs> outputConfig() {
        return this.outputConfig;
    }

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DeviceFleetArgs(
        @Nullable Output<String> description,
        Output<String> deviceFleetName,
        @Nullable Output<Boolean> enableIotRoleAlias,
        Output<DeviceFleetOutputConfigArgs> outputConfig,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.deviceFleetName = Objects.requireNonNull(deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
        this.enableIotRoleAlias = enableIotRoleAlias;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private DeviceFleetArgs() {
        this.description = Codegen.empty();
        this.deviceFleetName = Codegen.empty();
        this.enableIotRoleAlias = Codegen.empty();
        this.outputConfig = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> deviceFleetName;
        private @Nullable Output<Boolean> enableIotRoleAlias;
        private Output<DeviceFleetOutputConfigArgs> outputConfig;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceFleetName = defaults.deviceFleetName;
    	      this.enableIotRoleAlias = defaults.enableIotRoleAlias;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder deviceFleetName(Output<String> deviceFleetName) {
            this.deviceFleetName = Objects.requireNonNull(deviceFleetName);
            return this;
        }
        public Builder deviceFleetName(String deviceFleetName) {
            this.deviceFleetName = Output.of(Objects.requireNonNull(deviceFleetName));
            return this;
        }
        public Builder enableIotRoleAlias(@Nullable Output<Boolean> enableIotRoleAlias) {
            this.enableIotRoleAlias = enableIotRoleAlias;
            return this;
        }
        public Builder enableIotRoleAlias(@Nullable Boolean enableIotRoleAlias) {
            this.enableIotRoleAlias = Codegen.ofNullable(enableIotRoleAlias);
            return this;
        }
        public Builder outputConfig(Output<DeviceFleetOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public Builder outputConfig(DeviceFleetOutputConfigArgs outputConfig) {
            this.outputConfig = Output.of(Objects.requireNonNull(outputConfig));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DeviceFleetArgs build() {
            return new DeviceFleetArgs(description, deviceFleetName, enableIotRoleAlias, outputConfig, roleArn, tags);
        }
    }
}
