// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CreationDataResponse {
    /**
     * This is the ARM ID of the source object to be used to create the target object.
     * 
     */
    private final @Nullable String sourceResourceId;

    @CustomType.Constructor
    private CreationDataResponse(@CustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    /**
     * This is the ARM ID of the source object to be used to create the target object.
     * 
    */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }        public CreationDataResponse build() {
            return new CreationDataResponse(sourceResourceId);
        }
    }
}
