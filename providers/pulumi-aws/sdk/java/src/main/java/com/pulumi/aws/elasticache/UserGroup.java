// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticache.UserGroupArgs;
import com.pulumi.aws.elasticache.inputs.UserGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an ElastiCache user group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ElastiCache user groups can be imported using the `user_group_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticache/userGroup:UserGroup my_user_group userGoupId1
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/userGroup:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The current supported value is `REDIS`.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return The current supported value is `REDIS`.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the user group.
     * 
     */
    @Export(name="userGroupId", type=String.class, parameters={})
    private Output<String> userGroupId;

    /**
     * @return The ID of the user group.
     * 
     */
    public Output<String> userGroupId() {
        return this.userGroupId;
    }
    /**
     * The list of user IDs that belong to the user group.
     * 
     */
    @Export(name="userIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return The list of user IDs that belong to the user group.
     * 
     */
    public Output</* @Nullable */ List<String>> userIds() {
        return this.userIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroup(String name) {
        this(name, UserGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroup(String name, UserGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroup(String name, UserGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/userGroup:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/userGroup:UserGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static UserGroup get(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, state, options);
    }
}
