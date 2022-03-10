// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.inputs;

import io.pulumi.awsnative.kinesis.enums.StreamEncryptionEncryptionType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream. Removing this property from your stack template and updating your stack disables encryption.
 * 
 */
public final class StreamEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamEncryptionArgs Empty = new StreamEncryptionArgs();

    /**
     * The encryption type to use. The only valid value is KMS.
     * 
     */
    @InputImport(name="encryptionType", required=true)
      private final Input<StreamEncryptionEncryptionType> encryptionType;

    public Input<StreamEncryptionEncryptionType> getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.
     * 
     */
    @InputImport(name="keyId", required=true)
      private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    public StreamEncryptionArgs(
        Input<StreamEncryptionEncryptionType> encryptionType,
        Input<String> keyId) {
        this.encryptionType = Objects.requireNonNull(encryptionType, "expected parameter 'encryptionType' to be non-null");
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private StreamEncryptionArgs() {
        this.encryptionType = Input.empty();
        this.keyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<StreamEncryptionEncryptionType> encryptionType;
        private Input<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.keyId = defaults.keyId;
        }

        public Builder encryptionType(Input<StreamEncryptionEncryptionType> encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }

        public Builder encryptionType(StreamEncryptionEncryptionType encryptionType) {
            this.encryptionType = Input.of(Objects.requireNonNull(encryptionType));
            return this;
        }

        public Builder keyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder keyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }
        public StreamEncryptionArgs build() {
            return new StreamEncryptionArgs(encryptionType, keyId);
        }
    }
}
