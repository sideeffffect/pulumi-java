// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HubspotLinkedServiceResponse {
    /**
     * The access token obtained when initially authenticating your OAuth integration.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The client ID associated with your Hubspot application.
     * 
     */
    private final Object clientId;
    /**
     * The client secret associated with your Hubspot application.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The refresh token obtained when initially authenticating your OAuth integration.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
    /**
     * Type of linked service.
     * Expected value is 'Hubspot'.
     * 
     */
    private final String type;
    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    private final @Nullable Object useEncryptedEndpoints;
    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    private final @Nullable Object useHostVerification;
    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    private final @Nullable Object usePeerVerification;

    @CustomType.Constructor
    private HubspotLinkedServiceResponse(
        @CustomType.Parameter("accessToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("clientId") Object clientId,
        @CustomType.Parameter("clientSecret") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("refreshToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useEncryptedEndpoints") @Nullable Object useEncryptedEndpoints,
        @CustomType.Parameter("useHostVerification") @Nullable Object useHostVerification,
        @CustomType.Parameter("usePeerVerification") @Nullable Object usePeerVerification) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.refreshToken = refreshToken;
        this.type = type;
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    /**
     * The access token obtained when initially authenticating your OAuth integration.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The client ID associated with your Hubspot application.
     * 
    */
    public Object clientId() {
        return this.clientId;
    }
    /**
     * The client secret associated with your Hubspot application.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The refresh token obtained when initially authenticating your OAuth integration.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }
    /**
     * Type of linked service.
     * Expected value is 'Hubspot'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
    */
    public Optional<Object> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }
    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
    */
    public Optional<Object> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }
    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
    */
    public Optional<Object> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubspotLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private Object clientId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(HubspotLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.refreshToken = defaults.refreshToken;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clientId(Object clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }
        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }
        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }        public HubspotLinkedServiceResponse build() {
            return new HubspotLinkedServiceResponse(accessToken, annotations, clientId, clientSecret, connectVia, description, encryptedCredential, parameters, refreshToken, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
