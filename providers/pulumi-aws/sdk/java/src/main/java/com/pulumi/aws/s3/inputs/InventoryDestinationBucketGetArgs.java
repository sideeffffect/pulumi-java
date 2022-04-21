// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InventoryDestinationBucketGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketGetArgs Empty = new InventoryDestinationBucketGetArgs();

    /**
     * The ID of the account that owns the destination bucket. Recommended to be set to prevent problems if the destination bucket ownership changes.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The Amazon S3 bucket ARN of the destination.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * Contains the type of server-side encryption to use to encrypt the inventory (documented below).
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<InventoryDestinationBucketEncryptionGetArgs> encryption;

    public Optional<Output<InventoryDestinationBucketEncryptionGetArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * Specifies the output format of the inventory results. Can be `CSV`, [`ORC`](https://orc.apache.org/) or [`Parquet`](https://parquet.apache.org/).
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }

    /**
     * The prefix that is prepended to all inventory results.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private InventoryDestinationBucketGetArgs() {}

    private InventoryDestinationBucketGetArgs(InventoryDestinationBucketGetArgs $) {
        this.accountId = $.accountId;
        this.bucketArn = $.bucketArn;
        this.encryption = $.encryption;
        this.format = $.format;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryDestinationBucketGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryDestinationBucketGetArgs $;

        public Builder() {
            $ = new InventoryDestinationBucketGetArgs();
        }

        public Builder(InventoryDestinationBucketGetArgs defaults) {
            $ = new InventoryDestinationBucketGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        public Builder encryption(@Nullable Output<InventoryDestinationBucketEncryptionGetArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        public Builder encryption(InventoryDestinationBucketEncryptionGetArgs encryption) {
            return encryption(Output.of(encryption));
        }

        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public InventoryDestinationBucketGetArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
