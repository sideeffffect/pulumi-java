// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyRsaTokenKeyResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicySymmetricTokenKeyResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyTokenClaimResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyX509CertificateTokenKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentKeyPolicyTokenRestrictionResponse {
    /**
     * A list of alternative verification keys.
     * 
     */
    private final @Nullable List<Object> alternateVerificationKeys;
    /**
     * The audience for the token.
     * 
     */
    private final String audience;
    /**
     * The token issuer.
     * 
     */
    private final String issuer;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyTokenRestriction'.
     * 
     */
    private final String odataType;
    /**
     * The OpenID connect discovery document.
     * 
     */
    private final @Nullable String openIdConnectDiscoveryDocument;
    /**
     * The primary verification key.
     * 
     */
    private final Object primaryVerificationKey;
    /**
     * A list of required token claims.
     * 
     */
    private final @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims;
    /**
     * The type of token.
     * 
     */
    private final String restrictionTokenType;

    @OutputCustomType.Constructor
    private ContentKeyPolicyTokenRestrictionResponse(
        @OutputCustomType.Parameter("alternateVerificationKeys") @Nullable List<Object> alternateVerificationKeys,
        @OutputCustomType.Parameter("audience") String audience,
        @OutputCustomType.Parameter("issuer") String issuer,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("openIdConnectDiscoveryDocument") @Nullable String openIdConnectDiscoveryDocument,
        @OutputCustomType.Parameter("primaryVerificationKey") Object primaryVerificationKey,
        @OutputCustomType.Parameter("requiredClaims") @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims,
        @OutputCustomType.Parameter("restrictionTokenType") String restrictionTokenType) {
        this.alternateVerificationKeys = alternateVerificationKeys;
        this.audience = audience;
        this.issuer = issuer;
        this.odataType = odataType;
        this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
        this.primaryVerificationKey = primaryVerificationKey;
        this.requiredClaims = requiredClaims;
        this.restrictionTokenType = restrictionTokenType;
    }

    /**
     * A list of alternative verification keys.
     * 
    */
    public List<Object> getAlternateVerificationKeys() {
        return this.alternateVerificationKeys == null ? List.of() : this.alternateVerificationKeys;
    }
    /**
     * The audience for the token.
     * 
    */
    public String getAudience() {
        return this.audience;
    }
    /**
     * The token issuer.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyTokenRestriction'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The OpenID connect discovery document.
     * 
    */
    public Optional<String> getOpenIdConnectDiscoveryDocument() {
        return Optional.ofNullable(this.openIdConnectDiscoveryDocument);
    }
    /**
     * The primary verification key.
     * 
    */
    public Object getPrimaryVerificationKey() {
        return this.primaryVerificationKey;
    }
    /**
     * A list of required token claims.
     * 
    */
    public List<ContentKeyPolicyTokenClaimResponse> getRequiredClaims() {
        return this.requiredClaims == null ? List.of() : this.requiredClaims;
    }
    /**
     * The type of token.
     * 
    */
    public String getRestrictionTokenType() {
        return this.restrictionTokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyTokenRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> alternateVerificationKeys;
        private String audience;
        private String issuer;
        private String odataType;
        private @Nullable String openIdConnectDiscoveryDocument;
        private Object primaryVerificationKey;
        private @Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims;
        private String restrictionTokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyTokenRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateVerificationKeys = defaults.alternateVerificationKeys;
    	      this.audience = defaults.audience;
    	      this.issuer = defaults.issuer;
    	      this.odataType = defaults.odataType;
    	      this.openIdConnectDiscoveryDocument = defaults.openIdConnectDiscoveryDocument;
    	      this.primaryVerificationKey = defaults.primaryVerificationKey;
    	      this.requiredClaims = defaults.requiredClaims;
    	      this.restrictionTokenType = defaults.restrictionTokenType;
        }

        public Builder alternateVerificationKeys(@Nullable List<Object> alternateVerificationKeys) {
            this.alternateVerificationKeys = alternateVerificationKeys;
            return this;
        }

        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder openIdConnectDiscoveryDocument(@Nullable String openIdConnectDiscoveryDocument) {
            this.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
            return this;
        }

        public Builder primaryVerificationKey(Object primaryVerificationKey) {
            this.primaryVerificationKey = Objects.requireNonNull(primaryVerificationKey);
            return this;
        }

        public Builder requiredClaims(@Nullable List<ContentKeyPolicyTokenClaimResponse> requiredClaims) {
            this.requiredClaims = requiredClaims;
            return this;
        }

        public Builder restrictionTokenType(String restrictionTokenType) {
            this.restrictionTokenType = Objects.requireNonNull(restrictionTokenType);
            return this;
        }
        public ContentKeyPolicyTokenRestrictionResponse build() {
            return new ContentKeyPolicyTokenRestrictionResponse(alternateVerificationKeys, audience, issuer, odataType, openIdConnectDiscoveryDocument, primaryVerificationKey, requiredClaims, restrictionTokenType);
        }
    }
}
