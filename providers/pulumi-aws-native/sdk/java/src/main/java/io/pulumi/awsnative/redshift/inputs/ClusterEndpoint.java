// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final ClusterEndpoint Empty = new ClusterEndpoint();

    @InputImport(name="address")
      private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    @InputImport(name="port")
      private final @Nullable String port;

    public Optional<String> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public ClusterEndpoint(
        @Nullable String address,
        @Nullable String port) {
        this.address = address;
        this.port = port;
    }

    private ClusterEndpoint() {
        this.address = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public ClusterEndpoint build() {
            return new ClusterEndpoint(address, port);
        }
    }
}
