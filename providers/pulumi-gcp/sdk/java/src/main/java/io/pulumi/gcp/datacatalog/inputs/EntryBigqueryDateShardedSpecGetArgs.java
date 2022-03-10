// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryDateShardedSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryDateShardedSpecGetArgs Empty = new EntryBigqueryDateShardedSpecGetArgs();

    @InputImport(name="dataset")
      private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    @InputImport(name="shardCount")
      private final @Nullable Input<Integer> shardCount;

    public Input<Integer> getShardCount() {
        return this.shardCount == null ? Input.empty() : this.shardCount;
    }

    @InputImport(name="tablePrefix")
      private final @Nullable Input<String> tablePrefix;

    public Input<String> getTablePrefix() {
        return this.tablePrefix == null ? Input.empty() : this.tablePrefix;
    }

    public EntryBigqueryDateShardedSpecGetArgs(
        @Nullable Input<String> dataset,
        @Nullable Input<Integer> shardCount,
        @Nullable Input<String> tablePrefix) {
        this.dataset = dataset;
        this.shardCount = shardCount;
        this.tablePrefix = tablePrefix;
    }

    private EntryBigqueryDateShardedSpecGetArgs() {
        this.dataset = Input.empty();
        this.shardCount = Input.empty();
        this.tablePrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryDateShardedSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataset;
        private @Nullable Input<Integer> shardCount;
        private @Nullable Input<String> tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryDateShardedSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.shardCount = defaults.shardCount;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder dataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder dataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder shardCount(@Nullable Input<Integer> shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder shardCount(@Nullable Integer shardCount) {
            this.shardCount = Input.ofNullable(shardCount);
            return this;
        }

        public Builder tablePrefix(@Nullable Input<String> tablePrefix) {
            this.tablePrefix = tablePrefix;
            return this;
        }

        public Builder tablePrefix(@Nullable String tablePrefix) {
            this.tablePrefix = Input.ofNullable(tablePrefix);
            return this;
        }
        public EntryBigqueryDateShardedSpecGetArgs build() {
            return new EntryBigqueryDateShardedSpecGetArgs(dataset, shardCount, tablePrefix);
        }
    }
}
