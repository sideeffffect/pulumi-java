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
 * Linked service for Amazon Redshift.
 * 
 */
public final class AmazonRedshiftLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonRedshiftLinkedServiceArgs Empty = new AmazonRedshiftLinkedServiceArgs();

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
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The database name of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database", required=true)
    private Output<Object> database;

    public Output<Object> database() {
        return this.database;
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
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The password of the Amazon Redshift source.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port number that the Amazon Redshift server uses to listen for client connections. The default value is 5439. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="port")
    private @Nullable Output<Object> port;

    public Optional<Output<Object>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The name of the Amazon Redshift server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server", required=true)
    private Output<Object> server;

    public Output<Object> server() {
        return this.server;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonRedshift&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * The username of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Output<Object> username;

    public Optional<Output<Object>> username() {
        return Optional.ofNullable(this.username);
    }

    private AmazonRedshiftLinkedServiceArgs() {}

    private AmazonRedshiftLinkedServiceArgs(AmazonRedshiftLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.database = $.database;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.server = $.server;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonRedshiftLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonRedshiftLinkedServiceArgs $;

        public Builder() {
            $ = new AmazonRedshiftLinkedServiceArgs();
        }

        public Builder(AmazonRedshiftLinkedServiceArgs defaults) {
            $ = new AmazonRedshiftLinkedServiceArgs(Objects.requireNonNull(defaults));
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

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder database(Output<Object> database) {
            $.database = database;
            return this;
        }

        public Builder database(Object database) {
            return database(Output.of(database));
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

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        public Builder port(@Nullable Output<Object> port) {
            $.port = port;
            return this;
        }

        public Builder port(Object port) {
            return port(Output.of(port));
        }

        public Builder server(Output<Object> server) {
            $.server = server;
            return this;
        }

        public Builder server(Object server) {
            return server(Output.of(server));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder username(@Nullable Output<Object> username) {
            $.username = username;
            return this;
        }

        public Builder username(Object username) {
            return username(Output.of(username));
        }

        public AmazonRedshiftLinkedServiceArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
