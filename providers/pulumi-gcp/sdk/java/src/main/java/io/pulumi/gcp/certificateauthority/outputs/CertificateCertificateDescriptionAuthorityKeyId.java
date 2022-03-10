// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionAuthorityKeyId {
    private final @Nullable String keyId;

    @OutputCustomType.Constructor
    private CertificateCertificateDescriptionAuthorityKeyId(@OutputCustomType.Parameter("keyId") @Nullable String keyId) {
        this.keyId = keyId;
    }

    public Optional<String> getKeyId() {
        return Optional.ofNullable(this.keyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionAuthorityKeyId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionAuthorityKeyId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        public CertificateCertificateDescriptionAuthorityKeyId build() {
            return new CertificateCertificateDescriptionAuthorityKeyId(keyId);
        }
    }
}
