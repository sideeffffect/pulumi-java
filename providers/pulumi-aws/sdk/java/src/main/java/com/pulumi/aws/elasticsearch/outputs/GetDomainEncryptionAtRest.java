// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainEncryptionAtRest {
    /**
     * Whether node to node encryption is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The KMS key id used to encrypt data at rest.
     * 
     */
    private final String kmsKeyId;

    @CustomType.Constructor
    private GetDomainEncryptionAtRest(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId) {
        this.enabled = enabled;
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Whether node to node encryption is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * The KMS key id used to encrypt data at rest.
     * 
    */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainEncryptionAtRest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainEncryptionAtRest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }        public GetDomainEncryptionAtRest build() {
            return new GetDomainEncryptionAtRest(enabled, kmsKeyId);
        }
    }
}
