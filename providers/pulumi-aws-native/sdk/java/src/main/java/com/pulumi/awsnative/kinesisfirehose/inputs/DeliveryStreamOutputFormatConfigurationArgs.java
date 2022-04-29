// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSerializerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamOutputFormatConfigurationArgs extends ResourceArgs {

    public static final DeliveryStreamOutputFormatConfigurationArgs Empty = new DeliveryStreamOutputFormatConfigurationArgs();

    @Import(name="serializer")
    private @Nullable Output<DeliveryStreamSerializerArgs> serializer;

    public Optional<Output<DeliveryStreamSerializerArgs>> serializer() {
        return Optional.ofNullable(this.serializer);
    }

    private DeliveryStreamOutputFormatConfigurationArgs() {}

    private DeliveryStreamOutputFormatConfigurationArgs(DeliveryStreamOutputFormatConfigurationArgs $) {
        this.serializer = $.serializer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamOutputFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamOutputFormatConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamOutputFormatConfigurationArgs();
        }

        public Builder(DeliveryStreamOutputFormatConfigurationArgs defaults) {
            $ = new DeliveryStreamOutputFormatConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder serializer(@Nullable Output<DeliveryStreamSerializerArgs> serializer) {
            $.serializer = serializer;
            return this;
        }

        public Builder serializer(DeliveryStreamSerializerArgs serializer) {
            return serializer(Output.of(serializer));
        }

        public DeliveryStreamOutputFormatConfigurationArgs build() {
            return $;
        }
    }

}
