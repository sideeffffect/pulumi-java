// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs();

    /**
     * The url, in the format `gs://<bucket>/<path>`. Trailing wildcard in the path is allowed.
     * 
     */
    @InputImport(name="url", required=true)
      private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs(Input<String> url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder url(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetGetArgs(url);
        }
    }
}
