// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedPrivateEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedPrivateEndpointArgs Empty = new GetManagedPrivateEndpointArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the managed private endpoint.
     * 
     */
    @Import(name="managedPrivateEndpointName", required=true)
    private String managedPrivateEndpointName;

    public String managedPrivateEndpointName() {
        return this.managedPrivateEndpointName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedPrivateEndpointArgs() {}

    private GetManagedPrivateEndpointArgs(GetManagedPrivateEndpointArgs $) {
        this.clusterName = $.clusterName;
        this.managedPrivateEndpointName = $.managedPrivateEndpointName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new GetManagedPrivateEndpointArgs();
        }

        public Builder(GetManagedPrivateEndpointArgs defaults) {
            $ = new GetManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder managedPrivateEndpointName(String managedPrivateEndpointName) {
            $.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedPrivateEndpointArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.managedPrivateEndpointName = Objects.requireNonNull($.managedPrivateEndpointName, "expected parameter 'managedPrivateEndpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
