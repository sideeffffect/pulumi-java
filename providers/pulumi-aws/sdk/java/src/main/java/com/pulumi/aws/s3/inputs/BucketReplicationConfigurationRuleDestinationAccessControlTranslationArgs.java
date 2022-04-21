// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs Empty = new BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs();

    /**
     * The override value for the owner on replicated objects. Currently only `Destination` is supported.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }

    private BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs() {}

    private BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs(BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs $) {
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs $;

        public Builder() {
            $ = new BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs();
        }

        public Builder(BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs defaults) {
            $ = new BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs(Objects.requireNonNull(defaults));
        }

        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}
