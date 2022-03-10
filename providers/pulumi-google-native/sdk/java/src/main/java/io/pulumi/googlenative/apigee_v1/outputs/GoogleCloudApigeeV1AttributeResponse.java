// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1AttributeResponse {
    /**
     * API key of the attribute.
     * 
     */
    private final String name;
    /**
     * Value of the attribute.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private GoogleCloudApigeeV1AttributeResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * API key of the attribute.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Value of the attribute.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudApigeeV1AttributeResponse build() {
            return new GoogleCloudApigeeV1AttributeResponse(name, value);
        }
    }
}
