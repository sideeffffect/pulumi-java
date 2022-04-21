// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A structure that contains information about where and how to deliver your reports, specifically your Amazon S3 bucket name, S3 key prefix, and the formats of your reports.
 * 
 */
public final class ReportDeliveryChannelProperties extends com.pulumi.resources.InvokeArgs {

    public static final ReportDeliveryChannelProperties Empty = new ReportDeliveryChannelProperties();

    /**
     * A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
     * 
     */
    @Import(name="formats")
    private @Nullable List<String> formats;

    public Optional<List<String>> formats() {
        return Optional.ofNullable(this.formats);
    }

    /**
     * The unique name of the S3 bucket that receives your reports.
     * 
     */
    @Import(name="s3BucketName", required=true)
    private String s3BucketName;

    public String s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * The prefix for where AWS Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
     * 
     */
    @Import(name="s3KeyPrefix")
    private @Nullable String s3KeyPrefix;

    public Optional<String> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    private ReportDeliveryChannelProperties() {}

    private ReportDeliveryChannelProperties(ReportDeliveryChannelProperties $) {
        this.formats = $.formats;
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportDeliveryChannelProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDeliveryChannelProperties $;

        public Builder() {
            $ = new ReportDeliveryChannelProperties();
        }

        public Builder(ReportDeliveryChannelProperties defaults) {
            $ = new ReportDeliveryChannelProperties(Objects.requireNonNull(defaults));
        }

        public Builder formats(@Nullable List<String> formats) {
            $.formats = formats;
            return this;
        }

        public Builder formats(String... formats) {
            return formats(List.of(formats));
        }

        public Builder s3BucketName(String s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public ReportDeliveryChannelProperties build() {
            $.s3BucketName = Objects.requireNonNull($.s3BucketName, "expected parameter 's3BucketName' to be non-null");
            return $;
        }
    }

}
