// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketDestinationFormat;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies information about where to publish analysis or configuration results for an Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
 * 
 */
public final class BucketDestination extends io.pulumi.resources.InvokeArgs {

    public static final BucketDestination Empty = new BucketDestination();

    /**
     * The account ID that owns the destination S3 bucket.
     * 
     */
    @InputImport(name="bucketAccountId")
      private final @Nullable String bucketAccountId;

    public Optional<String> getBucketAccountId() {
        return this.bucketAccountId == null ? Optional.empty() : Optional.ofNullable(this.bucketAccountId);
    }

    /**
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     * 
     */
    @InputImport(name="bucketArn", required=true)
      private final String bucketArn;

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * Specifies the file format used when exporting data to Amazon S3.
     * 
     */
    @InputImport(name="format", required=true)
      private final BucketDestinationFormat format;

    public BucketDestinationFormat getFormat() {
        return this.format;
    }

    /**
     * The prefix to use when exporting data. The prefix is prepended to all results.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    public BucketDestination(
        @Nullable String bucketAccountId,
        String bucketArn,
        BucketDestinationFormat format,
        @Nullable String prefix) {
        this.bucketAccountId = bucketAccountId;
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.prefix = prefix;
    }

    private BucketDestination() {
        this.bucketAccountId = null;
        this.bucketArn = null;
        this.format = null;
        this.prefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketAccountId;
        private String bucketArn;
        private BucketDestinationFormat format;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccountId = defaults.bucketAccountId;
    	      this.bucketArn = defaults.bucketArn;
    	      this.format = defaults.format;
    	      this.prefix = defaults.prefix;
        }

        public Builder bucketAccountId(@Nullable String bucketAccountId) {
            this.bucketAccountId = bucketAccountId;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }

        public Builder format(BucketDestinationFormat format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public BucketDestination build() {
            return new BucketDestination(bucketAccountId, bucketArn, format, prefix);
        }
    }
}
