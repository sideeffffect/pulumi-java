// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePointCollectionSourcePropertiesResponse {
    /**
     * Resource Id of the source resource used to create this restore point collection
     * 
     */
    private final @Nullable String id;
    /**
     * Location of the source resource used to create this restore point collection.
     * 
     */
    private final String location;

    @OutputCustomType.Constructor({"id","location"})
    private RestorePointCollectionSourcePropertiesResponse(
        @Nullable String id,
        String location) {
        this.id = id;
        this.location = location;
    }

    /**
     * Resource Id of the source resource used to create this restore point collection
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Location of the source resource used to create this restore point collection.
     * 
    */
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointCollectionSourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointCollectionSourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public RestorePointCollectionSourcePropertiesResponse build() {
            return new RestorePointCollectionSourcePropertiesResponse(id, location);
        }
    }
}
