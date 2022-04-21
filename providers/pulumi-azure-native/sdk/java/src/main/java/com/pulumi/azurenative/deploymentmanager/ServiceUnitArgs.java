// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager;

import com.pulumi.azurenative.deploymentmanager.enums.DeploymentMode;
import com.pulumi.azurenative.deploymentmanager.inputs.ServiceUnitArtifactsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceUnitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceUnitArgs Empty = new ServiceUnitArgs();

    /**
     * The artifacts for the service unit.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<ServiceUnitArtifactsArgs> artifacts;

    public Optional<Output<ServiceUnitArtifactsArgs>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    @Import(name="deploymentMode", required=true)
    private Output<DeploymentMode> deploymentMode;

    public Output<DeploymentMode> deploymentMode() {
        return this.deploymentMode;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @Import(name="serviceTopologyName", required=true)
    private Output<String> serviceTopologyName;

    public Output<String> serviceTopologyName() {
        return this.serviceTopologyName;
    }

    /**
     * The name of the service unit resource.
     * 
     */
    @Import(name="serviceUnitName")
    private @Nullable Output<String> serviceUnitName;

    public Optional<Output<String>> serviceUnitName() {
        return Optional.ofNullable(this.serviceUnitName);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    @Import(name="targetResourceGroup", required=true)
    private Output<String> targetResourceGroup;

    public Output<String> targetResourceGroup() {
        return this.targetResourceGroup;
    }

    private ServiceUnitArgs() {}

    private ServiceUnitArgs(ServiceUnitArgs $) {
        this.artifacts = $.artifacts;
        this.deploymentMode = $.deploymentMode;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.serviceTopologyName = $.serviceTopologyName;
        this.serviceUnitName = $.serviceUnitName;
        this.tags = $.tags;
        this.targetResourceGroup = $.targetResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceUnitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceUnitArgs $;

        public Builder() {
            $ = new ServiceUnitArgs();
        }

        public Builder(ServiceUnitArgs defaults) {
            $ = new ServiceUnitArgs(Objects.requireNonNull(defaults));
        }

        public Builder artifacts(@Nullable Output<ServiceUnitArtifactsArgs> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(ServiceUnitArtifactsArgs artifacts) {
            return artifacts(Output.of(artifacts));
        }

        public Builder deploymentMode(Output<DeploymentMode> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        public Builder deploymentMode(DeploymentMode deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public Builder serviceTopologyName(Output<String> serviceTopologyName) {
            $.serviceTopologyName = serviceTopologyName;
            return this;
        }

        public Builder serviceTopologyName(String serviceTopologyName) {
            return serviceTopologyName(Output.of(serviceTopologyName));
        }

        public Builder serviceUnitName(@Nullable Output<String> serviceUnitName) {
            $.serviceUnitName = serviceUnitName;
            return this;
        }

        public Builder serviceUnitName(String serviceUnitName) {
            return serviceUnitName(Output.of(serviceUnitName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder targetResourceGroup(Output<String> targetResourceGroup) {
            $.targetResourceGroup = targetResourceGroup;
            return this;
        }

        public Builder targetResourceGroup(String targetResourceGroup) {
            return targetResourceGroup(Output.of(targetResourceGroup));
        }

        public ServiceUnitArgs build() {
            $.deploymentMode = Objects.requireNonNull($.deploymentMode, "expected parameter 'deploymentMode' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.serviceTopologyName = Objects.requireNonNull($.serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
            $.targetResourceGroup = Objects.requireNonNull($.targetResourceGroup, "expected parameter 'targetResourceGroup' to be non-null");
            return $;
        }
    }

}
