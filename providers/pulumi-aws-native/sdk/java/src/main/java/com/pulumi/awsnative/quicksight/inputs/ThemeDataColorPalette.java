// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The theme colors that are used for data colors in charts. The colors description is a
 *             hexadecimal color code that consists of six alphanumerical characters, prefixed with
 *                 <code>#</code>, for example #37BFF5. </p>
 * 
 */
public final class ThemeDataColorPalette extends com.pulumi.resources.InvokeArgs {

    public static final ThemeDataColorPalette Empty = new ThemeDataColorPalette();

    /**
     * <p>The hexadecimal codes for the colors.</p>
     * 
     */
    @Import(name="colors")
      private final @Nullable List<String> colors;

    public List<String> colors() {
        return this.colors == null ? List.of() : this.colors;
    }

    /**
     * <p>The hexadecimal code of a color that applies to charts where a lack of data is
     *             highlighted.</p>
     * 
     */
    @Import(name="emptyFillColor")
      private final @Nullable String emptyFillColor;

    public Optional<String> emptyFillColor() {
        return this.emptyFillColor == null ? Optional.empty() : Optional.ofNullable(this.emptyFillColor);
    }

    /**
     * <p>The minimum and maximum hexadecimal codes that describe a color gradient. </p>
     * 
     */
    @Import(name="minMaxGradient")
      private final @Nullable List<String> minMaxGradient;

    public List<String> minMaxGradient() {
        return this.minMaxGradient == null ? List.of() : this.minMaxGradient;
    }

    public ThemeDataColorPalette(
        @Nullable List<String> colors,
        @Nullable String emptyFillColor,
        @Nullable List<String> minMaxGradient) {
        this.colors = colors;
        this.emptyFillColor = emptyFillColor;
        this.minMaxGradient = minMaxGradient;
    }

    private ThemeDataColorPalette() {
        this.colors = List.of();
        this.emptyFillColor = null;
        this.minMaxGradient = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeDataColorPalette defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> colors;
        private @Nullable String emptyFillColor;
        private @Nullable List<String> minMaxGradient;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeDataColorPalette defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.emptyFillColor = defaults.emptyFillColor;
    	      this.minMaxGradient = defaults.minMaxGradient;
        }

        public Builder colors(@Nullable List<String> colors) {
            this.colors = colors;
            return this;
        }
        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }
        public Builder emptyFillColor(@Nullable String emptyFillColor) {
            this.emptyFillColor = emptyFillColor;
            return this;
        }
        public Builder minMaxGradient(@Nullable List<String> minMaxGradient) {
            this.minMaxGradient = minMaxGradient;
            return this;
        }
        public Builder minMaxGradient(String... minMaxGradient) {
            return minMaxGradient(List.of(minMaxGradient));
        }        public ThemeDataColorPalette build() {
            return new ThemeDataColorPalette(colors, emptyFillColor, minMaxGradient);
        }
    }
}
