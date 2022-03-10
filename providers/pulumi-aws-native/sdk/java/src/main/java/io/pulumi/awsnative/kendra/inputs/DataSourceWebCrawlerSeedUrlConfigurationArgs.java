// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerSeedUrlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerSeedUrlConfigurationArgs Empty = new DataSourceWebCrawlerSeedUrlConfigurationArgs();

    @InputImport(name="seedUrls", required=true)
      private final Input<List<String>> seedUrls;

    public Input<List<String>> getSeedUrls() {
        return this.seedUrls;
    }

    @InputImport(name="webCrawlerMode")
      private final @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> webCrawlerMode;

    public Input<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> getWebCrawlerMode() {
        return this.webCrawlerMode == null ? Input.empty() : this.webCrawlerMode;
    }

    public DataSourceWebCrawlerSeedUrlConfigurationArgs(
        Input<List<String>> seedUrls,
        @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> webCrawlerMode) {
        this.seedUrls = Objects.requireNonNull(seedUrls, "expected parameter 'seedUrls' to be non-null");
        this.webCrawlerMode = webCrawlerMode;
    }

    private DataSourceWebCrawlerSeedUrlConfigurationArgs() {
        this.seedUrls = Input.empty();
        this.webCrawlerMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerSeedUrlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> seedUrls;
        private @Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> webCrawlerMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerSeedUrlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.seedUrls = defaults.seedUrls;
    	      this.webCrawlerMode = defaults.webCrawlerMode;
        }

        public Builder seedUrls(Input<List<String>> seedUrls) {
            this.seedUrls = Objects.requireNonNull(seedUrls);
            return this;
        }

        public Builder seedUrls(List<String> seedUrls) {
            this.seedUrls = Input.of(Objects.requireNonNull(seedUrls));
            return this;
        }

        public Builder webCrawlerMode(@Nullable Input<DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode> webCrawlerMode) {
            this.webCrawlerMode = webCrawlerMode;
            return this;
        }

        public Builder webCrawlerMode(@Nullable DataSourceWebCrawlerSeedUrlConfigurationWebCrawlerMode webCrawlerMode) {
            this.webCrawlerMode = Input.ofNullable(webCrawlerMode);
            return this;
        }
        public DataSourceWebCrawlerSeedUrlConfigurationArgs build() {
            return new DataSourceWebCrawlerSeedUrlConfigurationArgs(seedUrls, webCrawlerMode);
        }
    }
}
