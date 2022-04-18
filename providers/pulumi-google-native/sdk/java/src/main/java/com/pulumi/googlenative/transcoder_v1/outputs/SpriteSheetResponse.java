// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpriteSheetResponse {
    /**
     * The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
     * 
     */
    private final Integer columnCount;
    /**
     * End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
     * 
     */
    private final String endTimeOffset;
    /**
     * File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
     * 
     */
    private final String filePrefix;
    /**
     * Format type. The default is `jpeg`. Supported formats: - `jpeg`
     * 
     */
    private final String format;
    /**
     * Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
     * 
     */
    private final String interval;
    /**
     * The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
     * 
     */
    private final Integer quality;
    /**
     * The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
     * 
     */
    private final Integer rowCount;
    /**
     * The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    private final Integer spriteHeightPixels;
    /**
     * The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    private final Integer spriteWidthPixels;
    /**
     * Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
     * 
     */
    private final String startTimeOffset;
    /**
     * Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
     * 
     */
    private final Integer totalCount;

    @CustomType.Constructor
    private SpriteSheetResponse(
        @CustomType.Parameter("columnCount") Integer columnCount,
        @CustomType.Parameter("endTimeOffset") String endTimeOffset,
        @CustomType.Parameter("filePrefix") String filePrefix,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("interval") String interval,
        @CustomType.Parameter("quality") Integer quality,
        @CustomType.Parameter("rowCount") Integer rowCount,
        @CustomType.Parameter("spriteHeightPixels") Integer spriteHeightPixels,
        @CustomType.Parameter("spriteWidthPixels") Integer spriteWidthPixels,
        @CustomType.Parameter("startTimeOffset") String startTimeOffset,
        @CustomType.Parameter("totalCount") Integer totalCount) {
        this.columnCount = columnCount;
        this.endTimeOffset = endTimeOffset;
        this.filePrefix = filePrefix;
        this.format = format;
        this.interval = interval;
        this.quality = quality;
        this.rowCount = rowCount;
        this.spriteHeightPixels = spriteHeightPixels;
        this.spriteWidthPixels = spriteWidthPixels;
        this.startTimeOffset = startTimeOffset;
        this.totalCount = totalCount;
    }

    /**
     * The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
     * 
    */
    public Integer columnCount() {
        return this.columnCount;
    }
    /**
     * End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
     * 
    */
    public String endTimeOffset() {
        return this.endTimeOffset;
    }
    /**
     * File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
     * 
    */
    public String filePrefix() {
        return this.filePrefix;
    }
    /**
     * Format type. The default is `jpeg`. Supported formats: - `jpeg`
     * 
    */
    public String format() {
        return this.format;
    }
    /**
     * Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
     * 
    */
    public String interval() {
        return this.interval;
    }
    /**
     * The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
     * 
    */
    public Integer quality() {
        return this.quality;
    }
    /**
     * The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
     * 
    */
    public Integer rowCount() {
        return this.rowCount;
    }
    /**
     * The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
     * 
    */
    public Integer spriteHeightPixels() {
        return this.spriteHeightPixels;
    }
    /**
     * The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
     * 
    */
    public Integer spriteWidthPixels() {
        return this.spriteWidthPixels;
    }
    /**
     * Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
     * 
    */
    public String startTimeOffset() {
        return this.startTimeOffset;
    }
    /**
     * Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
     * 
    */
    public Integer totalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpriteSheetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer columnCount;
        private String endTimeOffset;
        private String filePrefix;
        private String format;
        private String interval;
        private Integer quality;
        private Integer rowCount;
        private Integer spriteHeightPixels;
        private Integer spriteWidthPixels;
        private String startTimeOffset;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpriteSheetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnCount = defaults.columnCount;
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.filePrefix = defaults.filePrefix;
    	      this.format = defaults.format;
    	      this.interval = defaults.interval;
    	      this.quality = defaults.quality;
    	      this.rowCount = defaults.rowCount;
    	      this.spriteHeightPixels = defaults.spriteHeightPixels;
    	      this.spriteWidthPixels = defaults.spriteWidthPixels;
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder columnCount(Integer columnCount) {
            this.columnCount = Objects.requireNonNull(columnCount);
            return this;
        }
        public Builder endTimeOffset(String endTimeOffset) {
            this.endTimeOffset = Objects.requireNonNull(endTimeOffset);
            return this;
        }
        public Builder filePrefix(String filePrefix) {
            this.filePrefix = Objects.requireNonNull(filePrefix);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder quality(Integer quality) {
            this.quality = Objects.requireNonNull(quality);
            return this;
        }
        public Builder rowCount(Integer rowCount) {
            this.rowCount = Objects.requireNonNull(rowCount);
            return this;
        }
        public Builder spriteHeightPixels(Integer spriteHeightPixels) {
            this.spriteHeightPixels = Objects.requireNonNull(spriteHeightPixels);
            return this;
        }
        public Builder spriteWidthPixels(Integer spriteWidthPixels) {
            this.spriteWidthPixels = Objects.requireNonNull(spriteWidthPixels);
            return this;
        }
        public Builder startTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }
        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }        public SpriteSheetResponse build() {
            return new SpriteSheetResponse(columnCount, endTimeOffset, filePrefix, format, interval, quality, rowCount, spriteHeightPixels, spriteWidthPixels, startTimeOffset, totalCount);
        }
    }
}
