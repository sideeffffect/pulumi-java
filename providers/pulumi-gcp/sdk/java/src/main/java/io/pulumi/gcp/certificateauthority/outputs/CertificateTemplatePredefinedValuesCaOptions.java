// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateTemplatePredefinedValuesCaOptions {
    /**
     * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
     * 
     */
    private final @Nullable Boolean isCa;
    /**
     * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
     * 
     */
    private final @Nullable Integer maxIssuerPathLength;

    @CustomType.Constructor
    private CertificateTemplatePredefinedValuesCaOptions(
        @CustomType.Parameter("isCa") @Nullable Boolean isCa,
        @CustomType.Parameter("maxIssuerPathLength") @Nullable Integer maxIssuerPathLength) {
        this.isCa = isCa;
        this.maxIssuerPathLength = maxIssuerPathLength;
    }

    /**
     * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
     * 
    */
    public Optional<Boolean> isCa() {
        return Optional.ofNullable(this.isCa);
    }
    /**
     * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
     * 
    */
    public Optional<Integer> maxIssuerPathLength() {
        return Optional.ofNullable(this.maxIssuerPathLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesCaOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCa;
        private @Nullable Integer maxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesCaOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
        }

        public Builder isCa(@Nullable Boolean isCa) {
            this.isCa = isCa;
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }        public CertificateTemplatePredefinedValuesCaOptions build() {
            return new CertificateTemplatePredefinedValuesCaOptions(isCa, maxIssuerPathLength);
        }
    }
}
