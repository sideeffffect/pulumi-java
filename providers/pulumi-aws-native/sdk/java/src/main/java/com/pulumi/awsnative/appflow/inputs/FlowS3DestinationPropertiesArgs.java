// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowS3OutputFormatConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3DestinationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowS3DestinationPropertiesArgs Empty = new FlowS3DestinationPropertiesArgs();

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

    @Import(name="s3OutputFormatConfig")
    private @Nullable Output<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig;

    public Optional<Output<FlowS3OutputFormatConfigArgs>> s3OutputFormatConfig() {
        return Optional.ofNullable(this.s3OutputFormatConfig);
    }

    private FlowS3DestinationPropertiesArgs() {}

    private FlowS3DestinationPropertiesArgs(FlowS3DestinationPropertiesArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.s3OutputFormatConfig = $.s3OutputFormatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowS3DestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowS3DestinationPropertiesArgs $;

        public Builder() {
            $ = new FlowS3DestinationPropertiesArgs();
        }

        public Builder(FlowS3DestinationPropertiesArgs defaults) {
            $ = new FlowS3DestinationPropertiesArgs(Objects.requireNonNull(defaults));
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

        public Builder s3OutputFormatConfig(@Nullable Output<FlowS3OutputFormatConfigArgs> s3OutputFormatConfig) {
            $.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }

        public Builder s3OutputFormatConfig(FlowS3OutputFormatConfigArgs s3OutputFormatConfig) {
            return s3OutputFormatConfig(Output.of(s3OutputFormatConfig));
        }

        public FlowS3DestinationPropertiesArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
