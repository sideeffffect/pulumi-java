// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wisdom.AssistantArgs;
import com.pulumi.awsnative.wisdom.enums.AssistantType;
import com.pulumi.awsnative.wisdom.outputs.AssistantServerSideEncryptionConfiguration;
import com.pulumi.awsnative.wisdom.outputs.AssistantTag;
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
 * Definition of AWS::Wisdom::Assistant Resource Type
 * 
 */
@ResourceType(type="aws-native:wisdom:Assistant")
public class Assistant extends CustomResource {
    @Export(name="assistantArn", type=String.class, parameters={})
    private Output<String> assistantArn;

    public Output<String> assistantArn() {
        return this.assistantArn;
    }
    @Export(name="assistantId", type=String.class, parameters={})
    private Output<String> assistantId;

    public Output<String> assistantId() {
        return this.assistantId;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="serverSideEncryptionConfiguration", type=AssistantServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ AssistantServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    public Output<Optional<AssistantServerSideEncryptionConfiguration>> serverSideEncryptionConfiguration() {
        return Codegen.optional(this.serverSideEncryptionConfiguration);
    }
    @Export(name="tags", type=List.class, parameters={AssistantTag.class})
    private Output</* @Nullable */ List<AssistantTag>> tags;

    public Output<Optional<List<AssistantTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="type", type=AssistantType.class, parameters={})
    private Output<AssistantType> type;

    public Output<AssistantType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Assistant(String name) {
        this(name, AssistantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Assistant(String name, AssistantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Assistant(String name, AssistantArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:wisdom:Assistant", name, args == null ? AssistantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Assistant(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:wisdom:Assistant", name, null, makeResourceOptions(options, id));
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
    public static Assistant get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Assistant(name, id, options);
    }
}
