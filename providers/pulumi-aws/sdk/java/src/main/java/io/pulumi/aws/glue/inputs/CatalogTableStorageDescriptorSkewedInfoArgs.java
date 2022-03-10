// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSkewedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSkewedInfoArgs Empty = new CatalogTableStorageDescriptorSkewedInfoArgs();

    /**
     * List of names of columns that contain skewed values.
     * 
     */
    @InputImport(name="skewedColumnNames")
      private final @Nullable Input<List<String>> skewedColumnNames;

    public Input<List<String>> getSkewedColumnNames() {
        return this.skewedColumnNames == null ? Input.empty() : this.skewedColumnNames;
    }

    /**
     * List of values that appear so frequently as to be considered skewed.
     * 
     */
    @InputImport(name="skewedColumnValueLocationMaps")
      private final @Nullable Input<Map<String,String>> skewedColumnValueLocationMaps;

    public Input<Map<String,String>> getSkewedColumnValueLocationMaps() {
        return this.skewedColumnValueLocationMaps == null ? Input.empty() : this.skewedColumnValueLocationMaps;
    }

    /**
     * Map of skewed values to the columns that contain them.
     * 
     */
    @InputImport(name="skewedColumnValues")
      private final @Nullable Input<List<String>> skewedColumnValues;

    public Input<List<String>> getSkewedColumnValues() {
        return this.skewedColumnValues == null ? Input.empty() : this.skewedColumnValues;
    }

    public CatalogTableStorageDescriptorSkewedInfoArgs(
        @Nullable Input<List<String>> skewedColumnNames,
        @Nullable Input<Map<String,String>> skewedColumnValueLocationMaps,
        @Nullable Input<List<String>> skewedColumnValues) {
        this.skewedColumnNames = skewedColumnNames;
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        this.skewedColumnValues = skewedColumnValues;
    }

    private CatalogTableStorageDescriptorSkewedInfoArgs() {
        this.skewedColumnNames = Input.empty();
        this.skewedColumnValueLocationMaps = Input.empty();
        this.skewedColumnValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSkewedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> skewedColumnNames;
        private @Nullable Input<Map<String,String>> skewedColumnValueLocationMaps;
        private @Nullable Input<List<String>> skewedColumnValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSkewedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skewedColumnNames = defaults.skewedColumnNames;
    	      this.skewedColumnValueLocationMaps = defaults.skewedColumnValueLocationMaps;
    	      this.skewedColumnValues = defaults.skewedColumnValues;
        }

        public Builder skewedColumnNames(@Nullable Input<List<String>> skewedColumnNames) {
            this.skewedColumnNames = skewedColumnNames;
            return this;
        }

        public Builder skewedColumnNames(@Nullable List<String> skewedColumnNames) {
            this.skewedColumnNames = Input.ofNullable(skewedColumnNames);
            return this;
        }

        public Builder skewedColumnValueLocationMaps(@Nullable Input<Map<String,String>> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            return this;
        }

        public Builder skewedColumnValueLocationMaps(@Nullable Map<String,String> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = Input.ofNullable(skewedColumnValueLocationMaps);
            return this;
        }

        public Builder skewedColumnValues(@Nullable Input<List<String>> skewedColumnValues) {
            this.skewedColumnValues = skewedColumnValues;
            return this;
        }

        public Builder skewedColumnValues(@Nullable List<String> skewedColumnValues) {
            this.skewedColumnValues = Input.ofNullable(skewedColumnValues);
            return this;
        }
        public CatalogTableStorageDescriptorSkewedInfoArgs build() {
            return new CatalogTableStorageDescriptorSkewedInfoArgs(skewedColumnNames, skewedColumnValueLocationMaps, skewedColumnValues);
        }
    }
}
