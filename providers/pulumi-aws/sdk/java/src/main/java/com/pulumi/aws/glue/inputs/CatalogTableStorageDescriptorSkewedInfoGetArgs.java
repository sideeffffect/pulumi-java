// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSkewedInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSkewedInfoGetArgs Empty = new CatalogTableStorageDescriptorSkewedInfoGetArgs();

    /**
     * List of names of columns that contain skewed values.
     * 
     */
    @Import(name="skewedColumnNames")
    private @Nullable Output<List<String>> skewedColumnNames;

    public Optional<Output<List<String>>> skewedColumnNames() {
        return Optional.ofNullable(this.skewedColumnNames);
    }

    /**
     * List of values that appear so frequently as to be considered skewed.
     * 
     */
    @Import(name="skewedColumnValueLocationMaps")
    private @Nullable Output<Map<String,String>> skewedColumnValueLocationMaps;

    public Optional<Output<Map<String,String>>> skewedColumnValueLocationMaps() {
        return Optional.ofNullable(this.skewedColumnValueLocationMaps);
    }

    /**
     * Map of skewed values to the columns that contain them.
     * 
     */
    @Import(name="skewedColumnValues")
    private @Nullable Output<List<String>> skewedColumnValues;

    public Optional<Output<List<String>>> skewedColumnValues() {
        return Optional.ofNullable(this.skewedColumnValues);
    }

    private CatalogTableStorageDescriptorSkewedInfoGetArgs() {}

    private CatalogTableStorageDescriptorSkewedInfoGetArgs(CatalogTableStorageDescriptorSkewedInfoGetArgs $) {
        this.skewedColumnNames = $.skewedColumnNames;
        this.skewedColumnValueLocationMaps = $.skewedColumnValueLocationMaps;
        this.skewedColumnValues = $.skewedColumnValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTableStorageDescriptorSkewedInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTableStorageDescriptorSkewedInfoGetArgs $;

        public Builder() {
            $ = new CatalogTableStorageDescriptorSkewedInfoGetArgs();
        }

        public Builder(CatalogTableStorageDescriptorSkewedInfoGetArgs defaults) {
            $ = new CatalogTableStorageDescriptorSkewedInfoGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder skewedColumnNames(@Nullable Output<List<String>> skewedColumnNames) {
            $.skewedColumnNames = skewedColumnNames;
            return this;
        }

        public Builder skewedColumnNames(List<String> skewedColumnNames) {
            return skewedColumnNames(Output.of(skewedColumnNames));
        }

        public Builder skewedColumnNames(String... skewedColumnNames) {
            return skewedColumnNames(List.of(skewedColumnNames));
        }

        public Builder skewedColumnValueLocationMaps(@Nullable Output<Map<String,String>> skewedColumnValueLocationMaps) {
            $.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            return this;
        }

        public Builder skewedColumnValueLocationMaps(Map<String,String> skewedColumnValueLocationMaps) {
            return skewedColumnValueLocationMaps(Output.of(skewedColumnValueLocationMaps));
        }

        public Builder skewedColumnValues(@Nullable Output<List<String>> skewedColumnValues) {
            $.skewedColumnValues = skewedColumnValues;
            return this;
        }

        public Builder skewedColumnValues(List<String> skewedColumnValues) {
            return skewedColumnValues(Output.of(skewedColumnValues));
        }

        public Builder skewedColumnValues(String... skewedColumnValues) {
            return skewedColumnValues(List.of(skewedColumnValues));
        }

        public CatalogTableStorageDescriptorSkewedInfoGetArgs build() {
            return $;
        }
    }

}
