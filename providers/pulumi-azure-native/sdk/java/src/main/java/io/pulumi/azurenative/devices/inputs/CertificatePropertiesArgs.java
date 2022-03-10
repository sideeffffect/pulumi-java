// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The description of an X509 CA Certificate.
 * 
 */
public final class CertificatePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificatePropertiesArgs Empty = new CertificatePropertiesArgs();

    /**
     * The certificate content
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    public CertificatePropertiesArgs(@Nullable Input<String> certificate) {
        this.certificate = certificate;
    }

    private CertificatePropertiesArgs() {
        this.certificate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
        }

        public Builder certificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }
        public CertificatePropertiesArgs build() {
            return new CertificatePropertiesArgs(certificate);
        }
    }
}
