// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationProductionVariantGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationState Empty = new EndpointConfigurationState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this endpoint configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Specifies configuration for how an endpoint performs asynchronous inference.
     * 
     */
    @Import(name="asyncInferenceConfig")
      private final @Nullable Output<EndpointConfigurationAsyncInferenceConfigGetArgs> asyncInferenceConfig;

    public Output<EndpointConfigurationAsyncInferenceConfigGetArgs> asyncInferenceConfig() {
        return this.asyncInferenceConfig == null ? Codegen.empty() : this.asyncInferenceConfig;
    }

    /**
     * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
     * 
     */
    @Import(name="dataCaptureConfig")
      private final @Nullable Output<EndpointConfigurationDataCaptureConfigGetArgs> dataCaptureConfig;

    public Output<EndpointConfigurationDataCaptureConfigGetArgs> dataCaptureConfig() {
        return this.dataCaptureConfig == null ? Codegen.empty() : this.dataCaptureConfig;
    }

    /**
     * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    /**
     * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Fields are documented below.
     * 
     */
    @Import(name="productionVariants")
      private final @Nullable Output<List<EndpointConfigurationProductionVariantGetArgs>> productionVariants;

    public Output<List<EndpointConfigurationProductionVariantGetArgs>> productionVariants() {
        return this.productionVariants == null ? Codegen.empty() : this.productionVariants;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public EndpointConfigurationState(
        @Nullable Output<String> arn,
        @Nullable Output<EndpointConfigurationAsyncInferenceConfigGetArgs> asyncInferenceConfig,
        @Nullable Output<EndpointConfigurationDataCaptureConfigGetArgs> dataCaptureConfig,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<String> name,
        @Nullable Output<List<EndpointConfigurationProductionVariantGetArgs>> productionVariants,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.asyncInferenceConfig = asyncInferenceConfig;
        this.dataCaptureConfig = dataCaptureConfig;
        this.kmsKeyArn = kmsKeyArn;
        this.name = name;
        this.productionVariants = productionVariants;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private EndpointConfigurationState() {
        this.arn = Codegen.empty();
        this.asyncInferenceConfig = Codegen.empty();
        this.dataCaptureConfig = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
        this.name = Codegen.empty();
        this.productionVariants = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<EndpointConfigurationAsyncInferenceConfigGetArgs> asyncInferenceConfig;
        private @Nullable Output<EndpointConfigurationDataCaptureConfigGetArgs> dataCaptureConfig;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<EndpointConfigurationProductionVariantGetArgs>> productionVariants;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.asyncInferenceConfig = defaults.asyncInferenceConfig;
    	      this.dataCaptureConfig = defaults.dataCaptureConfig;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.name = defaults.name;
    	      this.productionVariants = defaults.productionVariants;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder asyncInferenceConfig(@Nullable Output<EndpointConfigurationAsyncInferenceConfigGetArgs> asyncInferenceConfig) {
            this.asyncInferenceConfig = asyncInferenceConfig;
            return this;
        }
        public Builder asyncInferenceConfig(@Nullable EndpointConfigurationAsyncInferenceConfigGetArgs asyncInferenceConfig) {
            this.asyncInferenceConfig = Codegen.ofNullable(asyncInferenceConfig);
            return this;
        }
        public Builder dataCaptureConfig(@Nullable Output<EndpointConfigurationDataCaptureConfigGetArgs> dataCaptureConfig) {
            this.dataCaptureConfig = dataCaptureConfig;
            return this;
        }
        public Builder dataCaptureConfig(@Nullable EndpointConfigurationDataCaptureConfigGetArgs dataCaptureConfig) {
            this.dataCaptureConfig = Codegen.ofNullable(dataCaptureConfig);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder productionVariants(@Nullable Output<List<EndpointConfigurationProductionVariantGetArgs>> productionVariants) {
            this.productionVariants = productionVariants;
            return this;
        }
        public Builder productionVariants(@Nullable List<EndpointConfigurationProductionVariantGetArgs> productionVariants) {
            this.productionVariants = Codegen.ofNullable(productionVariants);
            return this;
        }
        public Builder productionVariants(EndpointConfigurationProductionVariantGetArgs... productionVariants) {
            return productionVariants(List.of(productionVariants));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public EndpointConfigurationState build() {
            return new EndpointConfigurationState(arn, asyncInferenceConfig, dataCaptureConfig, kmsKeyArn, name, productionVariants, tags, tagsAll);
        }
    }
}
