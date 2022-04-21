// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateLinkServicePrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkServicePrivateEndpointConnectionArgs Empty = new GetPrivateLinkServicePrivateEndpointConnectionArgs();

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
     * The name of the private end point connection.
     * 
     */
    @Import(name="peConnectionName", required=true)
    private String peConnectionName;

    public String peConnectionName() {
        return this.peConnectionName;
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

    /**
     * The name of the private link service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetPrivateLinkServicePrivateEndpointConnectionArgs() {}

    private GetPrivateLinkServicePrivateEndpointConnectionArgs(GetPrivateLinkServicePrivateEndpointConnectionArgs $) {
        this.expand = $.expand;
        this.peConnectionName = $.peConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkServicePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkServicePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetPrivateLinkServicePrivateEndpointConnectionArgs();
        }

        public Builder(GetPrivateLinkServicePrivateEndpointConnectionArgs defaults) {
            $ = new GetPrivateLinkServicePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder peConnectionName(String peConnectionName) {
            $.peConnectionName = peConnectionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetPrivateLinkServicePrivateEndpointConnectionArgs build() {
            $.peConnectionName = Objects.requireNonNull($.peConnectionName, "expected parameter 'peConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
