// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestUsageArgs Empty = new GuestUsageArgs();

    /**
     * Location of the Guest Usages resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * The initial domain name of the AAD tenant.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * An identifier for the tenant for which the resource is being created
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public GuestUsageArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> tenantId) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
        this.tenantId = tenantId;
    }

    private GuestUsageArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder resourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public GuestUsageArgs build() {
            return new GuestUsageArgs(location, resourceGroupName, resourceName, tags, tenantId);
        }
    }
}
