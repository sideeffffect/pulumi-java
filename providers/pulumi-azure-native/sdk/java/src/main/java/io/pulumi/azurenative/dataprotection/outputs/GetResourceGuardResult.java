// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.DppIdentityDetailsResponse;
import io.pulumi.azurenative.dataprotection.outputs.ResourceGuardResponse;
import io.pulumi.azurenative.dataprotection.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceGuardResult {
    /**
     * Optional ETag.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Resource Id represents the complete path to the resource.
     * 
     */
    private final String id;
    /**
     * Input Managed Identity Details
     * 
     */
    private final @Nullable DppIdentityDetailsResponse identity;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name associated with the resource.
     * 
     */
    private final String name;
    /**
     * ResourceGuardResource properties
     * 
     */
    private final ResourceGuardResponse properties;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","identity","location","name","properties","systemData","tags","type"})
    private GetResourceGuardResult(
        @Nullable String eTag,
        String id,
        @Nullable DppIdentityDetailsResponse identity,
        @Nullable String location,
        String name,
        ResourceGuardResponse properties,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.eTag = eTag;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Optional ETag.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Resource Id represents the complete path to the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Input Managed Identity Details
     * 
    */
    public Optional<DppIdentityDetailsResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name associated with the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * ResourceGuardResource properties
     * 
    */
    public ResourceGuardResponse getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGuardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable DppIdentityDetailsResponse identity;
        private @Nullable String location;
        private String name;
        private ResourceGuardResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceGuardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable DppIdentityDetailsResponse identity) {
            this.identity = identity;
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

        public Builder setProperties(ResourceGuardResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public GetResourceGuardResult build() {
            return new GetResourceGuardResult(eTag, id, identity, location, name, properties, systemData, tags, type);
        }
    }
}
