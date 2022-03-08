// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.ProviderResourceTypeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderResponse {
    /**
     * The provider ID.
     * 
     */
    private final String id;
    /**
     * The namespace of the resource provider.
     * 
     */
    private final @Nullable String namespace;
    /**
     * The registration policy of the resource provider.
     * 
     */
    private final String registrationPolicy;
    /**
     * The registration state of the resource provider.
     * 
     */
    private final String registrationState;
    /**
     * The collection of provider resource types.
     * 
     */
    private final List<ProviderResourceTypeResponse> resourceTypes;

    @OutputCustomType.Constructor({"id","namespace","registrationPolicy","registrationState","resourceTypes"})
    private ProviderResponse(
        String id,
        @Nullable String namespace,
        String registrationPolicy,
        String registrationState,
        List<ProviderResourceTypeResponse> resourceTypes) {
        this.id = id;
        this.namespace = namespace;
        this.registrationPolicy = registrationPolicy;
        this.registrationState = registrationState;
        this.resourceTypes = resourceTypes;
    }

    /**
     * The provider ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The namespace of the resource provider.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * The registration policy of the resource provider.
     * 
    */
    public String getRegistrationPolicy() {
        return this.registrationPolicy;
    }
    /**
     * The registration state of the resource provider.
     * 
    */
    public String getRegistrationState() {
        return this.registrationState;
    }
    /**
     * The collection of provider resource types.
     * 
    */
    public List<ProviderResourceTypeResponse> getResourceTypes() {
        return this.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String namespace;
        private String registrationPolicy;
        private String registrationState;
        private List<ProviderResourceTypeResponse> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.registrationPolicy = defaults.registrationPolicy;
    	      this.registrationState = defaults.registrationState;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setRegistrationPolicy(String registrationPolicy) {
            this.registrationPolicy = Objects.requireNonNull(registrationPolicy);
            return this;
        }

        public Builder setRegistrationState(String registrationState) {
            this.registrationState = Objects.requireNonNull(registrationState);
            return this;
        }

        public Builder setResourceTypes(List<ProviderResourceTypeResponse> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public ProviderResponse build() {
            return new ProviderResponse(id, namespace, registrationPolicy, registrationState, resourceTypes);
        }
    }
}
