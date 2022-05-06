// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databoxedge.MECRoleArgs;
import com.pulumi.azurenative.databoxedge.outputs.AsymmetricEncryptedSecretResponse;
import com.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * MEC role.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### RolePut
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
 *         var mecRole = new MECRole(&#34;mecRole&#34;, MECRoleArgs.builder()        
 *             .deviceName(&#34;testedgedevice&#34;)
 *             .name(&#34;IoTRole1&#34;)
 *             .resourceGroupName(&#34;GroupForEdgeAutomation&#34;)
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
 * $ pulumi import azure-native:databoxedge:MECRole IoTRole1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/roles/IoTRole1 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:MECRole")
public class MECRole extends com.pulumi.resources.CustomResource {
    /**
     * Activation key of the MEC.
     * 
     */
    @Export(name="connectionString", type=AsymmetricEncryptedSecretResponse.class, parameters={})
    private Output</* @Nullable */ AsymmetricEncryptedSecretResponse> connectionString;

    /**
     * @return Activation key of the MEC.
     * 
     */
    public Output<Optional<AsymmetricEncryptedSecretResponse>> connectionString() {
        return Codegen.optional(this.connectionString);
    }
    /**
     * Role type.
     * Expected value is &#39;MEC&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Role type.
     * Expected value is &#39;MEC&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Role status.
     * 
     */
    @Export(name="roleStatus", type=String.class, parameters={})
    private Output<String> roleStatus;

    /**
     * @return Role status.
     * 
     */
    public Output<String> roleStatus() {
        return this.roleStatus;
    }
    /**
     * Role configured on ASE resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Role configured on ASE resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MECRole(String name) {
        this(name, MECRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MECRole(String name, MECRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MECRole(String name, MECRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MECRole", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private MECRole(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:MECRole", name, null, makeResourceOptions(options, id));
    }

    private static MECRoleArgs makeArgs(MECRoleArgs args) {
        var builder = args == null ? MECRoleArgs.builder() : MECRoleArgs.builder(args);
        return builder
            .kind("MEC")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220301:MECRole").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220401preview:MECRole").build())
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
    public static MECRole get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MECRole(name, id, options);
    }
}
