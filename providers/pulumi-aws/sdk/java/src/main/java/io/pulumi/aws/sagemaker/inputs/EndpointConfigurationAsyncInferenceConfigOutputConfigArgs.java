// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs();

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig;

    public Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    /**
     * The Amazon S3 location to upload inference responses to.
     * 
     */
    @Import(name="s3OutputPath", required=true)
      private final Output<String> s3OutputPath;

    public Output<String> s3OutputPath() {
        return this.s3OutputPath;
    }

    public EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig,
        Output<String> s3OutputPath) {
        this.kmsKeyId = kmsKeyId;
        this.notificationConfig = notificationConfig;
        this.s3OutputPath = Objects.requireNonNull(s3OutputPath, "expected parameter 's3OutputPath' to be non-null");
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigArgs() {
        this.kmsKeyId = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.s3OutputPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig;
        private Output<String> s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder s3OutputPath(Output<String> s3OutputPath) {
            this.s3OutputPath = Objects.requireNonNull(s3OutputPath);
            return this;
        }
        public Builder s3OutputPath(String s3OutputPath) {
            this.s3OutputPath = Output.of(Objects.requireNonNull(s3OutputPath));
            return this;
        }        public EndpointConfigurationAsyncInferenceConfigOutputConfigArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(kmsKeyId, notificationConfig, s3OutputPath);
        }
    }
}
