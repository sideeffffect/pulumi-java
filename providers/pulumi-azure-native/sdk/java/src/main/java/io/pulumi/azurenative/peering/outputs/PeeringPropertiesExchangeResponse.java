// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.ExchangeConnectionResponse;
import io.pulumi.azurenative.peering.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PeeringPropertiesExchangeResponse {
    /**
     * The set of connections that constitute an exchange peering.
     * 
     */
    private final @Nullable List<ExchangeConnectionResponse> connections;
    /**
     * The reference of the peer ASN.
     * 
     */
    private final @Nullable SubResourceResponse peerAsn;

    @OutputCustomType.Constructor
    private PeeringPropertiesExchangeResponse(
        @OutputCustomType.Parameter("connections") @Nullable List<ExchangeConnectionResponse> connections,
        @OutputCustomType.Parameter("peerAsn") @Nullable SubResourceResponse peerAsn) {
        this.connections = connections;
        this.peerAsn = peerAsn;
    }

    /**
     * The set of connections that constitute an exchange peering.
     * 
    */
    public List<ExchangeConnectionResponse> getConnections() {
        return this.connections == null ? List.of() : this.connections;
    }
    /**
     * The reference of the peer ASN.
     * 
    */
    public Optional<SubResourceResponse> getPeerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringPropertiesExchangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExchangeConnectionResponse> connections;
        private @Nullable SubResourceResponse peerAsn;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringPropertiesExchangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.peerAsn = defaults.peerAsn;
        }

        public Builder connections(@Nullable List<ExchangeConnectionResponse> connections) {
            this.connections = connections;
            return this;
        }

        public Builder peerAsn(@Nullable SubResourceResponse peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public PeeringPropertiesExchangeResponse build() {
            return new PeeringPropertiesExchangeResponse(connections, peerAsn);
        }
    }
}
