// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MongoDBDatabaseGetPropertiesResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final MongoDBDatabaseGetPropertiesResponseResource Empty = new MongoDBDatabaseGetPropertiesResponseResource();

    /**
     * A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Name of the Cosmos DB MongoDB database
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * A system generated property. A unique identifier.
     * 
     */
    @InputImport(name="rid", required=true)
      private final String rid;

    public String getRid() {
        return this.rid;
    }

    /**
     * A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    @InputImport(name="ts", required=true)
      private final Double ts;

    public Double getTs() {
        return this.ts;
    }

    public MongoDBDatabaseGetPropertiesResponseResource(
        String etag,
        String id,
        String rid,
        Double ts) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.rid = Objects.requireNonNull(rid, "expected parameter 'rid' to be non-null");
        this.ts = Objects.requireNonNull(ts, "expected parameter 'ts' to be non-null");
    }

    private MongoDBDatabaseGetPropertiesResponseResource() {
        this.etag = null;
        this.id = null;
        this.rid = null;
        this.ts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBDatabaseGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String rid;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBDatabaseGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }
        public MongoDBDatabaseGetPropertiesResponseResource build() {
            return new MongoDBDatabaseGetPropertiesResponseResource(etag, id, rid, ts);
        }
    }
}
