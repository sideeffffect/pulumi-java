// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketObjectContentCustomerEncryption extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketObjectContentCustomerEncryption Empty = new GetBucketObjectContentCustomerEncryption();

    @Import(name="encryptionAlgorithm", required=true)
      private final String encryptionAlgorithm;

    public String encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    @Import(name="encryptionKey", required=true)
      private final String encryptionKey;

    public String encryptionKey() {
        return this.encryptionKey;
    }

    public GetBucketObjectContentCustomerEncryption(
        String encryptionAlgorithm,
        String encryptionKey) {
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
    }

    private GetBucketObjectContentCustomerEncryption() {
        this.encryptionAlgorithm = null;
        this.encryptionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentCustomerEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encryptionAlgorithm;
        private String encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectContentCustomerEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }        public GetBucketObjectContentCustomerEncryption build() {
            return new GetBucketObjectContentCustomerEncryption(encryptionAlgorithm, encryptionKey);
        }
    }
}
