// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.resourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.resourcemanager.LienArgs;
import com.pulumi.gcp.resourcemanager.inputs.LienState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Lien represents an encumbrance on the actions that can be performed on a resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Lien can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:resourcemanager/lien:Lien default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:resourcemanager/lien:Lien")
public class Lien extends CustomResource {
    /**
     * Time of creation
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time of creation
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A system-generated unique identifier for this Lien.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A system-generated unique identifier for this Lien.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    @Export(name="origin", type=String.class, parameters={})
    private Output<String> origin;

    /**
     * @return A stable, user-visible/meaningful string identifying the origin
     * of the Lien, intended to be inspected programmatically. Maximum length of
     * 200 characters.
     * 
     */
    public Output<String> origin() {
        return this.origin;
    }
    /**
     * A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return A reference to the resource this Lien is attached to.
     * The server will validate the parent against those for which Liens are supported.
     * Since a variety of objects can have Liens against them, you must provide the type
     * prefix (e.g. &#34;projects/my-project-name&#34;).
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    @Export(name="reason", type=String.class, parameters={})
    private Output<String> reason;

    /**
     * @return Concise user-visible strings indicating why an action cannot be performed
     * on a resource. Maximum length of 200 characters.
     * 
     */
    public Output<String> reason() {
        return this.reason;
    }
    /**
     * The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    @Export(name="restrictions", type=List.class, parameters={String.class})
    private Output<List<String>> restrictions;

    /**
     * @return The types of operations which should be blocked as a result of this Lien.
     * Each value should correspond to an IAM permission. The server will validate
     * the permissions against those for which Liens are supported.  An empty
     * list is meaningless and will be rejected.
     * e.g. [&#39;resourcemanager.projects.delete&#39;]
     * 
     */
    public Output<List<String>> restrictions() {
        return this.restrictions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lien(String name) {
        this(name, LienArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lien(String name, LienArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lien(String name, LienArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, args == null ? LienArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lien(String name, Output<String> id, @Nullable LienState state, @Nullable CustomResourceOptions options) {
        super("gcp:resourcemanager/lien:Lien", name, state, makeResourceOptions(options, id));
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
    public static Lien get(String name, Output<String> id, @Nullable LienState state, @Nullable CustomResourceOptions options) {
        return new Lien(name, id, state, options);
    }
}
