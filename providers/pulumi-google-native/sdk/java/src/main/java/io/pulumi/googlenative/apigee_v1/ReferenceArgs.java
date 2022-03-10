// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReferenceArgs Empty = new ReferenceArgs();

    /**
     * Optional. A human-readable description of this reference.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="environmentId", required=true)
      private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * The resource id of this reference. Values must match the regular expression [\w\s\-.]+.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * The id of the resource to which this reference refers. Must be the id of a resource that exists in the parent environment and is of the given resource_type.
     * 
     */
    @InputImport(name="refers", required=true)
      private final Input<String> refers;

    public Input<String> getRefers() {
        return this.refers;
    }

    /**
     * The type of resource referred to by this reference. Valid values are 'KeyStore' or 'TrustStore'.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    public ReferenceArgs(
        @Nullable Input<String> description,
        Input<String> environmentId,
        @Nullable Input<String> name,
        Input<String> organizationId,
        Input<String> refers,
        @Nullable Input<String> resourceType) {
        this.description = description;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.refers = Objects.requireNonNull(refers, "expected parameter 'refers' to be non-null");
        this.resourceType = resourceType;
    }

    private ReferenceArgs() {
        this.description = Input.empty();
        this.environmentId = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.refers = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> environmentId;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private Input<String> refers;
        private @Nullable Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.refers = defaults.refers;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder environmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder organizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder refers(Input<String> refers) {
            this.refers = Objects.requireNonNull(refers);
            return this;
        }

        public Builder refers(String refers) {
            this.refers = Input.of(Objects.requireNonNull(refers));
            return this;
        }

        public Builder resourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }
        public ReferenceArgs build() {
            return new ReferenceArgs(description, environmentId, name, organizationId, refers, resourceType);
        }
    }
}
