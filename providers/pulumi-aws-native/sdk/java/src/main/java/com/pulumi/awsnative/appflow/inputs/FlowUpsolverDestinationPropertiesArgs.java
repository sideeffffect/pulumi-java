// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowUpsolverS3OutputFormatConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowUpsolverDestinationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowUpsolverDestinationPropertiesArgs Empty = new FlowUpsolverDestinationPropertiesArgs();

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

    @Import(name="s3OutputFormatConfig", required=true)
    private Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig;

    public Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig() {
        return this.s3OutputFormatConfig;
    }

    private FlowUpsolverDestinationPropertiesArgs() {}

    private FlowUpsolverDestinationPropertiesArgs(FlowUpsolverDestinationPropertiesArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.s3OutputFormatConfig = $.s3OutputFormatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowUpsolverDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowUpsolverDestinationPropertiesArgs $;

        public Builder() {
            $ = new FlowUpsolverDestinationPropertiesArgs();
        }

        public Builder(FlowUpsolverDestinationPropertiesArgs defaults) {
            $ = new FlowUpsolverDestinationPropertiesArgs(Objects.requireNonNull(defaults));
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

        public Builder s3OutputFormatConfig(Output<FlowUpsolverS3OutputFormatConfigArgs> s3OutputFormatConfig) {
            $.s3OutputFormatConfig = s3OutputFormatConfig;
            return this;
        }

        public Builder s3OutputFormatConfig(FlowUpsolverS3OutputFormatConfigArgs s3OutputFormatConfig) {
            return s3OutputFormatConfig(Output.of(s3OutputFormatConfig));
        }

        public FlowUpsolverDestinationPropertiesArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.s3OutputFormatConfig = Objects.requireNonNull($.s3OutputFormatConfig, "expected parameter 's3OutputFormatConfig' to be non-null");
            return $;
        }
    }

}
