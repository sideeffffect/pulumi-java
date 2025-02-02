// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Color preprocessing configuration. **Note:** This configuration is not supported.
 * 
 */
public final class ColorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ColorArgs Empty = new ColorArgs();

    /**
     * Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    @Import(name="brightness")
    private @Nullable Output<Double> brightness;

    /**
     * @return Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
     * 
     */
    public Optional<Output<Double>> brightness() {
        return Optional.ofNullable(this.brightness);
    }

    /**
     * Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    @Import(name="contrast")
    private @Nullable Output<Double> contrast;

    /**
     * @return Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
     * 
     */
    public Optional<Output<Double>> contrast() {
        return Optional.ofNullable(this.contrast);
    }

    /**
     * Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    @Import(name="saturation")
    private @Nullable Output<Double> saturation;

    /**
     * @return Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
     * 
     */
    public Optional<Output<Double>> saturation() {
        return Optional.ofNullable(this.saturation);
    }

    private ColorArgs() {}

    private ColorArgs(ColorArgs $) {
        this.brightness = $.brightness;
        this.contrast = $.contrast;
        this.saturation = $.saturation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ColorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColorArgs $;

        public Builder() {
            $ = new ColorArgs();
        }

        public Builder(ColorArgs defaults) {
            $ = new ColorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brightness Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder brightness(@Nullable Output<Double> brightness) {
            $.brightness = brightness;
            return this;
        }

        /**
         * @param brightness Control brightness of the video. Enter a value between -1 and 1, where -1 is minimum brightness and 1 is maximum brightness. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder brightness(Double brightness) {
            return brightness(Output.of(brightness));
        }

        /**
         * @param contrast Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder contrast(@Nullable Output<Double> contrast) {
            $.contrast = contrast;
            return this;
        }

        /**
         * @param contrast Control black and white contrast of the video. Enter a value between -1 and 1, where -1 is minimum contrast and 1 is maximum contrast. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder contrast(Double contrast) {
            return contrast(Output.of(contrast));
        }

        /**
         * @param saturation Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder saturation(@Nullable Output<Double> saturation) {
            $.saturation = saturation;
            return this;
        }

        /**
         * @param saturation Control color saturation of the video. Enter a value between -1 and 1, where -1 is fully desaturated and 1 is maximum saturation. 0 is no change. The default is 0.
         * 
         * @return builder
         * 
         */
        public Builder saturation(Double saturation) {
            return saturation(Output.of(saturation));
        }

        public ColorArgs build() {
            return $;
        }
    }

}
