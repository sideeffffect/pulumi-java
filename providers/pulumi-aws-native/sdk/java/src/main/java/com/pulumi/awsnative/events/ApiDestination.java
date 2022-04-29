// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.events.ApiDestinationArgs;
import com.pulumi.awsnative.events.enums.ApiDestinationHttpMethod;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Events::ApiDestination.
 * 
 */
@ResourceType(type="aws-native:events:ApiDestination")
public class ApiDestination extends CustomResource {
    /**
     * The arn of the api destination.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The arn of the api destination.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The arn of the connection.
     * 
     */
    @Export(name="connectionArn", type=String.class, parameters={})
    private Output<String> connectionArn;

    /**
     * @return The arn of the connection.
     * 
     */
    public Output<String> connectionArn() {
        return this.connectionArn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="httpMethod", type=ApiDestinationHttpMethod.class, parameters={})
    private Output<ApiDestinationHttpMethod> httpMethod;

    public Output<ApiDestinationHttpMethod> httpMethod() {
        return this.httpMethod;
    }
    /**
     * Url endpoint to invoke.
     * 
     */
    @Export(name="invocationEndpoint", type=String.class, parameters={})
    private Output<String> invocationEndpoint;

    /**
     * @return Url endpoint to invoke.
     * 
     */
    public Output<String> invocationEndpoint() {
        return this.invocationEndpoint;
    }
    @Export(name="invocationRateLimitPerSecond", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> invocationRateLimitPerSecond;

    public Output<Optional<Integer>> invocationRateLimitPerSecond() {
        return Codegen.optional(this.invocationRateLimitPerSecond);
    }
    /**
     * Name of the apiDestination.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the apiDestination.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiDestination(String name) {
        this(name, ApiDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiDestination(String name, ApiDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiDestination(String name, ApiDestinationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:events:ApiDestination", name, args == null ? ApiDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiDestination(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:events:ApiDestination", name, null, makeResourceOptions(options, id));
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
    public static ApiDestination get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ApiDestination(name, id, options);
    }
}
