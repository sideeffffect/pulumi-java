// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.StorageLensCloudWatchMetricsArgs;
import com.pulumi.awsnative.s3.inputs.StorageLensS3BucketDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies how Amazon S3 Storage Lens metrics should be exported.
 * 
 */
public final class StorageLensDataExportArgs extends ResourceArgs {

    public static final StorageLensDataExportArgs Empty = new StorageLensDataExportArgs();

    @Import(name="cloudWatchMetrics")
    private @Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics;

    public Optional<Output<StorageLensCloudWatchMetricsArgs>> cloudWatchMetrics() {
        return Optional.ofNullable(this.cloudWatchMetrics);
    }

    @Import(name="s3BucketDestination")
    private @Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination;

    public Optional<Output<StorageLensS3BucketDestinationArgs>> s3BucketDestination() {
        return Optional.ofNullable(this.s3BucketDestination);
    }

    private StorageLensDataExportArgs() {}

    private StorageLensDataExportArgs(StorageLensDataExportArgs $) {
        this.cloudWatchMetrics = $.cloudWatchMetrics;
        this.s3BucketDestination = $.s3BucketDestination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensDataExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensDataExportArgs $;

        public Builder() {
            $ = new StorageLensDataExportArgs();
        }

        public Builder(StorageLensDataExportArgs defaults) {
            $ = new StorageLensDataExportArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudWatchMetrics(@Nullable Output<StorageLensCloudWatchMetricsArgs> cloudWatchMetrics) {
            $.cloudWatchMetrics = cloudWatchMetrics;
            return this;
        }

        public Builder cloudWatchMetrics(StorageLensCloudWatchMetricsArgs cloudWatchMetrics) {
            return cloudWatchMetrics(Output.of(cloudWatchMetrics));
        }

        public Builder s3BucketDestination(@Nullable Output<StorageLensS3BucketDestinationArgs> s3BucketDestination) {
            $.s3BucketDestination = s3BucketDestination;
            return this;
        }

        public Builder s3BucketDestination(StorageLensS3BucketDestinationArgs s3BucketDestination) {
            return s3BucketDestination(Output.of(s3BucketDestination));
        }

        public StorageLensDataExportArgs build() {
            return $;
        }
    }

}
