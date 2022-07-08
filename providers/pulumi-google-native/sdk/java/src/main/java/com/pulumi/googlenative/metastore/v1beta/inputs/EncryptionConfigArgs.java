// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings for the service.
 * 
 */
public final class EncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    private EncryptionConfigArgs() {}

    private EncryptionConfigArgs(EncryptionConfigArgs $) {
        this.kmsKey = $.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigArgs $;

        public Builder() {
            $ = new EncryptionConfigArgs();
        }

        public Builder(EncryptionConfigArgs defaults) {
            $ = new EncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKey The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public EncryptionConfigArgs build() {
            return $;
        }
    }

}
