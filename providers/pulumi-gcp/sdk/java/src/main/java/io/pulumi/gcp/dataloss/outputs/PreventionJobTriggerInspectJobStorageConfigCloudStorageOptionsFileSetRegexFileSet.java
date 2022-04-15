// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet {
    /**
     * The name of a Cloud Storage bucket.
     * 
     */
    private final String bucketName;
    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at
     * least one of these regular expressions will be excluded from the scan.
     * 
     */
    private final @Nullable List<String> excludeRegexes;
    /**
     * A list of regular expressions matching file paths to include. All files in the bucket
     * that match at least one of these regular expressions will be included in the set of files,
     * except for those that also match an item in excludeRegex. Leaving this field empty will
     * match all files by default (this is equivalent to including .* in the list)
     * 
     */
    private final @Nullable List<String> includeRegexes;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet(
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("excludeRegexes") @Nullable List<String> excludeRegexes,
        @CustomType.Parameter("includeRegexes") @Nullable List<String> includeRegexes) {
        this.bucketName = bucketName;
        this.excludeRegexes = excludeRegexes;
        this.includeRegexes = includeRegexes;
    }

    /**
     * The name of a Cloud Storage bucket.
     * 
    */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at
     * least one of these regular expressions will be excluded from the scan.
     * 
    */
    public List<String> excludeRegexes() {
        return this.excludeRegexes == null ? List.of() : this.excludeRegexes;
    }
    /**
     * A list of regular expressions matching file paths to include. All files in the bucket
     * that match at least one of these regular expressions will be included in the set of files,
     * except for those that also match an item in excludeRegex. Leaving this field empty will
     * match all files by default (this is equivalent to including .* in the list)
     * 
    */
    public List<String> includeRegexes() {
        return this.includeRegexes == null ? List.of() : this.includeRegexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable List<String> excludeRegexes;
        private @Nullable List<String> includeRegexes;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.excludeRegexes = defaults.excludeRegexes;
    	      this.includeRegexes = defaults.includeRegexes;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder excludeRegexes(@Nullable List<String> excludeRegexes) {
            this.excludeRegexes = excludeRegexes;
            return this;
        }
        public Builder excludeRegexes(String... excludeRegexes) {
            return excludeRegexes(List.of(excludeRegexes));
        }
        public Builder includeRegexes(@Nullable List<String> includeRegexes) {
            this.includeRegexes = includeRegexes;
            return this;
        }
        public Builder includeRegexes(String... includeRegexes) {
            return includeRegexes(List.of(includeRegexes));
        }        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetRegexFileSet(bucketName, excludeRegexes, includeRegexes);
        }
    }
}
