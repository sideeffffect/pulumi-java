// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelRetentionPeriodArgs extends ResourceArgs {

    public static final ChannelRetentionPeriodArgs Empty = new ChannelRetentionPeriodArgs();

    @Import(name="numberOfDays")
    private @Nullable Output<Integer> numberOfDays;

    public Optional<Output<Integer>> numberOfDays() {
        return Optional.ofNullable(this.numberOfDays);
    }

    @Import(name="unlimited")
    private @Nullable Output<Boolean> unlimited;

    public Optional<Output<Boolean>> unlimited() {
        return Optional.ofNullable(this.unlimited);
    }

    private ChannelRetentionPeriodArgs() {}

    private ChannelRetentionPeriodArgs(ChannelRetentionPeriodArgs $) {
        this.numberOfDays = $.numberOfDays;
        this.unlimited = $.unlimited;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelRetentionPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelRetentionPeriodArgs $;

        public Builder() {
            $ = new ChannelRetentionPeriodArgs();
        }

        public Builder(ChannelRetentionPeriodArgs defaults) {
            $ = new ChannelRetentionPeriodArgs(Objects.requireNonNull(defaults));
        }

        public Builder numberOfDays(@Nullable Output<Integer> numberOfDays) {
            $.numberOfDays = numberOfDays;
            return this;
        }

        public Builder numberOfDays(Integer numberOfDays) {
            return numberOfDays(Output.of(numberOfDays));
        }

        public Builder unlimited(@Nullable Output<Boolean> unlimited) {
            $.unlimited = unlimited;
            return this;
        }

        public Builder unlimited(Boolean unlimited) {
            return unlimited(Output.of(unlimited));
        }

        public ChannelRetentionPeriodArgs build() {
            return $;
        }
    }

}
