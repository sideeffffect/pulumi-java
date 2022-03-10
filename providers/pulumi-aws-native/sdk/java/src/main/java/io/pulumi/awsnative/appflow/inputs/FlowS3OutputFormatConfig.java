// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowFileType;
import io.pulumi.awsnative.appflow.inputs.FlowAggregationConfig;
import io.pulumi.awsnative.appflow.inputs.FlowPrefixConfig;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3OutputFormatConfig extends io.pulumi.resources.InvokeArgs {

    public static final FlowS3OutputFormatConfig Empty = new FlowS3OutputFormatConfig();

    @InputImport(name="aggregationConfig")
      private final @Nullable FlowAggregationConfig aggregationConfig;

    public Optional<FlowAggregationConfig> getAggregationConfig() {
        return this.aggregationConfig == null ? Optional.empty() : Optional.ofNullable(this.aggregationConfig);
    }

    @InputImport(name="fileType")
      private final @Nullable FlowFileType fileType;

    public Optional<FlowFileType> getFileType() {
        return this.fileType == null ? Optional.empty() : Optional.ofNullable(this.fileType);
    }

    @InputImport(name="prefixConfig")
      private final @Nullable FlowPrefixConfig prefixConfig;

    public Optional<FlowPrefixConfig> getPrefixConfig() {
        return this.prefixConfig == null ? Optional.empty() : Optional.ofNullable(this.prefixConfig);
    }

    public FlowS3OutputFormatConfig(
        @Nullable FlowAggregationConfig aggregationConfig,
        @Nullable FlowFileType fileType,
        @Nullable FlowPrefixConfig prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = prefixConfig;
    }

    private FlowS3OutputFormatConfig() {
        this.aggregationConfig = null;
        this.fileType = null;
        this.prefixConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3OutputFormatConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAggregationConfig aggregationConfig;
        private @Nullable FlowFileType fileType;
        private @Nullable FlowPrefixConfig prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3OutputFormatConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder aggregationConfig(@Nullable FlowAggregationConfig aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }

        public Builder fileType(@Nullable FlowFileType fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder prefixConfig(@Nullable FlowPrefixConfig prefixConfig) {
            this.prefixConfig = prefixConfig;
            return this;
        }
        public FlowS3OutputFormatConfig build() {
            return new FlowS3OutputFormatConfig(aggregationConfig, fileType, prefixConfig);
        }
    }
}
