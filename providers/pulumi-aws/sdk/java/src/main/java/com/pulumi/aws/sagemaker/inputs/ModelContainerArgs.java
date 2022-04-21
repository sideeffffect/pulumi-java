// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.ModelContainerImageConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ModelContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelContainerArgs Empty = new ModelContainerArgs();

    /**
     * The DNS host name for the container.
     * 
     */
    @Import(name="containerHostname")
    private @Nullable Output<String> containerHostname;

    public Optional<Output<String>> containerHostname() {
        return Optional.ofNullable(this.containerHostname);
    }

    /**
     * Environment variables for the Docker container.
     * A list of key value pairs.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Map<String,String>> environment;

    public Optional<Output<Map<String,String>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The registry path where the inference code image is stored in Amazon ECR.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    public Output<String> image() {
        return this.image;
    }

    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * 
     */
    @Import(name="imageConfig")
    private @Nullable Output<ModelContainerImageConfigArgs> imageConfig;

    public Optional<Output<ModelContainerImageConfigArgs>> imageConfig() {
        return Optional.ofNullable(this.imageConfig);
    }

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The URL for the S3 location where model artifacts are stored.
     * 
     */
    @Import(name="modelDataUrl")
    private @Nullable Output<String> modelDataUrl;

    public Optional<Output<String>> modelDataUrl() {
        return Optional.ofNullable(this.modelDataUrl);
    }

    private ModelContainerArgs() {}

    private ModelContainerArgs(ModelContainerArgs $) {
        this.containerHostname = $.containerHostname;
        this.environment = $.environment;
        this.image = $.image;
        this.imageConfig = $.imageConfig;
        this.mode = $.mode;
        this.modelDataUrl = $.modelDataUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelContainerArgs $;

        public Builder() {
            $ = new ModelContainerArgs();
        }

        public Builder(ModelContainerArgs defaults) {
            $ = new ModelContainerArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerHostname(@Nullable Output<String> containerHostname) {
            $.containerHostname = containerHostname;
            return this;
        }

        public Builder containerHostname(String containerHostname) {
            return containerHostname(Output.of(containerHostname));
        }

        public Builder environment(@Nullable Output<Map<String,String>> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(Map<String,String> environment) {
            return environment(Output.of(environment));
        }

        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder imageConfig(@Nullable Output<ModelContainerImageConfigArgs> imageConfig) {
            $.imageConfig = imageConfig;
            return this;
        }

        public Builder imageConfig(ModelContainerImageConfigArgs imageConfig) {
            return imageConfig(Output.of(imageConfig));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder modelDataUrl(@Nullable Output<String> modelDataUrl) {
            $.modelDataUrl = modelDataUrl;
            return this;
        }

        public Builder modelDataUrl(String modelDataUrl) {
            return modelDataUrl(Output.of(modelDataUrl));
        }

        public ModelContainerArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            return $;
        }
    }

}
