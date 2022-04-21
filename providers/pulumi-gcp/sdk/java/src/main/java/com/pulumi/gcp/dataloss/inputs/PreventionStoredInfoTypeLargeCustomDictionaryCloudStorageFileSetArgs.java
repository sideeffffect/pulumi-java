// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs();

    /**
     * The url, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard in the path is allowed.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs() {}

    private PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs $;

        public Builder() {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs();
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs defaults) {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
