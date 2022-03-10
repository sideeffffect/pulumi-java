// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.IndexesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The paths that are included in indexing
 * 
 */
public final class IncludedPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncludedPathArgs Empty = new IncludedPathArgs();

    /**
     * List of indexes for this path
     * 
     */
    @InputImport(name="indexes")
      private final @Nullable Input<List<IndexesArgs>> indexes;

    public Input<List<IndexesArgs>> getIndexes() {
        return this.indexes == null ? Input.empty() : this.indexes;
    }

    /**
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public IncludedPathArgs(
        @Nullable Input<List<IndexesArgs>> indexes,
        @Nullable Input<String> path) {
        this.indexes = indexes;
        this.path = path;
    }

    private IncludedPathArgs() {
        this.indexes = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncludedPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IndexesArgs>> indexes;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(IncludedPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexes = defaults.indexes;
    	      this.path = defaults.path;
        }

        public Builder indexes(@Nullable Input<List<IndexesArgs>> indexes) {
            this.indexes = indexes;
            return this;
        }

        public Builder indexes(@Nullable List<IndexesArgs> indexes) {
            this.indexes = Input.ofNullable(indexes);
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }
        public IncludedPathArgs build() {
            return new IncludedPathArgs(indexes, path);
        }
    }
}
