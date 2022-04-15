// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs;
import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyLaunchTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyLaunchTemplateArgs Empty = new GroupMixedInstancesPolicyLaunchTemplateArgs();

    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    @Import(name="launchTemplateSpecification", required=true)
      private final Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs> launchTemplateSpecification;

    public Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs> launchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    @Import(name="overrides")
      private final @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs>> overrides;

    public Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs>> overrides() {
        return this.overrides == null ? Codegen.empty() : this.overrides;
    }

    public GroupMixedInstancesPolicyLaunchTemplateArgs(
        Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs> launchTemplateSpecification,
        @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs>> overrides) {
        this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification, "expected parameter 'launchTemplateSpecification' to be non-null");
        this.overrides = overrides;
    }

    private GroupMixedInstancesPolicyLaunchTemplateArgs() {
        this.launchTemplateSpecification = Codegen.empty();
        this.overrides = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs> launchTemplateSpecification;
        private @Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs>> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(Output<GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs> launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }
        public Builder launchTemplateSpecification(GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationArgs launchTemplateSpecification) {
            this.launchTemplateSpecification = Output.of(Objects.requireNonNull(launchTemplateSpecification));
            return this;
        }
        public Builder overrides(@Nullable Output<List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }
        public Builder overrides(@Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverrideArgs> overrides) {
            this.overrides = Codegen.ofNullable(overrides);
            return this;
        }
        public Builder overrides(GroupMixedInstancesPolicyLaunchTemplateOverrideArgs... overrides) {
            return overrides(List.of(overrides));
        }        public GroupMixedInstancesPolicyLaunchTemplateArgs build() {
            return new GroupMixedInstancesPolicyLaunchTemplateArgs(launchTemplateSpecification, overrides);
        }
    }
}
