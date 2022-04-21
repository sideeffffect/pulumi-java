// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndpointGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigEndpointGetArgs Empty = new RealtimeLogConfigEndpointGetArgs();

    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    @Import(name="kinesisStreamConfig", required=true)
    private Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig;

    public Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    @Import(name="streamType", required=true)
    private Output<String> streamType;

    public Output<String> streamType() {
        return this.streamType;
    }

    private RealtimeLogConfigEndpointGetArgs() {}

    private RealtimeLogConfigEndpointGetArgs(RealtimeLogConfigEndpointGetArgs $) {
        this.kinesisStreamConfig = $.kinesisStreamConfig;
        this.streamType = $.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RealtimeLogConfigEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigEndpointGetArgs $;

        public Builder() {
            $ = new RealtimeLogConfigEndpointGetArgs();
        }

        public Builder(RealtimeLogConfigEndpointGetArgs defaults) {
            $ = new RealtimeLogConfigEndpointGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder kinesisStreamConfig(Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig) {
            $.kinesisStreamConfig = kinesisStreamConfig;
            return this;
        }

        public Builder kinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfigGetArgs kinesisStreamConfig) {
            return kinesisStreamConfig(Output.of(kinesisStreamConfig));
        }

        public Builder streamType(Output<String> streamType) {
            $.streamType = streamType;
            return this;
        }

        public Builder streamType(String streamType) {
            return streamType(Output.of(streamType));
        }

        public RealtimeLogConfigEndpointGetArgs build() {
            $.kinesisStreamConfig = Objects.requireNonNull($.kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
            $.streamType = Objects.requireNonNull($.streamType, "expected parameter 'streamType' to be non-null");
            return $;
        }
    }

}
