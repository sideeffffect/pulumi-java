// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterDateFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterDateFilterArgs Empty = new FilterDateFilterArgs();

    @InputImport(name="endInclusive")
      private final @Nullable Input<Integer> endInclusive;

    public Input<Integer> getEndInclusive() {
        return this.endInclusive == null ? Input.empty() : this.endInclusive;
    }

    @InputImport(name="startInclusive")
      private final @Nullable Input<Integer> startInclusive;

    public Input<Integer> getStartInclusive() {
        return this.startInclusive == null ? Input.empty() : this.startInclusive;
    }

    public FilterDateFilterArgs(
        @Nullable Input<Integer> endInclusive,
        @Nullable Input<Integer> startInclusive) {
        this.endInclusive = endInclusive;
        this.startInclusive = startInclusive;
    }

    private FilterDateFilterArgs() {
        this.endInclusive = Input.empty();
        this.startInclusive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterDateFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> endInclusive;
        private @Nullable Input<Integer> startInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterDateFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endInclusive = defaults.endInclusive;
    	      this.startInclusive = defaults.startInclusive;
        }

        public Builder endInclusive(@Nullable Input<Integer> endInclusive) {
            this.endInclusive = endInclusive;
            return this;
        }

        public Builder endInclusive(@Nullable Integer endInclusive) {
            this.endInclusive = Input.ofNullable(endInclusive);
            return this;
        }

        public Builder startInclusive(@Nullable Input<Integer> startInclusive) {
            this.startInclusive = startInclusive;
            return this;
        }

        public Builder startInclusive(@Nullable Integer startInclusive) {
            this.startInclusive = Input.ofNullable(startInclusive);
            return this;
        }
        public FilterDateFilterArgs build() {
            return new FilterDateFilterArgs(endInclusive, startInclusive);
        }
    }
}
