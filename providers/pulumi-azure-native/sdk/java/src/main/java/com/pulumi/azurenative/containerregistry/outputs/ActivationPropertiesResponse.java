// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ActivationPropertiesResponse {
    /**
     * @return The activation status of the connected registry.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ActivationPropertiesResponse(@CustomType.Parameter("status") String status) {
        this.status = status;
    }

    /**
     * @return The activation status of the connected registry.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ActivationPropertiesResponse build() {
            return new ActivationPropertiesResponse(status);
        }
    }
}
