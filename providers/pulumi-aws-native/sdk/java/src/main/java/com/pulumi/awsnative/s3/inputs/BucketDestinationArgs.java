// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketDestinationFormat;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
 * 
 */
public final class BucketDestinationArgs extends ResourceArgs {

    public static final BucketDestinationArgs Empty = new BucketDestinationArgs();

    /**
     * The account ID that owns the destination S3 bucket.
     * 
     */
    @Import(name="bucketAccountId")
    private @Nullable Output<String> bucketAccountId;

    /**
     * @return The account ID that owns the destination S3 bucket.
     * 
     */
    public Optional<Output<String>> bucketAccountId() {
        return Optional.ofNullable(this.bucketAccountId);
    }

    /**
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    /**
     * @return The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * 
     */
    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * Specifies the file format used when exporting data to Amazon S3.
     * 
     */
    @Import(name="format", required=true)
    private Output<BucketDestinationFormat> format;

    /**
     * @return Specifies the file format used when exporting data to Amazon S3.
     * 
     */
    public Output<BucketDestinationFormat> format() {
        return this.format;
    }

    /**
     * The prefix to use when exporting data. The prefix is prepended to all results.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The prefix to use when exporting data. The prefix is prepended to all results.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private BucketDestinationArgs() {}

    private BucketDestinationArgs(BucketDestinationArgs $) {
        this.bucketAccountId = $.bucketAccountId;
        this.bucketArn = $.bucketArn;
        this.format = $.format;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketDestinationArgs $;

        public Builder() {
            $ = new BucketDestinationArgs();
        }

        public Builder(BucketDestinationArgs defaults) {
            $ = new BucketDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketAccountId The account ID that owns the destination S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccountId(@Nullable Output<String> bucketAccountId) {
            $.bucketAccountId = bucketAccountId;
            return this;
        }

        /**
         * @param bucketAccountId The account ID that owns the destination S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketAccountId(String bucketAccountId) {
            return bucketAccountId(Output.of(bucketAccountId));
        }

        /**
         * @param bucketArn The Amazon Resource Name (ARN) of the bucket to which data is exported.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        /**
         * @param bucketArn The Amazon Resource Name (ARN) of the bucket to which data is exported.
         * 
         * @return builder
         * 
         */
        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        /**
         * @param format Specifies the file format used when exporting data to Amazon S3.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<BucketDestinationFormat> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Specifies the file format used when exporting data to Amazon S3.
         * 
         * @return builder
         * 
         */
        public Builder format(BucketDestinationFormat format) {
            return format(Output.of(format));
        }

        /**
         * @param prefix The prefix to use when exporting data. The prefix is prepended to all results.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The prefix to use when exporting data. The prefix is prepended to all results.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public BucketDestinationArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
