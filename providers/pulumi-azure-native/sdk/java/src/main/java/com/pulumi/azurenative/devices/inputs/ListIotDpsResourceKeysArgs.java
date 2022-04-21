// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListIotDpsResourceKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIotDpsResourceKeysArgs Empty = new ListIotDpsResourceKeysArgs();

    /**
     * The provisioning service name to get the shared access keys for.
     * 
     */
    @Import(name="provisioningServiceName", required=true)
    private String provisioningServiceName;

    public String provisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListIotDpsResourceKeysArgs() {}

    private ListIotDpsResourceKeysArgs(ListIotDpsResourceKeysArgs $) {
        this.provisioningServiceName = $.provisioningServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIotDpsResourceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIotDpsResourceKeysArgs $;

        public Builder() {
            $ = new ListIotDpsResourceKeysArgs();
        }

        public Builder(ListIotDpsResourceKeysArgs defaults) {
            $ = new ListIotDpsResourceKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder provisioningServiceName(String provisioningServiceName) {
            $.provisioningServiceName = provisioningServiceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListIotDpsResourceKeysArgs build() {
            $.provisioningServiceName = Objects.requireNonNull($.provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
