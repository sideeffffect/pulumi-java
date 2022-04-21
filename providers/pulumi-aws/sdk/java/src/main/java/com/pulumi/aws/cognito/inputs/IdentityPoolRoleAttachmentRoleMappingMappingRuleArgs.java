// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs Empty = new IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs();

    /**
     * The claim name that must be present in the token, for example, &#34;isAdmin&#34; or &#34;paid&#34;.
     * 
     */
    @Import(name="claim", required=true)
    private Output<String> claim;

    public Output<String> claim() {
        return this.claim;
    }

    /**
     * The match condition that specifies how closely the claim value in the IdP token must match Value.
     * 
     */
    @Import(name="matchType", required=true)
    private Output<String> matchType;

    public Output<String> matchType() {
        return this.matchType;
    }

    /**
     * The role ARN.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A brief string that the claim must match, for example, &#34;paid&#34; or &#34;yes&#34;.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs() {}

    private IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs(IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs $) {
        this.claim = $.claim;
        this.matchType = $.matchType;
        this.roleArn = $.roleArn;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs $;

        public Builder() {
            $ = new IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs();
        }

        public Builder(IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs defaults) {
            $ = new IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder claim(Output<String> claim) {
            $.claim = claim;
            return this;
        }

        public Builder claim(String claim) {
            return claim(Output.of(claim));
        }

        public Builder matchType(Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs build() {
            $.claim = Objects.requireNonNull($.claim, "expected parameter 'claim' to be non-null");
            $.matchType = Objects.requireNonNull($.matchType, "expected parameter 'matchType' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
