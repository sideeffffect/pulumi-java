// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowLogDestinationOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowLogDestinationOptionsArgs Empty = new FlowLogDestinationOptionsArgs();

    /**
     * The format for the flow log. Default value: `plain-text`. Valid values: `plain-text`, `parquet`.
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3. Default value: `false`.
     * 
     */
    @Import(name="hiveCompatiblePartitions")
    private @Nullable Output<Boolean> hiveCompatiblePartitions;

    public Optional<Output<Boolean>> hiveCompatiblePartitions() {
        return Optional.ofNullable(this.hiveCompatiblePartitions);
    }

    /**
     * Indicates whether to partition the flow log per hour. This reduces the cost and response time for queries. Default value: `false`.
     * 
     */
    @Import(name="perHourPartition")
    private @Nullable Output<Boolean> perHourPartition;

    public Optional<Output<Boolean>> perHourPartition() {
        return Optional.ofNullable(this.perHourPartition);
    }

    private FlowLogDestinationOptionsArgs() {}

    private FlowLogDestinationOptionsArgs(FlowLogDestinationOptionsArgs $) {
        this.fileFormat = $.fileFormat;
        this.hiveCompatiblePartitions = $.hiveCompatiblePartitions;
        this.perHourPartition = $.perHourPartition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowLogDestinationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowLogDestinationOptionsArgs $;

        public Builder() {
            $ = new FlowLogDestinationOptionsArgs();
        }

        public Builder(FlowLogDestinationOptionsArgs defaults) {
            $ = new FlowLogDestinationOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        public Builder hiveCompatiblePartitions(@Nullable Output<Boolean> hiveCompatiblePartitions) {
            $.hiveCompatiblePartitions = hiveCompatiblePartitions;
            return this;
        }

        public Builder hiveCompatiblePartitions(Boolean hiveCompatiblePartitions) {
            return hiveCompatiblePartitions(Output.of(hiveCompatiblePartitions));
        }

        public Builder perHourPartition(@Nullable Output<Boolean> perHourPartition) {
            $.perHourPartition = perHourPartition;
            return this;
        }

        public Builder perHourPartition(Boolean perHourPartition) {
            return perHourPartition(Output.of(perHourPartition));
        }

        public FlowLogDestinationOptionsArgs build() {
            return $;
        }
    }

}
