// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationReferenceDataSourcesS3Args extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesS3Args Empty = new AnalyticsApplicationReferenceDataSourcesS3Args();

    /**
     * The S3 Bucket ARN.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * The File Key name containing reference data.
     * 
     */
    @Import(name="fileKey", required=true)
    private Output<String> fileKey;

    public Output<String> fileKey() {
        return this.fileKey;
    }

    /**
     * The ARN of the IAM Role used to send application messages.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private AnalyticsApplicationReferenceDataSourcesS3Args() {}

    private AnalyticsApplicationReferenceDataSourcesS3Args(AnalyticsApplicationReferenceDataSourcesS3Args $) {
        this.bucketArn = $.bucketArn;
        this.fileKey = $.fileKey;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsApplicationReferenceDataSourcesS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationReferenceDataSourcesS3Args $;

        public Builder() {
            $ = new AnalyticsApplicationReferenceDataSourcesS3Args();
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesS3Args defaults) {
            $ = new AnalyticsApplicationReferenceDataSourcesS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        public Builder fileKey(Output<String> fileKey) {
            $.fileKey = fileKey;
            return this;
        }

        public Builder fileKey(String fileKey) {
            return fileKey(Output.of(fileKey));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public AnalyticsApplicationReferenceDataSourcesS3Args build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.fileKey = Objects.requireNonNull($.fileKey, "expected parameter 'fileKey' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
