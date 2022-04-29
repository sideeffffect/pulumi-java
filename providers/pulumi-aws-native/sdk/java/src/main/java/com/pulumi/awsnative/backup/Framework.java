// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.backup.FrameworkArgs;
import com.pulumi.awsnative.backup.outputs.FrameworkControl;
import com.pulumi.awsnative.backup.outputs.FrameworkTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Contains detailed information about a framework. Frameworks contain controls, which evaluate and report on your backup events and resources. Frameworks generate daily compliance results.
 * 
 */
@ResourceType(type="aws-native:backup:Framework")
public class Framework extends CustomResource {
    /**
     * The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC). The value of `CreationTime` is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * 
     */
    @Export(name="creationTime", type=Double.class, parameters={})
    private Output<Double> creationTime;

    /**
     * @return The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC). The value of `CreationTime` is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * 
     */
    public Output<Double> creationTime() {
        return this.creationTime;
    }
    /**
     * The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED`
     * 
     */
    @Export(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    /**
     * @return The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED`
     * 
     */
    public Output<String> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
     * 
     */
    @Export(name="frameworkArn", type=String.class, parameters={})
    private Output<String> frameworkArn;

    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
     * 
     */
    public Output<String> frameworkArn() {
        return this.frameworkArn;
    }
    /**
     * Contains detailed information about all of the controls of a framework. Each framework must contain at least one control.
     * 
     */
    @Export(name="frameworkControls", type=List.class, parameters={FrameworkControl.class})
    private Output<List<FrameworkControl>> frameworkControls;

    /**
     * @return Contains detailed information about all of the controls of a framework. Each framework must contain at least one control.
     * 
     */
    public Output<List<FrameworkControl>> frameworkControls() {
        return this.frameworkControls;
    }
    /**
     * An optional description of the framework with a maximum 1,024 characters.
     * 
     */
    @Export(name="frameworkDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> frameworkDescription;

    /**
     * @return An optional description of the framework with a maximum 1,024 characters.
     * 
     */
    public Output<Optional<String>> frameworkDescription() {
        return Codegen.optional(this.frameworkDescription);
    }
    /**
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @Export(name="frameworkName", type=String.class, parameters={})
    private Output</* @Nullable */ String> frameworkName;

    /**
     * @return The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    public Output<Optional<String>> frameworkName() {
        return Codegen.optional(this.frameworkName);
    }
    /**
     * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. The statuses are:
     * 
     * `ACTIVE` when recording is turned on for all resources governed by the framework.
     * 
     * `PARTIALLY_ACTIVE` when recording is turned off for at least one resource governed by the framework.
     * 
     * `INACTIVE` when recording is turned off for all resources governed by the framework.
     * 
     * `UNAVAILABLE` when AWS Backup is unable to validate recording status at this time.
     * 
     */
    @Export(name="frameworkStatus", type=String.class, parameters={})
    private Output<String> frameworkStatus;

    /**
     * @return A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. The statuses are:
     * 
     * `ACTIVE` when recording is turned on for all resources governed by the framework.
     * 
     * `PARTIALLY_ACTIVE` when recording is turned off for at least one resource governed by the framework.
     * 
     * `INACTIVE` when recording is turned off for all resources governed by the framework.
     * 
     * `UNAVAILABLE` when AWS Backup is unable to validate recording status at this time.
     * 
     */
    public Output<String> frameworkStatus() {
        return this.frameworkStatus;
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Export(name="frameworkTags", type=List.class, parameters={FrameworkTag.class})
    private Output</* @Nullable */ List<FrameworkTag>> frameworkTags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Output<Optional<List<FrameworkTag>>> frameworkTags() {
        return Codegen.optional(this.frameworkTags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Framework(String name) {
        this(name, FrameworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Framework(String name, FrameworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Framework(String name, FrameworkArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:backup:Framework", name, args == null ? FrameworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Framework(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:backup:Framework", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Framework get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Framework(name, id, options);
    }
}
