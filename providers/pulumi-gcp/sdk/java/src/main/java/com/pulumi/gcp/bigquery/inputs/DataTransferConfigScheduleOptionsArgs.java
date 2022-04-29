// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataTransferConfigScheduleOptionsArgs extends ResourceArgs {

    public static final DataTransferConfigScheduleOptionsArgs Empty = new DataTransferConfigScheduleOptionsArgs();

    /**
     * If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
     */
    @Import(name="disableAutoScheduling")
    private @Nullable Output<Boolean> disableAutoScheduling;

    /**
     * @return If true, automatic scheduling of data transfer runs for this
     * configuration will be disabled. The runs can be started on ad-hoc
     * basis using transferConfigs.startManualRuns API. When automatic
     * scheduling is disabled, the TransferConfig.schedule field will
     * be ignored.
     * 
     */
    public Optional<Output<Boolean>> disableAutoScheduling() {
        return Optional.ofNullable(this.disableAutoScheduling);
    }

    /**
     * Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return Defines time to stop scheduling transfer runs. A transfer run cannot be
     * scheduled at or after the end time. The end time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Specifies time to start scheduling transfer runs. The first run will be
     * scheduled at or after the start time according to a recurrence pattern
     * defined in the schedule string. The start time can be changed at any
     * moment. The time when a data transfer can be triggered manually is not
     * limited by this option.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private DataTransferConfigScheduleOptionsArgs() {}

    private DataTransferConfigScheduleOptionsArgs(DataTransferConfigScheduleOptionsArgs $) {
        this.disableAutoScheduling = $.disableAutoScheduling;
        this.endTime = $.endTime;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataTransferConfigScheduleOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataTransferConfigScheduleOptionsArgs $;

        public Builder() {
            $ = new DataTransferConfigScheduleOptionsArgs();
        }

        public Builder(DataTransferConfigScheduleOptionsArgs defaults) {
            $ = new DataTransferConfigScheduleOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableAutoScheduling If true, automatic scheduling of data transfer runs for this
         * configuration will be disabled. The runs can be started on ad-hoc
         * basis using transferConfigs.startManualRuns API. When automatic
         * scheduling is disabled, the TransferConfig.schedule field will
         * be ignored.
         * 
         * @return builder
         * 
         */
        public Builder disableAutoScheduling(@Nullable Output<Boolean> disableAutoScheduling) {
            $.disableAutoScheduling = disableAutoScheduling;
            return this;
        }

        /**
         * @param disableAutoScheduling If true, automatic scheduling of data transfer runs for this
         * configuration will be disabled. The runs can be started on ad-hoc
         * basis using transferConfigs.startManualRuns API. When automatic
         * scheduling is disabled, the TransferConfig.schedule field will
         * be ignored.
         * 
         * @return builder
         * 
         */
        public Builder disableAutoScheduling(Boolean disableAutoScheduling) {
            return disableAutoScheduling(Output.of(disableAutoScheduling));
        }

        /**
         * @param endTime Defines time to stop scheduling transfer runs. A transfer run cannot be
         * scheduled at or after the end time. The end time can be changed at any
         * moment. The time when a data transfer can be triggered manually is not
         * limited by this option.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Defines time to stop scheduling transfer runs. A transfer run cannot be
         * scheduled at or after the end time. The end time can be changed at any
         * moment. The time when a data transfer can be triggered manually is not
         * limited by this option.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startTime Specifies time to start scheduling transfer runs. The first run will be
         * scheduled at or after the start time according to a recurrence pattern
         * defined in the schedule string. The start time can be changed at any
         * moment. The time when a data transfer can be triggered manually is not
         * limited by this option.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Specifies time to start scheduling transfer runs. The first run will be
         * scheduled at or after the start time according to a recurrence pattern
         * defined in the schedule string. The start time can be changed at any
         * moment. The time when a data transfer can be triggered manually is not
         * limited by this option.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public DataTransferConfigScheduleOptionsArgs build() {
            return $;
        }
    }

}
