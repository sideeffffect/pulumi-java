// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CloudFormation resource for DevOps Guru to monitor
 * 
 */
public final class ResourceCollectionCloudFormationCollectionFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionCloudFormationCollectionFilterArgs Empty = new ResourceCollectionCloudFormationCollectionFilterArgs();

    /**
     * An array of CloudFormation stack names.
     * 
     */
    @InputImport(name="stackNames")
      private final @Nullable Input<List<String>> stackNames;

    public Input<List<String>> getStackNames() {
        return this.stackNames == null ? Input.empty() : this.stackNames;
    }

    public ResourceCollectionCloudFormationCollectionFilterArgs(@Nullable Input<List<String>> stackNames) {
        this.stackNames = stackNames;
    }

    private ResourceCollectionCloudFormationCollectionFilterArgs() {
        this.stackNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> stackNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackNames = defaults.stackNames;
        }

        public Builder stackNames(@Nullable Input<List<String>> stackNames) {
            this.stackNames = stackNames;
            return this;
        }

        public Builder stackNames(@Nullable List<String> stackNames) {
            this.stackNames = Input.ofNullable(stackNames);
            return this;
        }
        public ResourceCollectionCloudFormationCollectionFilterArgs build() {
            return new ResourceCollectionCloudFormationCollectionFilterArgs(stackNames);
        }
    }
}
