// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs();

    /**
     * The regex-filtered set of files to scan.
     * Structure is documented below.
     * 
     */
    @InputImport(name="regexFileSet")
      private final @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet;

    public Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> getRegexFileSet() {
        return this.regexFileSet == null ? Input.empty() : this.regexFileSet;
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs://<bucket>/<path>`. Trailing wildcard
     * in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned
     * non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is
     * equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(
        @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet,
        @Nullable Input<String> url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs() {
        this.regexFileSet = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder regexFileSet(@Nullable Input<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet) {
            this.regexFileSet = regexFileSet;
            return this;
        }

        public Builder regexFileSet(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs regexFileSet) {
            this.regexFileSet = Input.ofNullable(regexFileSet);
            return this;
        }

        public Builder url(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(regexFileSet, url);
        }
    }
}
