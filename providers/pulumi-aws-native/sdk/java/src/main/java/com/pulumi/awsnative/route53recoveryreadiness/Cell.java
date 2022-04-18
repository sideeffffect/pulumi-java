// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53recoveryreadiness.CellArgs;
import com.pulumi.awsnative.route53recoveryreadiness.outputs.CellTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The API Schema for AWS Route53 Recovery Readiness Cells.
 * 
 */
@ResourceType(type="aws-native:route53recoveryreadiness:Cell")
public class Cell extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the cell.
     * 
     */
    @Export(name="cellArn", type=String.class, parameters={})
    private Output<String> cellArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cell.
     * 
     */
    public Output<String> cellArn() {
        return this.cellArn;
    }
    /**
     * The name of the cell to create.
     * 
     */
    @Export(name="cellName", type=String.class, parameters={})
    private Output<String> cellName;

    /**
     * @return The name of the cell to create.
     * 
     */
    public Output<String> cellName() {
        return this.cellName;
    }
    /**
     * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Regions.
     * 
     */
    @Export(name="cells", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cells;

    /**
     * @return A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Regions.
     * 
     */
    public Output</* @Nullable */ List<String>> cells() {
        return this.cells;
    }
    /**
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
     * 
     */
    @Export(name="parentReadinessScopes", type=List.class, parameters={String.class})
    private Output<List<String>> parentReadinessScopes;

    /**
     * @return The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is a list but currently can have only one element.
     * 
     */
    public Output<List<String>> parentReadinessScopes() {
        return this.parentReadinessScopes;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={CellTag.class})
    private Output</* @Nullable */ List<CellTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output</* @Nullable */ List<CellTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cell(String name) {
        this(name, CellArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cell(String name, @Nullable CellArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cell(String name, @Nullable CellArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:Cell", name, args == null ? CellArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cell(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53recoveryreadiness:Cell", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cell get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cell(name, id, options);
    }
}
