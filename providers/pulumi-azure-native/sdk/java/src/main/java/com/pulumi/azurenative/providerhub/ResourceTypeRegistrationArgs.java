// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationArgs Empty = new ResourceTypeRegistrationArgs();

    @Import(name="properties")
      private final @Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties;

    public Output<ResourceTypeRegistrationPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
      private final Output<String> providerNamespace;

    public Output<String> providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="resourceType")
      private final @Nullable Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType == null ? Codegen.empty() : this.resourceType;
    }

    public ResourceTypeRegistrationArgs(
        @Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties,
        Output<String> providerNamespace,
        @Nullable Output<String> resourceType) {
        this.properties = properties;
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.resourceType = resourceType;
    }

    private ResourceTypeRegistrationArgs() {
        this.properties = Codegen.empty();
        this.providerNamespace = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties;
        private Output<String> providerNamespace;
        private @Nullable Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder properties(@Nullable Output<ResourceTypeRegistrationPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ResourceTypeRegistrationPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder providerNamespace(Output<String> providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }
        public Builder providerNamespace(String providerNamespace) {
            this.providerNamespace = Output.of(Objects.requireNonNull(providerNamespace));
            return this;
        }
        public Builder resourceType(@Nullable Output<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Codegen.ofNullable(resourceType);
            return this;
        }        public ResourceTypeRegistrationArgs build() {
            return new ResourceTypeRegistrationArgs(properties, providerNamespace, resourceType);
        }
    }
}
