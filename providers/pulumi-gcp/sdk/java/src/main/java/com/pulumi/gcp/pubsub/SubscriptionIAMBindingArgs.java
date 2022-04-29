// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionIAMBindingArgs extends ResourceArgs {

    public static final SubscriptionIAMBindingArgs Empty = new SubscriptionIAMBindingArgs();

    @Import(name="condition")
    private @Nullable Output<SubscriptionIAMBindingConditionArgs> condition;

    public Optional<Output<SubscriptionIAMBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The subscription name or id to bind to attach IAM policy to.
     * 
     */
    @Import(name="subscription", required=true)
    private Output<String> subscription;

    /**
     * @return The subscription name or id to bind to attach IAM policy to.
     * 
     */
    public Output<String> subscription() {
        return this.subscription;
    }

    private SubscriptionIAMBindingArgs() {}

    private SubscriptionIAMBindingArgs(SubscriptionIAMBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.project = $.project;
        this.role = $.role;
        this.subscription = $.subscription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionIAMBindingArgs $;

        public Builder() {
            $ = new SubscriptionIAMBindingArgs();
        }

        public Builder(SubscriptionIAMBindingArgs defaults) {
            $ = new SubscriptionIAMBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<SubscriptionIAMBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(SubscriptionIAMBindingConditionArgs condition) {
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
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
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
         * `gcp.pubsub.SubscriptionIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(Output<String> subscription) {
            $.subscription = subscription;
            return this;
        }

        /**
         * @param subscription The subscription name or id to bind to attach IAM policy to.
         * 
         * @return builder
         * 
         */
        public Builder subscription(String subscription) {
            return subscription(Output.of(subscription));
        }

        public SubscriptionIAMBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.subscription = Objects.requireNonNull($.subscription, "expected parameter 'subscription' to be non-null");
            return $;
        }
    }

}
