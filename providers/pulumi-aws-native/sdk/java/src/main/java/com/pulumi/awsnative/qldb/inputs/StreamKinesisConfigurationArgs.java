// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.qldb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamKinesisConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamKinesisConfigurationArgs Empty = new StreamKinesisConfigurationArgs();

    @Import(name="aggregationEnabled")
    private @Nullable Output<Boolean> aggregationEnabled;

    public Optional<Output<Boolean>> aggregationEnabled() {
        return Optional.ofNullable(this.aggregationEnabled);
    }

    @Import(name="streamArn")
    private @Nullable Output<String> streamArn;

    public Optional<Output<String>> streamArn() {
        return Optional.ofNullable(this.streamArn);
    }

    private StreamKinesisConfigurationArgs() {}

    private StreamKinesisConfigurationArgs(StreamKinesisConfigurationArgs $) {
        this.aggregationEnabled = $.aggregationEnabled;
        this.streamArn = $.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamKinesisConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamKinesisConfigurationArgs $;

        public Builder() {
            $ = new StreamKinesisConfigurationArgs();
        }

        public Builder(StreamKinesisConfigurationArgs defaults) {
            $ = new StreamKinesisConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregationEnabled(@Nullable Output<Boolean> aggregationEnabled) {
            $.aggregationEnabled = aggregationEnabled;
            return this;
        }

        public Builder aggregationEnabled(Boolean aggregationEnabled) {
            return aggregationEnabled(Output.of(aggregationEnabled));
        }

        public Builder streamArn(@Nullable Output<String> streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        public Builder streamArn(String streamArn) {
            return streamArn(Output.of(streamArn));
        }

        public StreamKinesisConfigurationArgs build() {
            return $;
        }
    }

}
