// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wafv2.RegexPatternSetArgs;
import com.pulumi.awsnative.wafv2.enums.RegexPatternSetScope;
import com.pulumi.awsnative.wafv2.outputs.RegexPatternSetTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
 * 
 */
@ResourceType(type="aws-native:wafv2:RegexPatternSet")
public class RegexPatternSet extends CustomResource {
    /**
     * ARN of the WAF entity.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the WAF entity.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the entity.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the entity.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the RegexPatternSet.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the RegexPatternSet.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    @Export(name="regularExpressionList", type=List.class, parameters={String.class})
    private Output<List<String>> regularExpressionList;

    public Output<List<String>> regularExpressionList() {
        return this.regularExpressionList;
    }
    /**
     * Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    @Export(name="scope", type=RegexPatternSetScope.class, parameters={})
    private Output<RegexPatternSetScope> scope;

    /**
     * @return Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    public Output<RegexPatternSetScope> scope() {
        return this.scope;
    }
    @Export(name="tags", type=List.class, parameters={RegexPatternSetTag.class})
    private Output</* @Nullable */ List<RegexPatternSetTag>> tags;

    public Output<Optional<List<RegexPatternSetTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexPatternSet(String name) {
        this(name, RegexPatternSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexPatternSet(String name, RegexPatternSetArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:wafv2:RegexPatternSet", name, args == null ? RegexPatternSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexPatternSet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:wafv2:RegexPatternSet", name, null, makeResourceOptions(options, id));
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
    public static RegexPatternSet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new RegexPatternSet(name, id, options);
    }
}
