// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.inspectorv2.FilterArgs;
import com.pulumi.awsnative.inspectorv2.enums.FilterAction;
import com.pulumi.awsnative.inspectorv2.outputs.FilterCriteria;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Inspector Filter resource schema
 * 
 */
@ResourceType(type="aws-native:inspectorv2:Filter")
public class Filter extends CustomResource {
    /**
     * Findings filter ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Findings filter ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Findings filter description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Findings filter description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Findings filter action.
     * 
     */
    @Export(name="filterAction", type=FilterAction.class, parameters={})
    private Output<FilterAction> filterAction;

    /**
     * @return Findings filter action.
     * 
     */
    public Output<FilterAction> filterAction() {
        return this.filterAction;
    }
    /**
     * Findings filter criteria.
     * 
     */
    @Export(name="filterCriteria", type=FilterCriteria.class, parameters={})
    private Output<FilterCriteria> filterCriteria;

    /**
     * @return Findings filter criteria.
     * 
     */
    public Output<FilterCriteria> filterCriteria() {
        return this.filterCriteria;
    }
    /**
     * Findings filter name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Findings filter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Filter(String name) {
        this(name, FilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Filter(String name, FilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Filter(String name, FilterArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:inspectorv2:Filter", name, args == null ? FilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Filter(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:inspectorv2:Filter", name, null, makeResourceOptions(options, id));
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
    public static Filter get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Filter(name, id, options);
    }
}
