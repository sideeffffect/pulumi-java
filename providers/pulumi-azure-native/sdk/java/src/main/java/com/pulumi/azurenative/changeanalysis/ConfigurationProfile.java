// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.changeanalysis.ConfigurationProfileArgs;
import com.pulumi.azurenative.changeanalysis.outputs.ConfigurationProfileResourcePropertiesResponse;
import com.pulumi.azurenative.changeanalysis.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.changeanalysis.outputs.SystemDataResponse;
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
 * A profile object that contains change analysis configuration, such as notification settings, for this subscription
 * API Version: 2020-04-01-preview.
 * 
 * ## Example Usage
 * ### ConfigurationProfile_Create
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
 *         var configurationProfile = new ConfigurationProfile(&#34;configurationProfile&#34;, ConfigurationProfileArgs.builder()        
 *             .profileName(&#34;default&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### ConfigurationProfile_CreateWithIdentity
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
 *         var configurationProfile = new ConfigurationProfile(&#34;configurationProfile&#34;, ConfigurationProfileArgs.builder()        
 *             .profileName(&#34;default&#34;)
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
 * $ pulumi import azure-native:changeanalysis:ConfigurationProfile default /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/providers/Microsoft.ChangeAnalysis/profile/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:changeanalysis:ConfigurationProfile")
public class ConfigurationProfile extends com.pulumi.resources.CustomResource {
    /**
     * The identity block returned by ARM resource that supports managed identity.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The identity block returned by ARM resource that supports managed identity.
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The location where the resource is to be deployed.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location where the resource is to be deployed.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The properties of a configuration profile.
     * 
     */
    @Export(name="properties", type=ConfigurationProfileResourcePropertiesResponse.class, parameters={})
    private Output<ConfigurationProfileResourcePropertiesResponse> properties;

    /**
     * @return The properties of a configuration profile.
     * 
     */
    public Output<ConfigurationProfileResourcePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output</* @Nullable */ SystemDataResponse> systemData;

    /**
     * @return Top level metadata https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/common-api-contracts.md#system-metadata-for-all-azure-resources
     * 
     */
    public Output<Optional<SystemDataResponse>> systemData() {
        return Codegen.optional(this.systemData);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationProfile(String name) {
        this(name, ConfigurationProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationProfile(String name, @Nullable ConfigurationProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationProfile(String name, @Nullable ConfigurationProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:changeanalysis:ConfigurationProfile", name, args == null ? ConfigurationProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:changeanalysis:ConfigurationProfile", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:changeanalysis/v20200401preview:ConfigurationProfile").build())
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
    public static ConfigurationProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationProfile(name, id, options);
    }
}
