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
 * Microsoft Access linked service.
 * 
 */
public final class MicrosoftAccessLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final MicrosoftAccessLinkedServiceResponse Empty = new MicrosoftAccessLinkedServiceResponse();

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
     * Type of authentication used to connect to the Microsoft Access as ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType")
    private @Nullable Object authenticationType;

    public Optional<Object> authenticationType() {
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
     * The non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
    private Object connectionString;

    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * The access credential portion of the connection string specified in driver-specific property-value format.
     * 
     */
    @Import(name="credential")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> credential;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> credential() {
        return Optional.ofNullable(this.credential);
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
     * Password for Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;MicrosoftAccess&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private MicrosoftAccessLinkedServiceResponse() {}

    private MicrosoftAccessLinkedServiceResponse(MicrosoftAccessLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.connectionString = $.connectionString;
        this.credential = $.credential;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.password = $.password;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MicrosoftAccessLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MicrosoftAccessLinkedServiceResponse $;

        public Builder() {
            $ = new MicrosoftAccessLinkedServiceResponse();
        }

        public Builder(MicrosoftAccessLinkedServiceResponse defaults) {
            $ = new MicrosoftAccessLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(@Nullable Object authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectionString(Object connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder credential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> credential) {
            $.credential = credential;
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

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userName(@Nullable Object userName) {
            $.userName = userName;
            return this;
        }

        public MicrosoftAccessLinkedServiceResponse build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
