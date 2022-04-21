// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.CassandraPartitionKeyResponse;
import com.pulumi.azurenative.documentdb.inputs.ClusterKeyResponse;
import com.pulumi.azurenative.documentdb.inputs.ColumnResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table schema
 * 
 */
public final class CassandraSchemaResponse extends com.pulumi.resources.InvokeArgs {

    public static final CassandraSchemaResponse Empty = new CassandraSchemaResponse();

    /**
     * List of cluster key.
     * 
     */
    @Import(name="clusterKeys")
    private @Nullable List<ClusterKeyResponse> clusterKeys;

    public Optional<List<ClusterKeyResponse>> clusterKeys() {
        return Optional.ofNullable(this.clusterKeys);
    }

    /**
     * List of Cassandra table columns.
     * 
     */
    @Import(name="columns")
    private @Nullable List<ColumnResponse> columns;

    public Optional<List<ColumnResponse>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * List of partition key.
     * 
     */
    @Import(name="partitionKeys")
    private @Nullable List<CassandraPartitionKeyResponse> partitionKeys;

    public Optional<List<CassandraPartitionKeyResponse>> partitionKeys() {
        return Optional.ofNullable(this.partitionKeys);
    }

    private CassandraSchemaResponse() {}

    private CassandraSchemaResponse(CassandraSchemaResponse $) {
        this.clusterKeys = $.clusterKeys;
        this.columns = $.columns;
        this.partitionKeys = $.partitionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CassandraSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CassandraSchemaResponse $;

        public Builder() {
            $ = new CassandraSchemaResponse();
        }

        public Builder(CassandraSchemaResponse defaults) {
            $ = new CassandraSchemaResponse(Objects.requireNonNull(defaults));
        }

        public Builder clusterKeys(@Nullable List<ClusterKeyResponse> clusterKeys) {
            $.clusterKeys = clusterKeys;
            return this;
        }

        public Builder clusterKeys(ClusterKeyResponse... clusterKeys) {
            return clusterKeys(List.of(clusterKeys));
        }

        public Builder columns(@Nullable List<ColumnResponse> columns) {
            $.columns = columns;
            return this;
        }

        public Builder columns(ColumnResponse... columns) {
            return columns(List.of(columns));
        }

        public Builder partitionKeys(@Nullable List<CassandraPartitionKeyResponse> partitionKeys) {
            $.partitionKeys = partitionKeys;
            return this;
        }

        public Builder partitionKeys(CassandraPartitionKeyResponse... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }

        public CassandraSchemaResponse build() {
            return $;
        }
    }

}
