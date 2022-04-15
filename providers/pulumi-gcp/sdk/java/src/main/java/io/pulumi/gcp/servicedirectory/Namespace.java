// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicedirectory.NamespaceArgs;
import io.pulumi.gcp.servicedirectory.inputs.NamespaceState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A container for `services`. Namespaces allow administrators to group services
 * together and define permissions for a collection of services.
 * 
 * To get more information about Namespace, see:
 * 
 * * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1beta1/projects.locations.namespaces)
 * * How-to Guides
 *     * [Configuring a namespace](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_a_namespace)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Namespace can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/namespace:Namespace default projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/namespace:Namespace default {{project}}/{{location}}/{{namespace_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/namespace:Namespace default {{location}}/{{namespace_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:servicedirectory/namespace:Namespace")
public class Namespace extends io.pulumi.resources.CustomResource {
    /**
     * Resource labels associated with this Namespace. No more than 64 user
     * labels can be associated with a given resource. Label keys and values can
     * be no longer than 63 characters.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels associated with this Namespace. No more than 64 user
     * labels can be associated with a given resource. Label keys and values can
     * be no longer than 63 characters.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The location for the Namespace.
     * A full list of valid locations can be found by running
     * `gcloud beta service-directory locations list`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the Namespace.
     * A full list of valid locations can be found by running
     * `gcloud beta service-directory locations list`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name for the namespace in the format 'projects/*{@literal /}locations/*{@literal /}namespaces/*'.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the namespace in the format 'projects/*{@literal /}locations/*{@literal /}namespaces/*'.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/namespace:Namespace", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Namespace get(String name, Output<String> id, @Nullable NamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
