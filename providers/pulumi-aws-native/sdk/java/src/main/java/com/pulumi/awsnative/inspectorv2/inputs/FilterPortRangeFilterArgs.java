// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterPortRangeFilterArgs extends ResourceArgs {

    public static final FilterPortRangeFilterArgs Empty = new FilterPortRangeFilterArgs();

    @Import(name="beginInclusive")
    private @Nullable Output<Integer> beginInclusive;

    public Optional<Output<Integer>> beginInclusive() {
        return Optional.ofNullable(this.beginInclusive);
    }

    @Import(name="endInclusive")
    private @Nullable Output<Integer> endInclusive;

    public Optional<Output<Integer>> endInclusive() {
        return Optional.ofNullable(this.endInclusive);
    }

    private FilterPortRangeFilterArgs() {}

    private FilterPortRangeFilterArgs(FilterPortRangeFilterArgs $) {
        this.beginInclusive = $.beginInclusive;
        this.endInclusive = $.endInclusive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterPortRangeFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterPortRangeFilterArgs $;

        public Builder() {
            $ = new FilterPortRangeFilterArgs();
        }

        public Builder(FilterPortRangeFilterArgs defaults) {
            $ = new FilterPortRangeFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder beginInclusive(@Nullable Output<Integer> beginInclusive) {
            $.beginInclusive = beginInclusive;
            return this;
        }

        public Builder beginInclusive(Integer beginInclusive) {
            return beginInclusive(Output.of(beginInclusive));
        }

        public Builder endInclusive(@Nullable Output<Integer> endInclusive) {
            $.endInclusive = endInclusive;
            return this;
        }

        public Builder endInclusive(Integer endInclusive) {
            return endInclusive(Output.of(endInclusive));
        }

        public FilterPortRangeFilterArgs build() {
            return $;
        }
    }

}
