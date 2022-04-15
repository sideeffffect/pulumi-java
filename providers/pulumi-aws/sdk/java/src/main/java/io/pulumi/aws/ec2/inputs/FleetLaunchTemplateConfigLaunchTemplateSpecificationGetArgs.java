// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs Empty = new FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs();

    /**
     * ID of the launch template.
     * 
     */
    @Import(name="launchTemplateId")
      private final @Nullable Output<String> launchTemplateId;

    public Output<String> launchTemplateId() {
        return this.launchTemplateId == null ? Codegen.empty() : this.launchTemplateId;
    }

    /**
     * Name of the launch template.
     * 
     */
    @Import(name="launchTemplateName")
      private final @Nullable Output<String> launchTemplateName;

    public Output<String> launchTemplateName() {
        return this.launchTemplateName == null ? Codegen.empty() : this.launchTemplateName;
    }

    /**
     * Version number of the launch template.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs(
        @Nullable Output<String> launchTemplateId,
        @Nullable Output<String> launchTemplateName,
        Output<String> version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs() {
        this.launchTemplateId = Codegen.empty();
        this.launchTemplateName = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> launchTemplateId;
        private @Nullable Output<String> launchTemplateName;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = Codegen.ofNullable(launchTemplateId);
            return this;
        }
        public Builder launchTemplateName(@Nullable Output<String> launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = Codegen.ofNullable(launchTemplateName);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs build() {
            return new FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs(launchTemplateId, launchTemplateName, version);
        }
    }
}
