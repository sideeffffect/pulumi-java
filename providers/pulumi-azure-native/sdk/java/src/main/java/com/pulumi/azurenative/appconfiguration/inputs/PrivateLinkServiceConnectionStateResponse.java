// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The state of a private link service connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * Any action that is required beyond basic workflow (approve/ reject/ disconnect)
     * 
     */
    @Import(name="actionsRequired", required=true)
      private final String actionsRequired;

    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public PrivateLinkServiceConnectionStateResponse(
        String actionsRequired,
        @Nullable String description,
        @Nullable String status) {
        this.actionsRequired = Objects.requireNonNull(actionsRequired, "expected parameter 'actionsRequired' to be non-null");
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateResponse() {
        this.actionsRequired = null;
        this.description = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
