// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.MultichannelResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting for SMB protocol
 * 
 */
public final class SmbSettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final SmbSettingResponse Empty = new SmbSettingResponse();

    /**
     * SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string with delimiter ';'.
     * 
     */
    @InputImport(name="authenticationMethods")
      private final @Nullable String authenticationMethods;

    public Optional<String> getAuthenticationMethods() {
        return this.authenticationMethods == null ? Optional.empty() : Optional.ofNullable(this.authenticationMethods);
    }

    /**
     * SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter ';'.
     * 
     */
    @InputImport(name="channelEncryption")
      private final @Nullable String channelEncryption;

    public Optional<String> getChannelEncryption() {
        return this.channelEncryption == null ? Optional.empty() : Optional.ofNullable(this.channelEncryption);
    }

    /**
     * Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter ';'
     * 
     */
    @InputImport(name="kerberosTicketEncryption")
      private final @Nullable String kerberosTicketEncryption;

    public Optional<String> getKerberosTicketEncryption() {
        return this.kerberosTicketEncryption == null ? Optional.empty() : Optional.ofNullable(this.kerberosTicketEncryption);
    }

    /**
     * Multichannel setting. Applies to Premium FileStorage only.
     * 
     */
    @InputImport(name="multichannel")
      private final @Nullable MultichannelResponse multichannel;

    public Optional<MultichannelResponse> getMultichannel() {
        return this.multichannel == null ? Optional.empty() : Optional.ofNullable(this.multichannel);
    }

    /**
     * SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter ';'.
     * 
     */
    @InputImport(name="versions")
      private final @Nullable String versions;

    public Optional<String> getVersions() {
        return this.versions == null ? Optional.empty() : Optional.ofNullable(this.versions);
    }

    public SmbSettingResponse(
        @Nullable String authenticationMethods,
        @Nullable String channelEncryption,
        @Nullable String kerberosTicketEncryption,
        @Nullable MultichannelResponse multichannel,
        @Nullable String versions) {
        this.authenticationMethods = authenticationMethods;
        this.channelEncryption = channelEncryption;
        this.kerberosTicketEncryption = kerberosTicketEncryption;
        this.multichannel = multichannel;
        this.versions = versions;
    }

    private SmbSettingResponse() {
        this.authenticationMethods = null;
        this.channelEncryption = null;
        this.kerberosTicketEncryption = null;
        this.multichannel = null;
        this.versions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmbSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationMethods;
        private @Nullable String channelEncryption;
        private @Nullable String kerberosTicketEncryption;
        private @Nullable MultichannelResponse multichannel;
        private @Nullable String versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SmbSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMethods = defaults.authenticationMethods;
    	      this.channelEncryption = defaults.channelEncryption;
    	      this.kerberosTicketEncryption = defaults.kerberosTicketEncryption;
    	      this.multichannel = defaults.multichannel;
    	      this.versions = defaults.versions;
        }

        public Builder authenticationMethods(@Nullable String authenticationMethods) {
            this.authenticationMethods = authenticationMethods;
            return this;
        }

        public Builder channelEncryption(@Nullable String channelEncryption) {
            this.channelEncryption = channelEncryption;
            return this;
        }

        public Builder kerberosTicketEncryption(@Nullable String kerberosTicketEncryption) {
            this.kerberosTicketEncryption = kerberosTicketEncryption;
            return this;
        }

        public Builder multichannel(@Nullable MultichannelResponse multichannel) {
            this.multichannel = multichannel;
            return this;
        }

        public Builder versions(@Nullable String versions) {
            this.versions = versions;
            return this;
        }
        public SmbSettingResponse build() {
            return new SmbSettingResponse(authenticationMethods, channelEncryption, kerberosTicketEncryption, multichannel, versions);
        }
    }
}
