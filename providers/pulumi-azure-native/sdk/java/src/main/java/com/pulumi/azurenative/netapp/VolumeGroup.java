// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.netapp.VolumeGroupArgs;
import com.pulumi.azurenative.netapp.outputs.VolumeGroupMetaDataResponse;
import com.pulumi.azurenative.netapp.outputs.VolumeGroupVolumePropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Volume group resource for create
 * API Version: 2021-10-01.
 * 
 * ## Example Usage
 * ### VolumeGroups_Create
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
 *         var volumeGroup = new VolumeGroup(&#34;volumeGroup&#34;, VolumeGroupArgs.builder()        
 *             .accountName(&#34;account1&#34;)
 *             .groupMetaData(Map.ofEntries(
 *                 Map.entry(&#34;applicationIdentifier&#34;, &#34;DEV&#34;),
 *                 Map.entry(&#34;applicationType&#34;, &#34;SAP-HANA&#34;),
 *                 Map.entry(&#34;deploymentSpecId&#34;, &#34;fb04dbeb-005d-2703-197e-6208dfadb5d9&#34;),
 *                 Map.entry(&#34;groupDescription&#34;, &#34;Volume group&#34;)
 *             ))
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;myRG&#34;)
 *             .volumeGroupName(&#34;group1&#34;)
 *             .volumes(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;capacityPoolResourceId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1&#34;),
 *                     Map.entry(&#34;creationToken&#34;, &#34;testVol1&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;testVol1&#34;),
 *                     Map.entry(&#34;proximityPlacementGroup&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg&#34;),
 *                     Map.entry(&#34;serviceLevel&#34;, &#34;Premium&#34;),
 *                     Map.entry(&#34;subnetId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3&#34;),
 *                     Map.entry(&#34;throughputMibps&#34;, 10),
 *                     Map.entry(&#34;usageThreshold&#34;, 107374182400),
 *                     Map.entry(&#34;volumeSpecName&#34;, &#34;data&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;capacityPoolResourceId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1&#34;),
 *                     Map.entry(&#34;creationToken&#34;, &#34;testVol2&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;testVol2&#34;),
 *                     Map.entry(&#34;proximityPlacementGroup&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg&#34;),
 *                     Map.entry(&#34;serviceLevel&#34;, &#34;Premium&#34;),
 *                     Map.entry(&#34;subnetId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3&#34;),
 *                     Map.entry(&#34;throughputMibps&#34;, 10),
 *                     Map.entry(&#34;usageThreshold&#34;, 107374182400),
 *                     Map.entry(&#34;volumeSpecName&#34;, &#34;log&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;capacityPoolResourceId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1&#34;),
 *                     Map.entry(&#34;creationToken&#34;, &#34;testVol3&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;testVol3&#34;),
 *                     Map.entry(&#34;proximityPlacementGroup&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg&#34;),
 *                     Map.entry(&#34;serviceLevel&#34;, &#34;Premium&#34;),
 *                     Map.entry(&#34;subnetId&#34;, &#34;/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3&#34;),
 *                     Map.entry(&#34;throughputMibps&#34;, 10),
 *                     Map.entry(&#34;usageThreshold&#34;, 107374182400),
 *                     Map.entry(&#34;volumeSpecName&#34;, &#34;shared&#34;)
 *                 ))
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
 * $ pulumi import azure-native:netapp:VolumeGroup group1 /subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/volumeGroups/group1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:VolumeGroup")
public class VolumeGroup extends com.pulumi.resources.CustomResource {
    /**
     * Volume group details
     * 
     */
    @Export(name="groupMetaData", type=VolumeGroupMetaDataResponse.class, parameters={})
    private Output</* @Nullable */ VolumeGroupMetaDataResponse> groupMetaData;

    /**
     * @return Volume group details
     * 
     */
    public Output<Optional<VolumeGroupMetaDataResponse>> groupMetaData() {
        return Codegen.optional(this.groupMetaData);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * List of volumes from group
     * 
     */
    @Export(name="volumes", type=List.class, parameters={VolumeGroupVolumePropertiesResponse.class})
    private Output</* @Nullable */ List<VolumeGroupVolumePropertiesResponse>> volumes;

    /**
     * @return List of volumes from group
     * 
     */
    public Output<Optional<List<VolumeGroupVolumePropertiesResponse>>> volumes() {
        return Codegen.optional(this.volumes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeGroup(String name) {
        this(name, VolumeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeGroup(String name, VolumeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeGroup(String name, VolumeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:VolumeGroup", name, args == null ? VolumeGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:VolumeGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:netapp/v20210801:VolumeGroup").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20211001:VolumeGroup").build())
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
    public static VolumeGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeGroup(name, id, options);
    }
}
