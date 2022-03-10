// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointFilterItemResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint filter.
 * 
 */
public final class ConnectionMonitorEndpointFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorEndpointFilterResponse Empty = new ConnectionMonitorEndpointFilterResponse();

    /**
     * List of items in the filter.
     * 
     */
    @InputImport(name="items")
      private final @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items;

    public List<ConnectionMonitorEndpointFilterItemResponse> getItems() {
        return this.items == null ? List.of() : this.items;
    }

    /**
     * The behavior of the endpoint filter. Currently only 'Include' is supported.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ConnectionMonitorEndpointFilterResponse(
        @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items,
        @Nullable String type) {
        this.items = items;
        this.type = type;
    }

    private ConnectionMonitorEndpointFilterResponse() {
        this.items = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.type = defaults.type;
        }

        public Builder items(@Nullable List<ConnectionMonitorEndpointFilterItemResponse> items) {
            this.items = items;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ConnectionMonitorEndpointFilterResponse build() {
            return new ConnectionMonitorEndpointFilterResponse(items, type);
        }
    }
}
