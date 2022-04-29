// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterLoggingPropertiesArgs extends ResourceArgs {

    public static final ClusterLoggingPropertiesArgs Empty = new ClusterLoggingPropertiesArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="s3KeyPrefix")
    private @Nullable Output<String> s3KeyPrefix;

    public Optional<Output<String>> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    private ClusterLoggingPropertiesArgs() {}

    private ClusterLoggingPropertiesArgs(ClusterLoggingPropertiesArgs $) {
        this.bucketName = $.bucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterLoggingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterLoggingPropertiesArgs $;

        public Builder() {
            $ = new ClusterLoggingPropertiesArgs();
        }

        public Builder(ClusterLoggingPropertiesArgs defaults) {
            $ = new ClusterLoggingPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3KeyPrefix(String s3KeyPrefix) {
            return s3KeyPrefix(Output.of(s3KeyPrefix));
        }

        public ClusterLoggingPropertiesArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
