// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.ThemeTileLayoutStyleArgs;
import com.pulumi.awsnative.quicksight.inputs.ThemeTileStyleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The theme display options for sheets. &lt;/p&gt;
 * 
 */
public final class ThemeSheetStyleArgs extends ResourceArgs {

    public static final ThemeSheetStyleArgs Empty = new ThemeSheetStyleArgs();

    @Import(name="tile")
    private @Nullable Output<ThemeTileStyleArgs> tile;

    public Optional<Output<ThemeTileStyleArgs>> tile() {
        return Optional.ofNullable(this.tile);
    }

    @Import(name="tileLayout")
    private @Nullable Output<ThemeTileLayoutStyleArgs> tileLayout;

    public Optional<Output<ThemeTileLayoutStyleArgs>> tileLayout() {
        return Optional.ofNullable(this.tileLayout);
    }

    private ThemeSheetStyleArgs() {}

    private ThemeSheetStyleArgs(ThemeSheetStyleArgs $) {
        this.tile = $.tile;
        this.tileLayout = $.tileLayout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeSheetStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeSheetStyleArgs $;

        public Builder() {
            $ = new ThemeSheetStyleArgs();
        }

        public Builder(ThemeSheetStyleArgs defaults) {
            $ = new ThemeSheetStyleArgs(Objects.requireNonNull(defaults));
        }

        public Builder tile(@Nullable Output<ThemeTileStyleArgs> tile) {
            $.tile = tile;
            return this;
        }

        public Builder tile(ThemeTileStyleArgs tile) {
            return tile(Output.of(tile));
        }

        public Builder tileLayout(@Nullable Output<ThemeTileLayoutStyleArgs> tileLayout) {
            $.tileLayout = tileLayout;
            return this;
        }

        public Builder tileLayout(ThemeTileLayoutStyleArgs tileLayout) {
            return tileLayout(Output.of(tileLayout));
        }

        public ThemeSheetStyleArgs build() {
            return $;
        }
    }

}
