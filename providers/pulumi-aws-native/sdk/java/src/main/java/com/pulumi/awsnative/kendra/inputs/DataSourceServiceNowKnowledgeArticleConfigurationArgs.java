// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceServiceNowKnowledgeArticleConfigurationArgs extends ResourceArgs {

    public static final DataSourceServiceNowKnowledgeArticleConfigurationArgs Empty = new DataSourceServiceNowKnowledgeArticleConfigurationArgs();

    @Import(name="crawlAttachments")
    private @Nullable Output<Boolean> crawlAttachments;

    public Optional<Output<Boolean>> crawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }

    @Import(name="documentDataFieldName", required=true)
    private Output<String> documentDataFieldName;

    public Output<String> documentDataFieldName() {
        return this.documentDataFieldName;
    }

    @Import(name="documentTitleFieldName")
    private @Nullable Output<String> documentTitleFieldName;

    public Optional<Output<String>> documentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }

    @Import(name="excludeAttachmentFilePatterns")
    private @Nullable Output<List<String>> excludeAttachmentFilePatterns;

    public Optional<Output<List<String>>> excludeAttachmentFilePatterns() {
        return Optional.ofNullable(this.excludeAttachmentFilePatterns);
    }

    @Import(name="fieldMappings")
    private @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Optional<Output<List<DataSourceToIndexFieldMappingArgs>>> fieldMappings() {
        return Optional.ofNullable(this.fieldMappings);
    }

    @Import(name="filterQuery")
    private @Nullable Output<String> filterQuery;

    public Optional<Output<String>> filterQuery() {
        return Optional.ofNullable(this.filterQuery);
    }

    @Import(name="includeAttachmentFilePatterns")
    private @Nullable Output<List<String>> includeAttachmentFilePatterns;

    public Optional<Output<List<String>>> includeAttachmentFilePatterns() {
        return Optional.ofNullable(this.includeAttachmentFilePatterns);
    }

    private DataSourceServiceNowKnowledgeArticleConfigurationArgs() {}

    private DataSourceServiceNowKnowledgeArticleConfigurationArgs(DataSourceServiceNowKnowledgeArticleConfigurationArgs $) {
        this.crawlAttachments = $.crawlAttachments;
        this.documentDataFieldName = $.documentDataFieldName;
        this.documentTitleFieldName = $.documentTitleFieldName;
        this.excludeAttachmentFilePatterns = $.excludeAttachmentFilePatterns;
        this.fieldMappings = $.fieldMappings;
        this.filterQuery = $.filterQuery;
        this.includeAttachmentFilePatterns = $.includeAttachmentFilePatterns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceServiceNowKnowledgeArticleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceServiceNowKnowledgeArticleConfigurationArgs $;

        public Builder() {
            $ = new DataSourceServiceNowKnowledgeArticleConfigurationArgs();
        }

        public Builder(DataSourceServiceNowKnowledgeArticleConfigurationArgs defaults) {
            $ = new DataSourceServiceNowKnowledgeArticleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder crawlAttachments(@Nullable Output<Boolean> crawlAttachments) {
            $.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder crawlAttachments(Boolean crawlAttachments) {
            return crawlAttachments(Output.of(crawlAttachments));
        }

        public Builder documentDataFieldName(Output<String> documentDataFieldName) {
            $.documentDataFieldName = documentDataFieldName;
            return this;
        }

        public Builder documentDataFieldName(String documentDataFieldName) {
            return documentDataFieldName(Output.of(documentDataFieldName));
        }

        public Builder documentTitleFieldName(@Nullable Output<String> documentTitleFieldName) {
            $.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder documentTitleFieldName(String documentTitleFieldName) {
            return documentTitleFieldName(Output.of(documentTitleFieldName));
        }

        public Builder excludeAttachmentFilePatterns(@Nullable Output<List<String>> excludeAttachmentFilePatterns) {
            $.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder excludeAttachmentFilePatterns(List<String> excludeAttachmentFilePatterns) {
            return excludeAttachmentFilePatterns(Output.of(excludeAttachmentFilePatterns));
        }

        public Builder excludeAttachmentFilePatterns(String... excludeAttachmentFilePatterns) {
            return excludeAttachmentFilePatterns(List.of(excludeAttachmentFilePatterns));
        }

        public Builder fieldMappings(@Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            $.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            return fieldMappings(Output.of(fieldMappings));
        }

        public Builder fieldMappings(DataSourceToIndexFieldMappingArgs... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }

        public Builder filterQuery(@Nullable Output<String> filterQuery) {
            $.filterQuery = filterQuery;
            return this;
        }

        public Builder filterQuery(String filterQuery) {
            return filterQuery(Output.of(filterQuery));
        }

        public Builder includeAttachmentFilePatterns(@Nullable Output<List<String>> includeAttachmentFilePatterns) {
            $.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public Builder includeAttachmentFilePatterns(List<String> includeAttachmentFilePatterns) {
            return includeAttachmentFilePatterns(Output.of(includeAttachmentFilePatterns));
        }

        public Builder includeAttachmentFilePatterns(String... includeAttachmentFilePatterns) {
            return includeAttachmentFilePatterns(List.of(includeAttachmentFilePatterns));
        }

        public DataSourceServiceNowKnowledgeArticleConfigurationArgs build() {
            $.documentDataFieldName = Objects.requireNonNull($.documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
            return $;
        }
    }

}
