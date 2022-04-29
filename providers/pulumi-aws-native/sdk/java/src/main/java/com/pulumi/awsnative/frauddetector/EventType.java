// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.frauddetector.EventTypeArgs;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeEntityType;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeEventVariable;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeLabel;
import com.pulumi.awsnative.frauddetector.outputs.EventTypeTag;
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
 * A resource schema for an EventType in Amazon Fraud Detector.
 * 
 */
@ResourceType(type="aws-native:frauddetector:EventType")
public class EventType extends CustomResource {
    /**
     * The ARN of the event type.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the event type.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The time when the event type was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The time when the event type was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The description of the event type.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the event type.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="entityTypes", type=List.class, parameters={EventTypeEntityType.class})
    private Output<List<EventTypeEntityType>> entityTypes;

    public Output<List<EventTypeEntityType>> entityTypes() {
        return this.entityTypes;
    }
    @Export(name="eventVariables", type=List.class, parameters={EventTypeEventVariable.class})
    private Output<List<EventTypeEventVariable>> eventVariables;

    public Output<List<EventTypeEventVariable>> eventVariables() {
        return this.eventVariables;
    }
    @Export(name="labels", type=List.class, parameters={EventTypeLabel.class})
    private Output<List<EventTypeLabel>> labels;

    public Output<List<EventTypeLabel>> labels() {
        return this.labels;
    }
    /**
     * The time when the event type was last updated.
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return The time when the event type was last updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * The name for the event type
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the event type
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tags associated with this event type.
     * 
     */
    @Export(name="tags", type=List.class, parameters={EventTypeTag.class})
    private Output</* @Nullable */ List<EventTypeTag>> tags;

    /**
     * @return Tags associated with this event type.
     * 
     */
    public Output<Optional<List<EventTypeTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventType(String name) {
        this(name, EventTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventType(String name, EventTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventType(String name, EventTypeArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:frauddetector:EventType", name, args == null ? EventTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventType(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:frauddetector:EventType", name, null, makeResourceOptions(options, id));
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
    public static EventType get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new EventType(name, id, options);
    }
}
