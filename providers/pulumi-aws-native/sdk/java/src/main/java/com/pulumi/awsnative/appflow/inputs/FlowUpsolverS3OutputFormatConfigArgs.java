// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.enums.FlowFileType;
import com.pulumi.awsnative.appflow.inputs.FlowAggregationConfigArgs;
import com.pulumi.awsnative.appflow.inputs.FlowPrefixConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowUpsolverS3OutputFormatConfigArgs extends ResourceArgs {

    public static final FlowUpsolverS3OutputFormatConfigArgs Empty = new FlowUpsolverS3OutputFormatConfigArgs();

    @Import(name="aggregationConfig")
    private @Nullable Output<FlowAggregationConfigArgs> aggregationConfig;

    public Optional<Output<FlowAggregationConfigArgs>> aggregationConfig() {
        return Optional.ofNullable(this.aggregationConfig);
    }

    @Import(name="fileType")
    private @Nullable Output<FlowFileType> fileType;

    public Optional<Output<FlowFileType>> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    @Import(name="prefixConfig", required=true)
    private Output<FlowPrefixConfigArgs> prefixConfig;

    public Output<FlowPrefixConfigArgs> prefixConfig() {
        return this.prefixConfig;
    }

    private FlowUpsolverS3OutputFormatConfigArgs() {}

    private FlowUpsolverS3OutputFormatConfigArgs(FlowUpsolverS3OutputFormatConfigArgs $) {
        this.aggregationConfig = $.aggregationConfig;
        this.fileType = $.fileType;
        this.prefixConfig = $.prefixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowUpsolverS3OutputFormatConfigArgs $;

        public Builder() {
            $ = new FlowUpsolverS3OutputFormatConfigArgs();
        }

        public Builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
            $ = new FlowUpsolverS3OutputFormatConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregationConfig(@Nullable Output<FlowAggregationConfigArgs> aggregationConfig) {
            $.aggregationConfig = aggregationConfig;
            return this;
        }

        public Builder aggregationConfig(FlowAggregationConfigArgs aggregationConfig) {
            return aggregationConfig(Output.of(aggregationConfig));
        }

        public Builder fileType(@Nullable Output<FlowFileType> fileType) {
            $.fileType = fileType;
            return this;
        }

        public Builder fileType(FlowFileType fileType) {
            return fileType(Output.of(fileType));
        }

        public Builder prefixConfig(Output<FlowPrefixConfigArgs> prefixConfig) {
            $.prefixConfig = prefixConfig;
            return this;
        }

        public Builder prefixConfig(FlowPrefixConfigArgs prefixConfig) {
            return prefixConfig(Output.of(prefixConfig));
        }

        public FlowUpsolverS3OutputFormatConfigArgs build() {
            $.prefixConfig = Objects.requireNonNull($.prefixConfig, "expected parameter 'prefixConfig' to be non-null");
            return $;
        }
    }

}
