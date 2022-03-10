// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.NatGatewaySkuResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNatGatewayResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The idle timeout of the nat gateway.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the NAT gateway resource.
     * 
     */
    private final String provisioningState;
    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
     */
    private final @Nullable List<SubResourceResponse> publicIpAddresses;
    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
     */
    private final @Nullable List<SubResourceResponse> publicIpPrefixes;
    /**
     * The resource GUID property of the NAT gateway resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The nat gateway SKU.
     * 
     */
    private final @Nullable NatGatewaySkuResponse sku;
    /**
     * An array of references to the subnets using this nat gateway resource.
     * 
     */
    private final List<SubResourceResponse> subnets;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor
    private GetNatGatewayResult(
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicIpAddresses") @Nullable List<SubResourceResponse> publicIpAddresses,
        @OutputCustomType.Parameter("publicIpPrefixes") @Nullable List<SubResourceResponse> publicIpPrefixes,
        @OutputCustomType.Parameter("resourceGuid") String resourceGuid,
        @OutputCustomType.Parameter("sku") @Nullable NatGatewaySkuResponse sku,
        @OutputCustomType.Parameter("subnets") List<SubResourceResponse> subnets,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("zones") @Nullable List<String> zones) {
        this.etag = etag;
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicIpAddresses = publicIpAddresses;
        this.publicIpPrefixes = publicIpPrefixes;
        this.resourceGuid = resourceGuid;
        this.sku = sku;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The idle timeout of the nat gateway.
     * 
    */
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the NAT gateway resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * An array of public ip addresses associated with the nat gateway resource.
     * 
    */
    public List<SubResourceResponse> getPublicIpAddresses() {
        return this.publicIpAddresses == null ? List.of() : this.publicIpAddresses;
    }
    /**
     * An array of public ip prefixes associated with the nat gateway resource.
     * 
    */
    public List<SubResourceResponse> getPublicIpPrefixes() {
        return this.publicIpPrefixes == null ? List.of() : this.publicIpPrefixes;
    }
    /**
     * The resource GUID property of the NAT gateway resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The nat gateway SKU.
     * 
    */
    public Optional<NatGatewaySkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * An array of references to the subnets using this nat gateway resource.
     * 
    */
    public List<SubResourceResponse> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A list of availability zones denoting the zone in which Nat Gateway should be deployed.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable List<SubResourceResponse> publicIpAddresses;
        private @Nullable List<SubResourceResponse> publicIpPrefixes;
        private String resourceGuid;
        private @Nullable NatGatewaySkuResponse sku;
        private List<SubResourceResponse> subnets;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIpAddresses = defaults.publicIpAddresses;
    	      this.publicIpPrefixes = defaults.publicIpPrefixes;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicIpAddresses(@Nullable List<SubResourceResponse> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        public Builder publicIpPrefixes(@Nullable List<SubResourceResponse> publicIpPrefixes) {
            this.publicIpPrefixes = publicIpPrefixes;
            return this;
        }

        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder sku(@Nullable NatGatewaySkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder subnets(List<SubResourceResponse> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
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

        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetNatGatewayResult build() {
            return new GetNatGatewayResult(etag, id, idleTimeoutInMinutes, location, name, provisioningState, publicIpAddresses, publicIpPrefixes, resourceGuid, sku, subnets, tags, type, zones);
        }
    }
}
