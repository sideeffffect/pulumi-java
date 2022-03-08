// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
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
public final class AzureDataExplorerLinkedServiceResponse {
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
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
     */
    private final Object database;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the format https://<clusterName>.<regionName>.kusto.windows.net. Type: string (or Expression with resultType string)
     * 
     */
    private final Object endpoint;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The ID of the service principal used to authenticate against Azure Data Explorer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The key of the service principal used to authenticate against Kusto.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'AzureDataExplorer'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","connectVia","credential","database","description","endpoint","parameters","servicePrincipalId","servicePrincipalKey","tenant","type"})
    private AzureDataExplorerLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        Object database,
        @Nullable String description,
        Object endpoint,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object tenant,
        String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.credential = credential;
        this.database = database;
        this.description = description;
        this.endpoint = endpoint;
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The credential reference containing authentication information.
     * 
    */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
    */
    public Object getDatabase() {
        return this.database;
    }
    /**
     * Linked service description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the format https://<clusterName>.<regionName>.kusto.windows.net. Type: string (or Expression with resultType string)
     * 
    */
    public Object getEndpoint() {
        return this.endpoint;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The ID of the service principal used to authenticate against Azure Data Explorer. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The key of the service principal used to authenticate against Kusto.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureDataExplorer'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private Object database;
        private @Nullable String description;
        private Object endpoint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setDatabase(Object database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEndpoint(Object endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureDataExplorerLinkedServiceResponse build() {
            return new AzureDataExplorerLinkedServiceResponse(annotations, connectVia, credential, database, description, endpoint, parameters, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
