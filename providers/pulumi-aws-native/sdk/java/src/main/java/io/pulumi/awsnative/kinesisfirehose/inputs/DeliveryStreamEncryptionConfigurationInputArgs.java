// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamEncryptionConfigurationInputArgs Empty = new DeliveryStreamEncryptionConfigurationInputArgs();

    @InputImport(name="keyARN")
      private final @Nullable Input<String> keyARN;

    public Input<String> getKeyARN() {
        return this.keyARN == null ? Input.empty() : this.keyARN;
    }

    @InputImport(name="keyType", required=true)
      private final Input<DeliveryStreamEncryptionConfigurationInputKeyType> keyType;

    public Input<DeliveryStreamEncryptionConfigurationInputKeyType> getKeyType() {
        return this.keyType;
    }

    public DeliveryStreamEncryptionConfigurationInputArgs(
        @Nullable Input<String> keyARN,
        Input<DeliveryStreamEncryptionConfigurationInputKeyType> keyType) {
        this.keyARN = keyARN;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private DeliveryStreamEncryptionConfigurationInputArgs() {
        this.keyARN = Input.empty();
        this.keyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyARN;
        private Input<DeliveryStreamEncryptionConfigurationInputKeyType> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyARN = defaults.keyARN;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyARN(@Nullable Input<String> keyARN) {
            this.keyARN = keyARN;
            return this;
        }

        public Builder keyARN(@Nullable String keyARN) {
            this.keyARN = Input.ofNullable(keyARN);
            return this;
        }

        public Builder keyType(Input<DeliveryStreamEncryptionConfigurationInputKeyType> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public Builder keyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            this.keyType = Input.of(Objects.requireNonNull(keyType));
            return this;
        }
        public DeliveryStreamEncryptionConfigurationInputArgs build() {
            return new DeliveryStreamEncryptionConfigurationInputArgs(keyARN, keyType);
        }
    }
}
