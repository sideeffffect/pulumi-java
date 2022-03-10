// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class PemCertificateListResponse extends io.pulumi.resources.InvokeArgs {

    public static final PemCertificateListResponse Empty = new PemCertificateListResponse();

    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
     */
    @InputImport(name="certificates", required=true)
      private final List<String> certificates;

    public List<String> getCertificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.PemCertificateList'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PemCertificateListResponse(
        List<String> certificates,
        String type) {
        this.certificates = Objects.requireNonNull(certificates, "expected parameter 'certificates' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PemCertificateListResponse() {
        this.certificates = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PemCertificateListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PemCertificateListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.type = defaults.type;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PemCertificateListResponse build() {
            return new PemCertificateListResponse(certificates, type);
        }
    }
}
