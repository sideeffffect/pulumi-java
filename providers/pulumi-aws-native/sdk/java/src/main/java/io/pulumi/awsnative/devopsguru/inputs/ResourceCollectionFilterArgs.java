// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.inputs;

import io.pulumi.awsnative.devopsguru.inputs.ResourceCollectionCloudFormationCollectionFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about a filter used to specify which AWS resources are analyzed for anomalous behavior by DevOps Guru.
 * 
 */
public final class ResourceCollectionFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionFilterArgs Empty = new ResourceCollectionFilterArgs();

    @InputImport(name="cloudFormation")
      private final @Nullable Input<ResourceCollectionCloudFormationCollectionFilterArgs> cloudFormation;

    public Input<ResourceCollectionCloudFormationCollectionFilterArgs> getCloudFormation() {
        return this.cloudFormation == null ? Input.empty() : this.cloudFormation;
    }

    public ResourceCollectionFilterArgs(@Nullable Input<ResourceCollectionCloudFormationCollectionFilterArgs> cloudFormation) {
        this.cloudFormation = cloudFormation;
    }

    private ResourceCollectionFilterArgs() {
        this.cloudFormation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceCollectionCloudFormationCollectionFilterArgs> cloudFormation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFormation = defaults.cloudFormation;
        }

        public Builder cloudFormation(@Nullable Input<ResourceCollectionCloudFormationCollectionFilterArgs> cloudFormation) {
            this.cloudFormation = cloudFormation;
            return this;
        }

        public Builder cloudFormation(@Nullable ResourceCollectionCloudFormationCollectionFilterArgs cloudFormation) {
            this.cloudFormation = Input.ofNullable(cloudFormation);
            return this;
        }
        public ResourceCollectionFilterArgs build() {
            return new ResourceCollectionFilterArgs(cloudFormation);
        }
    }
}
