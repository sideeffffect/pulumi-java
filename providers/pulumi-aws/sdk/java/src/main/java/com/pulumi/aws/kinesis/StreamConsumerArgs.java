// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamConsumerArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamConsumerArgs Empty = new StreamConsumerArgs();

    /**
     * Name of the stream consumer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @Import(name="streamArn", required=true)
    private Output<String> streamArn;

    public Output<String> streamArn() {
        return this.streamArn;
    }

    private StreamConsumerArgs() {}

    private StreamConsumerArgs(StreamConsumerArgs $) {
        this.name = $.name;
        this.streamArn = $.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamConsumerArgs $;

        public Builder() {
            $ = new StreamConsumerArgs();
        }

        public Builder(StreamConsumerArgs defaults) {
            $ = new StreamConsumerArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder streamArn(Output<String> streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        public Builder streamArn(String streamArn) {
            return streamArn(Output.of(streamArn));
        }

        public StreamConsumerArgs build() {
            $.streamArn = Objects.requireNonNull($.streamArn, "expected parameter 'streamArn' to be non-null");
            return $;
        }
    }

}
