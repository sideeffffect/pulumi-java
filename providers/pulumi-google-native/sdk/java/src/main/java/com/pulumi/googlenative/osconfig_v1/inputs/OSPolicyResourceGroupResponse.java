// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyInventoryFilterResponse;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceResponse;
import java.util.List;
import java.util.Objects;


/**
 * Resource groups provide a mechanism to group OS policy resources. Resource groups enable OS policy authors to create a single OS policy to be applied to VMs running different operating Systems. When the OS policy is applied to a target VM, the appropriate resource group within the OS policy is selected based on the `OSFilter` specified within the resource group.
 * 
 */
public final class OSPolicyResourceGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceGroupResponse Empty = new OSPolicyResourceGroupResponse();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @Import(name="inventoryFilters", required=true)
    private List<OSPolicyInventoryFilterResponse> inventoryFilters;

    public List<OSPolicyInventoryFilterResponse> inventoryFilters() {
        return this.inventoryFilters;
    }

    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @Import(name="resources", required=true)
    private List<OSPolicyResourceResponse> resources;

    public List<OSPolicyResourceResponse> resources() {
        return this.resources;
    }

    private OSPolicyResourceGroupResponse() {}

    private OSPolicyResourceGroupResponse(OSPolicyResourceGroupResponse $) {
        this.inventoryFilters = $.inventoryFilters;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceGroupResponse $;

        public Builder() {
            $ = new OSPolicyResourceGroupResponse();
        }

        public Builder(OSPolicyResourceGroupResponse defaults) {
            $ = new OSPolicyResourceGroupResponse(Objects.requireNonNull(defaults));
        }

        public Builder inventoryFilters(List<OSPolicyInventoryFilterResponse> inventoryFilters) {
            $.inventoryFilters = inventoryFilters;
            return this;
        }

        public Builder inventoryFilters(OSPolicyInventoryFilterResponse... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }

        public Builder resources(List<OSPolicyResourceResponse> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(OSPolicyResourceResponse... resources) {
            return resources(List.of(resources));
        }

        public OSPolicyResourceGroupResponse build() {
            $.inventoryFilters = Objects.requireNonNull($.inventoryFilters, "expected parameter 'inventoryFilters' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
