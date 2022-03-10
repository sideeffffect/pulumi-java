// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaterializedViewDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaterializedViewDefinitionArgs Empty = new MaterializedViewDefinitionArgs();

    /**
     * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
     * 
     */
    @InputImport(name="enableRefresh")
      private final @Nullable Input<Boolean> enableRefresh;

    public Input<Boolean> getEnableRefresh() {
        return this.enableRefresh == null ? Input.empty() : this.enableRefresh;
    }

    /**
     * [Required] A query whose result is persisted.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
     * 
     */
    @InputImport(name="refreshIntervalMs")
      private final @Nullable Input<String> refreshIntervalMs;

    public Input<String> getRefreshIntervalMs() {
        return this.refreshIntervalMs == null ? Input.empty() : this.refreshIntervalMs;
    }

    public MaterializedViewDefinitionArgs(
        @Nullable Input<Boolean> enableRefresh,
        @Nullable Input<String> query,
        @Nullable Input<String> refreshIntervalMs) {
        this.enableRefresh = enableRefresh;
        this.query = query;
        this.refreshIntervalMs = refreshIntervalMs;
    }

    private MaterializedViewDefinitionArgs() {
        this.enableRefresh = Input.empty();
        this.query = Input.empty();
        this.refreshIntervalMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterializedViewDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableRefresh;
        private @Nullable Input<String> query;
        private @Nullable Input<String> refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterializedViewDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder enableRefresh(@Nullable Input<Boolean> enableRefresh) {
            this.enableRefresh = enableRefresh;
            return this;
        }

        public Builder enableRefresh(@Nullable Boolean enableRefresh) {
            this.enableRefresh = Input.ofNullable(enableRefresh);
            return this;
        }

        public Builder query(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder refreshIntervalMs(@Nullable Input<String> refreshIntervalMs) {
            this.refreshIntervalMs = refreshIntervalMs;
            return this;
        }

        public Builder refreshIntervalMs(@Nullable String refreshIntervalMs) {
            this.refreshIntervalMs = Input.ofNullable(refreshIntervalMs);
            return this;
        }
        public MaterializedViewDefinitionArgs build() {
            return new MaterializedViewDefinitionArgs(enableRefresh, query, refreshIntervalMs);
        }
    }
}
