// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceDocumentsMetadataConfigurationArgs extends ResourceArgs {

    public static final DataSourceDocumentsMetadataConfigurationArgs Empty = new DataSourceDocumentsMetadataConfigurationArgs();

    @Import(name="s3Prefix")
    private @Nullable Output<String> s3Prefix;

    public Optional<Output<String>> s3Prefix() {
        return Optional.ofNullable(this.s3Prefix);
    }

    private DataSourceDocumentsMetadataConfigurationArgs() {}

    private DataSourceDocumentsMetadataConfigurationArgs(DataSourceDocumentsMetadataConfigurationArgs $) {
        this.s3Prefix = $.s3Prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceDocumentsMetadataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceDocumentsMetadataConfigurationArgs $;

        public Builder() {
            $ = new DataSourceDocumentsMetadataConfigurationArgs();
        }

        public Builder(DataSourceDocumentsMetadataConfigurationArgs defaults) {
            $ = new DataSourceDocumentsMetadataConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Prefix(@Nullable Output<String> s3Prefix) {
            $.s3Prefix = s3Prefix;
            return this;
        }

        public Builder s3Prefix(String s3Prefix) {
            return s3Prefix(Output.of(s3Prefix));
        }

        public DataSourceDocumentsMetadataConfigurationArgs build() {
            return $;
        }
    }

}
