// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerPort represents a network port in a single container.
 * 
 */
public final class ContainerPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPortArgs Empty = new ContainerPortArgs();

    /**
     * (Optional) Port number the container listens on. This must be a valid port number, 0 < x < 65536.
     * 
     */
    @InputImport(name="containerPort")
      private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort == null ? Input.empty() : this.containerPort;
    }

    /**
     * (Optional) If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * (Optional) Protocol for port. Must be "TCP". Defaults to "TCP".
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public ContainerPortArgs(
        @Nullable Input<Integer> containerPort,
        @Nullable Input<String> name,
        @Nullable Input<String> protocol) {
        this.containerPort = containerPort;
        this.name = name;
        this.protocol = protocol;
    }

    private ContainerPortArgs() {
        this.containerPort = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<String> name;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(@Nullable Input<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Input.ofNullable(containerPort);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder protocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public ContainerPortArgs build() {
            return new ContainerPortArgs(containerPort, name, protocol);
        }
    }
}
