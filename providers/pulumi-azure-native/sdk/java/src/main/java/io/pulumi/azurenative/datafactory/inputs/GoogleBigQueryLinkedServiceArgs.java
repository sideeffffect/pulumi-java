// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.GoogleBigQueryAuthenticationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Google BigQuery service linked service.
 * 
 */
public final class GoogleBigQueryLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleBigQueryLinkedServiceArgs Empty = new GoogleBigQueryLinkedServiceArgs();

    /**
     * A comma-separated list of public BigQuery projects to access.
     * 
     */
    @InputImport(name="additionalProjects")
      private final @Nullable Input<Object> additionalProjects;

    public Input<Object> getAdditionalProjects() {
        return this.additionalProjects == null ? Input.empty() : this.additionalProjects;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    @InputImport(name="authenticationType", required=true)
      private final Input<Either<String,GoogleBigQueryAuthenticationType>> authenticationType;

    public Input<Either<String,GoogleBigQueryAuthenticationType>> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<Object> clientId;

    public Input<Object> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<Object> email;

    public Input<Object> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
      private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    @InputImport(name="keyFilePath")
      private final @Nullable Input<Object> keyFilePath;

    public Input<Object> getKeyFilePath() {
        return this.keyFilePath == null ? Input.empty() : this.keyFilePath;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The default BigQuery project to query against.
     * 
     */
    @InputImport(name="project", required=true)
      private final Input<Object> project;

    public Input<Object> getProject() {
        return this.project;
    }

    /**
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    @InputImport(name="refreshToken")
      private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    /**
     * Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    @InputImport(name="requestGoogleDriveScope")
      private final @Nullable Input<Object> requestGoogleDriveScope;

    public Input<Object> getRequestGoogleDriveScope() {
        return this.requestGoogleDriveScope == null ? Input.empty() : this.requestGoogleDriveScope;
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @InputImport(name="trustedCertPath")
      private final @Nullable Input<Object> trustedCertPath;

    public Input<Object> getTrustedCertPath() {
        return this.trustedCertPath == null ? Input.empty() : this.trustedCertPath;
    }

    /**
     * Type of linked service.
     * Expected value is 'GoogleBigQuery'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @InputImport(name="useSystemTrustStore")
      private final @Nullable Input<Object> useSystemTrustStore;

    public Input<Object> getUseSystemTrustStore() {
        return this.useSystemTrustStore == null ? Input.empty() : this.useSystemTrustStore;
    }

    public GoogleBigQueryLinkedServiceArgs(
        @Nullable Input<Object> additionalProjects,
        @Nullable Input<List<Object>> annotations,
        Input<Either<String,GoogleBigQueryAuthenticationType>> authenticationType,
        @Nullable Input<Object> clientId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> email,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> keyFilePath,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<Object> project,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken,
        @Nullable Input<Object> requestGoogleDriveScope,
        @Nullable Input<Object> trustedCertPath,
        Input<String> type,
        @Nullable Input<Object> useSystemTrustStore) {
        this.additionalProjects = additionalProjects;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.email = email;
        this.encryptedCredential = encryptedCredential;
        this.keyFilePath = keyFilePath;
        this.parameters = parameters;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.refreshToken = refreshToken;
        this.requestGoogleDriveScope = requestGoogleDriveScope;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useSystemTrustStore = useSystemTrustStore;
    }

    private GoogleBigQueryLinkedServiceArgs() {
        this.additionalProjects = Input.empty();
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.email = Input.empty();
        this.encryptedCredential = Input.empty();
        this.keyFilePath = Input.empty();
        this.parameters = Input.empty();
        this.project = Input.empty();
        this.refreshToken = Input.empty();
        this.requestGoogleDriveScope = Input.empty();
        this.trustedCertPath = Input.empty();
        this.type = Input.empty();
        this.useSystemTrustStore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleBigQueryLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalProjects;
        private @Nullable Input<List<Object>> annotations;
        private Input<Either<String,GoogleBigQueryAuthenticationType>> authenticationType;
        private @Nullable Input<Object> clientId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> email;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> keyFilePath;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<Object> project;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;
        private @Nullable Input<Object> requestGoogleDriveScope;
        private @Nullable Input<Object> trustedCertPath;
        private Input<String> type;
        private @Nullable Input<Object> useSystemTrustStore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleBigQueryLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProjects = defaults.additionalProjects;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.email = defaults.email;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.keyFilePath = defaults.keyFilePath;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.refreshToken = defaults.refreshToken;
    	      this.requestGoogleDriveScope = defaults.requestGoogleDriveScope;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
        }

        public Builder additionalProjects(@Nullable Input<Object> additionalProjects) {
            this.additionalProjects = additionalProjects;
            return this;
        }

        public Builder additionalProjects(@Nullable Object additionalProjects) {
            this.additionalProjects = Input.ofNullable(additionalProjects);
            return this;
        }

        public Builder annotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder authenticationType(Input<Either<String,GoogleBigQueryAuthenticationType>> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder authenticationType(Either<String,GoogleBigQueryAuthenticationType> authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder clientId(@Nullable Input<Object> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable Object clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder clientSecret(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder connectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder email(@Nullable Input<Object> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable Object email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder encryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder keyFilePath(@Nullable Input<Object> keyFilePath) {
            this.keyFilePath = keyFilePath;
            return this;
        }

        public Builder keyFilePath(@Nullable Object keyFilePath) {
            this.keyFilePath = Input.ofNullable(keyFilePath);
            return this;
        }

        public Builder parameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder project(Input<Object> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder project(Object project) {
            this.project = Input.of(Objects.requireNonNull(project));
            return this;
        }

        public Builder refreshToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public Builder requestGoogleDriveScope(@Nullable Input<Object> requestGoogleDriveScope) {
            this.requestGoogleDriveScope = requestGoogleDriveScope;
            return this;
        }

        public Builder requestGoogleDriveScope(@Nullable Object requestGoogleDriveScope) {
            this.requestGoogleDriveScope = Input.ofNullable(requestGoogleDriveScope);
            return this;
        }

        public Builder trustedCertPath(@Nullable Input<Object> trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = Input.ofNullable(trustedCertPath);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder useSystemTrustStore(@Nullable Input<Object> useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = Input.ofNullable(useSystemTrustStore);
            return this;
        }
        public GoogleBigQueryLinkedServiceArgs build() {
            return new GoogleBigQueryLinkedServiceArgs(additionalProjects, annotations, authenticationType, clientId, clientSecret, connectVia, description, email, encryptedCredential, keyFilePath, parameters, project, refreshToken, requestGoogleDriveScope, trustedCertPath, type, useSystemTrustStore);
        }
    }
}
