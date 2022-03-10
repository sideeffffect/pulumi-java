// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SkuCapabilityResponse {
    private final String name;
    private final String value;

    @OutputCustomType.Constructor
    private SkuCapabilityResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCapabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCapabilityResponse defaults) {
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
        public SkuCapabilityResponse build() {
            return new SkuCapabilityResponse(name, value);
        }
    }
}
