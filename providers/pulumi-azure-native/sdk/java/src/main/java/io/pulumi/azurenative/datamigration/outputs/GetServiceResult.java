// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ServiceSkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceResult {
    /**
     * HTTP strong entity tag value. Ignored if submitted
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The resource kind. Only 'vm' (the default) is supported.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The resource's provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * The public key of the service, used to encrypt secrets sent to the service
     * 
     */
    private final @Nullable String publicKey;
    /**
     * Service SKU
     * 
     */
    private final @Nullable ServiceSkuResponse sku;
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
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
     */
    private final String virtualSubnetId;

    @OutputCustomType.Constructor
    private GetServiceResult(
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicKey") @Nullable String publicKey,
        @OutputCustomType.Parameter("sku") @Nullable ServiceSkuResponse sku,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualSubnetId") String virtualSubnetId) {
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.virtualSubnetId = virtualSubnetId;
    }

    /**
     * HTTP strong entity tag value. Ignored if submitted
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource kind. Only 'vm' (the default) is supported.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource's provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public key of the service, used to encrypt secrets sent to the service
     * 
    */
    public Optional<String> getPublicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * Service SKU
     * 
    */
    public Optional<ServiceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
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
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
     * 
    */
    public String getVirtualSubnetId() {
        return this.virtualSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String publicKey;
        private @Nullable ServiceSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String virtualSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualSubnetId = defaults.virtualSubnetId;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder sku(@Nullable ServiceSkuResponse sku) {
            this.sku = sku;
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

        public Builder virtualSubnetId(String virtualSubnetId) {
            this.virtualSubnetId = Objects.requireNonNull(virtualSubnetId);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(etag, id, kind, location, name, provisioningState, publicKey, sku, tags, type, virtualSubnetId);
        }
    }
}
