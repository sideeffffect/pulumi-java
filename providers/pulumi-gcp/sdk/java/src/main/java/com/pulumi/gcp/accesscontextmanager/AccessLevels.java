// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevel;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically.
 * This is a bulk edit of all Access Levels and may override existing Access Levels created by `gcp.accesscontextmanager.AccessLevel`,
 * thus causing a permadiff if used alongside `gcp.accesscontextmanager.AccessLevel` on the same parent.
 * 
 * To get more information about AccessLevels, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AccessLevels can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}/accessLevels
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevels:AccessLevels")
public class AccessLevels extends CustomResource {
    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @Export(name="accessLevels", type=List.class, parameters={AccessLevelsAccessLevel.class})
    private Output</* @Nullable */ List<AccessLevelsAccessLevel>> accessLevels;

    /**
     * @return The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<AccessLevelsAccessLevel>>> accessLevels() {
        return Codegen.optional(this.accessLevels);
    }
    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevels(String name) {
        this(name, AccessLevelsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevels(String name, AccessLevelsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevels(String name, AccessLevelsArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, args == null ? AccessLevelsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevels(String name, Output<String> id, @Nullable AccessLevelsState state, @Nullable CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, state, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessLevels get(String name, Output<String> id, @Nullable AccessLevelsState state, @Nullable CustomResourceOptions options) {
        return new AccessLevels(name, id, state, options);
    }
}
