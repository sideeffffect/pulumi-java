// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.enums.DataSourceSalesforceKnowledgeArticleState;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceKnowledgeArticleConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceKnowledgeArticleConfiguration Empty = new DataSourceSalesforceKnowledgeArticleConfiguration();

    @Import(name="customKnowledgeArticleTypeConfigurations")
    private @Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations;

    public Optional<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration>> customKnowledgeArticleTypeConfigurations() {
        return Optional.ofNullable(this.customKnowledgeArticleTypeConfigurations);
    }

    @Import(name="includedStates", required=true)
    private List<DataSourceSalesforceKnowledgeArticleState> includedStates;

    public List<DataSourceSalesforceKnowledgeArticleState> includedStates() {
        return this.includedStates;
    }

    @Import(name="standardKnowledgeArticleTypeConfiguration")
    private @Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration;

    public Optional<DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration> standardKnowledgeArticleTypeConfiguration() {
        return Optional.ofNullable(this.standardKnowledgeArticleTypeConfiguration);
    }

    private DataSourceSalesforceKnowledgeArticleConfiguration() {}

    private DataSourceSalesforceKnowledgeArticleConfiguration(DataSourceSalesforceKnowledgeArticleConfiguration $) {
        this.customKnowledgeArticleTypeConfigurations = $.customKnowledgeArticleTypeConfigurations;
        this.includedStates = $.includedStates;
        this.standardKnowledgeArticleTypeConfiguration = $.standardKnowledgeArticleTypeConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSalesforceKnowledgeArticleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSalesforceKnowledgeArticleConfiguration $;

        public Builder() {
            $ = new DataSourceSalesforceKnowledgeArticleConfiguration();
        }

        public Builder(DataSourceSalesforceKnowledgeArticleConfiguration defaults) {
            $ = new DataSourceSalesforceKnowledgeArticleConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder customKnowledgeArticleTypeConfigurations(@Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration> customKnowledgeArticleTypeConfigurations) {
            $.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
            return this;
        }

        public Builder customKnowledgeArticleTypeConfigurations(DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration... customKnowledgeArticleTypeConfigurations) {
            return customKnowledgeArticleTypeConfigurations(List.of(customKnowledgeArticleTypeConfigurations));
        }

        public Builder includedStates(List<DataSourceSalesforceKnowledgeArticleState> includedStates) {
            $.includedStates = includedStates;
            return this;
        }

        public Builder includedStates(DataSourceSalesforceKnowledgeArticleState... includedStates) {
            return includedStates(List.of(includedStates));
        }

        public Builder standardKnowledgeArticleTypeConfiguration(@Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration standardKnowledgeArticleTypeConfiguration) {
            $.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
            return this;
        }

        public DataSourceSalesforceKnowledgeArticleConfiguration build() {
            $.includedStates = Objects.requireNonNull($.includedStates, "expected parameter 'includedStates' to be non-null");
            return $;
        }
    }

}
