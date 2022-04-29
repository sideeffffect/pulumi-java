// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.codeartifact;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.codeartifact.DomainArgs;
import com.pulumi.awsnative.codeartifact.outputs.DomainTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The resource schema to create a CodeArtifact domain.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:codeartifact:Domain")
public class Domain extends CustomResource {
    /**
     * The ARN of the domain.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the domain.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * 
     */
    @Export(name="encryptionKey", type=String.class, parameters={})
    private Output<String> encryptionKey;

    /**
     * @return The ARN of an AWS Key Management Service (AWS KMS) key associated with a domain.
     * 
     */
    public Output<String> encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * The name of the domain. This field is used for GetAtt
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the domain. This field is used for GetAtt
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The 12-digit account ID of the AWS account that owns the domain. This field is used for GetAtt
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The access control resource policy on the provided domain.
     * 
     */
    @Export(name="permissionsPolicyDocument", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> permissionsPolicyDocument;

    /**
     * @return The access control resource policy on the provided domain.
     * 
     */
    public Output<Optional<Object>> permissionsPolicyDocument() {
        return Codegen.optional(this.permissionsPolicyDocument);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DomainTag.class})
    private Output</* @Nullable */ List<DomainTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<DomainTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:codeartifact:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:codeartifact:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
