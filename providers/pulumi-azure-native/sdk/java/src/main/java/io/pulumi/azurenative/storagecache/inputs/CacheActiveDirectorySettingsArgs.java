// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.CacheActiveDirectorySettingsCredentialsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Active Directory settings used to join a cache to a domain.
 * 
 */
public final class CacheActiveDirectorySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheActiveDirectorySettingsArgs Empty = new CacheActiveDirectorySettingsArgs();

    /**
     * The NetBIOS name to assign to the HPC Cache when it joins the Active Directory domain as a server. Length must 1-15 characters from the class [-0-9a-zA-Z].
     * 
     */
    @InputImport(name="cacheNetBiosName", required=true)
      private final Input<String> cacheNetBiosName;

    public Input<String> getCacheNetBiosName() {
        return this.cacheNetBiosName;
    }

    /**
     * Active Directory admin credentials used to join the HPC Cache to a domain.
     * 
     */
    @InputImport(name="credentials")
      private final @Nullable Input<CacheActiveDirectorySettingsCredentialsArgs> credentials;

    public Input<CacheActiveDirectorySettingsCredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * The fully qualified domain name of the Active Directory domain controller.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The Active Directory domain's NetBIOS name.
     * 
     */
    @InputImport(name="domainNetBiosName", required=true)
      private final Input<String> domainNetBiosName;

    public Input<String> getDomainNetBiosName() {
        return this.domainNetBiosName;
    }

    /**
     * Primary DNS IP address used to resolve the Active Directory domain controller's fully qualified domain name.
     * 
     */
    @InputImport(name="primaryDnsIpAddress", required=true)
      private final Input<String> primaryDnsIpAddress;

    public Input<String> getPrimaryDnsIpAddress() {
        return this.primaryDnsIpAddress;
    }

    /**
     * Secondary DNS IP address used to resolve the Active Directory domain controller's fully qualified domain name.
     * 
     */
    @InputImport(name="secondaryDnsIpAddress")
      private final @Nullable Input<String> secondaryDnsIpAddress;

    public Input<String> getSecondaryDnsIpAddress() {
        return this.secondaryDnsIpAddress == null ? Input.empty() : this.secondaryDnsIpAddress;
    }

    public CacheActiveDirectorySettingsArgs(
        Input<String> cacheNetBiosName,
        @Nullable Input<CacheActiveDirectorySettingsCredentialsArgs> credentials,
        Input<String> domainName,
        Input<String> domainNetBiosName,
        Input<String> primaryDnsIpAddress,
        @Nullable Input<String> secondaryDnsIpAddress) {
        this.cacheNetBiosName = Objects.requireNonNull(cacheNetBiosName, "expected parameter 'cacheNetBiosName' to be non-null");
        this.credentials = credentials;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainNetBiosName = Objects.requireNonNull(domainNetBiosName, "expected parameter 'domainNetBiosName' to be non-null");
        this.primaryDnsIpAddress = Objects.requireNonNull(primaryDnsIpAddress, "expected parameter 'primaryDnsIpAddress' to be non-null");
        this.secondaryDnsIpAddress = secondaryDnsIpAddress;
    }

    private CacheActiveDirectorySettingsArgs() {
        this.cacheNetBiosName = Input.empty();
        this.credentials = Input.empty();
        this.domainName = Input.empty();
        this.domainNetBiosName = Input.empty();
        this.primaryDnsIpAddress = Input.empty();
        this.secondaryDnsIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheActiveDirectorySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cacheNetBiosName;
        private @Nullable Input<CacheActiveDirectorySettingsCredentialsArgs> credentials;
        private Input<String> domainName;
        private Input<String> domainNetBiosName;
        private Input<String> primaryDnsIpAddress;
        private @Nullable Input<String> secondaryDnsIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheActiveDirectorySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheNetBiosName = defaults.cacheNetBiosName;
    	      this.credentials = defaults.credentials;
    	      this.domainName = defaults.domainName;
    	      this.domainNetBiosName = defaults.domainNetBiosName;
    	      this.primaryDnsIpAddress = defaults.primaryDnsIpAddress;
    	      this.secondaryDnsIpAddress = defaults.secondaryDnsIpAddress;
        }

        public Builder cacheNetBiosName(Input<String> cacheNetBiosName) {
            this.cacheNetBiosName = Objects.requireNonNull(cacheNetBiosName);
            return this;
        }

        public Builder cacheNetBiosName(String cacheNetBiosName) {
            this.cacheNetBiosName = Input.of(Objects.requireNonNull(cacheNetBiosName));
            return this;
        }

        public Builder credentials(@Nullable Input<CacheActiveDirectorySettingsCredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder credentials(@Nullable CacheActiveDirectorySettingsCredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder domainNetBiosName(Input<String> domainNetBiosName) {
            this.domainNetBiosName = Objects.requireNonNull(domainNetBiosName);
            return this;
        }

        public Builder domainNetBiosName(String domainNetBiosName) {
            this.domainNetBiosName = Input.of(Objects.requireNonNull(domainNetBiosName));
            return this;
        }

        public Builder primaryDnsIpAddress(Input<String> primaryDnsIpAddress) {
            this.primaryDnsIpAddress = Objects.requireNonNull(primaryDnsIpAddress);
            return this;
        }

        public Builder primaryDnsIpAddress(String primaryDnsIpAddress) {
            this.primaryDnsIpAddress = Input.of(Objects.requireNonNull(primaryDnsIpAddress));
            return this;
        }

        public Builder secondaryDnsIpAddress(@Nullable Input<String> secondaryDnsIpAddress) {
            this.secondaryDnsIpAddress = secondaryDnsIpAddress;
            return this;
        }

        public Builder secondaryDnsIpAddress(@Nullable String secondaryDnsIpAddress) {
            this.secondaryDnsIpAddress = Input.ofNullable(secondaryDnsIpAddress);
            return this;
        }
        public CacheActiveDirectorySettingsArgs build() {
            return new CacheActiveDirectorySettingsArgs(cacheNetBiosName, credentials, domainName, domainNetBiosName, primaryDnsIpAddress, secondaryDnsIpAddress);
        }
    }
}
