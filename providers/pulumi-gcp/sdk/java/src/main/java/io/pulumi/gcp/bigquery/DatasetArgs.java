// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessArgs;
import io.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * 
     */
    @Import(name="accesses")
      private final @Nullable Output<List<DatasetAccessArgs>> accesses;

    public Output<List<DatasetAccessArgs>> accesses() {
        return this.accesses == null ? Codegen.empty() : this.accesses;
    }

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultEncryptionConfiguration")
      private final @Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration;

    public Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration() {
        return this.defaultEncryptionConfiguration == null ? Codegen.empty() : this.defaultEncryptionConfiguration;
    }

    /**
     * The default partition expiration for all partitioned tables in
     * the dataset, in milliseconds.
     * 
     */
    @Import(name="defaultPartitionExpirationMs")
      private final @Nullable Output<Integer> defaultPartitionExpirationMs;

    public Output<Integer> defaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs == null ? Codegen.empty() : this.defaultPartitionExpirationMs;
    }

    /**
     * The default lifetime of all tables in the dataset, in milliseconds.
     * The minimum value is 3600000 milliseconds (one hour).
     * 
     */
    @Import(name="defaultTableExpirationMs")
      private final @Nullable Output<Integer> defaultTableExpirationMs;

    public Output<Integer> defaultTableExpirationMs() {
        return this.defaultTableExpirationMs == null ? Codegen.empty() : this.defaultTableExpirationMs;
    }

    /**
     * If set to `true`, delete all the tables in the
     * dataset when destroying the resource; otherwise,
     * destroying the resource will fail if tables are present.
     * 
     */
    @Import(name="deleteContentsOnDestroy")
      private final @Nullable Output<Boolean> deleteContentsOnDestroy;

    public Output<Boolean> deleteContentsOnDestroy() {
        return this.deleteContentsOnDestroy == null ? Codegen.empty() : this.deleteContentsOnDestroy;
    }

    /**
     * A user-friendly description of the dataset
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A descriptive name for the dataset
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * The labels associated with this dataset. You can use these to
     * organize and group your datasets
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public DatasetArgs(
        @Nullable Output<List<DatasetAccessArgs>> accesses,
        Output<String> datasetId,
        @Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration,
        @Nullable Output<Integer> defaultPartitionExpirationMs,
        @Nullable Output<Integer> defaultTableExpirationMs,
        @Nullable Output<Boolean> deleteContentsOnDestroy,
        @Nullable Output<String> description,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> project) {
        this.accesses = accesses;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
        this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
        this.defaultTableExpirationMs = defaultTableExpirationMs;
        this.deleteContentsOnDestroy = deleteContentsOnDestroy;
        this.description = description;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.location = location;
        this.project = project;
    }

    private DatasetArgs() {
        this.accesses = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.defaultEncryptionConfiguration = Codegen.empty();
        this.defaultPartitionExpirationMs = Codegen.empty();
        this.defaultTableExpirationMs = Codegen.empty();
        this.deleteContentsOnDestroy = Codegen.empty();
        this.description = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DatasetAccessArgs>> accesses;
        private Output<String> datasetId;
        private @Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration;
        private @Nullable Output<Integer> defaultPartitionExpirationMs;
        private @Nullable Output<Integer> defaultTableExpirationMs;
        private @Nullable Output<Boolean> deleteContentsOnDestroy;
        private @Nullable Output<String> description;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultEncryptionConfiguration = defaults.defaultEncryptionConfiguration;
    	      this.defaultPartitionExpirationMs = defaults.defaultPartitionExpirationMs;
    	      this.defaultTableExpirationMs = defaults.defaultTableExpirationMs;
    	      this.deleteContentsOnDestroy = defaults.deleteContentsOnDestroy;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder accesses(@Nullable Output<List<DatasetAccessArgs>> accesses) {
            this.accesses = accesses;
            return this;
        }
        public Builder accesses(@Nullable List<DatasetAccessArgs> accesses) {
            this.accesses = Codegen.ofNullable(accesses);
            return this;
        }
        public Builder accesses(DatasetAccessArgs... accesses) {
            return accesses(List.of(accesses));
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder defaultEncryptionConfiguration(@Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
            return this;
        }
        public Builder defaultEncryptionConfiguration(@Nullable DatasetDefaultEncryptionConfigurationArgs defaultEncryptionConfiguration) {
            this.defaultEncryptionConfiguration = Codegen.ofNullable(defaultEncryptionConfiguration);
            return this;
        }
        public Builder defaultPartitionExpirationMs(@Nullable Output<Integer> defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
            return this;
        }
        public Builder defaultPartitionExpirationMs(@Nullable Integer defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = Codegen.ofNullable(defaultPartitionExpirationMs);
            return this;
        }
        public Builder defaultTableExpirationMs(@Nullable Output<Integer> defaultTableExpirationMs) {
            this.defaultTableExpirationMs = defaultTableExpirationMs;
            return this;
        }
        public Builder defaultTableExpirationMs(@Nullable Integer defaultTableExpirationMs) {
            this.defaultTableExpirationMs = Codegen.ofNullable(defaultTableExpirationMs);
            return this;
        }
        public Builder deleteContentsOnDestroy(@Nullable Output<Boolean> deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = deleteContentsOnDestroy;
            return this;
        }
        public Builder deleteContentsOnDestroy(@Nullable Boolean deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = Codegen.ofNullable(deleteContentsOnDestroy);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public DatasetArgs build() {
            return new DatasetArgs(accesses, datasetId, defaultEncryptionConfiguration, defaultPartitionExpirationMs, defaultTableExpirationMs, deleteContentsOnDestroy, description, friendlyName, labels, location, project);
        }
    }
}
