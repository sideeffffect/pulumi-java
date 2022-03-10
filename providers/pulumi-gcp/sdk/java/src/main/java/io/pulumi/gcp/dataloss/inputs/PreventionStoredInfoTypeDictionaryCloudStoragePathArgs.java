// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeDictionaryCloudStoragePathArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeDictionaryCloudStoragePathArgs Empty = new PreventionStoredInfoTypeDictionaryCloudStoragePathArgs();

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    public PreventionStoredInfoTypeDictionaryCloudStoragePathArgs(Input<String> path) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private PreventionStoredInfoTypeDictionaryCloudStoragePathArgs() {
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionaryCloudStoragePathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionaryCloudStoragePathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }
        public PreventionStoredInfoTypeDictionaryCloudStoragePathArgs build() {
            return new PreventionStoredInfoTypeDictionaryCloudStoragePathArgs(path);
        }
    }
}
