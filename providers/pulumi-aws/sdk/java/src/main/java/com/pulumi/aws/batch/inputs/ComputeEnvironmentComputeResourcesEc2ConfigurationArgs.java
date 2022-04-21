// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputeEnvironmentComputeResourcesEc2ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentComputeResourcesEc2ConfigurationArgs Empty = new ComputeEnvironmentComputeResourcesEc2ConfigurationArgs();

    /**
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
     * 
     */
    @Import(name="imageIdOverride")
    private @Nullable Output<String> imageIdOverride;

    public Optional<Output<String>> imageIdOverride() {
        return Optional.ofNullable(this.imageIdOverride);
    }

    /**
     * The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn&#39;t specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
     * 
     */
    @Import(name="imageType")
    private @Nullable Output<String> imageType;

    public Optional<Output<String>> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    private ComputeEnvironmentComputeResourcesEc2ConfigurationArgs() {}

    private ComputeEnvironmentComputeResourcesEc2ConfigurationArgs(ComputeEnvironmentComputeResourcesEc2ConfigurationArgs $) {
        this.imageIdOverride = $.imageIdOverride;
        this.imageType = $.imageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeEnvironmentComputeResourcesEc2ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEnvironmentComputeResourcesEc2ConfigurationArgs $;

        public Builder() {
            $ = new ComputeEnvironmentComputeResourcesEc2ConfigurationArgs();
        }

        public Builder(ComputeEnvironmentComputeResourcesEc2ConfigurationArgs defaults) {
            $ = new ComputeEnvironmentComputeResourcesEc2ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageIdOverride(@Nullable Output<String> imageIdOverride) {
            $.imageIdOverride = imageIdOverride;
            return this;
        }

        public Builder imageIdOverride(String imageIdOverride) {
            return imageIdOverride(Output.of(imageIdOverride));
        }

        public Builder imageType(@Nullable Output<String> imageType) {
            $.imageType = imageType;
            return this;
        }

        public Builder imageType(String imageType) {
            return imageType(Output.of(imageType));
        }

        public ComputeEnvironmentComputeResourcesEc2ConfigurationArgs build() {
            return $;
        }
    }

}
