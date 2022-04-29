// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs;
import com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MembershipArgs extends ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @Import(name="authority")
    private @Nullable Output<MembershipAuthorityArgs> authority;

    /**
     * @return Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    public Optional<Output<MembershipAuthorityArgs>> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<MembershipEndpointArgs> endpoint;

    /**
     * @return If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<MembershipEndpointArgs>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Labels to apply to this membership.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this membership.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The client-provided identifier of the membership.
     * 
     */
    @Import(name="membershipId", required=true)
    private Output<String> membershipId;

    /**
     * @return The client-provided identifier of the membership.
     * 
     */
    public Output<String> membershipId() {
        return this.membershipId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private MembershipArgs() {}

    private MembershipArgs(MembershipArgs $) {
        this.authority = $.authority;
        this.description = $.description;
        this.endpoint = $.endpoint;
        this.labels = $.labels;
        this.membershipId = $.membershipId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipArgs $;

        public Builder() {
            $ = new MembershipArgs();
        }

        public Builder(MembershipArgs defaults) {
            $ = new MembershipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authority Authority encodes how Google will recognize identities from this Membership.
         * See the workload identity documentation for more details:
         * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authority(@Nullable Output<MembershipAuthorityArgs> authority) {
            $.authority = authority;
            return this;
        }

        /**
         * @param authority Authority encodes how Google will recognize identities from this Membership.
         * See the workload identity documentation for more details:
         * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authority(MembershipAuthorityArgs authority) {
            return authority(Output.of(authority));
        }

        /**
         * @param description The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
         * 
         */
        @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
         * 
         */
        @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<MembershipEndpointArgs> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(MembershipEndpointArgs endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param labels Labels to apply to this membership.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this membership.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param membershipId The client-provided identifier of the membership.
         * 
         * @return builder
         * 
         */
        public Builder membershipId(Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        /**
         * @param membershipId The client-provided identifier of the membership.
         * 
         * @return builder
         * 
         */
        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public MembershipArgs build() {
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}
