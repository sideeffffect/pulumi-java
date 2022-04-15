// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationAsyncInferenceConfigOutputConfig {
    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * 
     */
    private final @Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig;
    /**
     * The Amazon S3 location to upload inference responses to.
     * 
     */
    private final String s3OutputPath;

    @CustomType.Constructor
    private EndpointConfigurationAsyncInferenceConfigOutputConfig(
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("notificationConfig") @Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig,
        @CustomType.Parameter("s3OutputPath") String s3OutputPath) {
        this.kmsKeyId = kmsKeyId;
        this.notificationConfig = notificationConfig;
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
    */
    public Optional<String> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * 
    */
    public Optional<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }
    /**
     * The Amazon S3 location to upload inference responses to.
     * 
    */
    public String s3OutputPath() {
        return this.s3OutputPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig;
        private String s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder notificationConfig(@Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfig notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder s3OutputPath(String s3OutputPath) {
            this.s3OutputPath = Objects.requireNonNull(s3OutputPath);
            return this;
        }        public EndpointConfigurationAsyncInferenceConfigOutputConfig build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfig(kmsKeyId, notificationConfig, s3OutputPath);
        }
    }
}
