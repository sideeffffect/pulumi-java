// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.notificationhubs.NamespaceAuthorizationRuleArgs;
import com.pulumi.azurenative.notificationhubs.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Description of a Namespace AuthorizationRules.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * ### NameSpaceAuthorizationRuleCreate
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
 *         var namespaceAuthorizationRule = new NamespaceAuthorizationRule(&#34;namespaceAuthorizationRule&#34;, NamespaceAuthorizationRuleArgs.builder()        
 *             .authorizationRuleName(&#34;sdk-AuthRules-1788&#34;)
 *             .namespaceName(&#34;nh-sdk-ns&#34;)
 *             .properties(Map.of(&#34;rights&#34;,             
 *                 &#34;Listen&#34;,
 *                 &#34;Send&#34;))
 *             .resourceGroupName(&#34;5ktrial&#34;)
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
 * $ pulumi import azure-native:notificationhubs:NamespaceAuthorizationRule sdk-AuthRules-1788 /subscriptions/29cfa613-cbbc-4512-b1d6-1b3a92c7fa40/resourceGroups/ArunMonocle/providers/Microsoft.NotificationHubs/namespaces/sdk-Namespace-6914/AuthorizationRules/sdk-AuthRules-1788 
 * ```
 * 
 */
@ResourceType(type="azure-native:notificationhubs:NamespaceAuthorizationRule")
public class NamespaceAuthorizationRule extends com.pulumi.resources.CustomResource {
    /**
     * A string that describes the claim type
     * 
     */
    @Export(name="claimType", type=String.class, parameters={})
    private Output<String> claimType;

    /**
     * @return A string that describes the claim type
     * 
     */
    public Output<String> claimType() {
        return this.claimType;
    }
    /**
     * A string that describes the claim value
     * 
     */
    @Export(name="claimValue", type=String.class, parameters={})
    private Output<String> claimValue;

    /**
     * @return A string that describes the claim value
     * 
     */
    public Output<String> claimValue() {
        return this.claimValue;
    }
    /**
     * The created time for this rule
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time for this rule
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * A string that describes the authorization rule.
     * 
     */
    @Export(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    /**
     * @return A string that describes the authorization rule.
     * 
     */
    public Output<String> keyName() {
        return this.keyName;
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
     * The last modified time for this rule
     * 
     */
    @Export(name="modifiedTime", type=String.class, parameters={})
    private Output<String> modifiedTime;

    /**
     * @return The last modified time for this rule
     * 
     */
    public Output<String> modifiedTime() {
        return this.modifiedTime;
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
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    @Export(name="primaryKey", type=String.class, parameters={})
    private Output<String> primaryKey;

    /**
     * @return A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    public Output<String> primaryKey() {
        return this.primaryKey;
    }
    /**
     * The revision number for the rule
     * 
     */
    @Export(name="revision", type=Integer.class, parameters={})
    private Output<Integer> revision;

    /**
     * @return The revision number for the rule
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }
    /**
     * The rights associated with the rule.
     * 
     */
    @Export(name="rights", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> rights;

    /**
     * @return The rights associated with the rule.
     * 
     */
    public Output<Optional<List<String>>> rights() {
        return Codegen.optional(this.rights);
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    @Export(name="secondaryKey", type=String.class, parameters={})
    private Output<String> secondaryKey;

    /**
     * @return A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    public Output<String> secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * The sku of the created namespace
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the created namespace
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceAuthorizationRule(String name) {
        this(name, NamespaceAuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:NamespaceAuthorizationRule", name, args == null ? NamespaceAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceAuthorizationRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notificationhubs:NamespaceAuthorizationRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:notificationhubs/v20160301:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:notificationhubs/v20170401:NamespaceAuthorizationRule").build())
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
    public static NamespaceAuthorizationRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceAuthorizationRule(name, id, options);
    }
}
