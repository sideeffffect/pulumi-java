// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkehub.MembershipArgs;
import com.pulumi.gcp.gkehub.inputs.MembershipState;
import com.pulumi.gcp.gkehub.outputs.MembershipAuthority;
import com.pulumi.gcp.gkehub.outputs.MembershipEndpoint;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Membership contains information about a member cluster.
 * 
 * To get more information about Membership, see:
 * 
 * * [API documentation](https://cloud.google.com/anthos/multicluster-management/reference/rest/v1/projects.locations.memberships)
 * * How-to Guides
 *     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Membership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membership:Membership default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/membership:Membership")
public class Membership extends CustomResource {
    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @Export(name="authority", type=MembershipAuthority.class, parameters={})
    private Output</* @Nullable */ MembershipAuthority> authority;

    /**
     * @return Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    public Output<Optional<MembershipAuthority>> authority() {
        return Codegen.optional(this.authority);
    }
    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Export(name="endpoint", type=MembershipEndpoint.class, parameters={})
    private Output</* @Nullable */ MembershipEndpoint> endpoint;

    /**
     * @return If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    public Output<Optional<MembershipEndpoint>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * Labels to apply to this membership.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this membership.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The client-provided identifier of the membership.
     * 
     */
    @Export(name="membershipId", type=String.class, parameters={})
    private Output<String> membershipId;

    /**
     * @return The client-provided identifier of the membership.
     * 
     */
    public Output<String> membershipId() {
        return this.membershipId;
    }
    /**
     * The unique identifier of the membership.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the membership.
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
    public Membership(String name) {
        this(name, MembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Membership(String name, MembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Membership(String name, MembershipArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Membership(String name, Output<String> id, @Nullable MembershipState state, @Nullable CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Membership get(String name, Output<String> id, @Nullable MembershipState state, @Nullable CustomResourceOptions options) {
        return new Membership(name, id, state, options);
    }
}
