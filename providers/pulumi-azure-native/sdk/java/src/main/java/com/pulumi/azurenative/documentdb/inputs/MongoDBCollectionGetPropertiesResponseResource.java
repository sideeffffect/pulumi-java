// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.MongoIndexResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongoDBCollectionGetPropertiesResponseResource extends com.pulumi.resources.InvokeArgs {

    public static final MongoDBCollectionGetPropertiesResponseResource Empty = new MongoDBCollectionGetPropertiesResponseResource();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Integer analyticalStorageTtl;

    public Optional<Integer> analyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Optional.empty() : Optional.ofNullable(this.analyticalStorageTtl);
    }

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB MongoDB collection
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * List of index keys
     * 
     */
    @Import(name="indexes")
      private final @Nullable List<MongoIndexResponse> indexes;

    public List<MongoIndexResponse> indexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @Import(name="rid", required=true)
      private final String rid;

    public String rid() {
        return this.rid;
    }

    /**
     * A key-value pair of shard keys to be applied for the request.
     * 
     */
    @Import(name="shardKey")
      private final @Nullable Map<String,String> shardKey;

    public Map<String,String> shardKey() {
        return this.shardKey == null ? Map.of() : this.shardKey;
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @Import(name="ts", required=true)
      private final Double ts;

    public Double ts() {
        return this.ts;
    }

    public MongoDBCollectionGetPropertiesResponseResource(
        @Nullable Integer analyticalStorageTtl,
        String etag,
        String id,
        @Nullable List<MongoIndexResponse> indexes,
        String rid,
        @Nullable Map<String,String> shardKey,
        Double ts) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexes = indexes;
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.shardKey = shardKey;
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
    }

    private MongoDBCollectionGetPropertiesResponseResource() {
        this.analyticalStorageTtl = null;
        this.etag = null;
        this.id = null;
        this.indexes = List.of();
        this.rid = null;
        this.shardKey = Map.of();
        this.ts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer analyticalStorageTtl;
        private String etag;
        private String id;
        private @Nullable List<MongoIndexResponse> indexes;
        private String rid;
        private @Nullable Map<String,String> shardKey;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBCollectionGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexes = defaults.indexes;
    	      this.rid = defaults.rid;
    	      this.shardKey = defaults.shardKey;
    	      this.ts = defaults.ts;
        }

        public Builder analyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder indexes(@Nullable List<MongoIndexResponse> indexes) {
            this.indexes = indexes;
            return this;
        }
        public Builder indexes(MongoIndexResponse... indexes) {
            return indexes(List.of(indexes));
        }
        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }
        public Builder shardKey(@Nullable Map<String,String> shardKey) {
            this.shardKey = shardKey;
            return this;
        }
        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }        public MongoDBCollectionGetPropertiesResponseResource build() {
            return new MongoDBCollectionGetPropertiesResponseResource(analyticalStorageTtl, etag, id, indexes, rid, shardKey, ts);
        }
    }
}
