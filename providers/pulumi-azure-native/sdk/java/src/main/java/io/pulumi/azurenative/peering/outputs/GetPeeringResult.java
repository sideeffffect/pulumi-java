// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.PeeringPropertiesDirectResponse;
import io.pulumi.azurenative.peering.outputs.PeeringPropertiesExchangeResponse;
import io.pulumi.azurenative.peering.outputs.PeeringSkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPeeringResult {
    /**
     * The properties that define a direct peering.
     * 
     */
    private final @Nullable PeeringPropertiesDirectResponse direct;
    /**
     * The properties that define an exchange peering.
     * 
     */
    private final @Nullable PeeringPropertiesExchangeResponse exchange;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The kind of the peering.
     * 
     */
    private final String kind;
    /**
     * The location of the resource.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The location of the peering.
     * 
     */
    private final @Nullable String peeringLocation;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU that defines the tier and kind of the peering.
     * 
     */
    private final PeeringSkuResponse sku;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPeeringResult(
        @OutputCustomType.Parameter("direct") @Nullable PeeringPropertiesDirectResponse direct,
        @OutputCustomType.Parameter("exchange") @Nullable PeeringPropertiesExchangeResponse exchange,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("peeringLocation") @Nullable String peeringLocation,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sku") PeeringSkuResponse sku,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.direct = direct;
        this.exchange = exchange;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.peeringLocation = peeringLocation;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The properties that define a direct peering.
     * 
    */
    public Optional<PeeringPropertiesDirectResponse> getDirect() {
        return Optional.ofNullable(this.direct);
    }
    /**
     * The properties that define an exchange peering.
     * 
    */
    public Optional<PeeringPropertiesExchangeResponse> getExchange() {
        return Optional.ofNullable(this.exchange);
    }
    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The kind of the peering.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The location of the peering.
     * 
    */
    public Optional<String> getPeeringLocation() {
        return Optional.ofNullable(this.peeringLocation);
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU that defines the tier and kind of the peering.
     * 
    */
    public PeeringSkuResponse getSku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PeeringPropertiesDirectResponse direct;
        private @Nullable PeeringPropertiesExchangeResponse exchange;
        private String id;
        private String kind;
        private String location;
        private String name;
        private @Nullable String peeringLocation;
        private String provisioningState;
        private PeeringSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direct = defaults.direct;
    	      this.exchange = defaults.exchange;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder direct(@Nullable PeeringPropertiesDirectResponse direct) {
            this.direct = direct;
            return this;
        }

        public Builder exchange(@Nullable PeeringPropertiesExchangeResponse exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder peeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sku(PeeringSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPeeringResult build() {
            return new GetPeeringResult(direct, exchange, id, kind, location, name, peeringLocation, provisioningState, sku, tags, type);
        }
    }
}
