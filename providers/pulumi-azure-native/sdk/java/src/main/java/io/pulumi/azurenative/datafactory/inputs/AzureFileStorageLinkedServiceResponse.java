// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure File Storage linked service.
 * 
 */
public final class AzureFileStorageLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFileStorageLinkedServiceResponse Empty = new AzureFileStorageLinkedServiceResponse();

    /**
     * The Azure key vault secret reference of accountKey in connection string.
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable AzureKeyVaultSecretReferenceResponse accountKey;

    public Optional<AzureKeyVaultSecretReferenceResponse> getAccountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The connection string. It is mutually exclusive with sasUri property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
      private final @Nullable Object connectionString;

    public Optional<Object> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The azure file share name. It is required when auth with accountKey/sasToken. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="fileShare")
      private final @Nullable Object fileShare;

    public Optional<Object> getFileShare() {
        return this.fileShare == null ? Optional.empty() : Optional.ofNullable(this.fileShare);
    }

    /**
     * Host name of the server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="host")
      private final @Nullable Object host;

    public Optional<Object> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Password to logon the server.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The Azure key vault secret reference of sasToken in sas uri.
     * 
     */
    @InputImport(name="sasToken")
      private final @Nullable AzureKeyVaultSecretReferenceResponse sasToken;

    public Optional<AzureKeyVaultSecretReferenceResponse> getSasToken() {
        return this.sasToken == null ? Optional.empty() : Optional.ofNullable(this.sasToken);
    }

    /**
     * SAS URI of the Azure File resource. It is mutually exclusive with connectionString property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="sasUri")
      private final @Nullable Object sasUri;

    public Optional<Object> getSasUri() {
        return this.sasUri == null ? Optional.empty() : Optional.ofNullable(this.sasUri);
    }

    /**
     * The azure file share snapshot version. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="snapshot")
      private final @Nullable Object snapshot;

    public Optional<Object> getSnapshot() {
        return this.snapshot == null ? Optional.empty() : Optional.ofNullable(this.snapshot);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureFileStorage'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * User ID to logon the server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userId")
      private final @Nullable Object userId;

    public Optional<Object> getUserId() {
        return this.userId == null ? Optional.empty() : Optional.ofNullable(this.userId);
    }

    public AzureFileStorageLinkedServiceResponse(
        @Nullable AzureKeyVaultSecretReferenceResponse accountKey,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionString,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object fileShare,
        @Nullable Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable AzureKeyVaultSecretReferenceResponse sasToken,
        @Nullable Object sasUri,
        @Nullable Object snapshot,
        String type,
        @Nullable Object userId) {
        this.accountKey = accountKey;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.fileShare = fileShare;
        this.host = host;
        this.parameters = parameters;
        this.password = password;
        this.sasToken = sasToken;
        this.sasUri = sasUri;
        this.snapshot = snapshot;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userId = userId;
    }

    private AzureFileStorageLinkedServiceResponse() {
        this.accountKey = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.connectionString = null;
        this.description = null;
        this.encryptedCredential = null;
        this.fileShare = null;
        this.host = null;
        this.parameters = Map.of();
        this.password = null;
        this.sasToken = null;
        this.sasUri = null;
        this.snapshot = null;
        this.type = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureKeyVaultSecretReferenceResponse accountKey;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object fileShare;
        private @Nullable Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable AzureKeyVaultSecretReferenceResponse sasToken;
        private @Nullable Object sasUri;
        private @Nullable Object snapshot;
        private String type;
        private @Nullable Object userId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.fileShare = defaults.fileShare;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.sasToken = defaults.sasToken;
    	      this.sasUri = defaults.sasUri;
    	      this.snapshot = defaults.snapshot;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
        }

        public Builder accountKey(@Nullable AzureKeyVaultSecretReferenceResponse accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
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

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder fileShare(@Nullable Object fileShare) {
            this.fileShare = fileShare;
            return this;
        }

        public Builder host(@Nullable Object host) {
            this.host = host;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
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

        public Builder snapshot(@Nullable Object snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userId(@Nullable Object userId) {
            this.userId = userId;
            return this;
        }
        public AzureFileStorageLinkedServiceResponse build() {
            return new AzureFileStorageLinkedServiceResponse(accountKey, annotations, connectVia, connectionString, description, encryptedCredential, fileShare, host, parameters, password, sasToken, sasUri, snapshot, type, userId);
        }
    }
}
