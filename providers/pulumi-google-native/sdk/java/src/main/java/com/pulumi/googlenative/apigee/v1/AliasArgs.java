// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Alias for the key/certificate pair. Values must match the regular expression `[\w\s-.]{1,255}`. This must be provided for all formats except `selfsignedcert`; self-signed certs may specify the alias in either this parameter or the JSON body.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return Alias for the key/certificate pair. Values must match the regular expression `[\w\s-.]{1,255}`. This must be provided for all formats except `selfsignedcert`; self-signed certs may specify the alias in either this parameter or the JSON body.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The HTTP request/response body as raw binary.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return The HTTP request/response body as raw binary.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<Map<String,String>>> extensions;

    /**
     * @return Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    public Optional<Output<List<Map<String,String>>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * Required. Format of the data. Valid values include: `selfsignedcert`, `keycertfile`, or `pkcs12`
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return Required. Format of the data. Valid values include: `selfsignedcert`, `keycertfile`, or `pkcs12`
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed.
     * 
     */
    @Import(name="ignoreExpiryValidation")
    private @Nullable Output<String> ignoreExpiryValidation;

    /**
     * @return Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed.
     * 
     */
    public Optional<Output<String>> ignoreExpiryValidation() {
        return Optional.ofNullable(this.ignoreExpiryValidation);
    }

    /**
     * Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
     * 
     */
    @Import(name="ignoreNewlineValidation")
    private @Nullable Output<String> ignoreNewlineValidation;

    /**
     * @return Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
     * 
     */
    public Optional<Output<String>> ignoreNewlineValidation() {
        return Optional.ofNullable(this.ignoreNewlineValidation);
    }

    @Import(name="keystoreId", required=true)
    private Output<String> keystoreId;

    public Output<String> keystoreId() {
        return this.keystoreId;
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * DEPRECATED: For improved security, specify the password in the request body instead of using the query parameter. To specify the password in the request body, set `Content-type: multipart/form-data` part with name `password`. Password for the private key file, if required.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return DEPRECATED: For improved security, specify the password in the request body instead of using the query parameter. To specify the password in the request body, set `Content-type: multipart/form-data` part with name `password`. Password for the private key file, if required.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.alias = $.alias;
        this.contentType = $.contentType;
        this.data = $.data;
        this.environmentId = $.environmentId;
        this.extensions = $.extensions;
        this.format = $.format;
        this.ignoreExpiryValidation = $.ignoreExpiryValidation;
        this.ignoreNewlineValidation = $.ignoreNewlineValidation;
        this.keystoreId = $.keystoreId;
        this.organizationId = $.organizationId;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias Alias for the key/certificate pair. Values must match the regular expression `[\w\s-.]{1,255}`. This must be provided for all formats except `selfsignedcert`; self-signed certs may specify the alias in either this parameter or the JSON body.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Alias for the key/certificate pair. Values must match the regular expression `[\w\s-.]{1,255}`. This must be provided for all formats except `selfsignedcert`; self-signed certs may specify the alias in either this parameter or the JSON body.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param contentType The HTTP Content-Type header value specifying the content type of the body.
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The HTTP Content-Type header value specifying the content type of the body.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param data The HTTP request/response body as raw binary.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The HTTP request/response body as raw binary.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(@Nullable Output<List<Map<String,String>>> extensions) {
            $.extensions = extensions;
            return this;
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(List<Map<String,String>> extensions) {
            return extensions(Output.of(extensions));
        }

        /**
         * @param extensions Application specific response metadata. Must be set in the first response for streaming APIs.
         * 
         * @return builder
         * 
         */
        public Builder extensions(Map<String,String>... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param format Required. Format of the data. Valid values include: `selfsignedcert`, `keycertfile`, or `pkcs12`
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Required. Format of the data. Valid values include: `selfsignedcert`, `keycertfile`, or `pkcs12`
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param ignoreExpiryValidation Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed.
         * 
         * @return builder
         * 
         */
        public Builder ignoreExpiryValidation(@Nullable Output<String> ignoreExpiryValidation) {
            $.ignoreExpiryValidation = ignoreExpiryValidation;
            return this;
        }

        /**
         * @param ignoreExpiryValidation Flag that specifies whether to ignore expiry validation. If set to `true`, no expiry validation will be performed.
         * 
         * @return builder
         * 
         */
        public Builder ignoreExpiryValidation(String ignoreExpiryValidation) {
            return ignoreExpiryValidation(Output.of(ignoreExpiryValidation));
        }

        /**
         * @param ignoreNewlineValidation Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNewlineValidation(@Nullable Output<String> ignoreNewlineValidation) {
            $.ignoreNewlineValidation = ignoreNewlineValidation;
            return this;
        }

        /**
         * @param ignoreNewlineValidation Flag that specifies whether to ignore newline validation. If set to `true`, no error is thrown when the file contains a certificate chain with no newline between each certificate. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreNewlineValidation(String ignoreNewlineValidation) {
            return ignoreNewlineValidation(Output.of(ignoreNewlineValidation));
        }

        public Builder keystoreId(Output<String> keystoreId) {
            $.keystoreId = keystoreId;
            return this;
        }

        public Builder keystoreId(String keystoreId) {
            return keystoreId(Output.of(keystoreId));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param password DEPRECATED: For improved security, specify the password in the request body instead of using the query parameter. To specify the password in the request body, set `Content-type: multipart/form-data` part with name `password`. Password for the private key file, if required.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password DEPRECATED: For improved security, specify the password in the request body instead of using the query parameter. To specify the password in the request body, set `Content-type: multipart/form-data` part with name `password`. Password for the private key file, if required.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public AliasArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.keystoreId = Objects.requireNonNull($.keystoreId, "expected parameter 'keystoreId' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
