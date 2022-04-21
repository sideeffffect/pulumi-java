// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.IAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final IAMMemberState Empty = new IAMMemberState();

    @Import(name="condition")
    private @Nullable Output<IAMMemberConditionGetArgs> condition;

    public Optional<Output<IAMMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

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
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private IAMMemberState() {}

    private IAMMemberState(IAMMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.orgId = $.orgId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMMemberState $;

        public Builder() {
            $ = new IAMMemberState();
        }

        public Builder(IAMMemberState defaults) {
            $ = new IAMMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<IAMMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(IAMMemberConditionGetArgs condition) {
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

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public IAMMemberState build() {
            return $;
        }
    }

}
