// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.ServiceBackendPortArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressServiceBackend references a Kubernetes Service as a Backend.
 * 
 */
public final class IngressServiceBackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressServiceBackendArgs Empty = new IngressServiceBackendArgs();

    /**
     * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<ServiceBackendPortArgs> port;

    public Input<ServiceBackendPortArgs> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public IngressServiceBackendArgs(
        Input<String> name,
        @Nullable Input<ServiceBackendPortArgs> port) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = port;
    }

    private IngressServiceBackendArgs() {
        this.name = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressServiceBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<ServiceBackendPortArgs> port;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressServiceBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder port(@Nullable Input<ServiceBackendPortArgs> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable ServiceBackendPortArgs port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public IngressServiceBackendArgs build() {
            return new IngressServiceBackendArgs(name, port);
        }
    }
}
