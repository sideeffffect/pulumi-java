// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.qldb;

import com.pulumi.awsnative.qldb.inputs.StreamKinesisConfigurationArgs;
import com.pulumi.awsnative.qldb.inputs.StreamTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamArgs Empty = new StreamArgs();

    @Import(name="exclusiveEndTime")
    private @Nullable Output<String> exclusiveEndTime;

    public Optional<Output<String>> exclusiveEndTime() {
        return Optional.ofNullable(this.exclusiveEndTime);
    }

    @Import(name="inclusiveStartTime", required=true)
    private Output<String> inclusiveStartTime;

    public Output<String> inclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    @Import(name="kinesisConfiguration", required=true)
    private Output<StreamKinesisConfigurationArgs> kinesisConfiguration;

    public Output<StreamKinesisConfigurationArgs> kinesisConfiguration() {
        return this.kinesisConfiguration;
    }

    @Import(name="ledgerName", required=true)
    private Output<String> ledgerName;

    public Output<String> ledgerName() {
        return this.ledgerName;
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="streamName")
    private @Nullable Output<String> streamName;

    public Optional<Output<String>> streamName() {
        return Optional.ofNullable(this.streamName);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StreamTagArgs>> tags;

    public Optional<Output<List<StreamTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private StreamArgs() {}

    private StreamArgs(StreamArgs $) {
        this.exclusiveEndTime = $.exclusiveEndTime;
        this.inclusiveStartTime = $.inclusiveStartTime;
        this.kinesisConfiguration = $.kinesisConfiguration;
        this.ledgerName = $.ledgerName;
        this.roleArn = $.roleArn;
        this.streamName = $.streamName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamArgs $;

        public Builder() {
            $ = new StreamArgs();
        }

        public Builder(StreamArgs defaults) {
            $ = new StreamArgs(Objects.requireNonNull(defaults));
        }

        public Builder exclusiveEndTime(@Nullable Output<String> exclusiveEndTime) {
            $.exclusiveEndTime = exclusiveEndTime;
            return this;
        }

        public Builder exclusiveEndTime(String exclusiveEndTime) {
            return exclusiveEndTime(Output.of(exclusiveEndTime));
        }

        public Builder inclusiveStartTime(Output<String> inclusiveStartTime) {
            $.inclusiveStartTime = inclusiveStartTime;
            return this;
        }

        public Builder inclusiveStartTime(String inclusiveStartTime) {
            return inclusiveStartTime(Output.of(inclusiveStartTime));
        }

        public Builder kinesisConfiguration(Output<StreamKinesisConfigurationArgs> kinesisConfiguration) {
            $.kinesisConfiguration = kinesisConfiguration;
            return this;
        }

        public Builder kinesisConfiguration(StreamKinesisConfigurationArgs kinesisConfiguration) {
            return kinesisConfiguration(Output.of(kinesisConfiguration));
        }

        public Builder ledgerName(Output<String> ledgerName) {
            $.ledgerName = ledgerName;
            return this;
        }

        public Builder ledgerName(String ledgerName) {
            return ledgerName(Output.of(ledgerName));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder streamName(@Nullable Output<String> streamName) {
            $.streamName = streamName;
            return this;
        }

        public Builder streamName(String streamName) {
            return streamName(Output.of(streamName));
        }

        public Builder tags(@Nullable Output<List<StreamTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<StreamTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(StreamTagArgs... tags) {
            return tags(List.of(tags));
        }

        public StreamArgs build() {
            $.inclusiveStartTime = Objects.requireNonNull($.inclusiveStartTime, "expected parameter 'inclusiveStartTime' to be non-null");
            $.kinesisConfiguration = Objects.requireNonNull($.kinesisConfiguration, "expected parameter 'kinesisConfiguration' to be non-null");
            $.ledgerName = Objects.requireNonNull($.ledgerName, "expected parameter 'ledgerName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
