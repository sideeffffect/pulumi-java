// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.refactorspaces;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.refactorspaces.RouteArgs;
import com.pulumi.awsnative.refactorspaces.enums.RouteType;
import com.pulumi.awsnative.refactorspaces.outputs.RouteTag;
import com.pulumi.awsnative.refactorspaces.outputs.RouteUriPathRouteInput;
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
 * Definition of AWS::RefactorSpaces::Route Resource Type
 * 
 */
@ResourceType(type="aws-native:refactorspaces:Route")
public class Route extends CustomResource {
    @Export(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> applicationIdentifier() {
        return this.applicationIdentifier;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="environmentIdentifier", type=String.class, parameters={})
    private Output<String> environmentIdentifier;

    public Output<String> environmentIdentifier() {
        return this.environmentIdentifier;
    }
    @Export(name="pathResourceToId", type=String.class, parameters={})
    private Output<String> pathResourceToId;

    public Output<String> pathResourceToId() {
        return this.pathResourceToId;
    }
    @Export(name="routeIdentifier", type=String.class, parameters={})
    private Output<String> routeIdentifier;

    public Output<String> routeIdentifier() {
        return this.routeIdentifier;
    }
    @Export(name="routeType", type=RouteType.class, parameters={})
    private Output</* @Nullable */ RouteType> routeType;

    public Output<Optional<RouteType>> routeType() {
        return Codegen.optional(this.routeType);
    }
    @Export(name="serviceIdentifier", type=String.class, parameters={})
    private Output<String> serviceIdentifier;

    public Output<String> serviceIdentifier() {
        return this.serviceIdentifier;
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Export(name="tags", type=List.class, parameters={RouteTag.class})
    private Output</* @Nullable */ List<RouteTag>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Output<Optional<List<RouteTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="uriPathRoute", type=RouteUriPathRouteInput.class, parameters={})
    private Output</* @Nullable */ RouteUriPathRouteInput> uriPathRoute;

    public Output<Optional<RouteUriPathRouteInput>> uriPathRoute() {
        return Codegen.optional(this.uriPathRoute);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:refactorspaces:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:refactorspaces:Route", name, null, makeResourceOptions(options, id));
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
    public static Route get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
