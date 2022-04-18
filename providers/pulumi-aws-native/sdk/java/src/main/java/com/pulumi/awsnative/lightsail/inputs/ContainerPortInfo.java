// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerPortInfo extends com.pulumi.resources.InvokeArgs {

    public static final ContainerPortInfo Empty = new ContainerPortInfo();

    @Import(name="port")
      private final @Nullable String port;

    public Optional<String> port() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    public ContainerPortInfo(
        @Nullable String port,
        @Nullable String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    private ContainerPortInfo() {
        this.port = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ContainerPortInfo build() {
            return new ContainerPortInfo(port, protocol);
        }
    }
}
