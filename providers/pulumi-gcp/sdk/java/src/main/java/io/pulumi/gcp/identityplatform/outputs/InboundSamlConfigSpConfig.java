// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.identityplatform.outputs.InboundSamlConfigSpConfigSpCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InboundSamlConfigSpConfig {
    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    private final @Nullable String callbackUri;
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates;
    /**
     * Unique identifier for all SAML entities.
     * 
     */
    private final @Nullable String spEntityId;

    @CustomType.Constructor
    private InboundSamlConfigSpConfig(
        @CustomType.Parameter("callbackUri") @Nullable String callbackUri,
        @CustomType.Parameter("spCertificates") @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates,
        @CustomType.Parameter("spEntityId") @Nullable String spEntityId) {
        this.callbackUri = callbackUri;
        this.spCertificates = spCertificates;
        this.spEntityId = spEntityId;
    }

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
    */
    public Optional<String> callbackUri() {
        return Optional.ofNullable(this.callbackUri);
    }
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
    */
    public List<InboundSamlConfigSpConfigSpCertificate> spCertificates() {
        return this.spCertificates == null ? List.of() : this.spCertificates;
    }
    /**
     * Unique identifier for all SAML entities.
     * 
    */
    public Optional<String> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String callbackUri;
        private @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates;
        private @Nullable String spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder callbackUri(@Nullable String callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }
        public Builder spCertificates(@Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }
        public Builder spCertificates(InboundSamlConfigSpConfigSpCertificate... spCertificates) {
            return spCertificates(List.of(spCertificates));
        }
        public Builder spEntityId(@Nullable String spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }        public InboundSamlConfigSpConfig build() {
            return new InboundSamlConfigSpConfig(callbackUri, spCertificates, spEntityId);
        }
    }
}
