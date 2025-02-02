// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualRouterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualRouterArgs Empty = new GetVirtualRouterArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable Output<String> expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<Output<String>> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Virtual Router.
     * 
     */
    @Import(name="virtualRouterName", required=true)
    private Output<String> virtualRouterName;

    /**
     * @return The name of the Virtual Router.
     * 
     */
    public Output<String> virtualRouterName() {
        return this.virtualRouterName;
    }

    private GetVirtualRouterArgs() {}

    private GetVirtualRouterArgs(GetVirtualRouterArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualRouterName = $.virtualRouterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualRouterArgs $;

        public Builder() {
            $ = new GetVirtualRouterArgs();
        }

        public Builder(GetVirtualRouterArgs defaults) {
            $ = new GetVirtualRouterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Output<String> expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(String expand) {
            return expand(Output.of(expand));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param virtualRouterName The name of the Virtual Router.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterName(Output<String> virtualRouterName) {
            $.virtualRouterName = virtualRouterName;
            return this;
        }

        /**
         * @param virtualRouterName The name of the Virtual Router.
         * 
         * @return builder
         * 
         */
        public Builder virtualRouterName(String virtualRouterName) {
            return virtualRouterName(Output.of(virtualRouterName));
        }

        public GetVirtualRouterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualRouterName = Objects.requireNonNull($.virtualRouterName, "expected parameter 'virtualRouterName' to be non-null");
            return $;
        }
    }

}
