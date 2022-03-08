// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchTemplateConfigOverride;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetRequestLaunchTemplateConfig {
    /**
     * Launch template specification. See Launch Template Specification below for more details.
     * 
     */
    private final SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * One or more override configurations. See Overrides below for more details.
     * 
     */
    private final @Nullable List<SpotFleetRequestLaunchTemplateConfigOverride> overrides;

    @OutputCustomType.Constructor({"launchTemplateSpecification","overrides"})
    private SpotFleetRequestLaunchTemplateConfig(
        SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification launchTemplateSpecification,
        @Nullable List<SpotFleetRequestLaunchTemplateConfigOverride> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    /**
     * Launch template specification. See Launch Template Specification below for more details.
     * 
    */
    public SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }
    /**
     * One or more override configurations. See Overrides below for more details.
     * 
    */
    public List<SpotFleetRequestLaunchTemplateConfigOverride> getOverrides() {
        return this.overrides == null ? List.of() : this.overrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchTemplateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification launchTemplateSpecification;
        private @Nullable List<SpotFleetRequestLaunchTemplateConfigOverride> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchTemplateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder setLaunchTemplateSpecification(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }

        public Builder setOverrides(@Nullable List<SpotFleetRequestLaunchTemplateConfigOverride> overrides) {
            this.overrides = overrides;
            return this;
        }
        public SpotFleetRequestLaunchTemplateConfig build() {
            return new SpotFleetRequestLaunchTemplateConfig(launchTemplateSpecification, overrides);
        }
    }
}
