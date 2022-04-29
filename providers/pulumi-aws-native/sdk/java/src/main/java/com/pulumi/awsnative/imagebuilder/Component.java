// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.imagebuilder.ComponentArgs;
import com.pulumi.awsnative.imagebuilder.enums.ComponentPlatform;
import com.pulumi.awsnative.imagebuilder.enums.ComponentType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::Component
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:imagebuilder:Component")
public class Component extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the component.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the component.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The change description of the component.
     * 
     */
    @Export(name="changeDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> changeDescription;

    /**
     * @return The change description of the component.
     * 
     */
    public Output<Optional<String>> changeDescription() {
        return Codegen.optional(this.changeDescription);
    }
    /**
     * The data of the component.
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output</* @Nullable */ String> data;

    /**
     * @return The data of the component.
     * 
     */
    public Output<Optional<String>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * The description of the component.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the component.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The encryption status of the component.
     * 
     */
    @Export(name="encrypted", type=Boolean.class, parameters={})
    private Output<Boolean> encrypted;

    /**
     * @return The encryption status of the component.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * The KMS key identifier used to encrypt the component.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The KMS key identifier used to encrypt the component.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * The name of the component.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the component.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The platform of the component.
     * 
     */
    @Export(name="platform", type=ComponentPlatform.class, parameters={})
    private Output<ComponentPlatform> platform;

    /**
     * @return The platform of the component.
     * 
     */
    public Output<ComponentPlatform> platform() {
        return this.platform;
    }
    /**
     * The operating system (OS) version supported by the component.
     * 
     */
    @Export(name="supportedOsVersions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedOsVersions;

    /**
     * @return The operating system (OS) version supported by the component.
     * 
     */
    public Output<Optional<List<String>>> supportedOsVersions() {
        return Codegen.optional(this.supportedOsVersions);
    }
    /**
     * The tags associated with the component.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags associated with the component.
     * 
     */
    public Output<Optional<Object>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    @Export(name="type", type=ComponentType.class, parameters={})
    private Output<ComponentType> type;

    /**
     * @return The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    public Output<ComponentType> type() {
        return this.type;
    }
    /**
     * The uri of the component.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return The uri of the component.
     * 
     */
    public Output<Optional<String>> uri() {
        return Codegen.optional(this.uri);
    }
    /**
     * The version of the component.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the component.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Component(String name) {
        this(name, ComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Component(String name, ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, ComponentArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:imagebuilder:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Component(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:imagebuilder:Component", name, null, makeResourceOptions(options, id));
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
    public static Component get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}
