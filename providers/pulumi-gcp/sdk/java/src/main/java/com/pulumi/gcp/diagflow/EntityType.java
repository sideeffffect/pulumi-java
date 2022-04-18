// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.EntityTypeArgs;
import com.pulumi.gcp.diagflow.inputs.EntityTypeState;
import com.pulumi.gcp.diagflow.outputs.EntityTypeEntity;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an entity type. Entity types serve as a tool for extracting parameter values from natural language queries.
 * 
 * To get more information about EntityType, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/docs/reference/rest/v2/projects.agent.entityTypes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EntityType can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/entityType:EntityType default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/entityType:EntityType")
public class EntityType extends com.pulumi.resources.CustomResource {
    /**
     * The name of this entity type to be displayed on the console.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of this entity type to be displayed on the console.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Export(name="enableFuzzyExtraction", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableFuzzyExtraction;

    /**
     * @return Enables fuzzy entity extraction during classification.
     * 
     */
    public Output</* @Nullable */ Boolean> enableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    @Export(name="entities", type=List.class, parameters={EntityTypeEntity.class})
    private Output</* @Nullable */ List<EntityTypeEntity>> entities;

    /**
     * @return The collection of entity entries associated with the entity type.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<EntityTypeEntity>> entities() {
        return this.entities;
    }
    /**
     * Indicates the kind of entity type.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a reference value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to reference values. However, list entity
     *   types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Indicates the kind of entity type.
     * * KIND_MAP: Map entity types allow mapping of a group of synonyms to a reference value.
     * * KIND_LIST: List entity types contain a set of entries that do not map to reference values. However, list entity
     *   types can contain references to other entity types (with or without aliases).
     * * KIND_REGEXP: Regexp entity types allow to specify regular expressions in entries values.
     *   Possible values are `KIND_MAP`, `KIND_LIST`, and `KIND_REGEXP`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The unique identifier of the entity type. Format: projects/<Project ID>/agent/entityTypes/<Entity type ID>.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the entity type. Format: projects/<Project ID>/agent/entityTypes/<Entity type ID>.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public EntityType(String name) {
        this(name, EntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityType(String name, EntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityType(String name, EntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/entityType:EntityType", name, args == null ? EntityTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntityType(String name, Output<String> id, @Nullable EntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/entityType:EntityType", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static EntityType get(String name, Output<String> id, @Nullable EntityTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntityType(name, id, state, options);
    }
}
