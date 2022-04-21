// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMonitorMonitoredResourcesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMonitorMonitoredResourcesArgs Empty = new ListMonitorMonitoredResourcesArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    public String monitorName() {
        return this.monitorName;
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

    private ListMonitorMonitoredResourcesArgs() {}

    private ListMonitorMonitoredResourcesArgs(ListMonitorMonitoredResourcesArgs $) {
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMonitorMonitoredResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMonitorMonitoredResourcesArgs $;

        public Builder() {
            $ = new ListMonitorMonitoredResourcesArgs();
        }

        public Builder(ListMonitorMonitoredResourcesArgs defaults) {
            $ = new ListMonitorMonitoredResourcesArgs(Objects.requireNonNull(defaults));
        }

        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListMonitorMonitoredResourcesArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
