// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    @Import(name="condition")
    private @Nullable Output<IAMMemberConditionArgs> condition;

    public Optional<Output<IAMMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private IAMMemberArgs() {}

    private IAMMemberArgs(IAMMemberArgs $) {
        this.condition = $.condition;
        this.member = $.member;
        this.orgId = $.orgId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMMemberArgs $;

        public Builder() {
            $ = new IAMMemberArgs();
        }

        public Builder(IAMMemberArgs defaults) {
            $ = new IAMMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(IAMMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param orgId The numeric ID of the organization in which you want to manage the audit logging config.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The numeric ID of the organization in which you want to manage the audit logging config.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public IAMMemberArgs build() {
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
