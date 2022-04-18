// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Private Endpoint resource.
 * 
 */
public final class PrivateEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointResponse Empty = new PrivateEndpointResponse();

    /**
     * This is private endpoint resource created with Microsoft.Network resource provider.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public PrivateEndpointResponse(@Nullable String id) {
        this.id = id;
    }

    private PrivateEndpointResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public PrivateEndpointResponse build() {
            return new PrivateEndpointResponse(id);
        }
    }
}
