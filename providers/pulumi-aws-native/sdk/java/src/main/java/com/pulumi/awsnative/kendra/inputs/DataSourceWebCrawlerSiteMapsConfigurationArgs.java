// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSourceWebCrawlerSiteMapsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerSiteMapsConfigurationArgs Empty = new DataSourceWebCrawlerSiteMapsConfigurationArgs();

    @Import(name="siteMaps", required=true)
    private Output<List<String>> siteMaps;

    public Output<List<String>> siteMaps() {
        return this.siteMaps;
    }

    private DataSourceWebCrawlerSiteMapsConfigurationArgs() {}

    private DataSourceWebCrawlerSiteMapsConfigurationArgs(DataSourceWebCrawlerSiteMapsConfigurationArgs $) {
        this.siteMaps = $.siteMaps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceWebCrawlerSiteMapsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceWebCrawlerSiteMapsConfigurationArgs $;

        public Builder() {
            $ = new DataSourceWebCrawlerSiteMapsConfigurationArgs();
        }

        public Builder(DataSourceWebCrawlerSiteMapsConfigurationArgs defaults) {
            $ = new DataSourceWebCrawlerSiteMapsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder siteMaps(Output<List<String>> siteMaps) {
            $.siteMaps = siteMaps;
            return this;
        }

        public Builder siteMaps(List<String> siteMaps) {
            return siteMaps(Output.of(siteMaps));
        }

        public Builder siteMaps(String... siteMaps) {
            return siteMaps(List.of(siteMaps));
        }

        public DataSourceWebCrawlerSiteMapsConfigurationArgs build() {
            $.siteMaps = Objects.requireNonNull($.siteMaps, "expected parameter 'siteMaps' to be non-null");
            return $;
        }
    }

}
