// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The indexes for the path.
 * 
 */
public final class IndexesResponse extends com.pulumi.resources.InvokeArgs {

    public static final IndexesResponse Empty = new IndexesResponse();

    /**
     * The datatype for which the indexing behavior is applied to.
     * 
     */
    @Import(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> dataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    /**
     * Indicates the type of index.
     * 
     */
    @Import(name="kind")
      private final @Nullable String kind;

    public Optional<String> kind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * The precision of the index. -1 is maximum precision.
     * 
     */
    @Import(name="precision")
      private final @Nullable Integer precision;

    public Optional<Integer> precision() {
        return this.precision == null ? Optional.empty() : Optional.ofNullable(this.precision);
    }

    public IndexesResponse(
        @Nullable String dataType,
        @Nullable String kind,
        @Nullable Integer precision) {
        this.dataType = dataType == null ? "String" : dataType;
        this.kind = kind == null ? "Hash" : kind;
        this.precision = precision;
    }

    private IndexesResponse() {
        this.dataType = null;
        this.kind = null;
        this.precision = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String kind;
        private @Nullable Integer precision;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.kind = defaults.kind;
    	      this.precision = defaults.precision;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder precision(@Nullable Integer precision) {
            this.precision = precision;
            return this;
        }        public IndexesResponse build() {
            return new IndexesResponse(dataType, kind, precision);
        }
    }
}
