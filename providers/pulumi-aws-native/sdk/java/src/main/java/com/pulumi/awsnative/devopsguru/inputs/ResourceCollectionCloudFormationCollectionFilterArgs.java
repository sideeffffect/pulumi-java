// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CloudFormation resource for DevOps Guru to monitor
 * 
 */
public final class ResourceCollectionCloudFormationCollectionFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionCloudFormationCollectionFilterArgs Empty = new ResourceCollectionCloudFormationCollectionFilterArgs();

    /**
     * An array of CloudFormation stack names.
     * 
     */
    @Import(name="stackNames")
    private @Nullable Output<List<String>> stackNames;

    /**
     * @return An array of CloudFormation stack names.
     * 
     */
    public Optional<Output<List<String>>> stackNames() {
        return Optional.ofNullable(this.stackNames);
    }

    private ResourceCollectionCloudFormationCollectionFilterArgs() {}

    private ResourceCollectionCloudFormationCollectionFilterArgs(ResourceCollectionCloudFormationCollectionFilterArgs $) {
        this.stackNames = $.stackNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCollectionCloudFormationCollectionFilterArgs $;

        public Builder() {
            $ = new ResourceCollectionCloudFormationCollectionFilterArgs();
        }

        public Builder(ResourceCollectionCloudFormationCollectionFilterArgs defaults) {
            $ = new ResourceCollectionCloudFormationCollectionFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stackNames An array of CloudFormation stack names.
         * 
         * @return builder
         * 
         */
        public Builder stackNames(@Nullable Output<List<String>> stackNames) {
            $.stackNames = stackNames;
            return this;
        }

        /**
         * @param stackNames An array of CloudFormation stack names.
         * 
         * @return builder
         * 
         */
        public Builder stackNames(List<String> stackNames) {
            return stackNames(Output.of(stackNames));
        }

        /**
         * @param stackNames An array of CloudFormation stack names.
         * 
         * @return builder
         * 
         */
        public Builder stackNames(String... stackNames) {
            return stackNames(List.of(stackNames));
        }

        public ResourceCollectionCloudFormationCollectionFilterArgs build() {
            return $;
        }
    }

}
