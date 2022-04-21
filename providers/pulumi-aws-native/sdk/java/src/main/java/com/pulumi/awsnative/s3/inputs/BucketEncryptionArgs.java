// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketServerSideEncryptionRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Specifies default encryption for a bucket using server-side encryption with either Amazon S3-managed keys (SSE-S3) or AWS KMS-managed keys (SSE-KMS).
 * 
 */
public final class BucketEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketEncryptionArgs Empty = new BucketEncryptionArgs();

    /**
     * Specifies the default server-side-encryption configuration.
     * 
     */
    @Import(name="serverSideEncryptionConfiguration", required=true)
    private Output<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration;

    public Output<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    private BucketEncryptionArgs() {}

    private BucketEncryptionArgs(BucketEncryptionArgs $) {
        this.serverSideEncryptionConfiguration = $.serverSideEncryptionConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketEncryptionArgs $;

        public Builder() {
            $ = new BucketEncryptionArgs();
        }

        public Builder(BucketEncryptionArgs defaults) {
            $ = new BucketEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder serverSideEncryptionConfiguration(Output<List<BucketServerSideEncryptionRuleArgs>> serverSideEncryptionConfiguration) {
            $.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder serverSideEncryptionConfiguration(List<BucketServerSideEncryptionRuleArgs> serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(Output.of(serverSideEncryptionConfiguration));
        }

        public Builder serverSideEncryptionConfiguration(BucketServerSideEncryptionRuleArgs... serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(List.of(serverSideEncryptionConfiguration));
        }

        public BucketEncryptionArgs build() {
            $.serverSideEncryptionConfiguration = Objects.requireNonNull($.serverSideEncryptionConfiguration, "expected parameter 'serverSideEncryptionConfiguration' to be non-null");
            return $;
        }
    }

}
