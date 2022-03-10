// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.DurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FutureReservationTimeWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final FutureReservationTimeWindowArgs Empty = new FutureReservationTimeWindowArgs();

    @InputImport(name="duration")
      private final @Nullable Input<DurationArgs> duration;

    public Input<DurationArgs> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Start time of the Future Reservation. The start_time is an RFC3339 string.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public FutureReservationTimeWindowArgs(
        @Nullable Input<DurationArgs> duration,
        @Nullable Input<String> endTime,
        @Nullable Input<String> startTime) {
        this.duration = duration;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    private FutureReservationTimeWindowArgs() {
        this.duration = Input.empty();
        this.endTime = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationTimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DurationArgs> duration;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationTimeWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(@Nullable Input<DurationArgs> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable DurationArgs duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder endTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public FutureReservationTimeWindowArgs build() {
            return new FutureReservationTimeWindowArgs(duration, endTime, startTime);
        }
    }
}
