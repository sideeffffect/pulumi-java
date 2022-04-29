// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.NetworkInsightsAnalysisArgs;
import com.pulumi.awsnative.ec2.enums.NetworkInsightsAnalysisStatus;
import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAlternatePathHint;
import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisExplanation;
import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPathComponent;
import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::EC2::NetworkInsightsAnalysis
 * 
 */
@ResourceType(type="aws-native:ec2:NetworkInsightsAnalysis")
public class NetworkInsightsAnalysis extends CustomResource {
    @Export(name="alternatePathHints", type=List.class, parameters={NetworkInsightsAnalysisAlternatePathHint.class})
    private Output<List<NetworkInsightsAnalysisAlternatePathHint>> alternatePathHints;

    public Output<List<NetworkInsightsAnalysisAlternatePathHint>> alternatePathHints() {
        return this.alternatePathHints;
    }
    @Export(name="explanations", type=List.class, parameters={NetworkInsightsAnalysisExplanation.class})
    private Output<List<NetworkInsightsAnalysisExplanation>> explanations;

    public Output<List<NetworkInsightsAnalysisExplanation>> explanations() {
        return this.explanations;
    }
    @Export(name="filterInArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> filterInArns;

    public Output<Optional<List<String>>> filterInArns() {
        return Codegen.optional(this.filterInArns);
    }
    @Export(name="forwardPathComponents", type=List.class, parameters={NetworkInsightsAnalysisPathComponent.class})
    private Output<List<NetworkInsightsAnalysisPathComponent>> forwardPathComponents;

    public Output<List<NetworkInsightsAnalysisPathComponent>> forwardPathComponents() {
        return this.forwardPathComponents;
    }
    @Export(name="networkInsightsAnalysisArn", type=String.class, parameters={})
    private Output<String> networkInsightsAnalysisArn;

    public Output<String> networkInsightsAnalysisArn() {
        return this.networkInsightsAnalysisArn;
    }
    @Export(name="networkInsightsAnalysisId", type=String.class, parameters={})
    private Output<String> networkInsightsAnalysisId;

    public Output<String> networkInsightsAnalysisId() {
        return this.networkInsightsAnalysisId;
    }
    @Export(name="networkInsightsPathId", type=String.class, parameters={})
    private Output<String> networkInsightsPathId;

    public Output<String> networkInsightsPathId() {
        return this.networkInsightsPathId;
    }
    @Export(name="networkPathFound", type=Boolean.class, parameters={})
    private Output<Boolean> networkPathFound;

    public Output<Boolean> networkPathFound() {
        return this.networkPathFound;
    }
    @Export(name="returnPathComponents", type=List.class, parameters={NetworkInsightsAnalysisPathComponent.class})
    private Output<List<NetworkInsightsAnalysisPathComponent>> returnPathComponents;

    public Output<List<NetworkInsightsAnalysisPathComponent>> returnPathComponents() {
        return this.returnPathComponents;
    }
    @Export(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    public Output<String> startDate() {
        return this.startDate;
    }
    @Export(name="status", type=NetworkInsightsAnalysisStatus.class, parameters={})
    private Output<NetworkInsightsAnalysisStatus> status;

    public Output<NetworkInsightsAnalysisStatus> status() {
        return this.status;
    }
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    @Export(name="tags", type=List.class, parameters={NetworkInsightsAnalysisTag.class})
    private Output</* @Nullable */ List<NetworkInsightsAnalysisTag>> tags;

    public Output<Optional<List<NetworkInsightsAnalysisTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInsightsAnalysis(String name) {
        this(name, NetworkInsightsAnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInsightsAnalysis(String name, NetworkInsightsAnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInsightsAnalysis(String name, NetworkInsightsAnalysisArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAnalysis", name, args == null ? NetworkInsightsAnalysisArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkInsightsAnalysis(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:ec2:NetworkInsightsAnalysis", name, null, makeResourceOptions(options, id));
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
    public static NetworkInsightsAnalysis get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new NetworkInsightsAnalysis(name, id, options);
    }
}
