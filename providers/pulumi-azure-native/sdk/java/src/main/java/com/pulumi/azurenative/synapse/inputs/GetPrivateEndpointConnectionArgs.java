// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetPrivateEndpointConnectionArgs() {}

    private GetPrivateEndpointConnectionArgs(GetPrivateEndpointConnectionArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionArgs();
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
            $ = new GetPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetPrivateEndpointConnectionArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
