// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterPortRangeFilter extends com.pulumi.resources.InvokeArgs {

    public static final FilterPortRangeFilter Empty = new FilterPortRangeFilter();

    @Import(name="beginInclusive")
    private @Nullable Integer beginInclusive;

    public Optional<Integer> beginInclusive() {
        return Optional.ofNullable(this.beginInclusive);
    }

    @Import(name="endInclusive")
    private @Nullable Integer endInclusive;

    public Optional<Integer> endInclusive() {
        return Optional.ofNullable(this.endInclusive);
    }

    private FilterPortRangeFilter() {}

    private FilterPortRangeFilter(FilterPortRangeFilter $) {
        this.beginInclusive = $.beginInclusive;
        this.endInclusive = $.endInclusive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterPortRangeFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterPortRangeFilter $;

        public Builder() {
            $ = new FilterPortRangeFilter();
        }

        public Builder(FilterPortRangeFilter defaults) {
            $ = new FilterPortRangeFilter(Objects.requireNonNull(defaults));
        }

        public Builder beginInclusive(@Nullable Integer beginInclusive) {
            $.beginInclusive = beginInclusive;
            return this;
        }

        public Builder endInclusive(@Nullable Integer endInclusive) {
            $.endInclusive = endInclusive;
            return this;
        }

        public FilterPortRangeFilter build() {
            return $;
        }
    }

}
