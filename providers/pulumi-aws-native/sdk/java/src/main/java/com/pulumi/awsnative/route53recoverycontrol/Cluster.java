// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53recoverycontrol.ClusterArgs;
import com.pulumi.awsnative.route53recoverycontrol.enums.ClusterStatus;
import com.pulumi.awsnative.route53recoverycontrol.outputs.ClusterEndpoint;
import com.pulumi.awsnative.route53recoverycontrol.outputs.ClusterTag;
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
 * AWS Route53 Recovery Control Cluster resource schema
 * 
 */
@ResourceType(type="aws-native:route53recoverycontrol:Cluster")
public class Cluster extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    @Export(name="clusterArn", type=String.class, parameters={})
    private Output<String> clusterArn;

    /**
     * @return The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }
    /**
     * Endpoints for the cluster.
     * 
     */
    @Export(name="clusterEndpoints", type=List.class, parameters={ClusterEndpoint.class})
    private Output<List<ClusterEndpoint>> clusterEndpoints;

    /**
     * @return Endpoints for the cluster.
     * 
     */
    public Output<List<ClusterEndpoint>> clusterEndpoints() {
        return this.clusterEndpoints;
    }
    /**
     * Name of a Cluster. You can use any non-white space character in the name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of a Cluster. You can use any non-white space character in the name
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    @Export(name="status", type=ClusterStatus.class, parameters={})
    private Output<ClusterStatus> status;

    /**
     * @return Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * 
     */
    public Output<ClusterStatus> status() {
        return this.status;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output<Optional<List<ClusterTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:route53recoverycontrol:Cluster", name, null, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
