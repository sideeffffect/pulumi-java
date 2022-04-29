// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationNoEncryptionConfig;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamKMSEncryptionConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationArgs extends ResourceArgs {

    public static final DeliveryStreamEncryptionConfigurationArgs Empty = new DeliveryStreamEncryptionConfigurationArgs();

    @Import(name="kMSEncryptionConfig")
    private @Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig;

    public Optional<Output<DeliveryStreamKMSEncryptionConfigArgs>> kMSEncryptionConfig() {
        return Optional.ofNullable(this.kMSEncryptionConfig);
    }

    @Import(name="noEncryptionConfig")
    private @Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig;

    public Optional<Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig>> noEncryptionConfig() {
        return Optional.ofNullable(this.noEncryptionConfig);
    }

    private DeliveryStreamEncryptionConfigurationArgs() {}

    private DeliveryStreamEncryptionConfigurationArgs(DeliveryStreamEncryptionConfigurationArgs $) {
        this.kMSEncryptionConfig = $.kMSEncryptionConfig;
        this.noEncryptionConfig = $.noEncryptionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamEncryptionConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamEncryptionConfigurationArgs();
        }

        public Builder(DeliveryStreamEncryptionConfigurationArgs defaults) {
            $ = new DeliveryStreamEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder kMSEncryptionConfig(@Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig) {
            $.kMSEncryptionConfig = kMSEncryptionConfig;
            return this;
        }

        public Builder kMSEncryptionConfig(DeliveryStreamKMSEncryptionConfigArgs kMSEncryptionConfig) {
            return kMSEncryptionConfig(Output.of(kMSEncryptionConfig));
        }

        public Builder noEncryptionConfig(@Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig) {
            $.noEncryptionConfig = noEncryptionConfig;
            return this;
        }

        public Builder noEncryptionConfig(DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
            return noEncryptionConfig(Output.of(noEncryptionConfig));
        }

        public DeliveryStreamEncryptionConfigurationArgs build() {
            return $;
        }
    }

}
