// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.accessanalyzer.AnalyzerArgs;
import com.pulumi.awsnative.accessanalyzer.outputs.AnalyzerArchiveRule;
import com.pulumi.awsnative.accessanalyzer.outputs.AnalyzerTag;
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
 * The AWS::AccessAnalyzer::Analyzer type specifies an analyzer of the user&#39;s account
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:accessanalyzer:Analyzer")
public class Analyzer extends CustomResource {
    /**
     * Analyzer name
     * 
     */
    @Export(name="analyzerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> analyzerName;

    /**
     * @return Analyzer name
     * 
     */
    public Output<Optional<String>> analyzerName() {
        return Codegen.optional(this.analyzerName);
    }
    @Export(name="archiveRules", type=List.class, parameters={AnalyzerArchiveRule.class})
    private Output</* @Nullable */ List<AnalyzerArchiveRule>> archiveRules;

    public Output<Optional<List<AnalyzerArchiveRule>>> archiveRules() {
        return Codegen.optional(this.archiveRules);
    }
    /**
     * Amazon Resource Name (ARN) of the analyzer
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the analyzer
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AnalyzerTag.class})
    private Output</* @Nullable */ List<AnalyzerTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<AnalyzerTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the analyzer, must be ACCOUNT or ORGANIZATION
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Analyzer(String name) {
        this(name, AnalyzerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Analyzer(String name, AnalyzerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Analyzer(String name, AnalyzerArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:accessanalyzer:Analyzer", name, args == null ? AnalyzerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Analyzer(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:accessanalyzer:Analyzer", name, null, makeResourceOptions(options, id));
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
    public static Analyzer get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Analyzer(name, id, options);
    }
}
