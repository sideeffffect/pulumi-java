// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SharedPrivateLinkResourcePropertiesResponse {
    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
     */
    private final @Nullable String groupId;
    /**
     * The resource id of the resource the shared private link resource is for.
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * The provisioning state of the shared private link resource. Can be Updating, Deleting, Failed, Succeeded or Incomplete.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The request message for requesting approval of the shared private link resource.
     * 
     */
    private final @Nullable String requestMessage;
    /**
     * Optional. Can be used to specify the Azure Resource Manager location of the resource to which a shared private link is to be created. This is only required for those resources whose DNS configuration are regional (such as Azure Kubernetes Service).
     * 
     */
    private final @Nullable String resourceRegion;
    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected or Disconnected.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor
    private SharedPrivateLinkResourcePropertiesResponse(
        @OutputCustomType.Parameter("groupId") @Nullable String groupId,
        @OutputCustomType.Parameter("privateLinkResourceId") @Nullable String privateLinkResourceId,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("requestMessage") @Nullable String requestMessage,
        @OutputCustomType.Parameter("resourceRegion") @Nullable String resourceRegion,
        @OutputCustomType.Parameter("status") @Nullable String status) {
        this.groupId = groupId;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
        this.requestMessage = requestMessage;
        this.resourceRegion = resourceRegion;
        this.status = status;
    }

    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
    */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * The resource id of the resource the shared private link resource is for.
     * 
    */
    public Optional<String> getPrivateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * The provisioning state of the shared private link resource. Can be Updating, Deleting, Failed, Succeeded or Incomplete.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The request message for requesting approval of the shared private link resource.
     * 
    */
    public Optional<String> getRequestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }
    /**
     * Optional. Can be used to specify the Azure Resource Manager location of the resource to which a shared private link is to be created. This is only required for those resources whose DNS configuration are regional (such as Azure Kubernetes Service).
     * 
    */
    public Optional<String> getResourceRegion() {
        return Optional.ofNullable(this.resourceRegion);
    }
    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected or Disconnected.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String privateLinkResourceId;
        private @Nullable String provisioningState;
        private @Nullable String requestMessage;
        private @Nullable String resourceRegion;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.resourceRegion = defaults.resourceRegion;
    	      this.status = defaults.status;
        }

        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder resourceRegion(@Nullable String resourceRegion) {
            this.resourceRegion = resourceRegion;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public SharedPrivateLinkResourcePropertiesResponse build() {
            return new SharedPrivateLinkResourcePropertiesResponse(groupId, privateLinkResourceId, provisioningState, requestMessage, resourceRegion, status);
        }
    }
}
