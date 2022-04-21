// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceConfluenceConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceDatabaseConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceGoogleDriveConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceOneDriveConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceS3DataSourceConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceServiceNowConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceSharePointConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerConfiguration;
import com.pulumi.awsnative.kendra.inputs.DataSourceWorkDocsConfiguration;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceConfiguration Empty = new DataSourceConfiguration();

    @Import(name="confluenceConfiguration")
    private @Nullable DataSourceConfluenceConfiguration confluenceConfiguration;

    public Optional<DataSourceConfluenceConfiguration> confluenceConfiguration() {
        return Optional.ofNullable(this.confluenceConfiguration);
    }

    @Import(name="databaseConfiguration")
    private @Nullable DataSourceDatabaseConfiguration databaseConfiguration;

    public Optional<DataSourceDatabaseConfiguration> databaseConfiguration() {
        return Optional.ofNullable(this.databaseConfiguration);
    }

    @Import(name="googleDriveConfiguration")
    private @Nullable DataSourceGoogleDriveConfiguration googleDriveConfiguration;

    public Optional<DataSourceGoogleDriveConfiguration> googleDriveConfiguration() {
        return Optional.ofNullable(this.googleDriveConfiguration);
    }

    @Import(name="oneDriveConfiguration")
    private @Nullable DataSourceOneDriveConfiguration oneDriveConfiguration;

    public Optional<DataSourceOneDriveConfiguration> oneDriveConfiguration() {
        return Optional.ofNullable(this.oneDriveConfiguration);
    }

    @Import(name="s3Configuration")
    private @Nullable DataSourceS3DataSourceConfiguration s3Configuration;

    public Optional<DataSourceS3DataSourceConfiguration> s3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }

    @Import(name="salesforceConfiguration")
    private @Nullable DataSourceSalesforceConfiguration salesforceConfiguration;

    public Optional<DataSourceSalesforceConfiguration> salesforceConfiguration() {
        return Optional.ofNullable(this.salesforceConfiguration);
    }

    @Import(name="serviceNowConfiguration")
    private @Nullable DataSourceServiceNowConfiguration serviceNowConfiguration;

    public Optional<DataSourceServiceNowConfiguration> serviceNowConfiguration() {
        return Optional.ofNullable(this.serviceNowConfiguration);
    }

    @Import(name="sharePointConfiguration")
    private @Nullable DataSourceSharePointConfiguration sharePointConfiguration;

    public Optional<DataSourceSharePointConfiguration> sharePointConfiguration() {
        return Optional.ofNullable(this.sharePointConfiguration);
    }

    @Import(name="webCrawlerConfiguration")
    private @Nullable DataSourceWebCrawlerConfiguration webCrawlerConfiguration;

    public Optional<DataSourceWebCrawlerConfiguration> webCrawlerConfiguration() {
        return Optional.ofNullable(this.webCrawlerConfiguration);
    }

    @Import(name="workDocsConfiguration")
    private @Nullable DataSourceWorkDocsConfiguration workDocsConfiguration;

    public Optional<DataSourceWorkDocsConfiguration> workDocsConfiguration() {
        return Optional.ofNullable(this.workDocsConfiguration);
    }

    private DataSourceConfiguration() {}

    private DataSourceConfiguration(DataSourceConfiguration $) {
        this.confluenceConfiguration = $.confluenceConfiguration;
        this.databaseConfiguration = $.databaseConfiguration;
        this.googleDriveConfiguration = $.googleDriveConfiguration;
        this.oneDriveConfiguration = $.oneDriveConfiguration;
        this.s3Configuration = $.s3Configuration;
        this.salesforceConfiguration = $.salesforceConfiguration;
        this.serviceNowConfiguration = $.serviceNowConfiguration;
        this.sharePointConfiguration = $.sharePointConfiguration;
        this.webCrawlerConfiguration = $.webCrawlerConfiguration;
        this.workDocsConfiguration = $.workDocsConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfiguration $;

        public Builder() {
            $ = new DataSourceConfiguration();
        }

        public Builder(DataSourceConfiguration defaults) {
            $ = new DataSourceConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder confluenceConfiguration(@Nullable DataSourceConfluenceConfiguration confluenceConfiguration) {
            $.confluenceConfiguration = confluenceConfiguration;
            return this;
        }

        public Builder databaseConfiguration(@Nullable DataSourceDatabaseConfiguration databaseConfiguration) {
            $.databaseConfiguration = databaseConfiguration;
            return this;
        }

        public Builder googleDriveConfiguration(@Nullable DataSourceGoogleDriveConfiguration googleDriveConfiguration) {
            $.googleDriveConfiguration = googleDriveConfiguration;
            return this;
        }

        public Builder oneDriveConfiguration(@Nullable DataSourceOneDriveConfiguration oneDriveConfiguration) {
            $.oneDriveConfiguration = oneDriveConfiguration;
            return this;
        }

        public Builder s3Configuration(@Nullable DataSourceS3DataSourceConfiguration s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        public Builder salesforceConfiguration(@Nullable DataSourceSalesforceConfiguration salesforceConfiguration) {
            $.salesforceConfiguration = salesforceConfiguration;
            return this;
        }

        public Builder serviceNowConfiguration(@Nullable DataSourceServiceNowConfiguration serviceNowConfiguration) {
            $.serviceNowConfiguration = serviceNowConfiguration;
            return this;
        }

        public Builder sharePointConfiguration(@Nullable DataSourceSharePointConfiguration sharePointConfiguration) {
            $.sharePointConfiguration = sharePointConfiguration;
            return this;
        }

        public Builder webCrawlerConfiguration(@Nullable DataSourceWebCrawlerConfiguration webCrawlerConfiguration) {
            $.webCrawlerConfiguration = webCrawlerConfiguration;
            return this;
        }

        public Builder workDocsConfiguration(@Nullable DataSourceWorkDocsConfiguration workDocsConfiguration) {
            $.workDocsConfiguration = workDocsConfiguration;
            return this;
        }

        public DataSourceConfiguration build() {
            return $;
        }
    }

}
