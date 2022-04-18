// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.evidently.FeatureArgs;
import com.pulumi.awsnative.evidently.enums.FeatureEvaluationStrategy;
import com.pulumi.awsnative.evidently.outputs.FeatureEntityOverride;
import com.pulumi.awsnative.evidently.outputs.FeatureTag;
import com.pulumi.awsnative.evidently.outputs.FeatureVariationObject;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Evidently::Feature.
 * 
 */
@ResourceType(type="aws-native:evidently:Feature")
public class Feature extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="defaultVariation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultVariation;

    public Output</* @Nullable */ String> defaultVariation() {
        return this.defaultVariation;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    @Export(name="entityOverrides", type=List.class, parameters={FeatureEntityOverride.class})
    private Output</* @Nullable */ List<FeatureEntityOverride>> entityOverrides;

    public Output</* @Nullable */ List<FeatureEntityOverride>> entityOverrides() {
        return this.entityOverrides;
    }
    @Export(name="evaluationStrategy", type=FeatureEvaluationStrategy.class, parameters={})
    private Output</* @Nullable */ FeatureEvaluationStrategy> evaluationStrategy;

    public Output</* @Nullable */ FeatureEvaluationStrategy> evaluationStrategy() {
        return this.evaluationStrategy;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={FeatureTag.class})
    private Output</* @Nullable */ List<FeatureTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<FeatureTag>> tags() {
        return this.tags;
    }
    @Export(name="variations", type=List.class, parameters={FeatureVariationObject.class})
    private Output<List<FeatureVariationObject>> variations;

    public Output<List<FeatureVariationObject>> variations() {
        return this.variations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Feature(String name) {
        this(name, FeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Feature(String name, FeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Feature(String name, FeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Feature(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Feature", name, null, makeResourceOptions(options, id));
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
    public static Feature get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, options);
    }
}
