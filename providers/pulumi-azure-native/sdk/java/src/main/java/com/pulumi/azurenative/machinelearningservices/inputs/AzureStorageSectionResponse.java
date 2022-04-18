// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ClientCredentialsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureStorageSectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureStorageSectionResponse Empty = new AzureStorageSectionResponse();

    /**
     *  Storage Account Key (Deprecated).
     * 
     */
    @Import(name="accountKey")
      private final @Nullable String accountKey;

    public Optional<String> accountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    /**
     * Storage Account Name.
     * 
     */
    @Import(name="accountName")
      private final @Nullable String accountName;

    public Optional<String> accountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    /**
     * Indicate if we are using Workspace ManagedIdentities/MSI token (Deprecated).
     * 
     */
    @Import(name="areWorkspaceManagedIdentitiesAllowed")
      private final @Nullable Boolean areWorkspaceManagedIdentitiesAllowed;

    public Optional<Boolean> areWorkspaceManagedIdentitiesAllowed() {
        return this.areWorkspaceManagedIdentitiesAllowed == null ? Optional.empty() : Optional.ofNullable(this.areWorkspaceManagedIdentitiesAllowed);
    }

    /**
     *  If this is an "DataStoreType.AzureBlob", the length of time (in seconds) to cache files locally after they are accessed (downloaded).
     * 
     */
    @Import(name="blobCacheTimeout")
      private final @Nullable Integer blobCacheTimeout;

    public Optional<Integer> blobCacheTimeout() {
        return this.blobCacheTimeout == null ? Optional.empty() : Optional.ofNullable(this.blobCacheTimeout);
    }

    @Import(name="clientCredentials")
      private final @Nullable ClientCredentialsResponse clientCredentials;

    public Optional<ClientCredentialsResponse> clientCredentials() {
        return this.clientCredentials == null ? Optional.empty() : Optional.ofNullable(this.clientCredentials);
    }

    /**
     * The storage container name.
     * 
     */
    @Import(name="containerName")
      private final @Nullable String containerName;

    public Optional<String> containerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * The credential.
     * 
     */
    @Import(name="credential")
      private final @Nullable String credential;

    public Optional<String> credential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     *  The credential type.
     * 
     */
    @Import(name="credentialType")
      private final @Nullable String credentialType;

    public Optional<String> credentialType() {
        return this.credentialType == null ? Optional.empty() : Optional.ofNullable(this.credentialType);
    }

    /**
     * The host of the container.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> endpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     * Indicate if we are using SAS token or Account Key (Deprecated).
     * 
     */
    @Import(name="isSas")
      private final @Nullable Boolean isSas;

    public Optional<Boolean> isSas() {
        return this.isSas == null ? Optional.empty() : Optional.ofNullable(this.isSas);
    }

    /**
     * The protocol to use. Defaults to https.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * Resource Group.
     * 
     */
    @Import(name="resourceGroup")
      private final @Nullable String resourceGroup;

    public Optional<String> resourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     *  SAS Token for the container (Deprecated).
     * 
     */
    @Import(name="sasToken")
      private final @Nullable String sasToken;

    public Optional<String> sasToken() {
        return this.sasToken == null ? Optional.empty() : Optional.ofNullable(this.sasToken);
    }

    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    @Import(name="serviceDataAccessAuthIdentity")
      private final @Nullable String serviceDataAccessAuthIdentity;

    public Optional<String> serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity == null ? Optional.empty() : Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }

    /**
     * Subscription ID.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable String subscriptionId;

    public Optional<String> subscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    public AzureStorageSectionResponse(
        @Nullable String accountKey,
        @Nullable String accountName,
        @Nullable Boolean areWorkspaceManagedIdentitiesAllowed,
        @Nullable Integer blobCacheTimeout,
        @Nullable ClientCredentialsResponse clientCredentials,
        @Nullable String containerName,
        @Nullable String credential,
        @Nullable String credentialType,
        @Nullable String endpoint,
        @Nullable Boolean isSas,
        @Nullable String protocol,
        @Nullable String resourceGroup,
        @Nullable String sasToken,
        @Nullable String serviceDataAccessAuthIdentity,
        @Nullable String subscriptionId) {
        this.accountKey = accountKey;
        this.accountName = accountName;
        this.areWorkspaceManagedIdentitiesAllowed = areWorkspaceManagedIdentitiesAllowed;
        this.blobCacheTimeout = blobCacheTimeout;
        this.clientCredentials = clientCredentials;
        this.containerName = containerName;
        this.credential = credential;
        this.credentialType = credentialType;
        this.endpoint = endpoint;
        this.isSas = isSas;
        this.protocol = protocol;
        this.resourceGroup = resourceGroup;
        this.sasToken = sasToken;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
    }

    private AzureStorageSectionResponse() {
        this.accountKey = null;
        this.accountName = null;
        this.areWorkspaceManagedIdentitiesAllowed = null;
        this.blobCacheTimeout = null;
        this.clientCredentials = null;
        this.containerName = null;
        this.credential = null;
        this.credentialType = null;
        this.endpoint = null;
        this.isSas = null;
        this.protocol = null;
        this.resourceGroup = null;
        this.sasToken = null;
        this.serviceDataAccessAuthIdentity = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private @Nullable String accountName;
        private @Nullable Boolean areWorkspaceManagedIdentitiesAllowed;
        private @Nullable Integer blobCacheTimeout;
        private @Nullable ClientCredentialsResponse clientCredentials;
        private @Nullable String containerName;
        private @Nullable String credential;
        private @Nullable String credentialType;
        private @Nullable String endpoint;
        private @Nullable Boolean isSas;
        private @Nullable String protocol;
        private @Nullable String resourceGroup;
        private @Nullable String sasToken;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.areWorkspaceManagedIdentitiesAllowed = defaults.areWorkspaceManagedIdentitiesAllowed;
    	      this.blobCacheTimeout = defaults.blobCacheTimeout;
    	      this.clientCredentials = defaults.clientCredentials;
    	      this.containerName = defaults.containerName;
    	      this.credential = defaults.credential;
    	      this.credentialType = defaults.credentialType;
    	      this.endpoint = defaults.endpoint;
    	      this.isSas = defaults.isSas;
    	      this.protocol = defaults.protocol;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.sasToken = defaults.sasToken;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder accountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder areWorkspaceManagedIdentitiesAllowed(@Nullable Boolean areWorkspaceManagedIdentitiesAllowed) {
            this.areWorkspaceManagedIdentitiesAllowed = areWorkspaceManagedIdentitiesAllowed;
            return this;
        }
        public Builder blobCacheTimeout(@Nullable Integer blobCacheTimeout) {
            this.blobCacheTimeout = blobCacheTimeout;
            return this;
        }
        public Builder clientCredentials(@Nullable ClientCredentialsResponse clientCredentials) {
            this.clientCredentials = clientCredentials;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder credential(@Nullable String credential) {
            this.credential = credential;
            return this;
        }
        public Builder credentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder isSas(@Nullable Boolean isSas) {
            this.isSas = isSas;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder sasToken(@Nullable String sasToken) {
            this.sasToken = sasToken;
            return this;
        }
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public AzureStorageSectionResponse build() {
            return new AzureStorageSectionResponse(accountKey, accountName, areWorkspaceManagedIdentitiesAllowed, blobCacheTimeout, clientCredentials, containerName, credential, credentialType, endpoint, isSas, protocol, resourceGroup, sasToken, serviceDataAccessAuthIdentity, subscriptionId);
        }
    }
}
