// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafregional.SizeConstraintSetArgs;
import io.pulumi.aws.wafregional.inputs.SizeConstraintSetState;
import io.pulumi.aws.wafregional.outputs.SizeConstraintSetSizeConstraint;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regional Size Constraint Set Resource for use with Application Load Balancer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Size Constraint Set can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/sizeConstraintSet:SizeConstraintSet size_constraint_set a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/sizeConstraintSet:SizeConstraintSet")
public class SizeConstraintSet extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Size Constraint Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Export(name="sizeConstraints", type=List.class, parameters={SizeConstraintSetSizeConstraint.class})
    private Output</* @Nullable */ List<SizeConstraintSetSizeConstraint>> sizeConstraints;

    /**
     * @return Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    public Output</* @Nullable */ List<SizeConstraintSetSizeConstraint>> sizeConstraints() {
        return this.sizeConstraints;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SizeConstraintSet(String name) {
        this(name, SizeConstraintSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/sizeConstraintSet:SizeConstraintSet", name, args == null ? SizeConstraintSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SizeConstraintSet(String name, Output<String> id, @Nullable SizeConstraintSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/sizeConstraintSet:SizeConstraintSet", name, state, makeResourceOptions(options, id));
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
    public static SizeConstraintSet get(String name, Output<String> id, @Nullable SizeConstraintSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SizeConstraintSet(name, id, state, options);
    }
}
