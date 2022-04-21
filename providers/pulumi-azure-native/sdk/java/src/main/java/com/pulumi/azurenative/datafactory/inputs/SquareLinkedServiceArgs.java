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
 * Square Service linked service.
 * 
 */
public final class SquareLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SquareLinkedServiceArgs Empty = new SquareLinkedServiceArgs();

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
     * The client ID associated with your Square application.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<Object> clientId;

    public Optional<Output<Object>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret associated with your Square application.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
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
     * Properties used to connect to Square. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @Import(name="connectionProperties")
    private @Nullable Output<Object> connectionProperties;

    public Optional<Output<Object>> connectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
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
     * The URL of the Square instance. (i.e. mystore.mysquare.com)
     * 
     */
    @Import(name="host")
    private @Nullable Output<Object> host;

    public Optional<Output<Object>> host() {
        return Optional.ofNullable(this.host);
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
     * The redirect URL assigned in the Square application dashboard. (i.e. http://localhost:2500)
     * 
     */
    @Import(name="redirectUri")
    private @Nullable Output<Object> redirectUri;

    public Optional<Output<Object>> redirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Square&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Output<Object> useEncryptedEndpoints;

    public Optional<Output<Object>> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Output<Object> useHostVerification;

    public Optional<Output<Object>> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Output<Object> usePeerVerification;

    public Optional<Output<Object>> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    private SquareLinkedServiceArgs() {}

    private SquareLinkedServiceArgs(SquareLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.connectVia = $.connectVia;
        this.connectionProperties = $.connectionProperties;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.parameters = $.parameters;
        this.redirectUri = $.redirectUri;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SquareLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SquareLinkedServiceArgs $;

        public Builder() {
            $ = new SquareLinkedServiceArgs();
        }

        public Builder(SquareLinkedServiceArgs defaults) {
            $ = new SquareLinkedServiceArgs(Objects.requireNonNull(defaults));
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

        public Builder clientId(@Nullable Output<Object> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(Object clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder connectionProperties(@Nullable Output<Object> connectionProperties) {
            $.connectionProperties = connectionProperties;
            return this;
        }

        public Builder connectionProperties(Object connectionProperties) {
            return connectionProperties(Output.of(connectionProperties));
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

        public Builder host(@Nullable Output<Object> host) {
            $.host = host;
            return this;
        }

        public Builder host(Object host) {
            return host(Output.of(host));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder redirectUri(@Nullable Output<Object> redirectUri) {
            $.redirectUri = redirectUri;
            return this;
        }

        public Builder redirectUri(Object redirectUri) {
            return redirectUri(Output.of(redirectUri));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(Object useEncryptedEndpoints) {
            return useEncryptedEndpoints(Output.of(useEncryptedEndpoints));
        }

        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(Object useHostVerification) {
            return useHostVerification(Output.of(useHostVerification));
        }

        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(Object usePeerVerification) {
            return usePeerVerification(Output.of(usePeerVerification));
        }

        public SquareLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
