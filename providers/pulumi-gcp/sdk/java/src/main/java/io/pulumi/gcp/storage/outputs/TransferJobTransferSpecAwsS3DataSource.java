// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.storage.outputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKey;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferJobTransferSpecAwsS3DataSource {
    /**
     * AWS credentials block.
     * 
     */
    private final @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey;
    /**
     * S3 Bucket name.
     * 
     */
    private final String bucketName;
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via 'AssumeRoleWithWebIdentity'. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a 'AssumeRoleWithWebIdentity' call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
     */
    private final @Nullable String roleArn;

    @OutputCustomType.Constructor({"awsAccessKey","bucketName","roleArn"})
    private TransferJobTransferSpecAwsS3DataSource(
        @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey,
        String bucketName,
        @Nullable String roleArn) {
        this.awsAccessKey = awsAccessKey;
        this.bucketName = bucketName;
        this.roleArn = roleArn;
    }

    /**
     * AWS credentials block.
     * 
    */
    public Optional<TransferJobTransferSpecAwsS3DataSourceAwsAccessKey> getAwsAccessKey() {
        return Optional.ofNullable(this.awsAccessKey);
    }
    /**
     * S3 Bucket name.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via 'AssumeRoleWithWebIdentity'. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a 'AssumeRoleWithWebIdentity' call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey;
        private String bucketName;
        private @Nullable String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAwsAccessKey(@Nullable TransferJobTransferSpecAwsS3DataSourceAwsAccessKey awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public TransferJobTransferSpecAwsS3DataSource build() {
            return new TransferJobTransferSpecAwsS3DataSource(awsAccessKey, bucketName, roleArn);
        }
    }
}
