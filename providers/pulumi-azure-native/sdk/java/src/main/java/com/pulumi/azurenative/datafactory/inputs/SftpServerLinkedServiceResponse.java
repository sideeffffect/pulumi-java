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
 * A linked service for an SSH File Transfer Protocol (SFTP) server.
 * 
 */
public final class SftpServerLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SftpServerLinkedServiceResponse Empty = new SftpServerLinkedServiceResponse();

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
     * The authentication type to be used to connect to the FTP server.
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
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="host", required=true)
    private Object host;

    public Object host() {
        return this.host;
    }

    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostKeyFingerprint")
    private @Nullable Object hostKeyFingerprint;

    public Optional<Object> hostKeyFingerprint() {
        return Optional.ofNullable(this.hostKeyFingerprint);
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
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     */
    @Import(name="passPhrase")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> passPhrase() {
        return Optional.ofNullable(this.passPhrase);
    }

    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
    private @Nullable Object port;

    public Optional<Object> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
     */
    @Import(name="privateKeyContent")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> privateKeyContent() {
        return Optional.ofNullable(this.privateKeyContent);
    }

    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="privateKeyPath")
    private @Nullable Object privateKeyPath;

    public Optional<Object> privateKeyPath() {
        return Optional.ofNullable(this.privateKeyPath);
    }

    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="skipHostKeyValidation")
    private @Nullable Object skipHostKeyValidation;

    public Optional<Object> skipHostKeyValidation() {
        return Optional.ofNullable(this.skipHostKeyValidation);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;Sftp&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Object userName;

    public Optional<Object> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SftpServerLinkedServiceResponse() {}

    private SftpServerLinkedServiceResponse(SftpServerLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.host = $.host;
        this.hostKeyFingerprint = $.hostKeyFingerprint;
        this.parameters = $.parameters;
        this.passPhrase = $.passPhrase;
        this.password = $.password;
        this.port = $.port;
        this.privateKeyContent = $.privateKeyContent;
        this.privateKeyPath = $.privateKeyPath;
        this.skipHostKeyValidation = $.skipHostKeyValidation;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SftpServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SftpServerLinkedServiceResponse $;

        public Builder() {
            $ = new SftpServerLinkedServiceResponse();
        }

        public Builder(SftpServerLinkedServiceResponse defaults) {
            $ = new SftpServerLinkedServiceResponse(Objects.requireNonNull(defaults));
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

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder host(Object host) {
            $.host = host;
            return this;
        }

        public Builder hostKeyFingerprint(@Nullable Object hostKeyFingerprint) {
            $.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder passPhrase(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase) {
            $.passPhrase = passPhrase;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder port(@Nullable Object port) {
            $.port = port;
            return this;
        }

        public Builder privateKeyContent(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent) {
            $.privateKeyContent = privateKeyContent;
            return this;
        }

        public Builder privateKeyPath(@Nullable Object privateKeyPath) {
            $.privateKeyPath = privateKeyPath;
            return this;
        }

        public Builder skipHostKeyValidation(@Nullable Object skipHostKeyValidation) {
            $.skipHostKeyValidation = skipHostKeyValidation;
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

        public SftpServerLinkedServiceResponse build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
