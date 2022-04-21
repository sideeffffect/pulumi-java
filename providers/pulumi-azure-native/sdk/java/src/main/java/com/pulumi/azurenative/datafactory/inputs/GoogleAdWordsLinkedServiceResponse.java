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
 * Google AdWords service linked service.
 * 
 */
public final class GoogleAdWordsLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleAdWordsLinkedServiceResponse Empty = new GoogleAdWordsLinkedServiceResponse();

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
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }

    /**
     * The Client customer ID of the AdWords account that you want to fetch report data for.
     * 
     */
    @Import(name="clientCustomerID")
    private @Nullable Object clientCustomerID;

    public Optional<Object> clientCustomerID() {
        return Optional.ofNullable(this.clientCustomerID);
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
     * Properties used to connect to GoogleAds. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @Import(name="connectionProperties")
    private @Nullable Object connectionProperties;

    public Optional<Object> connectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
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
     * The developer token associated with the manager account that you use to grant access to the AdWords API.
     * 
     */
    @Import(name="developerToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> developerToken() {
        return Optional.ofNullable(this.developerToken);
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
     * The refresh token obtained from Google for authorizing access to AdWords for UserAuthentication.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
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
     * Expected value is &#39;GoogleAdWords&#39;.
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

    private GoogleAdWordsLinkedServiceResponse() {}

    private GoogleAdWordsLinkedServiceResponse(GoogleAdWordsLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.clientCustomerID = $.clientCustomerID;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.connectionProperties = $.connectionProperties;
        this.description = $.description;
        this.developerToken = $.developerToken;
        this.email = $.email;
        this.encryptedCredential = $.encryptedCredential;
        this.keyFilePath = $.keyFilePath;
        this.parameters = $.parameters;
        this.refreshToken = $.refreshToken;
        this.trustedCertPath = $.trustedCertPath;
        this.type = $.type;
        this.useSystemTrustStore = $.useSystemTrustStore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleAdWordsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAdWordsLinkedServiceResponse $;

        public Builder() {
            $ = new GoogleAdWordsLinkedServiceResponse();
        }

        public Builder(GoogleAdWordsLinkedServiceResponse defaults) {
            $ = new GoogleAdWordsLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder clientCustomerID(@Nullable Object clientCustomerID) {
            $.clientCustomerID = clientCustomerID;
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

        public Builder connectionProperties(@Nullable Object connectionProperties) {
            $.connectionProperties = connectionProperties;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder developerToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> developerToken) {
            $.developerToken = developerToken;
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

        public Builder refreshToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> refreshToken) {
            $.refreshToken = refreshToken;
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

        public GoogleAdWordsLinkedServiceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
