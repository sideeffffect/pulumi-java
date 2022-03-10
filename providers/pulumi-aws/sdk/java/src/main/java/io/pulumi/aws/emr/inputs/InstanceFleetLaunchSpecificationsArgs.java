// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetLaunchSpecificationsSpotSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsArgs Empty = new InstanceFleetLaunchSpecificationsArgs();

    /**
     * Configuration block for on demand instances launch specifications
     * 
     */
    @InputImport(name="onDemandSpecifications")
      private final @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;

    public Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? Input.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications
     * 
     */
    @InputImport(name="spotSpecifications")
      private final @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

    public Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> getSpotSpecifications() {
        return this.spotSpecifications == null ? Input.empty() : this.spotSpecifications;
    }

    public InstanceFleetLaunchSpecificationsArgs(
        @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications,
        @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private InstanceFleetLaunchSpecificationsArgs() {
        this.onDemandSpecifications = Input.empty();
        this.spotSpecifications = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;
        private @Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder onDemandSpecifications(@Nullable Input<List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder onDemandSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecificationArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Input.ofNullable(onDemandSpecifications);
            return this;
        }

        public Builder spotSpecifications(@Nullable Input<List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }

        public Builder spotSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsSpotSpecificationArgs> spotSpecifications) {
            this.spotSpecifications = Input.ofNullable(spotSpecifications);
            return this;
        }
        public InstanceFleetLaunchSpecificationsArgs build() {
            return new InstanceFleetLaunchSpecificationsArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
