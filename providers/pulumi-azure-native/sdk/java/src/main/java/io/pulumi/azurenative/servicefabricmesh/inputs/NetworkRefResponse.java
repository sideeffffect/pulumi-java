// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.EndpointRefResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a network reference in a service.
 * 
 */
public final class NetworkRefResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRefResponse Empty = new NetworkRefResponse();

    /**
     * A list of endpoints that are exposed on this network.
     * 
     */
    @InputImport(name="endpointRefs")
      private final @Nullable List<EndpointRefResponse> endpointRefs;

    public List<EndpointRefResponse> getEndpointRefs() {
        return this.endpointRefs == null ? List.of() : this.endpointRefs;
    }

    /**
     * Name of the network
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public NetworkRefResponse(
        @Nullable List<EndpointRefResponse> endpointRefs,
        @Nullable String name) {
        this.endpointRefs = endpointRefs;
        this.name = name;
    }

    private NetworkRefResponse() {
        this.endpointRefs = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointRefResponse> endpointRefs;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointRefs = defaults.endpointRefs;
    	      this.name = defaults.name;
        }

        public Builder endpointRefs(@Nullable List<EndpointRefResponse> endpointRefs) {
            this.endpointRefs = endpointRefs;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public NetworkRefResponse build() {
            return new NetworkRefResponse(endpointRefs, name);
        }
    }
}
