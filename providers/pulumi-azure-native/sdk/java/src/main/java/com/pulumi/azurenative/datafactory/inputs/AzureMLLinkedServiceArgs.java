// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
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
 * Azure ML Studio Web Service linked service.
 * 
 */
public final class AzureMLLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureMLLinkedServiceArgs Empty = new AzureMLLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The API key for accessing the Azure ML model endpoint.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey() {
        return this.apiKey;
    }

    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<Object> authentication;

    public Optional<Output<Object>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mlEndpoint", required=true)
    private Output<Object> mlEndpoint;

    public Output<Object> mlEndpoint() {
        return this.mlEndpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<Object> tenant;

    public Optional<Output<Object>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureML&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The Update Resource REST URL for an Azure ML Studio Web Service endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="updateResourceEndpoint")
    private @Nullable Output<Object> updateResourceEndpoint;

    public Optional<Output<Object>> updateResourceEndpoint() {
        return Optional.ofNullable(this.updateResourceEndpoint);
    }

    private AzureMLLinkedServiceArgs() {}

    private AzureMLLinkedServiceArgs(AzureMLLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.apiKey = $.apiKey;
        this.authentication = $.authentication;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.mlEndpoint = $.mlEndpoint;
        this.parameters = $.parameters;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.updateResourceEndpoint = $.updateResourceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLLinkedServiceArgs $;

        public Builder() {
            $ = new AzureMLLinkedServiceArgs();
        }

        public Builder(AzureMLLinkedServiceArgs defaults) {
            $ = new AzureMLLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder apiKey(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public Builder authentication(@Nullable Output<Object> authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder authentication(Object authentication) {
            return authentication(Output.of(authentication));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder mlEndpoint(Output<Object> mlEndpoint) {
            $.mlEndpoint = mlEndpoint;
            return this;
        }

        public Builder mlEndpoint(Object mlEndpoint) {
            return mlEndpoint(Output.of(mlEndpoint));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        public Builder tenant(@Nullable Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder updateResourceEndpoint(@Nullable Output<Object> updateResourceEndpoint) {
            $.updateResourceEndpoint = updateResourceEndpoint;
            return this;
        }

        public Builder updateResourceEndpoint(Object updateResourceEndpoint) {
            return updateResourceEndpoint(Output.of(updateResourceEndpoint));
        }

        public AzureMLLinkedServiceArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            $.mlEndpoint = Objects.requireNonNull($.mlEndpoint, "expected parameter 'mlEndpoint' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
