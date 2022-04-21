// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs();

    /**
     * The regex-filtered set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="regexFileSet")
    private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet;

    public Optional<Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs>> regexFileSet() {
        return Optional.ofNullable(this.regexFileSet);
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard
     * in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned
     * non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is
     * equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs $) {
        this.regexFileSet = $.regexFileSet;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder regexFileSet(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs> regexFileSet) {
            $.regexFileSet = regexFileSet;
            return this;
        }

        public Builder regexFileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs regexFileSet) {
            return regexFileSet(Output.of(regexFileSet));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs build() {
            return $;
        }
    }

}
