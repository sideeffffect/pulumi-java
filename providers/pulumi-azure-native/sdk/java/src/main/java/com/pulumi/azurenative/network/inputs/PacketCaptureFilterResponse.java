// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Filter that is applied to packet capture request. Multiple filters can be applied.
 * 
 */
public final class PacketCaptureFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketCaptureFilterResponse Empty = new PacketCaptureFilterResponse();

    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @Import(name="localIPAddress")
      private final @Nullable String localIPAddress;

    public Optional<String> localIPAddress() {
        return this.localIPAddress == null ? Optional.empty() : Optional.ofNullable(this.localIPAddress);
    }

    /**
     * Local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @Import(name="localPort")
      private final @Nullable String localPort;

    public Optional<String> localPort() {
        return this.localPort == null ? Optional.empty() : Optional.ofNullable(this.localPort);
    }

    /**
     * Protocol to be filtered on.
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @Import(name="remoteIPAddress")
      private final @Nullable String remoteIPAddress;

    public Optional<String> remoteIPAddress() {
        return this.remoteIPAddress == null ? Optional.empty() : Optional.ofNullable(this.remoteIPAddress);
    }

    /**
     * Remote port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    @Import(name="remotePort")
      private final @Nullable String remotePort;

    public Optional<String> remotePort() {
        return this.remotePort == null ? Optional.empty() : Optional.ofNullable(this.remotePort);
    }

    public PacketCaptureFilterResponse(
        @Nullable String localIPAddress,
        @Nullable String localPort,
        @Nullable String protocol,
        @Nullable String remoteIPAddress,
        @Nullable String remotePort) {
        this.localIPAddress = localIPAddress;
        this.localPort = localPort;
        this.protocol = protocol == null ? "Any" : protocol;
        this.remoteIPAddress = remoteIPAddress;
        this.remotePort = remotePort;
    }

    private PacketCaptureFilterResponse() {
        this.localIPAddress = null;
        this.localPort = null;
        this.protocol = null;
        this.remoteIPAddress = null;
        this.remotePort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String localIPAddress;
        private @Nullable String localPort;
        private @Nullable String protocol;
        private @Nullable String remoteIPAddress;
        private @Nullable String remotePort;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localIPAddress = defaults.localIPAddress;
    	      this.localPort = defaults.localPort;
    	      this.protocol = defaults.protocol;
    	      this.remoteIPAddress = defaults.remoteIPAddress;
    	      this.remotePort = defaults.remotePort;
        }

        public Builder localIPAddress(@Nullable String localIPAddress) {
            this.localIPAddress = localIPAddress;
            return this;
        }
        public Builder localPort(@Nullable String localPort) {
            this.localPort = localPort;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder remoteIPAddress(@Nullable String remoteIPAddress) {
            this.remoteIPAddress = remoteIPAddress;
            return this;
        }
        public Builder remotePort(@Nullable String remotePort) {
            this.remotePort = remotePort;
            return this;
        }        public PacketCaptureFilterResponse build() {
            return new PacketCaptureFilterResponse(localIPAddress, localPort, protocol, remoteIPAddress, remotePort);
        }
    }
}
