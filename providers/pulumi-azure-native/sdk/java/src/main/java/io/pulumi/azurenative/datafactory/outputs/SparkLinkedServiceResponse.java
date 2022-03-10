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
public final class SparkLinkedServiceResponse {
    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    private final @Nullable Object allowHostNameCNMismatch;
    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    private final @Nullable Object allowSelfSignedServerCert;
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The authentication method used to access the Spark server.
     * 
     */
    private final String authenticationType;
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
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    private final @Nullable Object enableSsl;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * IP address or host name of the Spark server
     * 
     */
    private final Object host;
    /**
     * The partial URL corresponding to the Spark server.
     * 
     */
    private final @Nullable Object httpPath;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password corresponding to the user name that you provided in the Username field
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port that the Spark server uses to listen for client connections.
     * 
     */
    private final Object port;
    /**
     * The type of Spark server.
     * 
     */
    private final @Nullable String serverType;
    /**
     * The transport protocol to use in the Thrift layer.
     * 
     */
    private final @Nullable String thriftTransportProtocol;
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    private final @Nullable Object trustedCertPath;
    /**
     * Type of linked service.
     * Expected value is 'Spark'.
     * 
     */
    private final String type;
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
     */
    private final @Nullable Object useSystemTrustStore;
    /**
     * The user name that you use to access Spark Server.
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor
    private SparkLinkedServiceResponse(
        @OutputCustomType.Parameter("allowHostNameCNMismatch") @Nullable Object allowHostNameCNMismatch,
        @OutputCustomType.Parameter("allowSelfSignedServerCert") @Nullable Object allowSelfSignedServerCert,
        @OutputCustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @OutputCustomType.Parameter("authenticationType") String authenticationType,
        @OutputCustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("enableSsl") @Nullable Object enableSsl,
        @OutputCustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @OutputCustomType.Parameter("host") Object host,
        @OutputCustomType.Parameter("httpPath") @Nullable Object httpPath,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @OutputCustomType.Parameter("password") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @OutputCustomType.Parameter("port") Object port,
        @OutputCustomType.Parameter("serverType") @Nullable String serverType,
        @OutputCustomType.Parameter("thriftTransportProtocol") @Nullable String thriftTransportProtocol,
        @OutputCustomType.Parameter("trustedCertPath") @Nullable Object trustedCertPath,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("useSystemTrustStore") @Nullable Object useSystemTrustStore,
        @OutputCustomType.Parameter("username") @Nullable Object username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.httpPath = httpPath;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.serverType = serverType;
        this.thriftTransportProtocol = thriftTransportProtocol;
        this.trustedCertPath = trustedCertPath;
        this.type = type;
        this.useSystemTrustStore = useSystemTrustStore;
        this.username = username;
    }

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
    */
    public Optional<Object> getAllowHostNameCNMismatch() {
        return Optional.ofNullable(this.allowHostNameCNMismatch);
    }
    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
    */
    public Optional<Object> getAllowSelfSignedServerCert() {
        return Optional.ofNullable(this.allowSelfSignedServerCert);
    }
    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The authentication method used to access the Spark server.
     * 
    */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
    */
    public Optional<Object> getEnableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * IP address or host name of the Spark server
     * 
    */
    public Object getHost() {
        return this.host;
    }
    /**
     * The partial URL corresponding to the Spark server.
     * 
    */
    public Optional<Object> getHttpPath() {
        return Optional.ofNullable(this.httpPath);
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password corresponding to the user name that you provided in the Username field
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port that the Spark server uses to listen for client connections.
     * 
    */
    public Object getPort() {
        return this.port;
    }
    /**
     * The type of Spark server.
     * 
    */
    public Optional<String> getServerType() {
        return Optional.ofNullable(this.serverType);
    }
    /**
     * The transport protocol to use in the Thrift layer.
     * 
    */
    public Optional<String> getThriftTransportProtocol() {
        return Optional.ofNullable(this.thriftTransportProtocol);
    }
    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
    */
    public Optional<Object> getTrustedCertPath() {
        return Optional.ofNullable(this.trustedCertPath);
    }
    /**
     * Type of linked service.
     * Expected value is 'Spark'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default value is false.
     * 
    */
    public Optional<Object> getUseSystemTrustStore() {
        return Optional.ofNullable(this.useSystemTrustStore);
    }
    /**
     * The user name that you use to access Spark Server.
     * 
    */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowHostNameCNMismatch;
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object enableSsl;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Object httpPath;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object port;
        private @Nullable String serverType;
        private @Nullable String thriftTransportProtocol;
        private @Nullable Object trustedCertPath;
        private String type;
        private @Nullable Object useSystemTrustStore;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.httpPath = defaults.httpPath;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverType = defaults.serverType;
    	      this.thriftTransportProtocol = defaults.thriftTransportProtocol;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.useSystemTrustStore = defaults.useSystemTrustStore;
    	      this.username = defaults.username;
        }

        public Builder allowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder allowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
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

        public Builder enableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder host(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder httpPath(@Nullable Object httpPath) {
            this.httpPath = httpPath;
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

        public Builder port(Object port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder serverType(@Nullable String serverType) {
            this.serverType = serverType;
            return this;
        }

        public Builder thriftTransportProtocol(@Nullable String thriftTransportProtocol) {
            this.thriftTransportProtocol = thriftTransportProtocol;
            return this;
        }

        public Builder trustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder useSystemTrustStore(@Nullable Object useSystemTrustStore) {
            this.useSystemTrustStore = useSystemTrustStore;
            return this;
        }

        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public SparkLinkedServiceResponse build() {
            return new SparkLinkedServiceResponse(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, httpPath, parameters, password, port, serverType, thriftTransportProtocol, trustedCertPath, type, useSystemTrustStore, username);
        }
    }
}
