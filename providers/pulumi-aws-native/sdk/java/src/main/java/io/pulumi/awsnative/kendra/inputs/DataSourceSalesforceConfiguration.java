// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceChatterFeedConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceKnowledgeArticleConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectAttachmentConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceConfiguration Empty = new DataSourceSalesforceConfiguration();

    @InputImport(name="chatterFeedConfiguration")
      private final @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration;

    public Optional<DataSourceSalesforceChatterFeedConfiguration> getChatterFeedConfiguration() {
        return this.chatterFeedConfiguration == null ? Optional.empty() : Optional.ofNullable(this.chatterFeedConfiguration);
    }

    @InputImport(name="crawlAttachments")
      private final @Nullable Boolean crawlAttachments;

    public Optional<Boolean> getCrawlAttachments() {
        return this.crawlAttachments == null ? Optional.empty() : Optional.ofNullable(this.crawlAttachments);
    }

    @InputImport(name="excludeAttachmentFilePatterns")
      private final @Nullable List<String> excludeAttachmentFilePatterns;

    public List<String> getExcludeAttachmentFilePatterns() {
        return this.excludeAttachmentFilePatterns == null ? List.of() : this.excludeAttachmentFilePatterns;
    }

    @InputImport(name="includeAttachmentFilePatterns")
      private final @Nullable List<String> includeAttachmentFilePatterns;

    public List<String> getIncludeAttachmentFilePatterns() {
        return this.includeAttachmentFilePatterns == null ? List.of() : this.includeAttachmentFilePatterns;
    }

    @InputImport(name="knowledgeArticleConfiguration")
      private final @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;

    public Optional<DataSourceSalesforceKnowledgeArticleConfiguration> getKnowledgeArticleConfiguration() {
        return this.knowledgeArticleConfiguration == null ? Optional.empty() : Optional.ofNullable(this.knowledgeArticleConfiguration);
    }

    @InputImport(name="secretArn", required=true)
      private final String secretArn;

    public String getSecretArn() {
        return this.secretArn;
    }

    @InputImport(name="serverUrl", required=true)
      private final String serverUrl;

    public String getServerUrl() {
        return this.serverUrl;
    }

    @InputImport(name="standardObjectAttachmentConfiguration")
      private final @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;

    public Optional<DataSourceSalesforceStandardObjectAttachmentConfiguration> getStandardObjectAttachmentConfiguration() {
        return this.standardObjectAttachmentConfiguration == null ? Optional.empty() : Optional.ofNullable(this.standardObjectAttachmentConfiguration);
    }

    @InputImport(name="standardObjectConfigurations")
      private final @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations;

    public List<DataSourceSalesforceStandardObjectConfiguration> getStandardObjectConfigurations() {
        return this.standardObjectConfigurations == null ? List.of() : this.standardObjectConfigurations;
    }

    public DataSourceSalesforceConfiguration(
        @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration,
        @Nullable Boolean crawlAttachments,
        @Nullable List<String> excludeAttachmentFilePatterns,
        @Nullable List<String> includeAttachmentFilePatterns,
        @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration,
        String secretArn,
        String serverUrl,
        @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration,
        @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations) {
        this.chatterFeedConfiguration = chatterFeedConfiguration;
        this.crawlAttachments = crawlAttachments;
        this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
        this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.serverUrl = Objects.requireNonNull(serverUrl, "expected parameter 'serverUrl' to be non-null");
        this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
        this.standardObjectConfigurations = standardObjectConfigurations;
    }

    private DataSourceSalesforceConfiguration() {
        this.chatterFeedConfiguration = null;
        this.crawlAttachments = null;
        this.excludeAttachmentFilePatterns = List.of();
        this.includeAttachmentFilePatterns = List.of();
        this.knowledgeArticleConfiguration = null;
        this.secretArn = null;
        this.serverUrl = null;
        this.standardObjectAttachmentConfiguration = null;
        this.standardObjectConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration;
        private @Nullable Boolean crawlAttachments;
        private @Nullable List<String> excludeAttachmentFilePatterns;
        private @Nullable List<String> includeAttachmentFilePatterns;
        private @Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration;
        private String secretArn;
        private String serverUrl;
        private @Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration;
        private @Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chatterFeedConfiguration = defaults.chatterFeedConfiguration;
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.excludeAttachmentFilePatterns = defaults.excludeAttachmentFilePatterns;
    	      this.includeAttachmentFilePatterns = defaults.includeAttachmentFilePatterns;
    	      this.knowledgeArticleConfiguration = defaults.knowledgeArticleConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serverUrl = defaults.serverUrl;
    	      this.standardObjectAttachmentConfiguration = defaults.standardObjectAttachmentConfiguration;
    	      this.standardObjectConfigurations = defaults.standardObjectConfigurations;
        }

        public Builder chatterFeedConfiguration(@Nullable DataSourceSalesforceChatterFeedConfiguration chatterFeedConfiguration) {
            this.chatterFeedConfiguration = chatterFeedConfiguration;
            return this;
        }

        public Builder crawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder excludeAttachmentFilePatterns(@Nullable List<String> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder includeAttachmentFilePatterns(@Nullable List<String> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public Builder knowledgeArticleConfiguration(@Nullable DataSourceSalesforceKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
            this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder standardObjectAttachmentConfiguration(@Nullable DataSourceSalesforceStandardObjectAttachmentConfiguration standardObjectAttachmentConfiguration) {
            this.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
            return this;
        }

        public Builder standardObjectConfigurations(@Nullable List<DataSourceSalesforceStandardObjectConfiguration> standardObjectConfigurations) {
            this.standardObjectConfigurations = standardObjectConfigurations;
            return this;
        }
        public DataSourceSalesforceConfiguration build() {
            return new DataSourceSalesforceConfiguration(chatterFeedConfiguration, crawlAttachments, excludeAttachmentFilePatterns, includeAttachmentFilePatterns, knowledgeArticleConfiguration, secretArn, serverUrl, standardObjectAttachmentConfiguration, standardObjectConfigurations);
        }
    }
}
