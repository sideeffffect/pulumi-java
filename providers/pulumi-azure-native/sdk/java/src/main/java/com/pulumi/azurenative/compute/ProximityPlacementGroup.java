// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.ProximityPlacementGroupArgs;
import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceWithColocationStatusResponse;
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
 * Specifies information about the proximity placement group.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### Create or Update a proximity placement group.
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
 *         var proximityPlacementGroup = new ProximityPlacementGroup(&#34;proximityPlacementGroup&#34;, ProximityPlacementGroupArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .proximityPlacementGroupName(&#34;myProximityPlacementGroup&#34;)
 *             .proximityPlacementGroupType(&#34;Standard&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
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
 * $ pulumi import azure-native:compute:ProximityPlacementGroup myProximityPlacementGroup /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/proximityPlacementGroups/myProximityPlacementGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:ProximityPlacementGroup")
public class ProximityPlacementGroup extends com.pulumi.resources.CustomResource {
    /**
     * A list of references to all availability sets in the proximity placement group.
     * 
     */
    @Export(name="availabilitySets", type=List.class, parameters={SubResourceWithColocationStatusResponse.class})
    private Output<List<SubResourceWithColocationStatusResponse>> availabilitySets;

    /**
     * @return A list of references to all availability sets in the proximity placement group.
     * 
     */
    public Output<List<SubResourceWithColocationStatusResponse>> availabilitySets() {
        return this.availabilitySets;
    }
    /**
     * Describes colocation status of the Proximity Placement Group.
     * 
     */
    @Export(name="colocationStatus", type=InstanceViewStatusResponse.class, parameters={})
    private Output</* @Nullable */ InstanceViewStatusResponse> colocationStatus;

    /**
     * @return Describes colocation status of the Proximity Placement Group.
     * 
     */
    public Output<Optional<InstanceViewStatusResponse>> colocationStatus() {
        return Codegen.optional(this.colocationStatus);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     * 
     */
    @Export(name="proximityPlacementGroupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> proximityPlacementGroupType;

    /**
     * @return Specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     * 
     */
    public Output<Optional<String>> proximityPlacementGroupType() {
        return Codegen.optional(this.proximityPlacementGroupType);
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
     * A list of references to all virtual machine scale sets in the proximity placement group.
     * 
     */
    @Export(name="virtualMachineScaleSets", type=List.class, parameters={SubResourceWithColocationStatusResponse.class})
    private Output<List<SubResourceWithColocationStatusResponse>> virtualMachineScaleSets;

    /**
     * @return A list of references to all virtual machine scale sets in the proximity placement group.
     * 
     */
    public Output<List<SubResourceWithColocationStatusResponse>> virtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }
    /**
     * A list of references to all virtual machines in the proximity placement group.
     * 
     */
    @Export(name="virtualMachines", type=List.class, parameters={SubResourceWithColocationStatusResponse.class})
    private Output<List<SubResourceWithColocationStatusResponse>> virtualMachines;

    /**
     * @return A list of references to all virtual machines in the proximity placement group.
     * 
     */
    public Output<List<SubResourceWithColocationStatusResponse>> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProximityPlacementGroup(String name) {
        this(name, ProximityPlacementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProximityPlacementGroup(String name, ProximityPlacementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProximityPlacementGroup(String name, ProximityPlacementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:ProximityPlacementGroup", name, args == null ? ProximityPlacementGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProximityPlacementGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:ProximityPlacementGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20180401:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20181001:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191201:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200601:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:ProximityPlacementGroup").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:ProximityPlacementGroup").build())
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
    public static ProximityPlacementGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProximityPlacementGroup(name, id, options);
    }
}
