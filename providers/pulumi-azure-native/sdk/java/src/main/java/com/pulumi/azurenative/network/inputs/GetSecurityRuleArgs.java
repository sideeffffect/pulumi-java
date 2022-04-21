// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityRuleArgs Empty = new GetSecurityRuleArgs();

    /**
     * The name of the network security group.
     * 
     */
    @Import(name="networkSecurityGroupName", required=true)
    private String networkSecurityGroupName;

    public String networkSecurityGroupName() {
        return this.networkSecurityGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the security rule.
     * 
     */
    @Import(name="securityRuleName", required=true)
    private String securityRuleName;

    public String securityRuleName() {
        return this.securityRuleName;
    }

    private GetSecurityRuleArgs() {}

    private GetSecurityRuleArgs(GetSecurityRuleArgs $) {
        this.networkSecurityGroupName = $.networkSecurityGroupName;
        this.resourceGroupName = $.resourceGroupName;
        this.securityRuleName = $.securityRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityRuleArgs $;

        public Builder() {
            $ = new GetSecurityRuleArgs();
        }

        public Builder(GetSecurityRuleArgs defaults) {
            $ = new GetSecurityRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkSecurityGroupName(String networkSecurityGroupName) {
            $.networkSecurityGroupName = networkSecurityGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder securityRuleName(String securityRuleName) {
            $.securityRuleName = securityRuleName;
            return this;
        }

        public GetSecurityRuleArgs build() {
            $.networkSecurityGroupName = Objects.requireNonNull($.networkSecurityGroupName, "expected parameter 'networkSecurityGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.securityRuleName = Objects.requireNonNull($.securityRuleName, "expected parameter 'securityRuleName' to be non-null");
            return $;
        }
    }

}
