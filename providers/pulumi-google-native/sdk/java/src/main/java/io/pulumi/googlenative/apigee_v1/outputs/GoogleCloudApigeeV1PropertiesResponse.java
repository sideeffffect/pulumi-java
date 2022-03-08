// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertyResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1PropertiesResponse {
    /**
     * List of all properties in the object
     * 
     */
    private final List<GoogleCloudApigeeV1PropertyResponse> property;

    @OutputCustomType.Constructor({"property"})
    private GoogleCloudApigeeV1PropertiesResponse(List<GoogleCloudApigeeV1PropertyResponse> property) {
        this.property = property;
    }

    /**
     * List of all properties in the object
     * 
    */
    public List<GoogleCloudApigeeV1PropertyResponse> getProperty() {
        return this.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudApigeeV1PropertyResponse> property;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
        }

        public Builder setProperty(List<GoogleCloudApigeeV1PropertyResponse> property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        public GoogleCloudApigeeV1PropertiesResponse build() {
            return new GoogleCloudApigeeV1PropertiesResponse(property);
        }
    }
}
