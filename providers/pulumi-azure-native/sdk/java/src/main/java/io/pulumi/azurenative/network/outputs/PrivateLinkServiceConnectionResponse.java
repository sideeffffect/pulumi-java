// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * A collection of read-only information about the state of the connection to the remote resource.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * The resource id of private link service.
     * 
     */
    private final @Nullable String privateLinkServiceId;
    /**
     * The provisioning state of the private link service connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    private final @Nullable String requestMessage;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private PrivateLinkServiceConnectionResponse(
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @OutputCustomType.Parameter("privateLinkServiceId") @Nullable String privateLinkServiceId,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("requestMessage") @Nullable String requestMessage,
        @OutputCustomType.Parameter("type") String type) {
        this.etag = etag;
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.privateLinkServiceId = privateLinkServiceId;
        this.provisioningState = provisioningState;
        this.requestMessage = requestMessage;
        this.type = type;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to.
     * 
    */
    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A collection of read-only information about the state of the connection to the remote resource.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * The resource id of private link service.
     * 
    */
    public Optional<String> getPrivateLinkServiceId() {
        return Optional.ofNullable(this.privateLinkServiceId);
    }
    /**
     * The provisioning state of the private link service connection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
    */
    public Optional<String> getRequestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable List<String> groupIds;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String privateLinkServiceId;
        private String provisioningState;
        private @Nullable String requestMessage;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PrivateLinkServiceConnectionResponse build() {
            return new PrivateLinkServiceConnectionResponse(etag, groupIds, id, name, privateLinkServiceConnectionState, privateLinkServiceId, provisioningState, requestMessage, type);
        }
    }
}
