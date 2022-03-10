// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.TileResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


/**
 * A mosaic layout divides the available space into a grid of blocks, and overlays the grid with tiles. Unlike GridLayout, tiles may span multiple grid blocks and can be placed at arbitrary locations in the grid.
 * 
 */
public final class MosaicLayoutResponse extends io.pulumi.resources.InvokeArgs {

    public static final MosaicLayoutResponse Empty = new MosaicLayoutResponse();

    /**
     * The number of columns in the mosaic grid. The number of columns must be between 1 and 12, inclusive.
     * 
     */
    @InputImport(name="columns", required=true)
      private final Integer columns;

    public Integer getColumns() {
        return this.columns;
    }

    /**
     * The tiles to display.
     * 
     */
    @InputImport(name="tiles", required=true)
      private final List<TileResponse> tiles;

    public List<TileResponse> getTiles() {
        return this.tiles;
    }

    public MosaicLayoutResponse(
        Integer columns,
        List<TileResponse> tiles) {
        this.columns = Objects.requireNonNull(columns, "expected parameter 'columns' to be non-null");
        this.tiles = Objects.requireNonNull(tiles, "expected parameter 'tiles' to be non-null");
    }

    private MosaicLayoutResponse() {
        this.columns = null;
        this.tiles = List.of();
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
        public MosaicLayoutResponse build() {
            return new MosaicLayoutResponse(columns, tiles);
        }
    }
}
