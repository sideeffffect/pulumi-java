// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticMemberArgs Empty = new StaticMemberArgs();

    /**
     * The name of the network group.
     * 
     */
    @Import(name="networkGroupName", required=true)
    private Output<String> networkGroupName;

    /**
     * @return The name of the network group.
     * 
     */
    public Output<String> networkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Output<String> networkManagerName() {
        return this.networkManagerName;
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
     * Resource Id.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return Resource Id.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The name of the static member.
     * 
     */
    @Import(name="staticMemberName")
    private @Nullable Output<String> staticMemberName;

    /**
     * @return The name of the static member.
     * 
     */
    public Optional<Output<String>> staticMemberName() {
        return Optional.ofNullable(this.staticMemberName);
    }

    private StaticMemberArgs() {}

    private StaticMemberArgs(StaticMemberArgs $) {
        this.networkGroupName = $.networkGroupName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceId = $.resourceId;
        this.staticMemberName = $.staticMemberName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticMemberArgs $;

        public Builder() {
            $ = new StaticMemberArgs();
        }

        public Builder(StaticMemberArgs defaults) {
            $ = new StaticMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkGroupName The name of the network group.
         * 
         * @return builder
         * 
         */
        public Builder networkGroupName(Output<String> networkGroupName) {
            $.networkGroupName = networkGroupName;
            return this;
        }

        /**
         * @param networkGroupName The name of the network group.
         * 
         * @return builder
         * 
         */
        public Builder networkGroupName(String networkGroupName) {
            return networkGroupName(Output.of(networkGroupName));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
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
         * @param resourceId Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param staticMemberName The name of the static member.
         * 
         * @return builder
         * 
         */
        public Builder staticMemberName(@Nullable Output<String> staticMemberName) {
            $.staticMemberName = staticMemberName;
            return this;
        }

        /**
         * @param staticMemberName The name of the static member.
         * 
         * @return builder
         * 
         */
        public Builder staticMemberName(String staticMemberName) {
            return staticMemberName(Output.of(staticMemberName));
        }

        public StaticMemberArgs build() {
            $.networkGroupName = Objects.requireNonNull($.networkGroupName, "expected parameter 'networkGroupName' to be non-null");
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
