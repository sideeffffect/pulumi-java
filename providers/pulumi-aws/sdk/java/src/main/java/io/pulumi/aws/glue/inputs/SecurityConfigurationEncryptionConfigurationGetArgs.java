// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class SecurityConfigurationEncryptionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationGetArgs Empty = new SecurityConfigurationEncryptionConfigurationGetArgs();

    @Import(name="cloudwatchEncryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs> cloudwatchEncryption;

    public Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs> cloudwatchEncryption() {
        return this.cloudwatchEncryption;
    }

    @Import(name="jobBookmarksEncryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs> jobBookmarksEncryption;

    public Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs> jobBookmarksEncryption() {
        return this.jobBookmarksEncryption;
    }

    /**
     * A ` s3_encryption  ` block as described below, which contains encryption configuration for S3 data.
     * 
     */
    @Import(name="s3Encryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs> s3Encryption;

    public Output<SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs> s3Encryption() {
        return this.s3Encryption;
    }

    public SecurityConfigurationEncryptionConfigurationGetArgs(
        Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs> cloudwatchEncryption,
        Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs> jobBookmarksEncryption,
        Output<SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs> s3Encryption) {
        this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption, "expected parameter 'cloudwatchEncryption' to be non-null");
        this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption, "expected parameter 'jobBookmarksEncryption' to be non-null");
        this.s3Encryption = Objects.requireNonNull(s3Encryption, "expected parameter 's3Encryption' to be non-null");
    }

    private SecurityConfigurationEncryptionConfigurationGetArgs() {
        this.cloudwatchEncryption = Codegen.empty();
        this.jobBookmarksEncryption = Codegen.empty();
        this.s3Encryption = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs> cloudwatchEncryption;
        private Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs> jobBookmarksEncryption;
        private Output<SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs> s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryption = defaults.cloudwatchEncryption;
    	      this.jobBookmarksEncryption = defaults.jobBookmarksEncryption;
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder cloudwatchEncryption(Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs> cloudwatchEncryption) {
            this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption);
            return this;
        }
        public Builder cloudwatchEncryption(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs cloudwatchEncryption) {
            this.cloudwatchEncryption = Output.of(Objects.requireNonNull(cloudwatchEncryption));
            return this;
        }
        public Builder jobBookmarksEncryption(Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs> jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption);
            return this;
        }
        public Builder jobBookmarksEncryption(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionGetArgs jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Output.of(Objects.requireNonNull(jobBookmarksEncryption));
            return this;
        }
        public Builder s3Encryption(Output<SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs> s3Encryption) {
            this.s3Encryption = Objects.requireNonNull(s3Encryption);
            return this;
        }
        public Builder s3Encryption(SecurityConfigurationEncryptionConfigurationS3EncryptionGetArgs s3Encryption) {
            this.s3Encryption = Output.of(Objects.requireNonNull(s3Encryption));
            return this;
        }        public SecurityConfigurationEncryptionConfigurationGetArgs build() {
            return new SecurityConfigurationEncryptionConfigurationGetArgs(cloudwatchEncryption, jobBookmarksEncryption, s3Encryption);
        }
    }
}
