// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container image configuration object for the monitoring job.
 * 
 */
public final class ModelBiasJobDefinitionModelBiasAppSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelBiasJobDefinitionModelBiasAppSpecificationArgs Empty = new ModelBiasJobDefinitionModelBiasAppSpecificationArgs();

    /**
     * The S3 URI to an analysis configuration file
     * 
     */
    @Import(name="configUri", required=true)
    private Output<String> configUri;

    public Output<String> configUri() {
        return this.configUri;
    }

    /**
     * Sets the environment variables in the Docker container
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Object> environment;

    public Optional<Output<Object>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The container image to be run by the monitoring job.
     * 
     */
    @Import(name="imageUri", required=true)
    private Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri;
    }

    private ModelBiasJobDefinitionModelBiasAppSpecificationArgs() {}

    private ModelBiasJobDefinitionModelBiasAppSpecificationArgs(ModelBiasJobDefinitionModelBiasAppSpecificationArgs $) {
        this.configUri = $.configUri;
        this.environment = $.environment;
        this.imageUri = $.imageUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelBiasJobDefinitionModelBiasAppSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionModelBiasAppSpecificationArgs $;

        public Builder() {
            $ = new ModelBiasJobDefinitionModelBiasAppSpecificationArgs();
        }

        public Builder(ModelBiasJobDefinitionModelBiasAppSpecificationArgs defaults) {
            $ = new ModelBiasJobDefinitionModelBiasAppSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder configUri(Output<String> configUri) {
            $.configUri = configUri;
            return this;
        }

        public Builder configUri(String configUri) {
            return configUri(Output.of(configUri));
        }

        public Builder environment(@Nullable Output<Object> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(Object environment) {
            return environment(Output.of(environment));
        }

        public Builder imageUri(Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public ModelBiasJobDefinitionModelBiasAppSpecificationArgs build() {
            $.configUri = Objects.requireNonNull($.configUri, "expected parameter 'configUri' to be non-null");
            $.imageUri = Objects.requireNonNull($.imageUri, "expected parameter 'imageUri' to be non-null");
            return $;
        }
    }

}
