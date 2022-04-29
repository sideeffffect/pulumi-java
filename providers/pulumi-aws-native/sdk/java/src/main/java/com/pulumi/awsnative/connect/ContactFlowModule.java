// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.connect.ContactFlowModuleArgs;
import com.pulumi.awsnative.connect.enums.ContactFlowModuleState;
import com.pulumi.awsnative.connect.enums.ContactFlowModuleStatus;
import com.pulumi.awsnative.connect.outputs.ContactFlowModuleTag;
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
 * Resource Type definition for AWS::Connect::ContactFlowModule.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:connect:ContactFlowModule")
public class ContactFlowModule extends CustomResource {
    /**
     * The identifier of the contact flow module (ARN).
     * 
     */
    @Export(name="contactFlowModuleArn", type=String.class, parameters={})
    private Output<String> contactFlowModuleArn;

    /**
     * @return The identifier of the contact flow module (ARN).
     * 
     */
    public Output<String> contactFlowModuleArn() {
        return this.contactFlowModuleArn;
    }
    /**
     * The content of the contact flow module in JSON format.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The content of the contact flow module in JSON format.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The description of the contact flow module.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the contact flow module.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The identifier of the Amazon Connect instance (ARN).
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }
    /**
     * The name of the contact flow module.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the contact flow module.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The state of the contact flow module.
     * 
     */
    @Export(name="state", type=ContactFlowModuleState.class, parameters={})
    private Output</* @Nullable */ ContactFlowModuleState> state;

    /**
     * @return The state of the contact flow module.
     * 
     */
    public Output<Optional<ContactFlowModuleState>> state() {
        return Codegen.optional(this.state);
    }
    /**
     * The status of the contact flow module.
     * 
     */
    @Export(name="status", type=ContactFlowModuleStatus.class, parameters={})
    private Output<ContactFlowModuleStatus> status;

    /**
     * @return The status of the contact flow module.
     * 
     */
    public Output<ContactFlowModuleStatus> status() {
        return this.status;
    }
    /**
     * One or more tags.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ContactFlowModuleTag.class})
    private Output</* @Nullable */ List<ContactFlowModuleTag>> tags;

    /**
     * @return One or more tags.
     * 
     */
    public Output<Optional<List<ContactFlowModuleTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactFlowModule(String name) {
        this(name, ContactFlowModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactFlowModule(String name, ContactFlowModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactFlowModule(String name, ContactFlowModuleArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:connect:ContactFlowModule", name, args == null ? ContactFlowModuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactFlowModule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:connect:ContactFlowModule", name, null, makeResourceOptions(options, id));
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
    public static ContactFlowModule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ContactFlowModule(name, id, options);
    }
}
