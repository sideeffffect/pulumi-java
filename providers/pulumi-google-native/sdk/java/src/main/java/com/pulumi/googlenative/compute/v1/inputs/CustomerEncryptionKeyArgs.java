// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerEncryptionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomerEncryptionKeyArgs Empty = new CustomerEncryptionKeyArgs();

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. For example: &#34;kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The name of the encryption key that is stored in Google Cloud KMS. For example: &#34;kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: &#34;kmsKeyServiceAccount&#34;: &#34;name@project_id.iam.gserviceaccount.com/
     * 
     */
    @Import(name="kmsKeyServiceAccount")
    private @Nullable Output<String> kmsKeyServiceAccount;

    /**
     * @return The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: &#34;kmsKeyServiceAccount&#34;: &#34;name@project_id.iam.gserviceaccount.com/
     * 
     */
    public Optional<Output<String>> kmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rawKey&#34;: &#34;SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0=&#34;
     * 
     */
    @Import(name="rawKey")
    private @Nullable Output<String> rawKey;

    /**
     * @return Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rawKey&#34;: &#34;SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0=&#34;
     * 
     */
    public Optional<Output<String>> rawKey() {
        return Optional.ofNullable(this.rawKey);
    }

    /**
     * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rsaEncryptedKey&#34;: &#34;ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==&#34; The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
     * 
     */
    @Import(name="rsaEncryptedKey")
    private @Nullable Output<String> rsaEncryptedKey;

    /**
     * @return Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rsaEncryptedKey&#34;: &#34;ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==&#34; The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
     * 
     */
    public Optional<Output<String>> rsaEncryptedKey() {
        return Optional.ofNullable(this.rsaEncryptedKey);
    }

    private CustomerEncryptionKeyArgs() {}

    private CustomerEncryptionKeyArgs(CustomerEncryptionKeyArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.kmsKeyServiceAccount = $.kmsKeyServiceAccount;
        this.rawKey = $.rawKey;
        this.rsaEncryptedKey = $.rsaEncryptedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerEncryptionKeyArgs $;

        public Builder() {
            $ = new CustomerEncryptionKeyArgs();
        }

        public Builder(CustomerEncryptionKeyArgs defaults) {
            $ = new CustomerEncryptionKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName The name of the encryption key that is stored in Google Cloud KMS. For example: &#34;kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The name of the encryption key that is stored in Google Cloud KMS. For example: &#34;kmsKeyName&#34;: &#34;projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param kmsKeyServiceAccount The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: &#34;kmsKeyServiceAccount&#34;: &#34;name@project_id.iam.gserviceaccount.com/
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyServiceAccount(@Nullable Output<String> kmsKeyServiceAccount) {
            $.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        /**
         * @param kmsKeyServiceAccount The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: &#34;kmsKeyServiceAccount&#34;: &#34;name@project_id.iam.gserviceaccount.com/
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            return kmsKeyServiceAccount(Output.of(kmsKeyServiceAccount));
        }

        /**
         * @param rawKey Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rawKey&#34;: &#34;SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0=&#34;
         * 
         * @return builder
         * 
         */
        public Builder rawKey(@Nullable Output<String> rawKey) {
            $.rawKey = rawKey;
            return this;
        }

        /**
         * @param rawKey Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rawKey&#34;: &#34;SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0=&#34;
         * 
         * @return builder
         * 
         */
        public Builder rawKey(String rawKey) {
            return rawKey(Output.of(rawKey));
        }

        /**
         * @param rsaEncryptedKey Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rsaEncryptedKey&#34;: &#34;ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==&#34; The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
         * 
         * @return builder
         * 
         */
        public Builder rsaEncryptedKey(@Nullable Output<String> rsaEncryptedKey) {
            $.rsaEncryptedKey = rsaEncryptedKey;
            return this;
        }

        /**
         * @param rsaEncryptedKey Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: &#34;rsaEncryptedKey&#34;: &#34;ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==&#34; The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
         * 
         * @return builder
         * 
         */
        public Builder rsaEncryptedKey(String rsaEncryptedKey) {
            return rsaEncryptedKey(Output.of(rsaEncryptedKey));
        }

        public CustomerEncryptionKeyArgs build() {
            return $;
        }
    }

}
