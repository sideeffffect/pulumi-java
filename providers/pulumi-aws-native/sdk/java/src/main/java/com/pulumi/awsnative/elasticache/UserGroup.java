// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.elasticache.UserGroupArgs;
import com.pulumi.awsnative.elasticache.enums.UserGroupEngine;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ElastiCache::UserGroup
 * 
 */
@ResourceType(type="aws-native:elasticache:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the user account.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Must be redis.
     * 
     */
    @Export(name="engine", type=UserGroupEngine.class, parameters={})
    private Output<UserGroupEngine> engine;

    /**
     * @return Must be redis.
     * 
     */
    public Output<UserGroupEngine> engine() {
        return this.engine;
    }
    /**
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * List of users associated to this user group.
     * 
     */
    @Export(name="userIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return List of users associated to this user group.
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
        super("aws-native:elasticache:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticache:UserGroup", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, options);
    }
}
