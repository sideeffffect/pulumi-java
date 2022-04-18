// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ClusterParameterGroupArgs;
import com.pulumi.aws.rds.inputs.ClusterParameterGroupState;
import com.pulumi.aws.rds.outputs.ClusterParameterGroupParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB cluster parameter group resource. Documentation of the available parameters for various Aurora engines can be found at:
 * 
 * * [Aurora MySQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Reference.html)
 * * [Aurora PostgreSQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraPostgreSQL.Reference.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RDS Cluster Parameter Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterParameterGroup:ClusterParameterGroup cluster_pg production-pg-1
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterParameterGroup:ClusterParameterGroup")
public class ClusterParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the db cluster parameter group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the db cluster parameter group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the DB cluster parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the DB cluster parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The family of the DB cluster parameter group.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The family of the DB cluster parameter group.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the DB parameter.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DB parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ClusterParameterGroupParameter.class})
    private Output</* @Nullable */ List<ClusterParameterGroupParameter>> parameters;

    /**
     * @return A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     * 
     */
    public Output</* @Nullable */ List<ClusterParameterGroupParameter>> parameters() {
        return this.parameters;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterParameterGroup(String name) {
        this(name, ClusterParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterParameterGroup:ClusterParameterGroup", name, args == null ? ClusterParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterParameterGroup(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterParameterGroup:ClusterParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ClusterParameterGroup get(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterParameterGroup(name, id, state, options);
    }
}
