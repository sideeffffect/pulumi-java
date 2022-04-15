// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.tags.TagKeyArgs;
import io.pulumi.gcp.tags.inputs.TagKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A TagKey, used to group a set of TagValues.
 * 
 * To get more information about TagKey, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagKeys)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TagKey can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagKey:TagKey default tagKeys/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagKey:TagKey default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:tags/tagKey:TagKey")
public class TagKey extends io.pulumi.resources.CustomResource {
    /**
     * Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. Creation time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The generated numeric id for the TagKey.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The generated numeric id for the TagKey.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Output only. Namespaced name of the TagKey.
     * 
     */
    @Export(name="namespacedName", type=String.class, parameters={})
    private Output<String> namespacedName;

    /**
     * @return Output only. Namespaced name of the TagKey.
     * 
     */
    public Output<String> namespacedName() {
        return this.namespacedName;
    }
    /**
     * Input only. The resource name of the new TagKey's parent. Must be of the form organizations/{org_id}.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Input only. The resource name of the new TagKey's parent. Must be of the form organizations/{org_id}.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. Update time. A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagKey(String name) {
        this(name, TagKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagKey(String name, TagKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagKey(String name, TagKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagKey:TagKey", name, args == null ? TagKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagKey(String name, Output<String> id, @Nullable TagKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagKey:TagKey", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static TagKey get(String name, Output<String> id, @Nullable TagKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagKey(name, id, state, options);
    }
}
