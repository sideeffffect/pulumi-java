// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointArgs Empty = new GetPrivateEndpointArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName", required=true)
    private String privateEndpointName;

    public String privateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateEndpointArgs() {}

    private GetPrivateEndpointArgs(GetPrivateEndpointArgs $) {
        this.expand = $.expand;
        this.privateEndpointName = $.privateEndpointName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointArgs $;

        public Builder() {
            $ = new GetPrivateEndpointArgs();
        }

        public Builder(GetPrivateEndpointArgs defaults) {
            $ = new GetPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder privateEndpointName(String privateEndpointName) {
            $.privateEndpointName = privateEndpointName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateEndpointArgs build() {
            $.privateEndpointName = Objects.requireNonNull($.privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
