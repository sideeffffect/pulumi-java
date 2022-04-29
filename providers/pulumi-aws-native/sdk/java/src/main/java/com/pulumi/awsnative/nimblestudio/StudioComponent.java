// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.nimblestudio.StudioComponentArgs;
import com.pulumi.awsnative.nimblestudio.enums.StudioComponentSubtype;
import com.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentConfiguration;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentInitializationScript;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentScriptParameterKeyValue;
import com.pulumi.awsnative.nimblestudio.outputs.StudioComponentTags;
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
 * Represents a studio component which connects a non-Nimble Studio resource in your account to your studio
 * 
 */
@ResourceType(type="aws-native:nimblestudio:StudioComponent")
public class StudioComponent extends CustomResource {
    @Export(name="configuration", type=StudioComponentConfiguration.class, parameters={})
    private Output</* @Nullable */ StudioComponentConfiguration> configuration;

    public Output<Optional<StudioComponentConfiguration>> configuration() {
        return Codegen.optional(this.configuration);
    }
    /**
     * &lt;p&gt;The description.&lt;/p&gt;
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return &lt;p&gt;The description.&lt;/p&gt;
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * &lt;p&gt;The EC2 security groups that control access to the studio component.&lt;/p&gt;
     * 
     */
    @Export(name="ec2SecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ec2SecurityGroupIds;

    /**
     * @return &lt;p&gt;The EC2 security groups that control access to the studio component.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<String>>> ec2SecurityGroupIds() {
        return Codegen.optional(this.ec2SecurityGroupIds);
    }
    /**
     * &lt;p&gt;Initialization scripts for studio components.&lt;/p&gt;
     * 
     */
    @Export(name="initializationScripts", type=List.class, parameters={StudioComponentInitializationScript.class})
    private Output</* @Nullable */ List<StudioComponentInitializationScript>> initializationScripts;

    /**
     * @return &lt;p&gt;Initialization scripts for studio components.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<StudioComponentInitializationScript>>> initializationScripts() {
        return Codegen.optional(this.initializationScripts);
    }
    /**
     * &lt;p&gt;The name for the studio component.&lt;/p&gt;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return &lt;p&gt;The name for the studio component.&lt;/p&gt;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * &lt;p&gt;Parameters for the studio component scripts.&lt;/p&gt;
     * 
     */
    @Export(name="scriptParameters", type=List.class, parameters={StudioComponentScriptParameterKeyValue.class})
    private Output</* @Nullable */ List<StudioComponentScriptParameterKeyValue>> scriptParameters;

    /**
     * @return &lt;p&gt;Parameters for the studio component scripts.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<StudioComponentScriptParameterKeyValue>>> scriptParameters() {
        return Codegen.optional(this.scriptParameters);
    }
    @Export(name="studioComponentId", type=String.class, parameters={})
    private Output<String> studioComponentId;

    public Output<String> studioComponentId() {
        return this.studioComponentId;
    }
    /**
     * &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    public Output<String> studioId() {
        return this.studioId;
    }
    @Export(name="subtype", type=StudioComponentSubtype.class, parameters={})
    private Output</* @Nullable */ StudioComponentSubtype> subtype;

    public Output<Optional<StudioComponentSubtype>> subtype() {
        return Codegen.optional(this.subtype);
    }
    @Export(name="tags", type=StudioComponentTags.class, parameters={})
    private Output</* @Nullable */ StudioComponentTags> tags;

    public Output<Optional<StudioComponentTags>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="type", type=StudioComponentType.class, parameters={})
    private Output<StudioComponentType> type;

    public Output<StudioComponentType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioComponent(String name) {
        this(name, StudioComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioComponent(String name, StudioComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioComponent(String name, StudioComponentArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:nimblestudio:StudioComponent", name, args == null ? StudioComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StudioComponent(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:nimblestudio:StudioComponent", name, null, makeResourceOptions(options, id));
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
    public static StudioComponent get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new StudioComponent(name, id, options);
    }
}
