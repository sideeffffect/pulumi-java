// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointPolicyDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyDefinitionArgs Empty = new ServiceEndpointPolicyDefinitionArgs();

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Service endpoint name.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * The name of the service endpoint policy definition name.
     * 
     */
    @Import(name="serviceEndpointPolicyDefinitionName")
      private final @Nullable Output<String> serviceEndpointPolicyDefinitionName;

    public Output<String> serviceEndpointPolicyDefinitionName() {
        return this.serviceEndpointPolicyDefinitionName == null ? Codegen.empty() : this.serviceEndpointPolicyDefinitionName;
    }

    /**
     * The name of the service endpoint policy.
     * 
     */
    @Import(name="serviceEndpointPolicyName", required=true)
      private final Output<String> serviceEndpointPolicyName;

    public Output<String> serviceEndpointPolicyName() {
        return this.serviceEndpointPolicyName;
    }

    /**
     * A list of service resources.
     * 
     */
    @Import(name="serviceResources")
      private final @Nullable Output<List<String>> serviceResources;

    public Output<List<String>> serviceResources() {
        return this.serviceResources == null ? Codegen.empty() : this.serviceResources;
    }

    public ServiceEndpointPolicyDefinitionArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> service,
        @Nullable Output<String> serviceEndpointPolicyDefinitionName,
        Output<String> serviceEndpointPolicyName,
        @Nullable Output<List<String>> serviceResources) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.service = service;
        this.serviceEndpointPolicyDefinitionName = serviceEndpointPolicyDefinitionName;
        this.serviceEndpointPolicyName = Objects.requireNonNull(serviceEndpointPolicyName, "expected parameter 'serviceEndpointPolicyName' to be non-null");
        this.serviceResources = serviceResources;
    }

    private ServiceEndpointPolicyDefinitionArgs() {
        this.description = Codegen.empty();
        this.id = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.service = Codegen.empty();
        this.serviceEndpointPolicyDefinitionName = Codegen.empty();
        this.serviceEndpointPolicyName = Codegen.empty();
        this.serviceResources = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> service;
        private @Nullable Output<String> serviceEndpointPolicyDefinitionName;
        private Output<String> serviceEndpointPolicyName;
        private @Nullable Output<List<String>> serviceResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.service = defaults.service;
    	      this.serviceEndpointPolicyDefinitionName = defaults.serviceEndpointPolicyDefinitionName;
    	      this.serviceEndpointPolicyName = defaults.serviceEndpointPolicyName;
    	      this.serviceResources = defaults.serviceResources;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder serviceEndpointPolicyDefinitionName(@Nullable Output<String> serviceEndpointPolicyDefinitionName) {
            this.serviceEndpointPolicyDefinitionName = serviceEndpointPolicyDefinitionName;
            return this;
        }
        public Builder serviceEndpointPolicyDefinitionName(@Nullable String serviceEndpointPolicyDefinitionName) {
            this.serviceEndpointPolicyDefinitionName = Codegen.ofNullable(serviceEndpointPolicyDefinitionName);
            return this;
        }
        public Builder serviceEndpointPolicyName(Output<String> serviceEndpointPolicyName) {
            this.serviceEndpointPolicyName = Objects.requireNonNull(serviceEndpointPolicyName);
            return this;
        }
        public Builder serviceEndpointPolicyName(String serviceEndpointPolicyName) {
            this.serviceEndpointPolicyName = Output.of(Objects.requireNonNull(serviceEndpointPolicyName));
            return this;
        }
        public Builder serviceResources(@Nullable Output<List<String>> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }
        public Builder serviceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = Codegen.ofNullable(serviceResources);
            return this;
        }
        public Builder serviceResources(String... serviceResources) {
            return serviceResources(List.of(serviceResources));
        }        public ServiceEndpointPolicyDefinitionArgs build() {
            return new ServiceEndpointPolicyDefinitionArgs(description, id, name, resourceGroupName, service, serviceEndpointPolicyDefinitionName, serviceEndpointPolicyName, serviceResources);
        }
    }
}
