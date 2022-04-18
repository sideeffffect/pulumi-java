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
public final class AmazonMWSLinkedServiceResponse {
    /**
     * The access key id used to access data.
     * 
     */
    private final Object accessKeyId;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
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
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     * 
     */
    private final Object endpoint;
    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2)
     * 
     */
    private final Object marketplaceID;
    /**
     * The Amazon MWS authentication token.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The secret key used to access data.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;
    /**
     * The Amazon seller ID.
     * 
     */
    private final Object sellerID;
    /**
     * Type of linked service.
     * Expected value is 'AmazonMWS'.
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
    private AmazonMWSLinkedServiceResponse(
        @CustomType.Parameter("accessKeyId") Object accessKeyId,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("endpoint") Object endpoint,
        @CustomType.Parameter("marketplaceID") Object marketplaceID,
        @CustomType.Parameter("mwsAuthToken") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("secretKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey,
        @CustomType.Parameter("sellerID") Object sellerID,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useEncryptedEndpoints") @Nullable Object useEncryptedEndpoints,
        @CustomType.Parameter("useHostVerification") @Nullable Object useHostVerification,
        @CustomType.Parameter("usePeerVerification") @Nullable Object usePeerVerification) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = endpoint;
        this.marketplaceID = marketplaceID;
        this.mwsAuthToken = mwsAuthToken;
        this.parameters = parameters;
        this.secretKey = secretKey;
        this.sellerID = sellerID;
        this.type = type;
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    /**
     * The access key id used to access data.
     * 
    */
    public Object accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
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
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     * 
    */
    public Object endpoint() {
        return this.endpoint;
    }
    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2)
     * 
    */
    public Object marketplaceID() {
        return this.marketplaceID;
    }
    /**
     * The Amazon MWS authentication token.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> mwsAuthToken() {
        return Optional.ofNullable(this.mwsAuthToken);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The secret key used to access data.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * The Amazon seller ID.
     * 
    */
    public Object sellerID() {
        return this.sellerID;
    }
    /**
     * Type of linked service.
     * Expected value is 'AmazonMWS'.
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

    public static Builder builder(AmazonMWSLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object endpoint;
        private Object marketplaceID;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey;
        private Object sellerID;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonMWSLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.marketplaceID = defaults.marketplaceID;
    	      this.mwsAuthToken = defaults.mwsAuthToken;
    	      this.parameters = defaults.parameters;
    	      this.secretKey = defaults.secretKey;
    	      this.sellerID = defaults.sellerID;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder accessKeyId(Object accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
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
        public Builder endpoint(Object endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder marketplaceID(Object marketplaceID) {
            this.marketplaceID = Objects.requireNonNull(marketplaceID);
            return this;
        }
        public Builder mwsAuthToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> mwsAuthToken) {
            this.mwsAuthToken = mwsAuthToken;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder secretKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public Builder sellerID(Object sellerID) {
            this.sellerID = Objects.requireNonNull(sellerID);
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
        }        public AmazonMWSLinkedServiceResponse build() {
            return new AmazonMWSLinkedServiceResponse(accessKeyId, annotations, connectVia, description, encryptedCredential, endpoint, marketplaceID, mwsAuthToken, parameters, secretKey, sellerID, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
