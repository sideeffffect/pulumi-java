// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Video cropping configuration for the input video. The cropped input video is scaled to match the output resolution.
 * 
 */
public final class CropResponse extends com.pulumi.resources.InvokeArgs {

    public static final CropResponse Empty = new CropResponse();

    /**
     * The number of pixels to crop from the bottom. The default is 0.
     * 
     */
    @Import(name="bottomPixels", required=true)
    private Integer bottomPixels;

    public Integer bottomPixels() {
        return this.bottomPixels;
    }

    /**
     * The number of pixels to crop from the left. The default is 0.
     * 
     */
    @Import(name="leftPixels", required=true)
    private Integer leftPixels;

    public Integer leftPixels() {
        return this.leftPixels;
    }

    /**
     * The number of pixels to crop from the right. The default is 0.
     * 
     */
    @Import(name="rightPixels", required=true)
    private Integer rightPixels;

    public Integer rightPixels() {
        return this.rightPixels;
    }

    /**
     * The number of pixels to crop from the top. The default is 0.
     * 
     */
    @Import(name="topPixels", required=true)
    private Integer topPixels;

    public Integer topPixels() {
        return this.topPixels;
    }

    private CropResponse() {}

    private CropResponse(CropResponse $) {
        this.bottomPixels = $.bottomPixels;
        this.leftPixels = $.leftPixels;
        this.rightPixels = $.rightPixels;
        this.topPixels = $.topPixels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CropResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CropResponse $;

        public Builder() {
            $ = new CropResponse();
        }

        public Builder(CropResponse defaults) {
            $ = new CropResponse(Objects.requireNonNull(defaults));
        }

        public Builder bottomPixels(Integer bottomPixels) {
            $.bottomPixels = bottomPixels;
            return this;
        }

        public Builder leftPixels(Integer leftPixels) {
            $.leftPixels = leftPixels;
            return this;
        }

        public Builder rightPixels(Integer rightPixels) {
            $.rightPixels = rightPixels;
            return this;
        }

        public Builder topPixels(Integer topPixels) {
            $.topPixels = topPixels;
            return this;
        }

        public CropResponse build() {
            $.bottomPixels = Objects.requireNonNull($.bottomPixels, "expected parameter 'bottomPixels' to be non-null");
            $.leftPixels = Objects.requireNonNull($.leftPixels, "expected parameter 'leftPixels' to be non-null");
            $.rightPixels = Objects.requireNonNull($.rightPixels, "expected parameter 'rightPixels' to be non-null");
            $.topPixels = Objects.requireNonNull($.topPixels, "expected parameter 'topPixels' to be non-null");
            return $;
        }
    }

}
