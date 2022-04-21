// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMonitoringConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMonitoringConfigArgs Empty = new GetMonitoringConfigArgs();

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="roleName", required=true)
    private String roleName;

    public String roleName() {
        return this.roleName;
    }

    private GetMonitoringConfigArgs() {}

    private GetMonitoringConfigArgs(GetMonitoringConfigArgs $) {
        this.deviceName = $.deviceName;
        this.resourceGroupName = $.resourceGroupName;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitoringConfigArgs $;

        public Builder() {
            $ = new GetMonitoringConfigArgs();
        }

        public Builder(GetMonitoringConfigArgs defaults) {
            $ = new GetMonitoringConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder roleName(String roleName) {
            $.roleName = roleName;
            return this;
        }

        public GetMonitoringConfigArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.roleName = Objects.requireNonNull($.roleName, "expected parameter 'roleName' to be non-null");
            return $;
        }
    }

}
