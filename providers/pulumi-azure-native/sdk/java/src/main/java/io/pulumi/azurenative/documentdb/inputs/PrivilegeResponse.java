// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.PrivilegeResponseResource;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of data plane operations permitted through this Role Definition.
 * 
 */
public final class PrivilegeResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivilegeResponse Empty = new PrivilegeResponse();

    /**
     * An array of actions that are allowed.
     * 
     */
    @InputImport(name="actions")
      private final @Nullable List<String> actions;

    public List<String> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }

    /**
     * An Azure Cosmos DB Mongo DB Resource.
     * 
     */
    @InputImport(name="resource")
      private final @Nullable PrivilegeResponseResource resource;

    public Optional<PrivilegeResponseResource> getResource() {
        return this.resource == null ? Optional.empty() : Optional.ofNullable(this.resource);
    }

    public PrivilegeResponse(
        @Nullable List<String> actions,
        @Nullable PrivilegeResponseResource resource) {
        this.actions = actions;
        this.resource = resource;
    }

    private PrivilegeResponse() {
        this.actions = List.of();
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actions;
        private @Nullable PrivilegeResponseResource resource;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivilegeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.resource = defaults.resource;
        }

        public Builder actions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }

        public Builder resource(@Nullable PrivilegeResponseResource resource) {
            this.resource = resource;
            return this;
        }
        public PrivilegeResponse build() {
            return new PrivilegeResponse(actions, resource);
        }
    }
}
