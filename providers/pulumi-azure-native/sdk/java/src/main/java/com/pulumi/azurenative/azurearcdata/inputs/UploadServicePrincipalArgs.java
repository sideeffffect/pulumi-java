// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service principal for uploading billing, metrics and logs.
 * 
 */
public final class UploadServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final UploadServicePrincipalArgs Empty = new UploadServicePrincipalArgs();

    /**
     * Authority for the service principal. Example: https://login.microsoftonline.com/
     * 
     */
    @Import(name="authority")
    private @Nullable Output<String> authority;

    /**
     * @return Authority for the service principal. Example: https://login.microsoftonline.com/
     * 
     */
    public Optional<Output<String>> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * Client ID of the service principal for uploading data.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client ID of the service principal for uploading data.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Secret of the service principal
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return Secret of the service principal
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Tenant ID of the service principal.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant ID of the service principal.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private UploadServicePrincipalArgs() {}

    private UploadServicePrincipalArgs(UploadServicePrincipalArgs $) {
        this.authority = $.authority;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UploadServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UploadServicePrincipalArgs $;

        public Builder() {
            $ = new UploadServicePrincipalArgs();
        }

        public Builder(UploadServicePrincipalArgs defaults) {
            $ = new UploadServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authority Authority for the service principal. Example: https://login.microsoftonline.com/
         * 
         * @return builder
         * 
         */
        public Builder authority(@Nullable Output<String> authority) {
            $.authority = authority;
            return this;
        }

        /**
         * @param authority Authority for the service principal. Example: https://login.microsoftonline.com/
         * 
         * @return builder
         * 
         */
        public Builder authority(String authority) {
            return authority(Output.of(authority));
        }

        /**
         * @param clientId Client ID of the service principal for uploading data.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client ID of the service principal for uploading data.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Secret of the service principal
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Secret of the service principal
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param tenantId Tenant ID of the service principal.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant ID of the service principal.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public UploadServicePrincipalArgs build() {
            return $;
        }
    }

}
