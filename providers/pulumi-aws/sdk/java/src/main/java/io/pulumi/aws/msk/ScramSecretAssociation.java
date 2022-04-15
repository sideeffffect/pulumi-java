// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.msk.ScramSecretAssociationArgs;
import io.pulumi.aws.msk.inputs.ScramSecretAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * MSK SCRAM Secret Associations can be imported using the `id` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:msk/scramSecretAssociation:ScramSecretAssociation example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/scramSecretAssociation:ScramSecretAssociation")
public class ScramSecretAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @Export(name="clusterArn", type=String.class, parameters={})
    private Output<String> clusterArn;

    /**
     * @return Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }
    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @Export(name="secretArnLists", type=List.class, parameters={String.class})
    private Output<List<String>> secretArnLists;

    /**
     * @return List of AWS Secrets Manager secret ARNs.
     * 
     */
    public Output<List<String>> secretArnLists() {
        return this.secretArnLists;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScramSecretAssociation(String name) {
        this(name, ScramSecretAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScramSecretAssociation(String name, ScramSecretAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScramSecretAssociation(String name, ScramSecretAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/scramSecretAssociation:ScramSecretAssociation", name, args == null ? ScramSecretAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScramSecretAssociation(String name, Output<String> id, @Nullable ScramSecretAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/scramSecretAssociation:ScramSecretAssociation", name, state, makeResourceOptions(options, id));
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
    public static ScramSecretAssociation get(String name, Output<String> id, @Nullable ScramSecretAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScramSecretAssociation(name, id, state, options);
    }
}
