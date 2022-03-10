// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTopologyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTopologyArgs Empty = new ServiceTopologyArgs();

    /**
     * The resource Id of the artifact source that contains the artifacts that can be referenced in the service units.
     * 
     */
    @InputImport(name="artifactSourceId")
      private final @Nullable Input<String> artifactSourceId;

    public Input<String> getArtifactSourceId() {
        return this.artifactSourceId == null ? Input.empty() : this.artifactSourceId;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @InputImport(name="serviceTopologyName")
      private final @Nullable Input<String> serviceTopologyName;

    public Input<String> getServiceTopologyName() {
        return this.serviceTopologyName == null ? Input.empty() : this.serviceTopologyName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceTopologyArgs(
        @Nullable Input<String> artifactSourceId,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> serviceTopologyName,
        @Nullable Input<Map<String,String>> tags) {
        this.artifactSourceId = artifactSourceId;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceTopologyName = serviceTopologyName;
        this.tags = tags;
    }

    private ServiceTopologyArgs() {
        this.artifactSourceId = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceTopologyName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> artifactSourceId;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serviceTopologyName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTopologyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactSourceId = defaults.artifactSourceId;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
    	      this.tags = defaults.tags;
        }

        public Builder artifactSourceId(@Nullable Input<String> artifactSourceId) {
            this.artifactSourceId = artifactSourceId;
            return this;
        }

        public Builder artifactSourceId(@Nullable String artifactSourceId) {
            this.artifactSourceId = Input.ofNullable(artifactSourceId);
            return this;
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

        public Builder serviceTopologyName(@Nullable Input<String> serviceTopologyName) {
            this.serviceTopologyName = serviceTopologyName;
            return this;
        }

        public Builder serviceTopologyName(@Nullable String serviceTopologyName) {
            this.serviceTopologyName = Input.ofNullable(serviceTopologyName);
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
        public ServiceTopologyArgs build() {
            return new ServiceTopologyArgs(artifactSourceId, location, resourceGroupName, serviceTopologyName, tags);
        }
    }
}
