// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.frauddetector.DetectorArgs;
import com.pulumi.awsnative.frauddetector.enums.DetectorRuleExecutionMode;
import com.pulumi.awsnative.frauddetector.enums.DetectorVersionStatus;
import com.pulumi.awsnative.frauddetector.outputs.DetectorEventType;
import com.pulumi.awsnative.frauddetector.outputs.DetectorModel;
import com.pulumi.awsnative.frauddetector.outputs.DetectorRule;
import com.pulumi.awsnative.frauddetector.outputs.DetectorTag;
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
 * A resource schema for a Detector in Amazon Fraud Detector.
 * 
 */
@ResourceType(type="aws-native:frauddetector:Detector")
public class Detector extends CustomResource {
    /**
     * The ARN of the detector.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the detector.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The models to associate with this detector.
     * 
     */
    @Export(name="associatedModels", type=List.class, parameters={DetectorModel.class})
    private Output</* @Nullable */ List<DetectorModel>> associatedModels;

    /**
     * @return The models to associate with this detector.
     * 
     */
    public Output<Optional<List<DetectorModel>>> associatedModels() {
        return Codegen.optional(this.associatedModels);
    }
    /**
     * The time when the detector was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The time when the detector was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The description of the detector.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the detector.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the detector
     * 
     */
    @Export(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The ID of the detector
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * The active version ID of the detector
     * 
     */
    @Export(name="detectorVersionId", type=String.class, parameters={})
    private Output<String> detectorVersionId;

    /**
     * @return The active version ID of the detector
     * 
     */
    public Output<String> detectorVersionId() {
        return this.detectorVersionId;
    }
    /**
     * The desired detector version status for the detector
     * 
     */
    @Export(name="detectorVersionStatus", type=DetectorVersionStatus.class, parameters={})
    private Output</* @Nullable */ DetectorVersionStatus> detectorVersionStatus;

    /**
     * @return The desired detector version status for the detector
     * 
     */
    public Output<Optional<DetectorVersionStatus>> detectorVersionStatus() {
        return Codegen.optional(this.detectorVersionStatus);
    }
    /**
     * The event type to associate this detector with.
     * 
     */
    @Export(name="eventType", type=DetectorEventType.class, parameters={})
    private Output<DetectorEventType> eventType;

    /**
     * @return The event type to associate this detector with.
     * 
     */
    public Output<DetectorEventType> eventType() {
        return this.eventType;
    }
    /**
     * The time when the detector was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return The time when the detector was last updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @Export(name="ruleExecutionMode", type=DetectorRuleExecutionMode.class, parameters={})
    private Output</* @Nullable */ DetectorRuleExecutionMode> ruleExecutionMode;

    public Output<Optional<DetectorRuleExecutionMode>> ruleExecutionMode() {
        return Codegen.optional(this.ruleExecutionMode);
    }
    @Export(name="rules", type=List.class, parameters={DetectorRule.class})
    private Output<List<DetectorRule>> rules;

    public Output<List<DetectorRule>> rules() {
        return this.rules;
    }
    /**
     * Tags associated with this detector.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DetectorTag.class})
    private Output</* @Nullable */ List<DetectorTag>> tags;

    /**
     * @return Tags associated with this detector.
     * 
     */
    public Output<Optional<List<DetectorTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Detector(String name) {
        this(name, DetectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Detector(String name, DetectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Detector(String name, DetectorArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:frauddetector:Detector", name, args == null ? DetectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Detector(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:frauddetector:Detector", name, null, makeResourceOptions(options, id));
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
    public static Detector get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Detector(name, id, options);
    }
}
