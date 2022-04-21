// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIamMemberArgs Empty = new InstanceIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<InstanceIamMemberConditionArgs> condition;

    public Optional<Output<InstanceIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    public Output<String> instance() {
        return this.instance;
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private InstanceIamMemberArgs() {}

    private InstanceIamMemberArgs(InstanceIamMemberArgs $) {
        this.condition = $.condition;
        this.instance = $.instance;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIamMemberArgs $;

        public Builder() {
            $ = new InstanceIamMemberArgs();
        }

        public Builder(InstanceIamMemberArgs defaults) {
            $ = new InstanceIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<InstanceIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(InstanceIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder member(Output<String> member) {
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

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public InstanceIamMemberArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
