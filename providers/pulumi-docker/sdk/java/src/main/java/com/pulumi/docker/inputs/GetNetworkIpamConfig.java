// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkIpamConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkIpamConfig Empty = new GetNetworkIpamConfig();

    @Import(name="auxAddress")
      private final @Nullable Map<String,Object> auxAddress;

    public Map<String,Object> auxAddress() {
        return this.auxAddress == null ? Map.of() : this.auxAddress;
    }

    @Import(name="gateway")
      private final @Nullable String gateway;

    public Optional<String> gateway() {
        return this.gateway == null ? Optional.empty() : Optional.ofNullable(this.gateway);
    }

    @Import(name="ipRange")
      private final @Nullable String ipRange;

    public Optional<String> ipRange() {
        return this.ipRange == null ? Optional.empty() : Optional.ofNullable(this.ipRange);
    }

    @Import(name="subnet")
      private final @Nullable String subnet;

    public Optional<String> subnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public GetNetworkIpamConfig(
        @Nullable Map<String,Object> auxAddress,
        @Nullable String gateway,
        @Nullable String ipRange,
        @Nullable String subnet) {
        this.auxAddress = auxAddress;
        this.gateway = gateway;
        this.ipRange = ipRange;
        this.subnet = subnet;
    }

    private GetNetworkIpamConfig() {
        this.auxAddress = Map.of();
        this.gateway = null;
        this.ipRange = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkIpamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> auxAddress;
        private @Nullable String gateway;
        private @Nullable String ipRange;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkIpamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxAddress = defaults.auxAddress;
    	      this.gateway = defaults.gateway;
    	      this.ipRange = defaults.ipRange;
    	      this.subnet = defaults.subnet;
        }

        public Builder auxAddress(@Nullable Map<String,Object> auxAddress) {
            this.auxAddress = auxAddress;
            return this;
        }
        public Builder gateway(@Nullable String gateway) {
            this.gateway = gateway;
            return this;
        }
        public Builder ipRange(@Nullable String ipRange) {
            this.ipRange = ipRange;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }        public GetNetworkIpamConfig build() {
            return new GetNetworkIpamConfig(auxAddress, gateway, ipRange, subnet);
        }
    }
}
