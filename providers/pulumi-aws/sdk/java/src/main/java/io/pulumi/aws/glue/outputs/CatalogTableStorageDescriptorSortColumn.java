// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CatalogTableStorageDescriptorSortColumn {
    /**
     * Name of the column.
     * 
     */
    private final String column;
    /**
     * Whether the column is sorted in ascending (`1`) or descending order (`0`).
     * 
     */
    private final Integer sortOrder;

    @CustomType.Constructor
    private CatalogTableStorageDescriptorSortColumn(
        @CustomType.Parameter("column") String column,
        @CustomType.Parameter("sortOrder") Integer sortOrder) {
        this.column = column;
        this.sortOrder = sortOrder;
    }

    /**
     * Name of the column.
     * 
    */
    public String column() {
        return this.column;
    }
    /**
     * Whether the column is sorted in ascending (`1`) or descending order (`0`).
     * 
    */
    public Integer sortOrder() {
        return this.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSortColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private Integer sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSortColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        public Builder sortOrder(Integer sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }        public CatalogTableStorageDescriptorSortColumn build() {
            return new CatalogTableStorageDescriptorSortColumn(column, sortOrder);
        }
    }
}
