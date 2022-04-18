// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.TypedLocalObjectReference;
import com.pulumi.kubernetes.networking.k8s.io_v1.outputs.IngressServiceBackend;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressBackend {
    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
     * 
     */
    private final @Nullable TypedLocalObjectReference resource;
    /**
     * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
     * 
     */
    private final @Nullable IngressServiceBackend service;

    @CustomType.Constructor
    private IngressBackend(
        @CustomType.Parameter("resource") @Nullable TypedLocalObjectReference resource,
        @CustomType.Parameter("service") @Nullable IngressServiceBackend service) {
        this.resource = resource;
        this.service = service;
    }

    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, a service.Name and service.Port must not be specified. This is a mutually exclusive setting with "Service".
     * 
    */
    public Optional<TypedLocalObjectReference> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Service references a Service as a Backend. This is a mutually exclusive setting with "Resource".
     * 
    */
    public Optional<IngressServiceBackend> service() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TypedLocalObjectReference resource;
        private @Nullable IngressServiceBackend service;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.service = defaults.service;
        }

        public Builder resource(@Nullable TypedLocalObjectReference resource) {
            this.resource = resource;
            return this;
        }
        public Builder service(@Nullable IngressServiceBackend service) {
            this.service = service;
            return this;
        }        public IngressBackend build() {
            return new IngressBackend(resource, service);
        }
    }
}
