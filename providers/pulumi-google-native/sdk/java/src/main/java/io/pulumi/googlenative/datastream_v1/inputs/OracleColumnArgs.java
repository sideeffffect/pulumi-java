// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle Column.
 * 
 */
public final class OracleColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleColumnArgs Empty = new OracleColumnArgs();

    /**
     * Column name.
     * 
     */
    @InputImport(name="column")
      private final @Nullable Input<String> column;

    public Input<String> getColumn() {
        return this.column == null ? Input.empty() : this.column;
    }

    /**
     * The Oracle data type.
     * 
     */
    @InputImport(name="dataType")
      private final @Nullable Input<String> dataType;

    public Input<String> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    /**
     * Column encoding.
     * 
     */
    @InputImport(name="encoding")
      private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * Column length.
     * 
     */
    @InputImport(name="length")
      private final @Nullable Input<Integer> length;

    public Input<Integer> getLength() {
        return this.length == null ? Input.empty() : this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @InputImport(name="nullable")
      private final @Nullable Input<Boolean> nullable;

    public Input<Boolean> getNullable() {
        return this.nullable == null ? Input.empty() : this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @InputImport(name="ordinalPosition")
      private final @Nullable Input<Integer> ordinalPosition;

    public Input<Integer> getOrdinalPosition() {
        return this.ordinalPosition == null ? Input.empty() : this.ordinalPosition;
    }

    /**
     * Column precision.
     * 
     */
    @InputImport(name="precision")
      private final @Nullable Input<Integer> precision;

    public Input<Integer> getPrecision() {
        return this.precision == null ? Input.empty() : this.precision;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @InputImport(name="primaryKey")
      private final @Nullable Input<Boolean> primaryKey;

    public Input<Boolean> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    /**
     * Column scale.
     * 
     */
    @InputImport(name="scale")
      private final @Nullable Input<Integer> scale;

    public Input<Integer> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    public OracleColumnArgs(
        @Nullable Input<String> column,
        @Nullable Input<String> dataType,
        @Nullable Input<String> encoding,
        @Nullable Input<Integer> length,
        @Nullable Input<Boolean> nullable,
        @Nullable Input<Integer> ordinalPosition,
        @Nullable Input<Integer> precision,
        @Nullable Input<Boolean> primaryKey,
        @Nullable Input<Integer> scale) {
        this.column = column;
        this.dataType = dataType;
        this.encoding = encoding;
        this.length = length;
        this.nullable = nullable;
        this.ordinalPosition = ordinalPosition;
        this.precision = precision;
        this.primaryKey = primaryKey;
        this.scale = scale;
    }

    private OracleColumnArgs() {
        this.column = Input.empty();
        this.dataType = Input.empty();
        this.encoding = Input.empty();
        this.length = Input.empty();
        this.nullable = Input.empty();
        this.ordinalPosition = Input.empty();
        this.precision = Input.empty();
        this.primaryKey = Input.empty();
        this.scale = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> column;
        private @Nullable Input<String> dataType;
        private @Nullable Input<String> encoding;
        private @Nullable Input<Integer> length;
        private @Nullable Input<Boolean> nullable;
        private @Nullable Input<Integer> ordinalPosition;
        private @Nullable Input<Integer> precision;
        private @Nullable Input<Boolean> primaryKey;
        private @Nullable Input<Integer> scale;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.dataType = defaults.dataType;
    	      this.encoding = defaults.encoding;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.precision = defaults.precision;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scale = defaults.scale;
        }

        public Builder column(@Nullable Input<String> column) {
            this.column = column;
            return this;
        }

        public Builder column(@Nullable String column) {
            this.column = Input.ofNullable(column);
            return this;
        }

        public Builder dataType(@Nullable Input<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }

        public Builder encoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder length(@Nullable Input<Integer> length) {
            this.length = length;
            return this;
        }

        public Builder length(@Nullable Integer length) {
            this.length = Input.ofNullable(length);
            return this;
        }

        public Builder nullable(@Nullable Input<Boolean> nullable) {
            this.nullable = nullable;
            return this;
        }

        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = Input.ofNullable(nullable);
            return this;
        }

        public Builder ordinalPosition(@Nullable Input<Integer> ordinalPosition) {
            this.ordinalPosition = ordinalPosition;
            return this;
        }

        public Builder ordinalPosition(@Nullable Integer ordinalPosition) {
            this.ordinalPosition = Input.ofNullable(ordinalPosition);
            return this;
        }

        public Builder precision(@Nullable Input<Integer> precision) {
            this.precision = precision;
            return this;
        }

        public Builder precision(@Nullable Integer precision) {
            this.precision = Input.ofNullable(precision);
            return this;
        }

        public Builder primaryKey(@Nullable Input<Boolean> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder primaryKey(@Nullable Boolean primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
            return this;
        }

        public Builder scale(@Nullable Input<Integer> scale) {
            this.scale = scale;
            return this;
        }

        public Builder scale(@Nullable Integer scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }
        public OracleColumnArgs build() {
            return new OracleColumnArgs(column, dataType, encoding, length, nullable, ordinalPosition, precision, primaryKey, scale);
        }
    }
}
