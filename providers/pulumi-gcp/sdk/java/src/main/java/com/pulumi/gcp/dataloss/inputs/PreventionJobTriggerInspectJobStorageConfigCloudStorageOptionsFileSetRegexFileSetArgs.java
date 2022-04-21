// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs();

    /**
     * The name of a Cloud Storage bucket.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at
     * least one of these regular expressions will be excluded from the scan.
     * 
     */
    @Import(name="excludeRegexes")
    private @Nullable Output<List<String>> excludeRegexes;

    public Optional<Output<List<String>>> excludeRegexes() {
        return Optional.ofNullable(this.excludeRegexes);
    }

    /**
     * A list of regular expressions matching file paths to include. All files in the bucket
     * that match at least one of these regular expressions will be included in the set of files,
     * except for those that also match an item in excludeRegex. Leaving this field empty will
     * match all files by default (this is equivalent to including .* in the list)
     * 
     */
    @Import(name="includeRegexes")
    private @Nullable Output<List<String>> includeRegexes;

    public Optional<Output<List<String>>> includeRegexes() {
        return Optional.ofNullable(this.includeRegexes);
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs $) {
        this.bucketName = $.bucketName;
        this.excludeRegexes = $.excludeRegexes;
        this.includeRegexes = $.includeRegexes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder excludeRegexes(@Nullable Output<List<String>> excludeRegexes) {
            $.excludeRegexes = excludeRegexes;
            return this;
        }

        public Builder excludeRegexes(List<String> excludeRegexes) {
            return excludeRegexes(Output.of(excludeRegexes));
        }

        public Builder excludeRegexes(String... excludeRegexes) {
            return excludeRegexes(List.of(excludeRegexes));
        }

        public Builder includeRegexes(@Nullable Output<List<String>> includeRegexes) {
            $.includeRegexes = includeRegexes;
            return this;
        }

        public Builder includeRegexes(List<String> includeRegexes) {
            return includeRegexes(Output.of(includeRegexes));
        }

        public Builder includeRegexes(String... includeRegexes) {
            return includeRegexes(List.of(includeRegexes));
        }

        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSetArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
