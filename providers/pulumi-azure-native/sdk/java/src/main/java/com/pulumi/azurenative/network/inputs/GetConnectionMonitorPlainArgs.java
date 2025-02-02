// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionMonitorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionMonitorPlainArgs Empty = new GetConnectionMonitorPlainArgs();

    /**
     * The name of the connection monitor.
     * 
     */
    @Import(name="connectionMonitorName", required=true)
    private String connectionMonitorName;

    /**
     * @return The name of the connection monitor.
     * 
     */
    public String connectionMonitorName() {
        return this.connectionMonitorName;
    }

    /**
     * The name of the Network Watcher resource.
     * 
     */
    @Import(name="networkWatcherName", required=true)
    private String networkWatcherName;

    /**
     * @return The name of the Network Watcher resource.
     * 
     */
    public String networkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * The name of the resource group containing Network Watcher.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group containing Network Watcher.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetConnectionMonitorPlainArgs() {}

    private GetConnectionMonitorPlainArgs(GetConnectionMonitorPlainArgs $) {
        this.connectionMonitorName = $.connectionMonitorName;
        this.networkWatcherName = $.networkWatcherName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionMonitorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionMonitorPlainArgs $;

        public Builder() {
            $ = new GetConnectionMonitorPlainArgs();
        }

        public Builder(GetConnectionMonitorPlainArgs defaults) {
            $ = new GetConnectionMonitorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionMonitorName The name of the connection monitor.
         * 
         * @return builder
         * 
         */
        public Builder connectionMonitorName(String connectionMonitorName) {
            $.connectionMonitorName = connectionMonitorName;
            return this;
        }

        /**
         * @param networkWatcherName The name of the Network Watcher resource.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(String networkWatcherName) {
            $.networkWatcherName = networkWatcherName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing Network Watcher.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetConnectionMonitorPlainArgs build() {
            $.connectionMonitorName = Objects.requireNonNull($.connectionMonitorName, "expected parameter 'connectionMonitorName' to be non-null");
            $.networkWatcherName = Objects.requireNonNull($.networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
