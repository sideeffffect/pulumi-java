// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.enums.SpotFleetSpotCapacityRebalanceReplacementStrategy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetSpotCapacityRebalanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetSpotCapacityRebalanceArgs Empty = new SpotFleetSpotCapacityRebalanceArgs();

    @Import(name="replacementStrategy")
    private @Nullable Output<SpotFleetSpotCapacityRebalanceReplacementStrategy> replacementStrategy;

    public Optional<Output<SpotFleetSpotCapacityRebalanceReplacementStrategy>> replacementStrategy() {
        return Optional.ofNullable(this.replacementStrategy);
    }

    @Import(name="terminationDelay")
    private @Nullable Output<Integer> terminationDelay;

    public Optional<Output<Integer>> terminationDelay() {
        return Optional.ofNullable(this.terminationDelay);
    }

    private SpotFleetSpotCapacityRebalanceArgs() {}

    private SpotFleetSpotCapacityRebalanceArgs(SpotFleetSpotCapacityRebalanceArgs $) {
        this.replacementStrategy = $.replacementStrategy;
        this.terminationDelay = $.terminationDelay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetSpotCapacityRebalanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetSpotCapacityRebalanceArgs $;

        public Builder() {
            $ = new SpotFleetSpotCapacityRebalanceArgs();
        }

        public Builder(SpotFleetSpotCapacityRebalanceArgs defaults) {
            $ = new SpotFleetSpotCapacityRebalanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder replacementStrategy(@Nullable Output<SpotFleetSpotCapacityRebalanceReplacementStrategy> replacementStrategy) {
            $.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder replacementStrategy(SpotFleetSpotCapacityRebalanceReplacementStrategy replacementStrategy) {
            return replacementStrategy(Output.of(replacementStrategy));
        }

        public Builder terminationDelay(@Nullable Output<Integer> terminationDelay) {
            $.terminationDelay = terminationDelay;
            return this;
        }

        public Builder terminationDelay(Integer terminationDelay) {
            return terminationDelay(Output.of(terminationDelay));
        }

        public SpotFleetSpotCapacityRebalanceArgs build() {
            return $;
        }
    }

}
