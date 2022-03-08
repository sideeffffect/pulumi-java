// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CatalogTableTargetTable {
    /**
     * ID of the Data Catalog in which the table resides.
     * 
     */
    private final String catalogId;
    /**
     * Name of the catalog database that contains the target table.
     * 
     */
    private final String databaseName;
    /**
     * Name of the target table.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"catalogId","databaseName","name"})
    private CatalogTableTargetTable(
        String catalogId,
        String databaseName,
        String name) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.name = name;
    }

    /**
     * ID of the Data Catalog in which the table resides.
     * 
    */
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Name of the catalog database that contains the target table.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Name of the target table.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableTargetTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String databaseName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableTargetTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public CatalogTableTargetTable build() {
            return new CatalogTableTargetTable(catalogId, databaseName, name);
        }
    }
}
