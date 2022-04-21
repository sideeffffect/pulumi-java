// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Google BigQuery service linked service.
 * 
 */
public final class GoogleBigQueryLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleBigQueryLinkedServiceResponse Empty = new GoogleBigQueryLinkedServiceResponse();

    /**
     * A comma-separated list of public BigQuery projects to access.
     * 
     */
    @Import(name="additionalProjects")
    private @Nullable Object additionalProjects;

    public Optional<Object> additionalProjects() {
        return Optional.ofNullable(this.additionalProjects);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The OAuth 2.0 authentication mechanism used for authentication. ServiceAuthentication can only be used on self-hosted IR.
     * 
     */
    @Import(name="authenticationType", required=true)
    private String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * The client id of the google application used to acquire the refresh token. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
    private @Nullable Object clientId;

    public Optional<Object> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret of the google application used to acquire the refresh token.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The service account email ID that is used for ServiceAuthentication and can only be used on self-hosted IR.
     * 
     */
    @Import(name="email")
    private @Nullable Object email;

    public Optional<Object> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The full path to the .p12 key file that is used to authenticate the service account email address and can only be used on self-hosted IR.
     * 
     */
    @Import(name="keyFilePath")
    private @Nullable Object keyFilePath;

    public Optional<Object> keyFilePath() {
        return Optional.ofNullable(this.keyFilePath);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The default BigQuery project to query against.
     * 
     */
    @Import(name="project", required=true)
    private Object project;

    public Object project() {
        return this.project;
    }

    /**
     * The refresh token obtained from Google for authorizing access to BigQuery for UserAuthentication.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    /**
     * Whether to request access to Google Drive. Allowing Google Drive access enables support for federated tables that combine BigQuery data with data from Google Drive. The default value is false.
     * 
     */
    @Import(name="requestGoogleDriveScope")
    private @Nullable Object requestGoogleDriveScope;

    public Optional<Object> requestGoogleDriveScope() {
        return Optional.ofNullable(this.requestGoogleDriveScope);
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @Import(name="trustedCertPath")
    private @Nullable Object trustedCertPath;

    public Optional<Object> trustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;GoogleBigQuery&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    @Import(name="useSystemTrustStore")
    private @Nullable Object useSystemTrustStore;

    public Optional<Object> useSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }

    private GoogleBigQueryLinkedServiceResponse() {}

    private GoogleBigQueryLinkedServiceResponse(GoogleBigQueryLinkedServiceResponse $) {
        this.additionalProjects = $.additionalProjects;
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.email = $.email;
        this.encryptedCredential = $.encryptedCredential;
        this.keyFilePath = $.keyFilePath;
        this.parameters = $.parameters;
        this.project = $.project;
        this.refreshToken = $.refreshToken;
        this.requestGoogleDriveScope = $.requestGoogleDriveScope;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useSystemTrustStore = $.useSystemTrustStore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleBigQueryLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleBigQueryLinkedServiceResponse $;

        public Builder() {
            $ = new GoogleBigQueryLinkedServiceResponse();
        }

        public Builder(GoogleBigQueryLinkedServiceResponse defaults) {
            $ = new GoogleBigQueryLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder additionalProjects(@Nullable Object additionalProjects) {
            $.additionalProjects = additionalProjects;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder clientId(@Nullable Object clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder email(@Nullable Object email) {
            $.email = email;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder keyFilePath(@Nullable Object keyFilePath) {
            $.keyFilePath = keyFilePath;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder project(Object project) {
            $.project = project;
            return this;
        }

        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public Builder requestGoogleDriveScope(@Nullable Object requestGoogleDriveScope) {
            $.requestGoogleDriveScope = requestGoogleDriveScope;
            return this;
        }

        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            $.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            $.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public GoogleBigQueryLinkedServiceResponse build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
