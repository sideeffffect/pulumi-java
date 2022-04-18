// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.outputs.ThemeGutterStyle;
import com.pulumi.awsnative.quicksight.outputs.ThemeMarginStyle;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThemeTileLayoutStyle {
    private final @Nullable ThemeGutterStyle gutter;
    private final @Nullable ThemeMarginStyle margin;

    @CustomType.Constructor
    private ThemeTileLayoutStyle(
        @CustomType.Parameter("gutter") @Nullable ThemeGutterStyle gutter,
        @CustomType.Parameter("margin") @Nullable ThemeMarginStyle margin) {
        this.gutter = gutter;
        this.margin = margin;
    }

    public Optional<ThemeGutterStyle> gutter() {
        return Optional.ofNullable(this.gutter);
    }
    public Optional<ThemeMarginStyle> margin() {
        return Optional.ofNullable(this.margin);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTileLayoutStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ThemeGutterStyle gutter;
        private @Nullable ThemeMarginStyle margin;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTileLayoutStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gutter = defaults.gutter;
    	      this.margin = defaults.margin;
        }

        public Builder gutter(@Nullable ThemeGutterStyle gutter) {
            this.gutter = gutter;
            return this;
        }
        public Builder margin(@Nullable ThemeMarginStyle margin) {
            this.margin = margin;
            return this;
        }        public ThemeTileLayoutStyle build() {
            return new ThemeTileLayoutStyle(gutter, margin);
        }
    }
}
