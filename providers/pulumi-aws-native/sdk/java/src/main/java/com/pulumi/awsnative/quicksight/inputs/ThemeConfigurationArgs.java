// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.ThemeDataColorPaletteArgs;
import com.pulumi.awsnative.quicksight.inputs.ThemeSheetStyleArgs;
import com.pulumi.awsnative.quicksight.inputs.ThemeTypographyArgs;
import com.pulumi.awsnative.quicksight.inputs.ThemeUIColorPaletteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The theme configuration. This configuration contains all of the display properties for
 *             a theme.&lt;/p&gt;
 * 
 */
public final class ThemeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThemeConfigurationArgs Empty = new ThemeConfigurationArgs();

    @Import(name="dataColorPalette")
    private @Nullable Output<ThemeDataColorPaletteArgs> dataColorPalette;

    public Optional<Output<ThemeDataColorPaletteArgs>> dataColorPalette() {
        return Optional.ofNullable(this.dataColorPalette);
    }

    @Import(name="sheet")
    private @Nullable Output<ThemeSheetStyleArgs> sheet;

    public Optional<Output<ThemeSheetStyleArgs>> sheet() {
        return Optional.ofNullable(this.sheet);
    }

    @Import(name="typography")
    private @Nullable Output<ThemeTypographyArgs> typography;

    public Optional<Output<ThemeTypographyArgs>> typography() {
        return Optional.ofNullable(this.typography);
    }

    @Import(name="uIColorPalette")
    private @Nullable Output<ThemeUIColorPaletteArgs> uIColorPalette;

    public Optional<Output<ThemeUIColorPaletteArgs>> uIColorPalette() {
        return Optional.ofNullable(this.uIColorPalette);
    }

    private ThemeConfigurationArgs() {}

    private ThemeConfigurationArgs(ThemeConfigurationArgs $) {
        this.dataColorPalette = $.dataColorPalette;
        this.sheet = $.sheet;
        this.typography = $.typography;
        this.uIColorPalette = $.uIColorPalette;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeConfigurationArgs $;

        public Builder() {
            $ = new ThemeConfigurationArgs();
        }

        public Builder(ThemeConfigurationArgs defaults) {
            $ = new ThemeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataColorPalette(@Nullable Output<ThemeDataColorPaletteArgs> dataColorPalette) {
            $.dataColorPalette = dataColorPalette;
            return this;
        }

        public Builder dataColorPalette(ThemeDataColorPaletteArgs dataColorPalette) {
            return dataColorPalette(Output.of(dataColorPalette));
        }

        public Builder sheet(@Nullable Output<ThemeSheetStyleArgs> sheet) {
            $.sheet = sheet;
            return this;
        }

        public Builder sheet(ThemeSheetStyleArgs sheet) {
            return sheet(Output.of(sheet));
        }

        public Builder typography(@Nullable Output<ThemeTypographyArgs> typography) {
            $.typography = typography;
            return this;
        }

        public Builder typography(ThemeTypographyArgs typography) {
            return typography(Output.of(typography));
        }

        public Builder uIColorPalette(@Nullable Output<ThemeUIColorPaletteArgs> uIColorPalette) {
            $.uIColorPalette = uIColorPalette;
            return this;
        }

        public Builder uIColorPalette(ThemeUIColorPaletteArgs uIColorPalette) {
            return uIColorPalette(Output.of(uIColorPalette));
        }

        public ThemeConfigurationArgs build() {
            return $;
        }
    }

}
