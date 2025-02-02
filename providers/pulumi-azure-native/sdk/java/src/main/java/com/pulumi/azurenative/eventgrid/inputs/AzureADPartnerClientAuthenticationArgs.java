// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Active Directory Partner Client Authentication
 * 
 */
public final class AzureADPartnerClientAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureADPartnerClientAuthenticationArgs Empty = new AzureADPartnerClientAuthenticationArgs();

    /**
     * The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    @Import(name="azureActiveDirectoryApplicationIdOrUri")
    private @Nullable Output<String> azureActiveDirectoryApplicationIdOrUri;

    /**
     * @return The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<Output<String>> azureActiveDirectoryApplicationIdOrUri() {
        return Optional.ofNullable(this.azureActiveDirectoryApplicationIdOrUri);
    }

    /**
     * The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    @Import(name="azureActiveDirectoryTenantId")
    private @Nullable Output<String> azureActiveDirectoryTenantId;

    /**
     * @return The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     * 
     */
    public Optional<Output<String>> azureActiveDirectoryTenantId() {
        return Optional.ofNullable(this.azureActiveDirectoryTenantId);
    }

    /**
     * Type of client authentication
     * Expected value is &#39;AzureAD&#39;.
     * 
     */
    @Import(name="clientAuthenticationType", required=true)
    private Output<String> clientAuthenticationType;

    /**
     * @return Type of client authentication
     * Expected value is &#39;AzureAD&#39;.
     * 
     */
    public Output<String> clientAuthenticationType() {
        return this.clientAuthenticationType;
    }

    private AzureADPartnerClientAuthenticationArgs() {}

    private AzureADPartnerClientAuthenticationArgs(AzureADPartnerClientAuthenticationArgs $) {
        this.azureActiveDirectoryApplicationIdOrUri = $.azureActiveDirectoryApplicationIdOrUri;
        this.azureActiveDirectoryTenantId = $.azureActiveDirectoryTenantId;
        this.clientAuthenticationType = $.clientAuthenticationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureADPartnerClientAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureADPartnerClientAuthenticationArgs $;

        public Builder() {
            $ = new AzureADPartnerClientAuthenticationArgs();
        }

        public Builder(AzureADPartnerClientAuthenticationArgs defaults) {
            $ = new AzureADPartnerClientAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureActiveDirectoryApplicationIdOrUri The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryApplicationIdOrUri(@Nullable Output<String> azureActiveDirectoryApplicationIdOrUri) {
            $.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
            return this;
        }

        /**
         * @param azureActiveDirectoryApplicationIdOrUri The Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryApplicationIdOrUri(String azureActiveDirectoryApplicationIdOrUri) {
            return azureActiveDirectoryApplicationIdOrUri(Output.of(azureActiveDirectoryApplicationIdOrUri));
        }

        /**
         * @param azureActiveDirectoryTenantId The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryTenantId(@Nullable Output<String> azureActiveDirectoryTenantId) {
            $.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
            return this;
        }

        /**
         * @param azureActiveDirectoryTenantId The Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
            return azureActiveDirectoryTenantId(Output.of(azureActiveDirectoryTenantId));
        }

        /**
         * @param clientAuthenticationType Type of client authentication
         * Expected value is &#39;AzureAD&#39;.
         * 
         * @return builder
         * 
         */
        public Builder clientAuthenticationType(Output<String> clientAuthenticationType) {
            $.clientAuthenticationType = clientAuthenticationType;
            return this;
        }

        /**
         * @param clientAuthenticationType Type of client authentication
         * Expected value is &#39;AzureAD&#39;.
         * 
         * @return builder
         * 
         */
        public Builder clientAuthenticationType(String clientAuthenticationType) {
            return clientAuthenticationType(Output.of(clientAuthenticationType));
        }

        public AzureADPartnerClientAuthenticationArgs build() {
            $.clientAuthenticationType = Codegen.stringProp("clientAuthenticationType").output().arg($.clientAuthenticationType).def("AzureAD").require();
            return $;
        }
    }

}
