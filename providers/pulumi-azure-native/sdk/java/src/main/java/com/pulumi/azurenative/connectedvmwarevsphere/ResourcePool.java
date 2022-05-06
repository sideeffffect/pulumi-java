// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.connectedvmwarevsphere.ResourcePoolArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import com.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Define the resourcePool.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * ### CreateResourcePool
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var resourcePool = new ResourcePool(&#34;resourcePool&#34;, ResourcePoolArgs.builder()        
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;customLocation&#34;)
 *             ))
 *             .location(&#34;East US&#34;)
 *             .moRefId(&#34;aaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .resourcePoolName(&#34;HRPool&#34;)
 *             .vCenterId(&#34;/subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VCenters/ContosoVCenter&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:ResourcePool ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/ResourcePools/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:ResourcePool")
public class ResourcePool extends com.pulumi.resources.CustomResource {
    /**
     * Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
     */
    @Export(name="cpuLimitMHz", type=Double.class, parameters={})
    private Output<Double> cpuLimitMHz;

    /**
     * @return Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     * 
     */
    public Output<Double> cpuLimitMHz() {
        return this.cpuLimitMHz;
    }
    /**
     * Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
     */
    @Export(name="cpuReservationMHz", type=Double.class, parameters={})
    private Output<Double> cpuReservationMHz;

    /**
     * @return Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     * 
     */
    public Output<Double> cpuReservationMHz() {
        return this.cpuReservationMHz;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    @Export(name="cpuSharesLevel", type=String.class, parameters={})
    private Output<String> cpuSharesLevel;

    /**
     * @return Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    public Output<String> cpuSharesLevel() {
        return this.cpuSharesLevel;
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @Export(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> customResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Gets or sets the inventory Item ID for the resource pool.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the resource pool.
     * 
     */
    public Output<Optional<String>> inventoryItemId() {
        return Codegen.optional(this.inventoryItemId);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
     */
    @Export(name="memLimitMB", type=Double.class, parameters={})
    private Output<Double> memLimitMB;

    /**
     * @return Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     * 
     */
    public Output<Double> memLimitMB() {
        return this.memLimitMB;
    }
    /**
     * Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
     */
    @Export(name="memReservationMB", type=Double.class, parameters={})
    private Output<Double> memReservationMB;

    /**
     * @return Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     * 
     */
    public Output<Double> memReservationMB() {
        return this.memReservationMB;
    }
    /**
     * Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    @Export(name="memSharesLevel", type=String.class, parameters={})
    private Output<String> memSharesLevel;

    /**
     * @return Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     * 
     */
    public Output<String> memSharesLevel() {
        return this.memSharesLevel;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the resource pool.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the resource pool.
     * 
     */
    public Output<String> moName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     * 
     */
    public Output<Optional<String>> moRefId() {
        return Codegen.optional(this.moRefId);
    }
    /**
     * Gets or sets the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> statuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    public Output<Optional<String>> vCenterId() {
        return Codegen.optional(this.vCenterId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePool(String name) {
        this(name, ResourcePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePool(String name, ResourcePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePool(String name, ResourcePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:ResourcePool", name, args == null ? ResourcePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:ResourcePool", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:ResourcePool").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResourcePool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePool(name, id, options);
    }
}
