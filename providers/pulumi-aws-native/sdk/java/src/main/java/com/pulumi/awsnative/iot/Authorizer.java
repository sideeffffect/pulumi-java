// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iot.AuthorizerArgs;
import com.pulumi.awsnative.iot.enums.AuthorizerStatus;
import com.pulumi.awsnative.iot.outputs.AuthorizerTag;
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
 * Creates an authorizer.
 * 
 */
@ResourceType(type="aws-native:iot:Authorizer")
public class Authorizer extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="authorizerFunctionArn", type=String.class, parameters={})
    private Output<String> authorizerFunctionArn;

    public Output<String> authorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }
    @Export(name="authorizerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerName;

    public Output<Optional<String>> authorizerName() {
        return Codegen.optional(this.authorizerName);
    }
    @Export(name="signingDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> signingDisabled;

    public Output<Optional<Boolean>> signingDisabled() {
        return Codegen.optional(this.signingDisabled);
    }
    @Export(name="status", type=AuthorizerStatus.class, parameters={})
    private Output</* @Nullable */ AuthorizerStatus> status;

    public Output<Optional<AuthorizerStatus>> status() {
        return Codegen.optional(this.status);
    }
    @Export(name="tags", type=List.class, parameters={AuthorizerTag.class})
    private Output</* @Nullable */ List<AuthorizerTag>> tags;

    public Output<Optional<List<AuthorizerTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tokenKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenKeyName;

    public Output<Optional<String>> tokenKeyName() {
        return Codegen.optional(this.tokenKeyName);
    }
    @Export(name="tokenSigningPublicKeys", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tokenSigningPublicKeys;

    public Output<Optional<Object>> tokenSigningPublicKeys() {
        return Codegen.optional(this.tokenSigningPublicKeys);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:iot:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Authorizer(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:iot:Authorizer", name, null, makeResourceOptions(options, id));
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
    public static Authorizer get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Authorizer(name, id, options);
    }
}
