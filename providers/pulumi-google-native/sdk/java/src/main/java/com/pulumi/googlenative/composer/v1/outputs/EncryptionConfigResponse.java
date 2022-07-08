// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EncryptionConfigResponse {
    /**
     * @return Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated. If not specified, Google-managed key will be used.
     * 
     */
    private final String kmsKeyName;

    @CustomType.Constructor
    private EncryptionConfigResponse(@CustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    /**
     * @return Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated. If not specified, Google-managed key will be used.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(kmsKeyName);
        }
    }
}
