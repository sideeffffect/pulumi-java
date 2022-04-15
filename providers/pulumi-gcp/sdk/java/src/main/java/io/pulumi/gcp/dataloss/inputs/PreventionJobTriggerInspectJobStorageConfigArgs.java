// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigArgs Empty = new PreventionJobTriggerInspectJobStorageConfigArgs();

    /**
     * Options defining BigQuery table and row identifiers.
     * Structure is documented below.
     * 
     */
    @Import(name="bigQueryOptions")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions;

    public Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions() {
        return this.bigQueryOptions == null ? Codegen.empty() : this.bigQueryOptions;
    }

    /**
     * Options defining a file or a set of files within a Google Cloud Storage bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudStorageOptions")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions;

    public Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions() {
        return this.cloudStorageOptions == null ? Codegen.empty() : this.cloudStorageOptions;
    }

    /**
     * Options defining a data set within Google Cloud Datastore.
     * Structure is documented below.
     * 
     */
    @Import(name="datastoreOptions")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions;

    public Output<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions() {
        return this.datastoreOptions == null ? Codegen.empty() : this.datastoreOptions;
    }

    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    @Import(name="timespanConfig")
      private final @Nullable Output<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig;

    public Output<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig() {
        return this.timespanConfig == null ? Codegen.empty() : this.timespanConfig;
    }

    public PreventionJobTriggerInspectJobStorageConfigArgs(
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions,
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions,
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions,
        @Nullable Output<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.timespanConfig = timespanConfig;
    }

    private PreventionJobTriggerInspectJobStorageConfigArgs() {
        this.bigQueryOptions = Codegen.empty();
        this.cloudStorageOptions = Codegen.empty();
        this.datastoreOptions = Codegen.empty();
        this.timespanConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions;
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions;
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions;
        private @Nullable Output<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder bigQueryOptions(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs> bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }
        public Builder bigQueryOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsArgs bigQueryOptions) {
            this.bigQueryOptions = Codegen.ofNullable(bigQueryOptions);
            return this;
        }
        public Builder cloudStorageOptions(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs> cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }
        public Builder cloudStorageOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs cloudStorageOptions) {
            this.cloudStorageOptions = Codegen.ofNullable(cloudStorageOptions);
            return this;
        }
        public Builder datastoreOptions(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs> datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }
        public Builder datastoreOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsArgs datastoreOptions) {
            this.datastoreOptions = Codegen.ofNullable(datastoreOptions);
            return this;
        }
        public Builder timespanConfig(@Nullable Output<PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs> timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }
        public Builder timespanConfig(@Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfigArgs timespanConfig) {
            this.timespanConfig = Codegen.ofNullable(timespanConfig);
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigArgs(bigQueryOptions, cloudStorageOptions, datastoreOptions, timespanConfig);
        }
    }
}
