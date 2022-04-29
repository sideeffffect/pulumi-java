// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTagIamMemberState extends ResourceArgs {

    public static final PolicyTagIamMemberState Empty = new PolicyTagIamMemberState();

    @Import(name="condition")
    private @Nullable Output<PolicyTagIamMemberConditionArgs> condition;

    public Optional<Output<PolicyTagIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="policyTag")
    private @Nullable Output<String> policyTag;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> policyTag() {
        return Optional.ofNullable(this.policyTag);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private PolicyTagIamMemberState() {}

    private PolicyTagIamMemberState(PolicyTagIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.policyTag = $.policyTag;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagIamMemberState $;

        public Builder() {
            $ = new PolicyTagIamMemberState();
        }

        public Builder(PolicyTagIamMemberState defaults) {
            $ = new PolicyTagIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<PolicyTagIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(PolicyTagIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
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

        /**
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(@Nullable Output<String> policyTag) {
            $.policyTag = policyTag;
            return this;
        }

        /**
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(String policyTag) {
            return policyTag(Output.of(policyTag));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public PolicyTagIamMemberState build() {
            return $;
        }
    }

}
