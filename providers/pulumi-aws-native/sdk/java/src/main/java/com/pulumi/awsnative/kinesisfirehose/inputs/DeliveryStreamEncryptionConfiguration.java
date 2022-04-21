// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationNoEncryptionConfig;
import com.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamKMSEncryptionConfig;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamEncryptionConfiguration Empty = new DeliveryStreamEncryptionConfiguration();

    @Import(name="kMSEncryptionConfig")
    private @Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig;

    public Optional<DeliveryStreamKMSEncryptionConfig> kMSEncryptionConfig() {
        return Optional.ofNullable(this.kMSEncryptionConfig);
    }

    @Import(name="noEncryptionConfig")
    private @Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig;

    public Optional<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig() {
        return Optional.ofNullable(this.noEncryptionConfig);
    }

    private DeliveryStreamEncryptionConfiguration() {}

    private DeliveryStreamEncryptionConfiguration(DeliveryStreamEncryptionConfiguration $) {
        this.kMSEncryptionConfig = $.kMSEncryptionConfig;
        this.noEncryptionConfig = $.noEncryptionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamEncryptionConfiguration $;

        public Builder() {
            $ = new DeliveryStreamEncryptionConfiguration();
        }

        public Builder(DeliveryStreamEncryptionConfiguration defaults) {
            $ = new DeliveryStreamEncryptionConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder kMSEncryptionConfig(@Nullable DeliveryStreamKMSEncryptionConfig kMSEncryptionConfig) {
            $.kMSEncryptionConfig = kMSEncryptionConfig;
            return this;
        }

        public Builder noEncryptionConfig(@Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
            $.noEncryptionConfig = noEncryptionConfig;
            return this;
        }

        public DeliveryStreamEncryptionConfiguration build() {
            return $;
        }
    }

}
