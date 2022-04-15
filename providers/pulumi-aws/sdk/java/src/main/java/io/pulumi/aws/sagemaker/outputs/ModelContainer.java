// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.ModelContainerImageConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelContainer {
    /**
     * The DNS host name for the container.
     * 
     */
    private final @Nullable String containerHostname;
    /**
     * Environment variables for the Docker container.
     * A list of key value pairs.
     * 
     */
    private final @Nullable Map<String,String> environment;
    /**
     * The registry path where the inference code image is stored in Amazon ECR.
     * 
     */
    private final String image;
    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * 
     */
    private final @Nullable ModelContainerImageConfig imageConfig;
    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    private final @Nullable String mode;
    /**
     * The URL for the S3 location where model artifacts are stored.
     * 
     */
    private final @Nullable String modelDataUrl;

    @CustomType.Constructor
    private ModelContainer(
        @CustomType.Parameter("containerHostname") @Nullable String containerHostname,
        @CustomType.Parameter("environment") @Nullable Map<String,String> environment,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("imageConfig") @Nullable ModelContainerImageConfig imageConfig,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("modelDataUrl") @Nullable String modelDataUrl) {
        this.containerHostname = containerHostname;
        this.environment = environment;
        this.image = image;
        this.imageConfig = imageConfig;
        this.mode = mode;
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * The DNS host name for the container.
     * 
    */
    public Optional<String> containerHostname() {
        return Optional.ofNullable(this.containerHostname);
    }
    /**
     * Environment variables for the Docker container.
     * A list of key value pairs.
     * 
    */
    public Map<String,String> environment() {
        return this.environment == null ? Map.of() : this.environment;
    }
    /**
     * The registry path where the inference code image is stored in Amazon ECR.
     * 
    */
    public String image() {
        return this.image;
    }
    /**
     * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For more information see [Using a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html). see Image Config.
     * 
    */
    public Optional<ModelContainerImageConfig> imageConfig() {
        return Optional.ofNullable(this.imageConfig);
    }
    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The URL for the S3 location where model artifacts are stored.
     * 
    */
    public Optional<String> modelDataUrl() {
        return Optional.ofNullable(this.modelDataUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerHostname;
        private @Nullable Map<String,String> environment;
        private String image;
        private @Nullable ModelContainerImageConfig imageConfig;
        private @Nullable String mode;
        private @Nullable String modelDataUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerHostname = defaults.containerHostname;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.imageConfig = defaults.imageConfig;
    	      this.mode = defaults.mode;
    	      this.modelDataUrl = defaults.modelDataUrl;
        }

        public Builder containerHostname(@Nullable String containerHostname) {
            this.containerHostname = containerHostname;
            return this;
        }
        public Builder environment(@Nullable Map<String,String> environment) {
            this.environment = environment;
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder imageConfig(@Nullable ModelContainerImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder modelDataUrl(@Nullable String modelDataUrl) {
            this.modelDataUrl = modelDataUrl;
            return this;
        }        public ModelContainer build() {
            return new ModelContainer(containerHostname, environment, image, imageConfig, mode, modelDataUrl);
        }
    }
}
