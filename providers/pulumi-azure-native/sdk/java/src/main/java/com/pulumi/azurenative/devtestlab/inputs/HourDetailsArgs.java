// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an hourly schedule.
 * 
 */
public final class HourDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HourDetailsArgs Empty = new HourDetailsArgs();

    /**
     * Minutes of the hour the schedule will run.
     * 
     */
    @Import(name="minute")
    private @Nullable Output<Integer> minute;

    public Optional<Output<Integer>> minute() {
        return Optional.ofNullable(this.minute);
    }

    private HourDetailsArgs() {}

    private HourDetailsArgs(HourDetailsArgs $) {
        this.minute = $.minute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HourDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HourDetailsArgs $;

        public Builder() {
            $ = new HourDetailsArgs();
        }

        public Builder(HourDetailsArgs defaults) {
            $ = new HourDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder minute(@Nullable Output<Integer> minute) {
            $.minute = minute;
            return this;
        }

        public Builder minute(Integer minute) {
            return minute(Output.of(minute));
        }

        public HourDetailsArgs build() {
            return $;
        }
    }

}
