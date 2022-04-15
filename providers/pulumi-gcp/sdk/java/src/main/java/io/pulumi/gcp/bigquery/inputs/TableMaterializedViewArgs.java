// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMaterializedViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMaterializedViewArgs Empty = new TableMaterializedViewArgs();

    /**
     * Specifies whether to use BigQuery's automatic refresh for this materialized view when the base table is updated.
     * The default value is true.
     * 
     */
    @Import(name="enableRefresh")
      private final @Nullable Output<Boolean> enableRefresh;

    public Output<Boolean> enableRefresh() {
        return this.enableRefresh == null ? Codegen.empty() : this.enableRefresh;
    }

    /**
     * A query whose result is persisted.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * The maximum frequency at which this materialized view will be refreshed.
     * The default value is 1800000
     * 
     */
    @Import(name="refreshIntervalMs")
      private final @Nullable Output<Integer> refreshIntervalMs;

    public Output<Integer> refreshIntervalMs() {
        return this.refreshIntervalMs == null ? Codegen.empty() : this.refreshIntervalMs;
    }

    public TableMaterializedViewArgs(
        @Nullable Output<Boolean> enableRefresh,
        Output<String> query,
        @Nullable Output<Integer> refreshIntervalMs) {
        this.enableRefresh = enableRefresh;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.refreshIntervalMs = refreshIntervalMs;
    }

    private TableMaterializedViewArgs() {
        this.enableRefresh = Codegen.empty();
        this.query = Codegen.empty();
        this.refreshIntervalMs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMaterializedViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableRefresh;
        private Output<String> query;
        private @Nullable Output<Integer> refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMaterializedViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder enableRefresh(@Nullable Output<Boolean> enableRefresh) {
            this.enableRefresh = enableRefresh;
            return this;
        }
        public Builder enableRefresh(@Nullable Boolean enableRefresh) {
            this.enableRefresh = Codegen.ofNullable(enableRefresh);
            return this;
        }
        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder refreshIntervalMs(@Nullable Output<Integer> refreshIntervalMs) {
            this.refreshIntervalMs = refreshIntervalMs;
            return this;
        }
        public Builder refreshIntervalMs(@Nullable Integer refreshIntervalMs) {
            this.refreshIntervalMs = Codegen.ofNullable(refreshIntervalMs);
            return this;
        }        public TableMaterializedViewArgs build() {
            return new TableMaterializedViewArgs(enableRefresh, query, refreshIntervalMs);
        }
    }
}
