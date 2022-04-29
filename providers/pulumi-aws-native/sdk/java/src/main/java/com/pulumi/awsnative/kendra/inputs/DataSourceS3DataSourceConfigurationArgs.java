// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceAccessControlListConfigurationArgs;
import com.pulumi.awsnative.kendra.inputs.DataSourceDocumentsMetadataConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * S3 data source configuration
 * 
 */
public final class DataSourceS3DataSourceConfigurationArgs extends ResourceArgs {

    public static final DataSourceS3DataSourceConfigurationArgs Empty = new DataSourceS3DataSourceConfigurationArgs();

    @Import(name="accessControlListConfiguration")
    private @Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration;

    public Optional<Output<DataSourceAccessControlListConfigurationArgs>> accessControlListConfiguration() {
        return Optional.ofNullable(this.accessControlListConfiguration);
    }

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="documentsMetadataConfiguration")
    private @Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration;

    public Optional<Output<DataSourceDocumentsMetadataConfigurationArgs>> documentsMetadataConfiguration() {
        return Optional.ofNullable(this.documentsMetadataConfiguration);
    }

    @Import(name="exclusionPatterns")
    private @Nullable Output<List<String>> exclusionPatterns;

    public Optional<Output<List<String>>> exclusionPatterns() {
        return Optional.ofNullable(this.exclusionPatterns);
    }

    @Import(name="inclusionPatterns")
    private @Nullable Output<List<String>> inclusionPatterns;

    public Optional<Output<List<String>>> inclusionPatterns() {
        return Optional.ofNullable(this.inclusionPatterns);
    }

    @Import(name="inclusionPrefixes")
    private @Nullable Output<List<String>> inclusionPrefixes;

    public Optional<Output<List<String>>> inclusionPrefixes() {
        return Optional.ofNullable(this.inclusionPrefixes);
    }

    private DataSourceS3DataSourceConfigurationArgs() {}

    private DataSourceS3DataSourceConfigurationArgs(DataSourceS3DataSourceConfigurationArgs $) {
        this.accessControlListConfiguration = $.accessControlListConfiguration;
        this.bucketName = $.bucketName;
        this.documentsMetadataConfiguration = $.documentsMetadataConfiguration;
        this.exclusionPatterns = $.exclusionPatterns;
        this.inclusionPatterns = $.inclusionPatterns;
        this.inclusionPrefixes = $.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceS3DataSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceS3DataSourceConfigurationArgs $;

        public Builder() {
            $ = new DataSourceS3DataSourceConfigurationArgs();
        }

        public Builder(DataSourceS3DataSourceConfigurationArgs defaults) {
            $ = new DataSourceS3DataSourceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessControlListConfiguration(@Nullable Output<DataSourceAccessControlListConfigurationArgs> accessControlListConfiguration) {
            $.accessControlListConfiguration = accessControlListConfiguration;
            return this;
        }

        public Builder accessControlListConfiguration(DataSourceAccessControlListConfigurationArgs accessControlListConfiguration) {
            return accessControlListConfiguration(Output.of(accessControlListConfiguration));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder documentsMetadataConfiguration(@Nullable Output<DataSourceDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration) {
            $.documentsMetadataConfiguration = documentsMetadataConfiguration;
            return this;
        }

        public Builder documentsMetadataConfiguration(DataSourceDocumentsMetadataConfigurationArgs documentsMetadataConfiguration) {
            return documentsMetadataConfiguration(Output.of(documentsMetadataConfiguration));
        }

        public Builder exclusionPatterns(@Nullable Output<List<String>> exclusionPatterns) {
            $.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder exclusionPatterns(List<String> exclusionPatterns) {
            return exclusionPatterns(Output.of(exclusionPatterns));
        }

        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }

        public Builder inclusionPatterns(@Nullable Output<List<String>> inclusionPatterns) {
            $.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder inclusionPatterns(List<String> inclusionPatterns) {
            return inclusionPatterns(Output.of(inclusionPatterns));
        }

        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }

        public Builder inclusionPrefixes(@Nullable Output<List<String>> inclusionPrefixes) {
            $.inclusionPrefixes = inclusionPrefixes;
            return this;
        }

        public Builder inclusionPrefixes(List<String> inclusionPrefixes) {
            return inclusionPrefixes(Output.of(inclusionPrefixes));
        }

        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }

        public DataSourceS3DataSourceConfigurationArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
