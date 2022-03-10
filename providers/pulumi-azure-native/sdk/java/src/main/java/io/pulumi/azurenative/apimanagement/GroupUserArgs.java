// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupUserArgs Empty = new GroupUserArgs();

    /**
     * Group identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="groupId", required=true)
      private final Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="userId")
      private final @Nullable Input<String> userId;

    public Input<String> getUserId() {
        return this.userId == null ? Input.empty() : this.userId;
    }

    public GroupUserArgs(
        Input<String> groupId,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> userId) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.userId = userId;
    }

    private GroupUserArgs() {
        this.groupId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> groupId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.userId = defaults.userId;
        }

        public Builder groupId(Input<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = Input.of(Objects.requireNonNull(groupId));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serviceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder userId(@Nullable Input<String> userId) {
            this.userId = userId;
            return this;
        }

        public Builder userId(@Nullable String userId) {
            this.userId = Input.ofNullable(userId);
            return this;
        }
        public GroupUserArgs build() {
            return new GroupUserArgs(groupId, resourceGroupName, serviceName, userId);
        }
    }
}
