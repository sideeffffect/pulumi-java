// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamServerSideEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamServerSideEncryptionGetArgs Empty = new FirehoseDeliveryStreamServerSideEncryptionGetArgs();

    /**
     * Whether to enable encryption at rest. Default is `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Amazon Resource Name (ARN) of the encryption key. Required when `key_type` is `CUSTOMER_MANAGED_CMK`.
     * 
     */
    @InputImport(name="keyArn")
      private final @Nullable Input<String> keyArn;

    public Input<String> getKeyArn() {
        return this.keyArn == null ? Input.empty() : this.keyArn;
    }

    /**
     * Type of encryption key. Default is `AWS_OWNED_CMK`. Valid values are `AWS_OWNED_CMK` and `CUSTOMER_MANAGED_CMK`
     * 
     */
    @InputImport(name="keyType")
      private final @Nullable Input<String> keyType;

    public Input<String> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    public FirehoseDeliveryStreamServerSideEncryptionGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> keyArn,
        @Nullable Input<String> keyType) {
        this.enabled = enabled;
        this.keyArn = keyArn;
        this.keyType = keyType;
    }

    private FirehoseDeliveryStreamServerSideEncryptionGetArgs() {
        this.enabled = Input.empty();
        this.keyArn = Input.empty();
        this.keyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamServerSideEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> keyArn;
        private @Nullable Input<String> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamServerSideEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder keyArn(@Nullable Input<String> keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder keyArn(@Nullable String keyArn) {
            this.keyArn = Input.ofNullable(keyArn);
            return this;
        }

        public Builder keyType(@Nullable Input<String> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder keyType(@Nullable String keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }
        public FirehoseDeliveryStreamServerSideEncryptionGetArgs build() {
            return new FirehoseDeliveryStreamServerSideEncryptionGetArgs(enabled, keyArn, keyType);
        }
    }
}
