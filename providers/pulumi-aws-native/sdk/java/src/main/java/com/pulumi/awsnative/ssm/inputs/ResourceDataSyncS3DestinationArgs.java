// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDataSyncS3DestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncS3DestinationArgs Empty = new ResourceDataSyncS3DestinationArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    @Import(name="bucketRegion", required=true)
    private Output<String> bucketRegion;

    public Output<String> bucketRegion() {
        return this.bucketRegion;
    }

    @Import(name="kMSKeyArn")
    private @Nullable Output<String> kMSKeyArn;

    public Optional<Output<String>> kMSKeyArn() {
        return Optional.ofNullable(this.kMSKeyArn);
    }

    @Import(name="syncFormat", required=true)
    private Output<String> syncFormat;

    public Output<String> syncFormat() {
        return this.syncFormat;
    }

    private ResourceDataSyncS3DestinationArgs() {}

    private ResourceDataSyncS3DestinationArgs(ResourceDataSyncS3DestinationArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.bucketRegion = $.bucketRegion;
        this.kMSKeyArn = $.kMSKeyArn;
        this.syncFormat = $.syncFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDataSyncS3DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDataSyncS3DestinationArgs $;

        public Builder() {
            $ = new ResourceDataSyncS3DestinationArgs();
        }

        public Builder(ResourceDataSyncS3DestinationArgs defaults) {
            $ = new ResourceDataSyncS3DestinationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public Builder bucketRegion(Output<String> bucketRegion) {
            $.bucketRegion = bucketRegion;
            return this;
        }

        public Builder bucketRegion(String bucketRegion) {
            return bucketRegion(Output.of(bucketRegion));
        }

        public Builder kMSKeyArn(@Nullable Output<String> kMSKeyArn) {
            $.kMSKeyArn = kMSKeyArn;
            return this;
        }

        public Builder kMSKeyArn(String kMSKeyArn) {
            return kMSKeyArn(Output.of(kMSKeyArn));
        }

        public Builder syncFormat(Output<String> syncFormat) {
            $.syncFormat = syncFormat;
            return this;
        }

        public Builder syncFormat(String syncFormat) {
            return syncFormat(Output.of(syncFormat));
        }

        public ResourceDataSyncS3DestinationArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.bucketRegion = Objects.requireNonNull($.bucketRegion, "expected parameter 'bucketRegion' to be non-null");
            $.syncFormat = Objects.requireNonNull($.syncFormat, "expected parameter 'syncFormat' to be non-null");
            return $;
        }
    }

}
