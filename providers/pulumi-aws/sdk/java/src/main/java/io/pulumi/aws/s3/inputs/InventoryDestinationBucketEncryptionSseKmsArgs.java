// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InventoryDestinationBucketEncryptionSseKmsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketEncryptionSseKmsArgs Empty = new InventoryDestinationBucketEncryptionSseKmsArgs();

    /**
     * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
     */
    @InputImport(name="keyId", required=true)
      private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    public InventoryDestinationBucketEncryptionSseKmsArgs(Input<String> keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private InventoryDestinationBucketEncryptionSseKmsArgs() {
        this.keyId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryptionSseKmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryptionSseKmsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder keyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }
        public InventoryDestinationBucketEncryptionSseKmsArgs build() {
            return new InventoryDestinationBucketEncryptionSseKmsArgs(keyId);
        }
    }
}
