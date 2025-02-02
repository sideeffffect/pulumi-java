// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketEncryptionResponse {
    /**
     * @return A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified.
     * 
     */
    private final String defaultKmsKeyName;

    @CustomType.Constructor
    private BucketEncryptionResponse(@CustomType.Parameter("defaultKmsKeyName") String defaultKmsKeyName) {
        this.defaultKmsKeyName = defaultKmsKeyName;
    }

    /**
     * @return A Cloud KMS key that will be used to encrypt objects inserted into this bucket, if no encryption method is specified.
     * 
     */
    public String defaultKmsKeyName() {
        return this.defaultKmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKmsKeyName = defaults.defaultKmsKeyName;
        }

        public Builder defaultKmsKeyName(String defaultKmsKeyName) {
            this.defaultKmsKeyName = Objects.requireNonNull(defaultKmsKeyName);
            return this;
        }        public BucketEncryptionResponse build() {
            return new BucketEncryptionResponse(defaultKmsKeyName);
        }
    }
}
