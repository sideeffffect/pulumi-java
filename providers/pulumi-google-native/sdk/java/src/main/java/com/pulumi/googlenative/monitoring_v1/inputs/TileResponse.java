// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring_v1.inputs.WidgetResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * A single tile in the mosaic. The placement and size of the tile are configurable.
 * 
 */
public final class TileResponse extends com.pulumi.resources.InvokeArgs {

    public static final TileResponse Empty = new TileResponse();

    /**
     * The height of the tile, measured in grid blocks. Tiles must have a minimum height of 1.
     * 
     */
    @Import(name="height", required=true)
    private Integer height;

    public Integer height() {
        return this.height;
    }

    /**
     * The informational widget contained in the tile. For example an XyChart.
     * 
     */
    @Import(name="widget", required=true)
    private WidgetResponse widget;

    public WidgetResponse widget() {
        return this.widget;
    }

    /**
     * The width of the tile, measured in grid blocks. Tiles must have a minimum width of 1.
     * 
     */
    @Import(name="width", required=true)
    private Integer width;

    public Integer width() {
        return this.width;
    }

    /**
     * The zero-indexed position of the tile in grid blocks relative to the left edge of the grid. Tiles must be contained within the specified number of columns. x_pos cannot be negative.
     * 
     */
    @Import(name="xPos", required=true)
    private Integer xPos;

    public Integer xPos() {
        return this.xPos;
    }

    /**
     * The zero-indexed position of the tile in grid blocks relative to the top edge of the grid. y_pos cannot be negative.
     * 
     */
    @Import(name="yPos", required=true)
    private Integer yPos;

    public Integer yPos() {
        return this.yPos;
    }

    private TileResponse() {}

    private TileResponse(TileResponse $) {
        this.height = $.height;
        this.widget = $.widget;
        this.width = $.width;
        this.xPos = $.xPos;
        this.yPos = $.yPos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TileResponse $;

        public Builder() {
            $ = new TileResponse();
        }

        public Builder(TileResponse defaults) {
            $ = new TileResponse(Objects.requireNonNull(defaults));
        }

        public Builder height(Integer height) {
            $.height = height;
            return this;
        }

        public Builder widget(WidgetResponse widget) {
            $.widget = widget;
            return this;
        }

        public Builder width(Integer width) {
            $.width = width;
            return this;
        }

        public Builder xPos(Integer xPos) {
            $.xPos = xPos;
            return this;
        }

        public Builder yPos(Integer yPos) {
            $.yPos = yPos;
            return this;
        }

        public TileResponse build() {
            $.height = Objects.requireNonNull($.height, "expected parameter 'height' to be non-null");
            $.widget = Objects.requireNonNull($.widget, "expected parameter 'widget' to be non-null");
            $.width = Objects.requireNonNull($.width, "expected parameter 'width' to be non-null");
            $.xPos = Objects.requireNonNull($.xPos, "expected parameter 'xPos' to be non-null");
            $.yPos = Objects.requireNonNull($.yPos, "expected parameter 'yPos' to be non-null");
            return $;
        }
    }

}
