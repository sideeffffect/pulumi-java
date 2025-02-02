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
 * Linked service for Windows Azure Search Service.
 * 
 */
public final class AzureSearchLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureSearchLinkedServiceArgs Empty = new AzureSearchLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Admin Key for Azure Search service
     * 
     */
    @Import(name="key")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> key;

    /**
     * @return Admin Key for Azure Search service
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureSearch&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;AzureSearch&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * URL for Azure Search service. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    /**
     * @return URL for Azure Search service. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> url() {
        return this.url;
    }

    private AzureSearchLinkedServiceArgs() {}

    private AzureSearchLinkedServiceArgs(AzureSearchLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.key = $.key;
        this.parameters = $.parameters;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSearchLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSearchLinkedServiceArgs $;

        public Builder() {
            $ = new AzureSearchLinkedServiceArgs();
        }

        public Builder(AzureSearchLinkedServiceArgs defaults) {
            $ = new AzureSearchLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param key Admin Key for Azure Search service
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Admin Key for Azure Search service
         * 
         * @return builder
         * 
         */
        public Builder key(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> key) {
            return key(Output.of(key));
        }

        /**
         * @param key Admin Key for Azure Search service
         * 
         * @return builder
         * 
         */
        public Builder key(AzureKeyVaultSecretReferenceArgs key) {
            return key(Either.ofLeft(key));
        }

        /**
         * @param key Admin Key for Azure Search service
         * 
         * @return builder
         * 
         */
        public Builder key(SecureStringArgs key) {
            return key(Either.ofRight(key));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AzureSearch&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;AzureSearch&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url URL for Azure Search service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL for Azure Search service. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder url(Object url) {
            return url(Output.of(url));
        }

        public AzureSearchLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
