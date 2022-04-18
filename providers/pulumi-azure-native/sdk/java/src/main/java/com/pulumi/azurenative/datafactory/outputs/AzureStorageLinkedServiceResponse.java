// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStorageLinkedServiceResponse {
    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
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
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object connectionString;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable String encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    private final @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
    /**
     * SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    private final @Nullable Object sasUri;
    /**
     * Type of linked service.
     * Expected value is 'AzureStorage'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureStorageLinkedServiceResponse(
        @CustomType.Parameter("accountKey") @Nullable AzureKeyVaultSecretReferenceResponse accountKey,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("connectionString") @Nullable Object connectionString,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable String encryptedCredential,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("sasToken") @Nullable AzureKeyVaultSecretReferenceResponse sasToken,
        @CustomType.Parameter("sasUri") @Nullable Object sasUri,
        @CustomType.Parameter("type") String type) {
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.sasToken = sasToken;
        this.sasUri = sasUri;
        this.type = type;
    }

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
    */
    public Optional<AzureKeyVaultSecretReferenceResponse> accountKey() {
        return Optional.ofNullable(this.accountKey);
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
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Object> connectionString() {
        return Optional.ofNullable(this.connectionString);
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
    public Optional<String> encryptedCredential() {
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
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
    */
    public Optional<AzureKeyVaultSecretReferenceResponse> sasToken() {
        return Optional.ofNullable(this.sasToken);
    }
    /**
     * SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
    */
    public Optional<Object> sasUri() {
        return Optional.ofNullable(this.sasUri);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureStorage'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable String description;
        private @Nullable String encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
        private @Nullable Object sasUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.sasToken = defaults.sasToken;
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder accountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
            this.accountKey = accountKey;
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
        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable String encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder sasToken(@Nullable AzureKeyVaultSecretReferenceResponse sasToken) {
            this.sasToken = sasToken;
            return this;
        }
        public Builder sasUri(@Nullable Object sasUri) {
            this.sasUri = sasUri;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureStorageLinkedServiceResponse build() {
            return new AzureStorageLinkedServiceResponse(accountKey, annotations, connectVia, connectionString, description, encryptedCredential, parameters, sasToken, sasUri, type);
        }
    }
}
