// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeploymentAtManagementGroupScopeResult {
    /**
     * The ID of the deployment.
     * 
     */
    private final String id;
    /**
     * the location of the deployment.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the deployment.
     * 
     */
    private final String name;
    /**
     * Deployment properties.
     * 
     */
    private final DeploymentPropertiesExtendedResponse properties;
    /**
     * Deployment tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the deployment.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","tags","type"})
    private GetDeploymentAtManagementGroupScopeResult(
        String id,
        @Nullable String location,
        String name,
        DeploymentPropertiesExtendedResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The ID of the deployment.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * the location of the deployment.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the deployment.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Deployment properties.
     * 
    */
    public DeploymentPropertiesExtendedResponse getProperties() {
        return this.properties;
    }
    /**
     * Deployment tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the deployment.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentAtManagementGroupScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private DeploymentPropertiesExtendedResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentAtManagementGroupScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(DeploymentPropertiesExtendedResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeploymentAtManagementGroupScopeResult build() {
            return new GetDeploymentAtManagementGroupScopeResult(id, location, name, properties, tags, type);
        }
    }
}
