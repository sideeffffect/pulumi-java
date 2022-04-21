// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.inputs.ResourceIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineEndpointArgs Empty = new OnlineEndpointArgs();

    /**
     * Online Endpoint name.
     * 
     */
    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * Service identity associated with a resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ResourceIdentityArgs> identity;

    public Optional<Output<ResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
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
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
    private Output<com.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties;

    public Output<com.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties() {
        return this.properties;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private OnlineEndpointArgs() {}

    private OnlineEndpointArgs(OnlineEndpointArgs $) {
        this.endpointName = $.endpointName;
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineEndpointArgs $;

        public Builder() {
            $ = new OnlineEndpointArgs();
        }

        public Builder(OnlineEndpointArgs defaults) {
            $ = new OnlineEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(Output<com.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(com.pulumi.azurenative.machinelearningservices.inputs.OnlineEndpointArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public OnlineEndpointArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
