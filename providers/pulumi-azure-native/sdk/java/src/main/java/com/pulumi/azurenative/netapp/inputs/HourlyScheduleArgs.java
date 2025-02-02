// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hourly Schedule properties
 * 
 */
public final class HourlyScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final HourlyScheduleArgs Empty = new HourlyScheduleArgs();

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @Import(name="minute")
    private @Nullable Output<Integer> minute;

    /**
     * @return Indicates which minute snapshot should be taken
     * 
     */
    public Optional<Output<Integer>> minute() {
        return Optional.ofNullable(this.minute);
    }

    /**
     * Hourly snapshot count to keep
     * 
     */
    @Import(name="snapshotsToKeep")
    private @Nullable Output<Integer> snapshotsToKeep;

    /**
     * @return Hourly snapshot count to keep
     * 
     */
    public Optional<Output<Integer>> snapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @Import(name="usedBytes")
    private @Nullable Output<Double> usedBytes;

    /**
     * @return Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    public Optional<Output<Double>> usedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    private HourlyScheduleArgs() {}

    private HourlyScheduleArgs(HourlyScheduleArgs $) {
        this.minute = $.minute;
        this.snapshotsToKeep = $.snapshotsToKeep;
        this.usedBytes = $.usedBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HourlyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HourlyScheduleArgs $;

        public Builder() {
            $ = new HourlyScheduleArgs();
        }

        public Builder(HourlyScheduleArgs defaults) {
            $ = new HourlyScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minute Indicates which minute snapshot should be taken
         * 
         * @return builder
         * 
         */
        public Builder minute(@Nullable Output<Integer> minute) {
            $.minute = minute;
            return this;
        }

        /**
         * @param minute Indicates which minute snapshot should be taken
         * 
         * @return builder
         * 
         */
        public Builder minute(Integer minute) {
            return minute(Output.of(minute));
        }

        /**
         * @param snapshotsToKeep Hourly snapshot count to keep
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(@Nullable Output<Integer> snapshotsToKeep) {
            $.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        /**
         * @param snapshotsToKeep Hourly snapshot count to keep
         * 
         * @return builder
         * 
         */
        public Builder snapshotsToKeep(Integer snapshotsToKeep) {
            return snapshotsToKeep(Output.of(snapshotsToKeep));
        }

        /**
         * @param usedBytes Resource size in bytes, current storage usage for the volume in bytes
         * 
         * @return builder
         * 
         */
        public Builder usedBytes(@Nullable Output<Double> usedBytes) {
            $.usedBytes = usedBytes;
            return this;
        }

        /**
         * @param usedBytes Resource size in bytes, current storage usage for the volume in bytes
         * 
         * @return builder
         * 
         */
        public Builder usedBytes(Double usedBytes) {
            return usedBytes(Output.of(usedBytes));
        }

        public HourlyScheduleArgs build() {
            return $;
        }
    }

}
