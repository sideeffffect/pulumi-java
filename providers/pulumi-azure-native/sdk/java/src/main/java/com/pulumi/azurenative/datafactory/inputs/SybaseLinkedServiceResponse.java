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
 * Linked service for Sybase data source.
 * 
 */
public final class SybaseLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SybaseLinkedServiceResponse Empty = new SybaseLinkedServiceResponse();

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
     * AuthenticationType to be used for connection.
     * 
     */
    @Import(name="authenticationType")
    private @Nullable String authenticationType;

    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
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
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database", required=true)
    private Object database;

    public Object database() {
        return this.database;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
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
     * Password for authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Schema name for connection. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="schema")
    private @Nullable Object schema;

    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Server name for connection. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server", required=true)
    private Object server;

    public Object server() {
        return this.server;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Sybase&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Object username;

    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
    }

    private SybaseLinkedServiceResponse() {}

    private SybaseLinkedServiceResponse(SybaseLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.database = $.database;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.schema = $.schema;
        this.server = $.server;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SybaseLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SybaseLinkedServiceResponse $;

        public Builder() {
            $ = new SybaseLinkedServiceResponse();
        }

        public Builder(SybaseLinkedServiceResponse defaults) {
            $ = new SybaseLinkedServiceResponse(Objects.requireNonNull(defaults));
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

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder database(Object database) {
            $.database = database;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder schema(@Nullable Object schema) {
            $.schema = schema;
            return this;
        }

        public Builder server(Object server) {
            $.server = server;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder username(@Nullable Object username) {
            $.username = username;
            return this;
        }

        public SybaseLinkedServiceResponse build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
