// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute;

import com.pulumi.azurenative.hybridcompute.inputs.PrivateEndpointConnectionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Resource properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<PrivateEndpointConnectionPropertiesArgs> properties;

    public Optional<Output<PrivateEndpointConnectionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
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
     * The name of the Azure Arc PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
    private Output<String> scopeName;

    public Output<String> scopeName() {
        return this.scopeName;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        public Builder properties(@Nullable Output<PrivateEndpointConnectionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(PrivateEndpointConnectionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder scopeName(Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public PrivateEndpointConnectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}
