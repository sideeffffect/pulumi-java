// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HivePartitioningOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HivePartitioningOptionsArgs Empty = new HivePartitioningOptionsArgs();

    /**
     * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
     * 
     */
    @InputImport(name="requirePartitionFilter")
      private final @Nullable Input<Boolean> requirePartitionFilter;

    public Input<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Input.empty() : this.requirePartitionFilter;
    }

    /**
     * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
     * 
     */
    @InputImport(name="sourceUriPrefix")
      private final @Nullable Input<String> sourceUriPrefix;

    public Input<String> getSourceUriPrefix() {
        return this.sourceUriPrefix == null ? Input.empty() : this.sourceUriPrefix;
    }

    public HivePartitioningOptionsArgs(
        @Nullable Input<String> mode,
        @Nullable Input<Boolean> requirePartitionFilter,
        @Nullable Input<String> sourceUriPrefix) {
        this.mode = mode;
        this.requirePartitionFilter = requirePartitionFilter;
        this.sourceUriPrefix = sourceUriPrefix;
    }

    private HivePartitioningOptionsArgs() {
        this.mode = Input.empty();
        this.requirePartitionFilter = Input.empty();
        this.sourceUriPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HivePartitioningOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mode;
        private @Nullable Input<Boolean> requirePartitionFilter;
        private @Nullable Input<String> sourceUriPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(HivePartitioningOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.sourceUriPrefix = defaults.sourceUriPrefix;
        }

        public Builder mode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder requirePartitionFilter(@Nullable Input<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Input.ofNullable(requirePartitionFilter);
            return this;
        }

        public Builder sourceUriPrefix(@Nullable Input<String> sourceUriPrefix) {
            this.sourceUriPrefix = sourceUriPrefix;
            return this;
        }

        public Builder sourceUriPrefix(@Nullable String sourceUriPrefix) {
            this.sourceUriPrefix = Input.ofNullable(sourceUriPrefix);
            return this;
        }
        public HivePartitioningOptionsArgs build() {
            return new HivePartitioningOptionsArgs(mode, requirePartitionFilter, sourceUriPrefix);
        }
    }
}
