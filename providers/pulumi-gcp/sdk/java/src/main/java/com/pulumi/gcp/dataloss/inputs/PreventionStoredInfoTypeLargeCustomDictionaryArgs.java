// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionStoredInfoTypeLargeCustomDictionaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryArgs();

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    @Import(name="bigQueryField")
    private @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs> bigQueryField;

    public Optional<Output<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs>> bigQueryField() {
        return Optional.ofNullable(this.bigQueryField);
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudStorageFileSet")
    private @Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs> cloudStorageFileSet;

    public Optional<Output<PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs>> cloudStorageFileSet() {
        return Optional.ofNullable(this.cloudStorageFileSet);
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API.
     * If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * Structure is documented below.
     * 
     */
    @Import(name="outputPath", required=true)
    private Output<PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs> outputPath;

    public Output<PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs> outputPath() {
        return this.outputPath;
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryArgs() {}

    private PreventionStoredInfoTypeLargeCustomDictionaryArgs(PreventionStoredInfoTypeLargeCustomDictionaryArgs $) {
        this.bigQueryField = $.bigQueryField;
        this.cloudStorageFileSet = $.cloudStorageFileSet;
        this.outputPath = $.outputPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryArgs $;

        public Builder() {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryArgs();
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryArgs defaults) {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigQueryField(@Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs> bigQueryField) {
            $.bigQueryField = bigQueryField;
            return this;
        }

        public Builder bigQueryField(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldArgs bigQueryField) {
            return bigQueryField(Output.of(bigQueryField));
        }

        public Builder cloudStorageFileSet(@Nullable Output<PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs> cloudStorageFileSet) {
            $.cloudStorageFileSet = cloudStorageFileSet;
            return this;
        }

        public Builder cloudStorageFileSet(PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSetArgs cloudStorageFileSet) {
            return cloudStorageFileSet(Output.of(cloudStorageFileSet));
        }

        public Builder outputPath(Output<PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs> outputPath) {
            $.outputPath = outputPath;
            return this;
        }

        public Builder outputPath(PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs outputPath) {
            return outputPath(Output.of(outputPath));
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryArgs build() {
            $.outputPath = Objects.requireNonNull($.outputPath, "expected parameter 'outputPath' to be non-null");
            return $;
        }
    }

}
