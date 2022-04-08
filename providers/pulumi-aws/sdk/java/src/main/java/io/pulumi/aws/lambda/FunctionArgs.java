// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.asset.Archive;
import io.pulumi.aws.lambda.enums.Runtime;
import io.pulumi.aws.lambda.inputs.FunctionDeadLetterConfigArgs;
import io.pulumi.aws.lambda.inputs.FunctionEnvironmentArgs;
import io.pulumi.aws.lambda.inputs.FunctionFileSystemConfigArgs;
import io.pulumi.aws.lambda.inputs.FunctionImageConfigArgs;
import io.pulumi.aws.lambda.inputs.FunctionTracingConfigArgs;
import io.pulumi.aws.lambda.inputs.FunctionVpcConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * Instruction set architecture for your Lambda function. Valid values are `["x86_64"]` and `["arm64"]`. Default is `["x86_64"]`. Removing this attribute, function's architecture stay the same.
     * 
     */
    @Import(name="architectures")
      private final @Nullable Output<List<String>> architectures;

    public Output<List<String>> getArchitectures() {
        return this.architectures == null ? Output.empty() : this.architectures;
    }

    /**
     * Path to the function's deployment package within the local filesystem. Conflicts with `image_uri`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<Archive> code;

    public Output<Archive> getCode() {
        return this.code == null ? Output.empty() : this.code;
    }

    /**
     * To enable code signing for this function, specify the ARN of a code-signing configuration. A code-signing configuration includes a set of signing profiles, which define the trusted publishers for this function.
     * 
     */
    @Import(name="codeSigningConfigArn")
      private final @Nullable Output<String> codeSigningConfigArn;

    public Output<String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn == null ? Output.empty() : this.codeSigningConfigArn;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="deadLetterConfig")
      private final @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig;

    public Output<FunctionDeadLetterConfigArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Output.empty() : this.deadLetterConfig;
    }

    /**
     * Description of what your Lambda Function does.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<FunctionEnvironmentArgs> environment;

    public Output<FunctionEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="fileSystemConfig")
      private final @Nullable Output<FunctionFileSystemConfigArgs> fileSystemConfig;

    public Output<FunctionFileSystemConfigArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Output.empty() : this.fileSystemConfig;
    }

    /**
     * Function [entrypoint](https://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events-create-test-function.html) in your code.
     * 
     */
    @Import(name="handler")
      private final @Nullable Output<String> handler;

    public Output<String> getHandler() {
        return this.handler == null ? Output.empty() : this.handler;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="imageConfig")
      private final @Nullable Output<FunctionImageConfigArgs> imageConfig;

    public Output<FunctionImageConfigArgs> getImageConfig() {
        return this.imageConfig == null ? Output.empty() : this.imageConfig;
    }

    /**
     * ECR image URI containing the function's deployment package. Conflicts with `filename`, `s3_bucket`, `s3_key`, and `s3_object_version`.
     * 
     */
    @Import(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> getImageUri() {
        return this.imageUri == null ? Output.empty() : this.imageUri;
    }

    /**
     * Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key that is used to encrypt environment variables. If this configuration is not provided when environment variables are in use, AWS Lambda uses a default service key. If this configuration is provided when environment variables are not in use, the AWS Lambda API does not save this configuration and the provider will show a perpetual difference of adding the key. To fix the perpetual difference, remove this configuration.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
     * 
     */
    @Import(name="layers")
      private final @Nullable Output<List<String>> layers;

    public Output<List<String>> getLayers() {
        return this.layers == null ? Output.empty() : this.layers;
    }

    /**
     * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
     * 
     */
    @Import(name="memorySize")
      private final @Nullable Output<Integer> memorySize;

    public Output<Integer> getMemorySize() {
        return this.memorySize == null ? Output.empty() : this.memorySize;
    }

    /**
     * Unique name for your Lambda Function.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Lambda deployment package type. Valid values are `Zip` and `Image`. Defaults to `Zip`.
     * 
     */
    @Import(name="packageType")
      private final @Nullable Output<String> packageType;

    public Output<String> getPackageType() {
        return this.packageType == null ? Output.empty() : this.packageType;
    }

    /**
     * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
     * 
     */
    @Import(name="publish")
      private final @Nullable Output<Boolean> publish;

    public Output<Boolean> getPublish() {
        return this.publish == null ? Output.empty() : this.publish;
    }

    /**
     * Amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
     * 
     */
    @Import(name="reservedConcurrentExecutions")
      private final @Nullable Output<Integer> reservedConcurrentExecutions;

    public Output<Integer> getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions == null ? Output.empty() : this.reservedConcurrentExecutions;
    }

    /**
     * Amazon Resource Name (ARN) of the function's execution role. The role provides the function's identity and access to AWS services and resources.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Identifier of the function's runtime. See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html#SSS-CreateFunction-request-Runtime) for valid values.
     * 
     */
    @Import(name="runtime")
      private final @Nullable Output<Either<String,Runtime>> runtime;

    public Output<Either<String,Runtime>> getRuntime() {
        return this.runtime == null ? Output.empty() : this.runtime;
    }

    /**
     * S3 bucket location containing the function's deployment package. Conflicts with `filename` and `image_uri`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @Import(name="s3Bucket")
      private final @Nullable Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket == null ? Output.empty() : this.s3Bucket;
    }

    /**
     * S3 key of an object containing the function's deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @Import(name="s3Key")
      private final @Nullable Output<String> s3Key;

    public Output<String> getS3Key() {
        return this.s3Key == null ? Output.empty() : this.s3Key;
    }

    /**
     * Object version containing the function's deployment package. Conflicts with `filename` and `image_uri`.
     * 
     */
    @Import(name="s3ObjectVersion")
      private final @Nullable Output<String> s3ObjectVersion;

    public Output<String> getS3ObjectVersion() {
        return this.s3ObjectVersion == null ? Output.empty() : this.s3ObjectVersion;
    }

    /**
     * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `filebase64sha256("file.zip")`, where "file.zip" is the local filename of the lambda function source archive.
     * 
     */
    @Import(name="sourceCodeHash")
      private final @Nullable Output<String> sourceCodeHash;

    public Output<String> getSourceCodeHash() {
        return this.sourceCodeHash == null ? Output.empty() : this.sourceCodeHash;
    }

    /**
     * Map of tags to assign to the object.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html).
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="tracingConfig")
      private final @Nullable Output<FunctionTracingConfigArgs> tracingConfig;

    public Output<FunctionTracingConfigArgs> getTracingConfig() {
        return this.tracingConfig == null ? Output.empty() : this.tracingConfig;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<FunctionVpcConfigArgs> vpcConfig;

    public Output<FunctionVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public FunctionArgs(
        @Nullable Output<List<String>> architectures,
        @Nullable Output<Archive> code,
        @Nullable Output<String> codeSigningConfigArn,
        @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig,
        @Nullable Output<String> description,
        @Nullable Output<FunctionEnvironmentArgs> environment,
        @Nullable Output<FunctionFileSystemConfigArgs> fileSystemConfig,
        @Nullable Output<String> handler,
        @Nullable Output<FunctionImageConfigArgs> imageConfig,
        @Nullable Output<String> imageUri,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<List<String>> layers,
        @Nullable Output<Integer> memorySize,
        @Nullable Output<String> name,
        @Nullable Output<String> packageType,
        @Nullable Output<Boolean> publish,
        @Nullable Output<Integer> reservedConcurrentExecutions,
        Output<String> role,
        @Nullable Output<Either<String,Runtime>> runtime,
        @Nullable Output<String> s3Bucket,
        @Nullable Output<String> s3Key,
        @Nullable Output<String> s3ObjectVersion,
        @Nullable Output<String> sourceCodeHash,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> timeout,
        @Nullable Output<FunctionTracingConfigArgs> tracingConfig,
        @Nullable Output<FunctionVpcConfigArgs> vpcConfig) {
        this.architectures = architectures;
        this.code = code;
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfig = fileSystemConfig;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.imageUri = imageUri;
        this.kmsKeyArn = kmsKeyArn;
        this.layers = layers;
        this.memorySize = memorySize;
        this.name = name;
        this.packageType = packageType;
        this.publish = publish;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.runtime = runtime;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.sourceCodeHash = sourceCodeHash;
        this.tags = tags;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.vpcConfig = vpcConfig;
    }

    private FunctionArgs() {
        this.architectures = Output.empty();
        this.code = Output.empty();
        this.codeSigningConfigArn = Output.empty();
        this.deadLetterConfig = Output.empty();
        this.description = Output.empty();
        this.environment = Output.empty();
        this.fileSystemConfig = Output.empty();
        this.handler = Output.empty();
        this.imageConfig = Output.empty();
        this.imageUri = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.layers = Output.empty();
        this.memorySize = Output.empty();
        this.name = Output.empty();
        this.packageType = Output.empty();
        this.publish = Output.empty();
        this.reservedConcurrentExecutions = Output.empty();
        this.role = Output.empty();
        this.runtime = Output.empty();
        this.s3Bucket = Output.empty();
        this.s3Key = Output.empty();
        this.s3ObjectVersion = Output.empty();
        this.sourceCodeHash = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
        this.tracingConfig = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> architectures;
        private @Nullable Output<Archive> code;
        private @Nullable Output<String> codeSigningConfigArn;
        private @Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig;
        private @Nullable Output<String> description;
        private @Nullable Output<FunctionEnvironmentArgs> environment;
        private @Nullable Output<FunctionFileSystemConfigArgs> fileSystemConfig;
        private @Nullable Output<String> handler;
        private @Nullable Output<FunctionImageConfigArgs> imageConfig;
        private @Nullable Output<String> imageUri;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<List<String>> layers;
        private @Nullable Output<Integer> memorySize;
        private @Nullable Output<String> name;
        private @Nullable Output<String> packageType;
        private @Nullable Output<Boolean> publish;
        private @Nullable Output<Integer> reservedConcurrentExecutions;
        private Output<String> role;
        private @Nullable Output<Either<String,Runtime>> runtime;
        private @Nullable Output<String> s3Bucket;
        private @Nullable Output<String> s3Key;
        private @Nullable Output<String> s3ObjectVersion;
        private @Nullable Output<String> sourceCodeHash;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<FunctionTracingConfigArgs> tracingConfig;
        private @Nullable Output<FunctionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.code = defaults.code;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.handler = defaults.handler;
    	      this.imageConfig = defaults.imageConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.name = defaults.name;
    	      this.packageType = defaults.packageType;
    	      this.publish = defaults.publish;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder architectures(@Nullable Output<List<String>> architectures) {
            this.architectures = architectures;
            return this;
        }
        public Builder architectures(@Nullable List<String> architectures) {
            this.architectures = Output.ofNullable(architectures);
            return this;
        }
        public Builder architectures(String... architectures) {
            return architectures(List.of(architectures));
        }
        public Builder code(@Nullable Output<Archive> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable Archive code) {
            this.code = Output.ofNullable(code);
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable Output<String> codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = Output.ofNullable(codeSigningConfigArn);
            return this;
        }
        public Builder deadLetterConfig(@Nullable Output<FunctionDeadLetterConfigArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }
        public Builder deadLetterConfig(@Nullable FunctionDeadLetterConfigArgs deadLetterConfig) {
            this.deadLetterConfig = Output.ofNullable(deadLetterConfig);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder environment(@Nullable Output<FunctionEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable FunctionEnvironmentArgs environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }
        public Builder fileSystemConfig(@Nullable Output<FunctionFileSystemConfigArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder fileSystemConfig(@Nullable FunctionFileSystemConfigArgs fileSystemConfig) {
            this.fileSystemConfig = Output.ofNullable(fileSystemConfig);
            return this;
        }
        public Builder handler(@Nullable Output<String> handler) {
            this.handler = handler;
            return this;
        }
        public Builder handler(@Nullable String handler) {
            this.handler = Output.ofNullable(handler);
            return this;
        }
        public Builder imageConfig(@Nullable Output<FunctionImageConfigArgs> imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public Builder imageConfig(@Nullable FunctionImageConfigArgs imageConfig) {
            this.imageConfig = Output.ofNullable(imageConfig);
            return this;
        }
        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Output.ofNullable(imageUri);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder layers(@Nullable Output<List<String>> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(@Nullable List<String> layers) {
            this.layers = Output.ofNullable(layers);
            return this;
        }
        public Builder layers(String... layers) {
            return layers(List.of(layers));
        }
        public Builder memorySize(@Nullable Output<Integer> memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Builder memorySize(@Nullable Integer memorySize) {
            this.memorySize = Output.ofNullable(memorySize);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder packageType(@Nullable Output<String> packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder packageType(@Nullable String packageType) {
            this.packageType = Output.ofNullable(packageType);
            return this;
        }
        public Builder publish(@Nullable Output<Boolean> publish) {
            this.publish = publish;
            return this;
        }
        public Builder publish(@Nullable Boolean publish) {
            this.publish = Output.ofNullable(publish);
            return this;
        }
        public Builder reservedConcurrentExecutions(@Nullable Output<Integer> reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }
        public Builder reservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = Output.ofNullable(reservedConcurrentExecutions);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder runtime(@Nullable Output<Either<String,Runtime>> runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder runtime(@Nullable Either<String,Runtime> runtime) {
            this.runtime = Output.ofNullable(runtime);
            return this;
        }
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Output.ofNullable(s3Bucket);
            return this;
        }
        public Builder s3Key(@Nullable Output<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }
        public Builder s3Key(@Nullable String s3Key) {
            this.s3Key = Output.ofNullable(s3Key);
            return this;
        }
        public Builder s3ObjectVersion(@Nullable Output<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }
        public Builder s3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Output.ofNullable(s3ObjectVersion);
            return this;
        }
        public Builder sourceCodeHash(@Nullable Output<String> sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }
        public Builder sourceCodeHash(@Nullable String sourceCodeHash) {
            this.sourceCodeHash = Output.ofNullable(sourceCodeHash);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder tracingConfig(@Nullable Output<FunctionTracingConfigArgs> tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }
        public Builder tracingConfig(@Nullable FunctionTracingConfigArgs tracingConfig) {
            this.tracingConfig = Output.ofNullable(tracingConfig);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<FunctionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable FunctionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }        public FunctionArgs build() {
            return new FunctionArgs(architectures, code, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfig, handler, imageConfig, imageUri, kmsKeyArn, layers, memorySize, name, packageType, publish, reservedConcurrentExecutions, role, runtime, s3Bucket, s3Key, s3ObjectVersion, sourceCodeHash, tags, timeout, tracingConfig, vpcConfig);
        }
    }
}
