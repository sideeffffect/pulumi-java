// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring.v1.outputs.TileResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MosaicLayoutResponse {
    /**
     * @return The number of columns in the mosaic grid. The number of columns must be between 1 and 12, inclusive.
     * 
     */
    private final Integer columns;
    /**
     * @return The tiles to display.
     * 
     */
    private final List<TileResponse> tiles;

    @CustomType.Constructor
    private MosaicLayoutResponse(
        @CustomType.Parameter("columns") Integer columns,
        @CustomType.Parameter("tiles") List<TileResponse> tiles) {
        this.columns = columns;
        this.tiles = tiles;
    }

    /**
     * @return The number of columns in the mosaic grid. The number of columns must be between 1 and 12, inclusive.
     * 
     */
    public Integer columns() {
        return this.columns;
    }
    /**
     * @return The tiles to display.
     * 
     */
    public List<TileResponse> tiles() {
        return this.tiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MosaicLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer columns;
        private List<TileResponse> tiles;

        public Builder() {
    	      // Empty
        }

        public Builder(MosaicLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.tiles = defaults.tiles;
        }

        public Builder columns(Integer columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        public Builder tiles(List<TileResponse> tiles) {
            this.tiles = Objects.requireNonNull(tiles);
            return this;
        }
        public Builder tiles(TileResponse... tiles) {
            return tiles(List.of(tiles));
        }        public MosaicLayoutResponse build() {
            return new MosaicLayoutResponse(columns, tiles);
        }
    }
}
