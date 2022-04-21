// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInfrastructureConfigurationLoggingS3Log extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationLoggingS3Log Empty = new GetInfrastructureConfigurationLoggingS3Log();

    /**
     * Name of the S3 Bucket for logging.
     * 
     */
    @Import(name="s3BucketName", required=true)
    private String s3BucketName;

    public String s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * Key prefix for S3 Bucket logging.
     * 
     */
    @Import(name="s3KeyPrefix", required=true)
    private String s3KeyPrefix;

    public String s3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    private GetInfrastructureConfigurationLoggingS3Log() {}

    private GetInfrastructureConfigurationLoggingS3Log(GetInfrastructureConfigurationLoggingS3Log $) {
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureConfigurationLoggingS3Log $;

        public Builder() {
            $ = new GetInfrastructureConfigurationLoggingS3Log();
        }

        public Builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
            $ = new GetInfrastructureConfigurationLoggingS3Log(Objects.requireNonNull(defaults));
        }

        public Builder s3BucketName(String s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3KeyPrefix(String s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public GetInfrastructureConfigurationLoggingS3Log build() {
            $.s3BucketName = Objects.requireNonNull($.s3BucketName, "expected parameter 's3BucketName' to be non-null");
            $.s3KeyPrefix = Objects.requireNonNull($.s3KeyPrefix, "expected parameter 's3KeyPrefix' to be non-null");
            return $;
        }
    }

}
