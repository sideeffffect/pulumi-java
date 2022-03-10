// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.discovery.k8s.io_v1.outputs.Endpoint;
import io.pulumi.kubernetes.discovery.k8s.io_v1.outputs.EndpointPort;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointSlice {
    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     * Possible enum values:
     *  - `"FQDN"` represents a FQDN.
     *  - `"IPv4"` represents an IPv4 Address.
     *  - `"IPv6"` represents an IPv6 Address.
     * 
     */
    private final String addressType;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
     */
    private final List<Endpoint> endpoints;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata.
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     * 
     */
    private final @Nullable List<EndpointPort> ports;

    @OutputCustomType.Constructor
    private EndpointSlice(
        @OutputCustomType.Parameter("addressType") String addressType,
        @OutputCustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @OutputCustomType.Parameter("endpoints") List<Endpoint> endpoints,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @OutputCustomType.Parameter("ports") @Nullable List<EndpointPort> ports) {
        this.addressType = addressType;
        this.apiVersion = apiVersion;
        this.endpoints = endpoints;
        this.kind = kind;
        this.metadata = metadata;
        this.ports = ports;
    }

    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     * Possible enum values:
     *  - `"FQDN"` represents a FQDN.
     *  - `"IPv4"` represents an IPv4 Address.
     *  - `"IPv6"` represents an IPv6 Address.
     * 
    */
    public String getAddressType() {
        return this.addressType;
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * 
    */
    public List<Endpoint> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata.
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     * 
    */
    public List<EndpointPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointSlice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressType;
        private @Nullable String apiVersion;
        private List<Endpoint> endpoints;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<EndpointPort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointSlice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.endpoints = defaults.endpoints;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.ports = defaults.ports;
        }

        public Builder addressType(String addressType) {
            this.addressType = Objects.requireNonNull(addressType);
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder endpoints(List<Endpoint> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder ports(@Nullable List<EndpointPort> ports) {
            this.ports = ports;
            return this;
        }
        public EndpointSlice build() {
            return new EndpointSlice(addressType, apiVersion, endpoints, kind, metadata, ports);
        }
    }
}
