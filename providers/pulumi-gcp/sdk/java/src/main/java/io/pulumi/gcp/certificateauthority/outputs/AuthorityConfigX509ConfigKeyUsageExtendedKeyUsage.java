// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage {
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
     */
    private final @Nullable Boolean clientAuth;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
     */
    private final @Nullable Boolean codeSigning;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
     */
    private final @Nullable Boolean emailProtection;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
     */
    private final @Nullable Boolean ocspSigning;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
     */
    private final @Nullable Boolean serverAuth;
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
     */
    private final @Nullable Boolean timeStamping;

    @OutputCustomType.Constructor
    private AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage(
        @OutputCustomType.Parameter("clientAuth") @Nullable Boolean clientAuth,
        @OutputCustomType.Parameter("codeSigning") @Nullable Boolean codeSigning,
        @OutputCustomType.Parameter("emailProtection") @Nullable Boolean emailProtection,
        @OutputCustomType.Parameter("ocspSigning") @Nullable Boolean ocspSigning,
        @OutputCustomType.Parameter("serverAuth") @Nullable Boolean serverAuth,
        @OutputCustomType.Parameter("timeStamping") @Nullable Boolean timeStamping) {
        this.clientAuth = clientAuth;
        this.codeSigning = codeSigning;
        this.emailProtection = emailProtection;
        this.ocspSigning = ocspSigning;
        this.serverAuth = serverAuth;
        this.timeStamping = timeStamping;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
    */
    public Optional<Boolean> getClientAuth() {
        return Optional.ofNullable(this.clientAuth);
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
    */
    public Optional<Boolean> getCodeSigning() {
        return Optional.ofNullable(this.codeSigning);
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
    */
    public Optional<Boolean> getEmailProtection() {
        return Optional.ofNullable(this.emailProtection);
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
    */
    public Optional<Boolean> getOcspSigning() {
        return Optional.ofNullable(this.ocspSigning);
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
    */
    public Optional<Boolean> getServerAuth() {
        return Optional.ofNullable(this.serverAuth);
    }
    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
    */
    public Optional<Boolean> getTimeStamping() {
        return Optional.ofNullable(this.timeStamping);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientAuth;
        private @Nullable Boolean codeSigning;
        private @Nullable Boolean emailProtection;
        private @Nullable Boolean ocspSigning;
        private @Nullable Boolean serverAuth;
        private @Nullable Boolean timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder clientAuth(@Nullable Boolean clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }

        public Builder codeSigning(@Nullable Boolean codeSigning) {
            this.codeSigning = codeSigning;
            return this;
        }

        public Builder emailProtection(@Nullable Boolean emailProtection) {
            this.emailProtection = emailProtection;
            return this;
        }

        public Builder ocspSigning(@Nullable Boolean ocspSigning) {
            this.ocspSigning = ocspSigning;
            return this;
        }

        public Builder serverAuth(@Nullable Boolean serverAuth) {
            this.serverAuth = serverAuth;
            return this;
        }

        public Builder timeStamping(@Nullable Boolean timeStamping) {
            this.timeStamping = timeStamping;
            return this;
        }
        public AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage build() {
            return new AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}
