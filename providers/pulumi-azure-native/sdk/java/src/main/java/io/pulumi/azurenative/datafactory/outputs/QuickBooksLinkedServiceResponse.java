// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QuickBooksLinkedServiceResponse {
    /**
     * The access token for OAuth 1.0 authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
    /**
     * The access token secret for OAuth 1.0 authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessTokenSecret;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The company ID of the QuickBooks company to authorize.
     * 
     */
    private final @Nullable Object companyId;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * Properties used to connect to QuickBooks. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    private final @Nullable Object connectionProperties;
    /**
     * The consumer key for OAuth 1.0 authentication.
     * 
     */
    private final @Nullable Object consumerKey;
    /**
     * The consumer secret for OAuth 1.0 authentication.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerSecret;
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
     * The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com)
     * 
     */
    private final @Nullable Object endpoint;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Type of linked service.
     * Expected value is 'QuickBooks'.
     * 
     */
    private final String type;
    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    private final @Nullable Object useEncryptedEndpoints;

    @OutputCustomType.Constructor
    private QuickBooksLinkedServiceResponse(
        @OutputCustomType.Parameter("accessToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @OutputCustomType.Parameter("accessTokenSecret") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessTokenSecret,
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("companyId") @Nullable Object companyId,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("connectionProperties") @Nullable Object connectionProperties,
        @OutputCustomType.Parameter("consumerKey") @Nullable Object consumerKey,
        @OutputCustomType.Parameter("consumerSecret") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerSecret,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("endpoint") @Nullable Object endpoint,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("useEncryptedEndpoints") @Nullable Object useEncryptedEndpoints) {
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
        this.annotations = annotations;
        this.companyId = companyId;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = endpoint;
        this.parameters = parameters;
        this.type = type;
        this.useEncryptedEndpoints = useEncryptedEndpoints;
    }

    /**
     * The access token for OAuth 1.0 authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * The access token secret for OAuth 1.0 authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getAccessTokenSecret() {
        return Optional.ofNullable(this.accessTokenSecret);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The company ID of the QuickBooks company to authorize.
     * 
    */
    public Optional<Object> getCompanyId() {
        return Optional.ofNullable(this.companyId);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Properties used to connect to QuickBooks. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
    */
    public Optional<Object> getConnectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
    }
    /**
     * The consumer key for OAuth 1.0 authentication.
     * 
    */
    public Optional<Object> getConsumerKey() {
        return Optional.ofNullable(this.consumerKey);
    }
    /**
     * The consumer secret for OAuth 1.0 authentication.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getConsumerSecret() {
        return Optional.ofNullable(this.consumerSecret);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com)
     * 
    */
    public Optional<Object> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Type of linked service.
     * Expected value is 'QuickBooks'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
    */
    public Optional<Object> getUseEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickBooksLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessTokenSecret;
        private @Nullable List<Object> annotations;
        private @Nullable Object companyId;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionProperties;
        private @Nullable Object consumerKey;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerSecret;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object endpoint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private @Nullable Object useEncryptedEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickBooksLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.accessTokenSecret = defaults.accessTokenSecret;
    	      this.annotations = defaults.annotations;
    	      this.companyId = defaults.companyId;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecret = defaults.consumerSecret;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
        }

        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder accessTokenSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessTokenSecret) {
            this.accessTokenSecret = accessTokenSecret;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder companyId(@Nullable Object companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder consumerKey(@Nullable Object consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder consumerSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerSecret) {
            this.consumerSecret = consumerSecret;
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

        public Builder endpoint(@Nullable Object endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
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
        public QuickBooksLinkedServiceResponse build() {
            return new QuickBooksLinkedServiceResponse(accessToken, accessTokenSecret, annotations, companyId, connectVia, connectionProperties, consumerKey, consumerSecret, description, encryptedCredential, endpoint, parameters, type, useEncryptedEndpoints);
        }
    }
}
