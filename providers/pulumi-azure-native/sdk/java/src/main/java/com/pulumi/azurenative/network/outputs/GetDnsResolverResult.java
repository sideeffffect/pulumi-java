// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetDnsResolverResult {
    /**
     * @return The current status of the DNS resolver. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final String dnsResolverState;
    /**
     * @return ETag of the DNS resolver.
     * 
     */
    private final String etag;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The current provisioning state of the DNS resolver. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final String provisioningState;
    /**
     * @return The resourceGuid property of the DNS resolver resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * @return The reference to the virtual network. This cannot be changed after creation.
     * 
     */
    private final SubResourceResponse virtualNetwork;

    @CustomType.Constructor
    private GetDnsResolverResult(
        @CustomType.Parameter("dnsResolverState") String dnsResolverState,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetwork") SubResourceResponse virtualNetwork) {
        this.dnsResolverState = dnsResolverState;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.virtualNetwork = virtualNetwork;
    }

    /**
     * @return The current status of the DNS resolver. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public String dnsResolverState() {
        return this.dnsResolverState;
    }
    /**
     * @return ETag of the DNS resolver.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current provisioning state of the DNS resolver. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The resourceGuid property of the DNS resolver resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The reference to the virtual network. This cannot be changed after creation.
     * 
     */
    public SubResourceResponse virtualNetwork() {
        return this.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsResolverResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsResolverState;
        private String etag;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private SubResourceResponse virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDnsResolverResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsResolverState = defaults.dnsResolverState;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder dnsResolverState(String dnsResolverState) {
            this.dnsResolverState = Objects.requireNonNull(dnsResolverState);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public Builder virtualNetwork(SubResourceResponse virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }        public GetDnsResolverResult build() {
            return new GetDnsResolverResult(dnsResolverState, etag, id, location, name, provisioningState, resourceGuid, systemData, tags, type, virtualNetwork);
        }
    }
}
