// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs Empty = new BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs();

    /**
     * Specifies the replica ownership. For default and valid values, see [PUT bucket replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in the Amazon S3 API Reference. Valid values: `Destination`.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }

    private BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs() {}

    private BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs(BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs $) {
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs();
        }

        public Builder(BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs defaults) {
            $ = new BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public BucketReplicationConfigRuleDestinationAccessControlTranslationGetArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}
