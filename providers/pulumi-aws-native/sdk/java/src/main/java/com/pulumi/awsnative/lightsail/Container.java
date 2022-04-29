// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.lightsail.ContainerArgs;
import com.pulumi.awsnative.lightsail.outputs.ContainerPublicDomainName;
import com.pulumi.awsnative.lightsail.outputs.ContainerServiceDeployment;
import com.pulumi.awsnative.lightsail.outputs.ContainerTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lightsail::Container
 * 
 */
@ResourceType(type="aws-native:lightsail:Container")
public class Container extends CustomResource {
    @Export(name="containerArn", type=String.class, parameters={})
    private Output<String> containerArn;

    public Output<String> containerArn() {
        return this.containerArn;
    }
    /**
     * Describes a container deployment configuration of an Amazon Lightsail container service.
     * 
     */
    @Export(name="containerServiceDeployment", type=ContainerServiceDeployment.class, parameters={})
    private Output</* @Nullable */ ContainerServiceDeployment> containerServiceDeployment;

    /**
     * @return Describes a container deployment configuration of an Amazon Lightsail container service.
     * 
     */
    public Output<Optional<ContainerServiceDeployment>> containerServiceDeployment() {
        return Codegen.optional(this.containerServiceDeployment);
    }
    /**
     * A Boolean value to indicate whether the container service is disabled.
     * 
     */
    @Export(name="isDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDisabled;

    /**
     * @return A Boolean value to indicate whether the container service is disabled.
     * 
     */
    public Output<Optional<Boolean>> isDisabled() {
        return Codegen.optional(this.isDisabled);
    }
    /**
     * The power specification for the container service.
     * 
     */
    @Export(name="power", type=String.class, parameters={})
    private Output<String> power;

    /**
     * @return The power specification for the container service.
     * 
     */
    public Output<String> power() {
        return this.power;
    }
    /**
     * The public domain names to use with the container service, such as example.com and www.example.com.
     * 
     */
    @Export(name="publicDomainNames", type=List.class, parameters={ContainerPublicDomainName.class})
    private Output</* @Nullable */ List<ContainerPublicDomainName>> publicDomainNames;

    /**
     * @return The public domain names to use with the container service, such as example.com and www.example.com.
     * 
     */
    public Output<Optional<List<ContainerPublicDomainName>>> publicDomainNames() {
        return Codegen.optional(this.publicDomainNames);
    }
    /**
     * The scale specification for the container service.
     * 
     */
    @Export(name="scale", type=Integer.class, parameters={})
    private Output<Integer> scale;

    /**
     * @return The scale specification for the container service.
     * 
     */
    public Output<Integer> scale() {
        return this.scale;
    }
    /**
     * The name for the container service.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return The name for the container service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ContainerTag.class})
    private Output</* @Nullable */ List<ContainerTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<ContainerTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The publicly accessible URL of the container service.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The publicly accessible URL of the container service.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Container(String name) {
        this(name, ContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Container(String name, ContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Container(String name, ContainerArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:lightsail:Container", name, args == null ? ContainerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Container(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:lightsail:Container", name, null, makeResourceOptions(options, id));
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
    public static Container get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Container(name, id, options);
    }
}
