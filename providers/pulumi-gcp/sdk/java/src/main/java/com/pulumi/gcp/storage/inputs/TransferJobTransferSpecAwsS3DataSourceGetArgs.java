// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecAwsS3DataSourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAwsS3DataSourceGetArgs Empty = new TransferJobTransferSpecAwsS3DataSourceGetArgs();

    /**
     * AWS credentials block.
     * 
     */
    @Import(name="awsAccessKey")
    private @Nullable Output<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs> awsAccessKey;

    public Optional<Output<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs>> awsAccessKey() {
        return Optional.ofNullable(this.awsAccessKey);
    }

    /**
     * S3 Bucket name.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via &#39;AssumeRoleWithWebIdentity&#39;. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a &#39;AssumeRoleWithWebIdentity&#39; call for the provided role using the [GoogleServiceAccount][] for this project.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private TransferJobTransferSpecAwsS3DataSourceGetArgs() {}

    private TransferJobTransferSpecAwsS3DataSourceGetArgs(TransferJobTransferSpecAwsS3DataSourceGetArgs $) {
        this.awsAccessKey = $.awsAccessKey;
        this.bucketName = $.bucketName;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecAwsS3DataSourceGetArgs $;

        public Builder() {
            $ = new TransferJobTransferSpecAwsS3DataSourceGetArgs();
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceGetArgs defaults) {
            $ = new TransferJobTransferSpecAwsS3DataSourceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccessKey(@Nullable Output<TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs> awsAccessKey) {
            $.awsAccessKey = awsAccessKey;
            return this;
        }

        public Builder awsAccessKey(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs awsAccessKey) {
            return awsAccessKey(Output.of(awsAccessKey));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public TransferJobTransferSpecAwsS3DataSourceGetArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
