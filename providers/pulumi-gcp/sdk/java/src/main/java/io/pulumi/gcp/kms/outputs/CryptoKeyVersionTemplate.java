// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoKeyVersionTemplate {
    /**
     * The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    private final String algorithm;
    /**
     * The protection level to use when creating a version based on this template. Possible values include "SOFTWARE", "HSM", "EXTERNAL". Defaults to "SOFTWARE".
     * 
     */
    private final @Nullable String protectionLevel;

    @CustomType.Constructor
    private CryptoKeyVersionTemplate(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("protectionLevel") @Nullable String protectionLevel) {
        this.algorithm = algorithm;
        this.protectionLevel = protectionLevel;
    }

    /**
     * The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
    */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * The protection level to use when creating a version based on this template. Possible values include "SOFTWARE", "HSM", "EXTERNAL". Defaults to "SOFTWARE".
     * 
    */
    public Optional<String> protectionLevel() {
        return Optional.ofNullable(this.protectionLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private @Nullable String protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder protectionLevel(@Nullable String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }        public CryptoKeyVersionTemplate build() {
            return new CryptoKeyVersionTemplate(algorithm, protectionLevel);
        }
    }
}
