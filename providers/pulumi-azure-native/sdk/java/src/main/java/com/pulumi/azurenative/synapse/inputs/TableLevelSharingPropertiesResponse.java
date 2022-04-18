// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Tables that will be included and excluded in the follower database
 * 
 */
public final class TableLevelSharingPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final TableLevelSharingPropertiesResponse Empty = new TableLevelSharingPropertiesResponse();

    /**
     * List of external tables exclude from the follower database
     * 
     */
    @Import(name="externalTablesToExclude")
      private final @Nullable List<String> externalTablesToExclude;

    public List<String> externalTablesToExclude() {
        return this.externalTablesToExclude == null ? List.of() : this.externalTablesToExclude;
    }

    /**
     * List of external tables to include in the follower database
     * 
     */
    @Import(name="externalTablesToInclude")
      private final @Nullable List<String> externalTablesToInclude;

    public List<String> externalTablesToInclude() {
        return this.externalTablesToInclude == null ? List.of() : this.externalTablesToInclude;
    }

    /**
     * List of materialized views exclude from the follower database
     * 
     */
    @Import(name="materializedViewsToExclude")
      private final @Nullable List<String> materializedViewsToExclude;

    public List<String> materializedViewsToExclude() {
        return this.materializedViewsToExclude == null ? List.of() : this.materializedViewsToExclude;
    }

    /**
     * List of materialized views to include in the follower database
     * 
     */
    @Import(name="materializedViewsToInclude")
      private final @Nullable List<String> materializedViewsToInclude;

    public List<String> materializedViewsToInclude() {
        return this.materializedViewsToInclude == null ? List.of() : this.materializedViewsToInclude;
    }

    /**
     * List of tables to exclude from the follower database
     * 
     */
    @Import(name="tablesToExclude")
      private final @Nullable List<String> tablesToExclude;

    public List<String> tablesToExclude() {
        return this.tablesToExclude == null ? List.of() : this.tablesToExclude;
    }

    /**
     * List of tables to include in the follower database
     * 
     */
    @Import(name="tablesToInclude")
      private final @Nullable List<String> tablesToInclude;

    public List<String> tablesToInclude() {
        return this.tablesToInclude == null ? List.of() : this.tablesToInclude;
    }

    public TableLevelSharingPropertiesResponse(
        @Nullable List<String> externalTablesToExclude,
        @Nullable List<String> externalTablesToInclude,
        @Nullable List<String> materializedViewsToExclude,
        @Nullable List<String> materializedViewsToInclude,
        @Nullable List<String> tablesToExclude,
        @Nullable List<String> tablesToInclude) {
        this.externalTablesToExclude = externalTablesToExclude;
        this.externalTablesToInclude = externalTablesToInclude;
        this.materializedViewsToExclude = materializedViewsToExclude;
        this.materializedViewsToInclude = materializedViewsToInclude;
        this.tablesToExclude = tablesToExclude;
        this.tablesToInclude = tablesToInclude;
    }

    private TableLevelSharingPropertiesResponse() {
        this.externalTablesToExclude = List.of();
        this.externalTablesToInclude = List.of();
        this.materializedViewsToExclude = List.of();
        this.materializedViewsToInclude = List.of();
        this.tablesToExclude = List.of();
        this.tablesToInclude = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableLevelSharingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> externalTablesToExclude;
        private @Nullable List<String> externalTablesToInclude;
        private @Nullable List<String> materializedViewsToExclude;
        private @Nullable List<String> materializedViewsToInclude;
        private @Nullable List<String> tablesToExclude;
        private @Nullable List<String> tablesToInclude;

        public Builder() {
    	      // Empty
        }

        public Builder(TableLevelSharingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalTablesToExclude = defaults.externalTablesToExclude;
    	      this.externalTablesToInclude = defaults.externalTablesToInclude;
    	      this.materializedViewsToExclude = defaults.materializedViewsToExclude;
    	      this.materializedViewsToInclude = defaults.materializedViewsToInclude;
    	      this.tablesToExclude = defaults.tablesToExclude;
    	      this.tablesToInclude = defaults.tablesToInclude;
        }

        public Builder externalTablesToExclude(@Nullable List<String> externalTablesToExclude) {
            this.externalTablesToExclude = externalTablesToExclude;
            return this;
        }
        public Builder externalTablesToExclude(String... externalTablesToExclude) {
            return externalTablesToExclude(List.of(externalTablesToExclude));
        }
        public Builder externalTablesToInclude(@Nullable List<String> externalTablesToInclude) {
            this.externalTablesToInclude = externalTablesToInclude;
            return this;
        }
        public Builder externalTablesToInclude(String... externalTablesToInclude) {
            return externalTablesToInclude(List.of(externalTablesToInclude));
        }
        public Builder materializedViewsToExclude(@Nullable List<String> materializedViewsToExclude) {
            this.materializedViewsToExclude = materializedViewsToExclude;
            return this;
        }
        public Builder materializedViewsToExclude(String... materializedViewsToExclude) {
            return materializedViewsToExclude(List.of(materializedViewsToExclude));
        }
        public Builder materializedViewsToInclude(@Nullable List<String> materializedViewsToInclude) {
            this.materializedViewsToInclude = materializedViewsToInclude;
            return this;
        }
        public Builder materializedViewsToInclude(String... materializedViewsToInclude) {
            return materializedViewsToInclude(List.of(materializedViewsToInclude));
        }
        public Builder tablesToExclude(@Nullable List<String> tablesToExclude) {
            this.tablesToExclude = tablesToExclude;
            return this;
        }
        public Builder tablesToExclude(String... tablesToExclude) {
            return tablesToExclude(List.of(tablesToExclude));
        }
        public Builder tablesToInclude(@Nullable List<String> tablesToInclude) {
            this.tablesToInclude = tablesToInclude;
            return this;
        }
        public Builder tablesToInclude(String... tablesToInclude) {
            return tablesToInclude(List.of(tablesToInclude));
        }        public TableLevelSharingPropertiesResponse build() {
            return new TableLevelSharingPropertiesResponse(externalTablesToExclude, externalTablesToInclude, materializedViewsToExclude, materializedViewsToInclude, tablesToExclude, tablesToInclude);
        }
    }
}
