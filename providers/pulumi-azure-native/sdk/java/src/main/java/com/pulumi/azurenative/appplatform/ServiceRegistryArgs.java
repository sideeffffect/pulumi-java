// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceRegistryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceRegistryArgs Empty = new ServiceRegistryArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The name of Service Registry.
     * 
     */
    @Import(name="serviceRegistryName")
    private @Nullable Output<String> serviceRegistryName;

    public Optional<Output<String>> serviceRegistryName() {
        return Optional.ofNullable(this.serviceRegistryName);
    }

    private ServiceRegistryArgs() {}

    private ServiceRegistryArgs(ServiceRegistryArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.serviceRegistryName = $.serviceRegistryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceRegistryArgs $;

        public Builder() {
            $ = new ServiceRegistryArgs();
        }

        public Builder(ServiceRegistryArgs defaults) {
            $ = new ServiceRegistryArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder serviceRegistryName(@Nullable Output<String> serviceRegistryName) {
            $.serviceRegistryName = serviceRegistryName;
            return this;
        }

        public Builder serviceRegistryName(String serviceRegistryName) {
            return serviceRegistryName(Output.of(serviceRegistryName));
        }

        public ServiceRegistryArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
