// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterNumberFilter extends com.pulumi.resources.InvokeArgs {

    public static final FilterNumberFilter Empty = new FilterNumberFilter();

    @Import(name="lowerInclusive")
    private @Nullable Double lowerInclusive;

    public Optional<Double> lowerInclusive() {
        return Optional.ofNullable(this.lowerInclusive);
    }

    @Import(name="upperInclusive")
    private @Nullable Double upperInclusive;

    public Optional<Double> upperInclusive() {
        return Optional.ofNullable(this.upperInclusive);
    }

    private FilterNumberFilter() {}

    private FilterNumberFilter(FilterNumberFilter $) {
        this.lowerInclusive = $.lowerInclusive;
        this.upperInclusive = $.upperInclusive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterNumberFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterNumberFilter $;

        public Builder() {
            $ = new FilterNumberFilter();
        }

        public Builder(FilterNumberFilter defaults) {
            $ = new FilterNumberFilter(Objects.requireNonNull(defaults));
        }

        public Builder lowerInclusive(@Nullable Double lowerInclusive) {
            $.lowerInclusive = lowerInclusive;
            return this;
        }

        public Builder upperInclusive(@Nullable Double upperInclusive) {
            $.upperInclusive = upperInclusive;
            return this;
        }

        public FilterNumberFilter build() {
            return $;
        }
    }

}
