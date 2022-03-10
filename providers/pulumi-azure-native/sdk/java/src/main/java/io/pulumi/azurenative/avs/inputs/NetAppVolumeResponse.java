// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An Azure NetApp Files volume from Microsoft.NetApp provider
 * 
 */
public final class NetAppVolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetAppVolumeResponse Empty = new NetAppVolumeResponse();

    /**
     * File path through which the NFS volume is exposed by the provider
     * 
     */
    @InputImport(name="nfsFilePath")
      private final @Nullable String nfsFilePath;

    public Optional<String> getNfsFilePath() {
        return this.nfsFilePath == null ? Optional.empty() : Optional.ofNullable(this.nfsFilePath);
    }

    /**
     * IP address of the NFS provider
     * 
     */
    @InputImport(name="nfsProviderIp")
      private final @Nullable String nfsProviderIp;

    public Optional<String> getNfsProviderIp() {
        return this.nfsProviderIp == null ? Optional.empty() : Optional.ofNullable(this.nfsProviderIp);
    }

    public NetAppVolumeResponse(
        @Nullable String nfsFilePath,
        @Nullable String nfsProviderIp) {
        this.nfsFilePath = nfsFilePath;
        this.nfsProviderIp = nfsProviderIp;
    }

    private NetAppVolumeResponse() {
        this.nfsFilePath = null;
        this.nfsProviderIp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetAppVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nfsFilePath;
        private @Nullable String nfsProviderIp;

        public Builder() {
    	      // Empty
        }

        public Builder(NetAppVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nfsFilePath = defaults.nfsFilePath;
    	      this.nfsProviderIp = defaults.nfsProviderIp;
        }

        public Builder nfsFilePath(@Nullable String nfsFilePath) {
            this.nfsFilePath = nfsFilePath;
            return this;
        }

        public Builder nfsProviderIp(@Nullable String nfsProviderIp) {
            this.nfsProviderIp = nfsProviderIp;
            return this;
        }
        public NetAppVolumeResponse build() {
            return new NetAppVolumeResponse(nfsFilePath, nfsProviderIp);
        }
    }
}
