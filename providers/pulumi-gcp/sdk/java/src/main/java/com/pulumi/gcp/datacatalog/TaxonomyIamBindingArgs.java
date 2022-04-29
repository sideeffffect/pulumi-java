// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaxonomyIamBindingArgs extends ResourceArgs {

    public static final TaxonomyIamBindingArgs Empty = new TaxonomyIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<TaxonomyIamBindingConditionArgs> condition;

    public Optional<Output<TaxonomyIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taxonomy", required=true)
    private Output<String> taxonomy;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> taxonomy() {
        return this.taxonomy;
    }

    private TaxonomyIamBindingArgs() {}

    private TaxonomyIamBindingArgs(TaxonomyIamBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
        this.taxonomy = $.taxonomy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaxonomyIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaxonomyIamBindingArgs $;

        public Builder() {
            $ = new TaxonomyIamBindingArgs();
        }

        public Builder(TaxonomyIamBindingArgs defaults) {
            $ = new TaxonomyIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TaxonomyIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TaxonomyIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
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

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.TaxonomyIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param taxonomy Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder taxonomy(Output<String> taxonomy) {
            $.taxonomy = taxonomy;
            return this;
        }

        /**
         * @param taxonomy Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder taxonomy(String taxonomy) {
            return taxonomy(Output.of(taxonomy));
        }

        public TaxonomyIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.taxonomy = Objects.requireNonNull($.taxonomy, "expected parameter 'taxonomy' to be non-null");
            return $;
        }
    }

}
