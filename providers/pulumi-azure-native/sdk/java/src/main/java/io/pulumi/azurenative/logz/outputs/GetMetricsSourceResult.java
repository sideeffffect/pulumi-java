// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.MonitorPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetricsSourceResult {
    /**
     * ARM id of the monitor resource.
     * 
     */
    private final String id;
    private final @Nullable IdentityPropertiesResponse identity;
    private final String location;
    /**
     * Name of the monitor resource.
     * 
     */
    private final String name;
    /**
     * Properties specific to the monitor resource.
     * 
     */
    private final MonitorPropertiesResponse properties;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the monitor resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","systemData","tags","type"})
    private GetMetricsSourceResult(
        String id,
        @Nullable IdentityPropertiesResponse identity,
        String location,
        String name,
        MonitorPropertiesResponse properties,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
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
     * ARM id of the monitor resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the monitor resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties specific to the monitor resource.
     * 
    */
    public MonitorPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The system metadata relating to this resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the monitor resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricsSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private String location;
        private String name;
        private MonitorPropertiesResponse properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricsSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(MonitorPropertiesResponse properties) {
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
        public GetMetricsSourceResult build() {
            return new GetMetricsSourceResult(id, identity, location, name, properties, systemData, tags, type);
        }
    }
}
