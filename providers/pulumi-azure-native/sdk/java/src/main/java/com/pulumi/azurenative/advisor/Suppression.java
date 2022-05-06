// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.advisor;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.advisor.SuppressionArgs;
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
 * The details of the snoozed or dismissed rule; for example, the duration, name, and GUID associated with the rule.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * ### CreateSuppression
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
 *         var suppression = new Suppression(&#34;suppression&#34;, SuppressionArgs.builder()        
 *             .name(&#34;suppressionName1&#34;)
 *             .recommendationId(&#34;recommendationId&#34;)
 *             .resourceUri(&#34;resourceUri&#34;)
 *             .ttl(&#34;07:00:00:00&#34;)
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
 * $ pulumi import azure-native:advisor:Suppression suppressionName1 /resourceUri/providers/Microsoft.Advisor/recommendations/recommendationId/suppressions/suppressionName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:advisor:Suppression")
public class Suppression extends com.pulumi.resources.CustomResource {
    /**
     * Gets or sets the expiration time stamp.
     * 
     */
    @Export(name="expirationTimeStamp", type=String.class, parameters={})
    private Output<String> expirationTimeStamp;

    /**
     * @return Gets or sets the expiration time stamp.
     * 
     */
    public Output<String> expirationTimeStamp() {
        return this.expirationTimeStamp;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The GUID of the suppression.
     * 
     */
    @Export(name="suppressionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> suppressionId;

    /**
     * @return The GUID of the suppression.
     * 
     */
    public Output<Optional<String>> suppressionId() {
        return Codegen.optional(this.suppressionId);
    }
    /**
     * The duration for which the suppression is valid.
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output</* @Nullable */ String> ttl;

    /**
     * @return The duration for which the suppression is valid.
     * 
     */
    public Output<Optional<String>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Suppression(String name) {
        this(name, SuppressionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Suppression(String name, SuppressionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Suppression(String name, SuppressionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:advisor:Suppression", name, args == null ? SuppressionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Suppression(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:advisor:Suppression", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:advisor/v20160712preview:Suppression").build()),
                Output.of(Alias.builder().type("azure-native:advisor/v20170331:Suppression").build()),
                Output.of(Alias.builder().type("azure-native:advisor/v20170419:Suppression").build()),
                Output.of(Alias.builder().type("azure-native:advisor/v20200101:Suppression").build())
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
    public static Suppression get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Suppression(name, id, options);
    }
}
