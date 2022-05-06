// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.DeploymentAtManagementGroupScopeArgs;
import com.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
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
 * Deployment information.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### Create deployment at management group scope.
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
 *         var deploymentAtManagementGroupScope = new DeploymentAtManagementGroupScope(&#34;deploymentAtManagementGroupScope&#34;, DeploymentAtManagementGroupScopeArgs.builder()        
 *             .deploymentName(&#34;my-deployment&#34;)
 *             .groupId(&#34;my-management-group-id&#34;)
 *             .location(&#34;eastus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;mode&#34;, &#34;Incremental&#34;),
 *                 Map.entry(&#34;parameters&#34;, ),
 *                 Map.entry(&#34;templateLink&#34;, Map.of(&#34;uri&#34;, &#34;https://example.com/exampleTemplate.json&#34;))
 *             ))
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
 * $ pulumi import azure-native:resources:DeploymentAtManagementGroupScope my-deployment /providers/Microsoft.Management/managementGroups/my-management-group-id/providers/Microsoft.Resources/deployments/my-deployment 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:DeploymentAtManagementGroupScope")
public class DeploymentAtManagementGroupScope extends com.pulumi.resources.CustomResource {
    /**
     * the location of the deployment.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the location of the deployment.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the deployment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the deployment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Deployment properties.
     * 
     */
    @Export(name="properties", type=DeploymentPropertiesExtendedResponse.class, parameters={})
    private Output<DeploymentPropertiesExtendedResponse> properties;

    /**
     * @return Deployment properties.
     * 
     */
    public Output<DeploymentPropertiesExtendedResponse> properties() {
        return this.properties;
    }
    /**
     * Deployment tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Deployment tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the deployment.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the deployment.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentAtManagementGroupScope(String name) {
        this(name, DeploymentAtManagementGroupScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentAtManagementGroupScope(String name, DeploymentAtManagementGroupScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentAtManagementGroupScope(String name, DeploymentAtManagementGroupScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtManagementGroupScope", name, args == null ? DeploymentAtManagementGroupScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentAtManagementGroupScope(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtManagementGroupScope", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20190501:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190510:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190701:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190801:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20191001:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200601:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200801:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210101:DeploymentAtManagementGroupScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210401:DeploymentAtManagementGroupScope").build())
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
    public static DeploymentAtManagementGroupScope get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentAtManagementGroupScope(name, id, options);
    }
}
