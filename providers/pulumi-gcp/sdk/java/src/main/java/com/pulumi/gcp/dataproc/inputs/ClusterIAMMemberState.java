// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIAMMemberState Empty = new ClusterIAMMemberState();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    @Import(name="condition")
    private @Nullable Output<ClusterIAMMemberConditionGetArgs> condition;

    public Optional<Output<ClusterIAMMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the clusters&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ClusterIAMMemberState() {}

    private ClusterIAMMemberState(ClusterIAMMemberState $) {
        this.cluster = $.cluster;
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIAMMemberState $;

        public Builder() {
            $ = new ClusterIAMMemberState();
        }

        public Builder(ClusterIAMMemberState defaults) {
            $ = new ClusterIAMMemberState(Objects.requireNonNull(defaults));
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        public Builder condition(@Nullable Output<ClusterIAMMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(ClusterIAMMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ClusterIAMMemberState build() {
            return $;
        }
    }

}
