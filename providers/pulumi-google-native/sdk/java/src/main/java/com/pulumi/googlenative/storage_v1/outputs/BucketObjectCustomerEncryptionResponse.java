// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketObjectCustomerEncryptionResponse {
    /**
     * The encryption algorithm.
     * 
     */
    private final String encryptionAlgorithm;
    /**
     * SHA256 hash value of the encryption key.
     * 
     */
    private final String keySha256;

    @CustomType.Constructor
    private BucketObjectCustomerEncryptionResponse(
        @CustomType.Parameter("encryptionAlgorithm") String encryptionAlgorithm,
        @CustomType.Parameter("keySha256") String keySha256) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.keySha256 = keySha256;
    }

    /**
     * The encryption algorithm.
     * 
    */
    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    /**
     * SHA256 hash value of the encryption key.
     * 
    */
    public String keySha256() {
        return this.keySha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String keySha256;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.keySha256 = defaults.keySha256;
        }

        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder keySha256(String keySha256) {
            this.keySha256 = Objects.requireNonNull(keySha256);
            return this;
        }        public BucketObjectCustomerEncryptionResponse build() {
            return new BucketObjectCustomerEncryptionResponse(encryptionAlgorithm, keySha256);
        }
    }
}
