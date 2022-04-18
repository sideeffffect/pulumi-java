// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.chaos.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TargetReferenceResponse {
    /**
     * String of the resource ID of a Target resource.
     * 
     */
    private final String id;
    /**
     * Enum of the Target reference type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TargetReferenceResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * String of the resource ID of a Target resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Enum of the Target reference type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TargetReferenceResponse build() {
            return new TargetReferenceResponse(id, type);
        }
    }
}
