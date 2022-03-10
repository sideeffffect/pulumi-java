// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cognitive Services account commitment period.
 * 
 */
public final class CommitmentPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommitmentPeriodArgs Empty = new CommitmentPeriodArgs();

    /**
     * Commitment period commitment count.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Commitment period commitment tier.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public CommitmentPeriodArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> tier) {
        this.count = count;
        this.tier = tier;
    }

    private CommitmentPeriodArgs() {
        this.count = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.tier = defaults.tier;
        }

        public Builder count(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder tier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public CommitmentPeriodArgs build() {
            return new CommitmentPeriodArgs(count, tier);
        }
    }
}
