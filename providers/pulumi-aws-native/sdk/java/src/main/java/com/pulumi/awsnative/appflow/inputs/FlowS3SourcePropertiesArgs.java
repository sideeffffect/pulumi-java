// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowS3InputFormatConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3SourcePropertiesArgs extends ResourceArgs {

    public static final FlowS3SourcePropertiesArgs Empty = new FlowS3SourcePropertiesArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="bucketPrefix", required=true)
    private Output<String> bucketPrefix;

    public Output<String> bucketPrefix() {
        return this.bucketPrefix;
    }

    @Import(name="s3InputFormatConfig")
    private @Nullable Output<FlowS3InputFormatConfigArgs> s3InputFormatConfig;

    public Optional<Output<FlowS3InputFormatConfigArgs>> s3InputFormatConfig() {
        return Optional.ofNullable(this.s3InputFormatConfig);
    }

    private FlowS3SourcePropertiesArgs() {}

    private FlowS3SourcePropertiesArgs(FlowS3SourcePropertiesArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.s3InputFormatConfig = $.s3InputFormatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowS3SourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowS3SourcePropertiesArgs $;

        public Builder() {
            $ = new FlowS3SourcePropertiesArgs();
        }

        public Builder(FlowS3SourcePropertiesArgs defaults) {
            $ = new FlowS3SourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder bucketPrefix(Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public Builder s3InputFormatConfig(@Nullable Output<FlowS3InputFormatConfigArgs> s3InputFormatConfig) {
            $.s3InputFormatConfig = s3InputFormatConfig;
            return this;
        }

        public Builder s3InputFormatConfig(FlowS3InputFormatConfigArgs s3InputFormatConfig) {
            return s3InputFormatConfig(Output.of(s3InputFormatConfig));
        }

        public FlowS3SourcePropertiesArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.bucketPrefix = Objects.requireNonNull($.bucketPrefix, "expected parameter 'bucketPrefix' to be non-null");
            return $;
        }
    }

}
