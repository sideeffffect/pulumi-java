// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.ServiceBackendPort;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressServiceBackend {
    /**
     * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
     * 
     */
    private final String name;
    /**
     * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
     * 
     */
    private final @Nullable ServiceBackendPort port;

    @OutputCustomType.Constructor({"name","port"})
    private IngressServiceBackend(
        String name,
        @Nullable ServiceBackendPort port) {
        this.name = name;
        this.port = port;
    }

    /**
     * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Port of the referenced service. A port name or port number is required for a IngressServiceBackend.
     * 
    */
    public Optional<ServiceBackendPort> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressServiceBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable ServiceBackendPort port;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressServiceBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(@Nullable ServiceBackendPort port) {
            this.port = port;
            return this;
        }
        public IngressServiceBackend build() {
            return new IngressServiceBackend(name, port);
        }
    }
}
