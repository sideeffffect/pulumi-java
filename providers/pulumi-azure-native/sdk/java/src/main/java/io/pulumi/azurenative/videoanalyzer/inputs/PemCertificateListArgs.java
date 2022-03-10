// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A list of PEM formatted certificates.
 * 
 */
public final class PemCertificateListArgs extends io.pulumi.resources.ResourceArgs {

    public static final PemCertificateListArgs Empty = new PemCertificateListArgs();

    /**
     * PEM formatted public certificates. One certificate per entry.
     * 
     */
    @InputImport(name="certificates", required=true)
      private final Input<List<String>> certificates;

    public Input<List<String>> getCertificates() {
        return this.certificates;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.PemCertificateList'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public PemCertificateListArgs(
        Input<List<String>> certificates,
        Input<String> type) {
        this.certificates = Objects.requireNonNull(certificates, "expected parameter 'certificates' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PemCertificateListArgs() {
        this.certificates = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PemCertificateListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> certificates;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PemCertificateListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.type = defaults.type;
        }

        public Builder certificates(Input<List<String>> certificates) {
            this.certificates = Objects.requireNonNull(certificates);
            return this;
        }

        public Builder certificates(List<String> certificates) {
            this.certificates = Input.of(Objects.requireNonNull(certificates));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public PemCertificateListArgs build() {
            return new PemCertificateListArgs(certificates, type);
        }
    }
}
