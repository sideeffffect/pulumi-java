// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.visualstudio;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.visualstudio.ExtensionArgs;
import com.pulumi.azurenative.visualstudio.outputs.ExtensionResourcePlanResponse;
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
 * The response to an extension resource GET request.
 * API Version: 2014-04-01-preview.
 * 
 * ## Example Usage
 * ### Create an extension resource
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
 *         var extension = new Extension(&#34;extension&#34;, ExtensionArgs.builder()        
 *             .accountResourceName(&#34;ExampleAccount&#34;)
 *             .extensionResourceName(&#34;ms.example&#34;)
 *             .location(&#34;Central US&#34;)
 *             .plan(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;ExamplePlan&#34;),
 *                 Map.entry(&#34;product&#34;, &#34;ExampleExtensionName&#34;),
 *                 Map.entry(&#34;promotionCode&#34;, &#34;&#34;),
 *                 Map.entry(&#34;publisher&#34;, &#34;ExampleExtensionPublisher&#34;),
 *                 Map.entry(&#34;version&#34;, &#34;1.0&#34;)
 *             ))
 *             .properties()
 *             .resourceGroupName(&#34;VS-Example-Group&#34;)
 *             .tags()
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
 * $ pulumi import azure-native:visualstudio:Extension ms.example /subscriptions/0de7f055-dbea-498d-8e9e-da287eedca90/resourceGroups/VS-Example-Group/providers/Microsoft.VisualStudio/account/ExampleAccount/extension/ms.example 
 * ```
 * 
 */
@ResourceType(type="azure-native:visualstudio:Extension")
public class Extension extends com.pulumi.resources.CustomResource {
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The extension plan that was purchased.
     * 
     */
    @Export(name="plan", type=ExtensionResourcePlanResponse.class, parameters={})
    private Output</* @Nullable */ ExtensionResourcePlanResponse> plan;

    /**
     * @return The extension plan that was purchased.
     * 
     */
    public Output<Optional<ExtensionResourcePlanResponse>> plan() {
        return Codegen.optional(this.plan);
    }
    /**
     * Resource properties.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> properties;

    /**
     * @return Resource properties.
     * 
     */
    public Output<Map<String,String>> properties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:visualstudio:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:visualstudio:Extension", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:visualstudio/v20140401preview:Extension").build()),
                Output.of(Alias.builder().type("azure-native:visualstudio/v20171101preview:Extension").build())
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
    public static Extension get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
