// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListDisasterRecoveryConfigKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListDisasterRecoveryConfigKeysArgs Empty = new ListDisasterRecoveryConfigKeysArgs();

    /**
     * The Disaster Recovery configuration name
     * 
     */
    @Import(name="alias", required=true)
    private String alias;

    public String alias() {
        return this.alias;
    }

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName", required=true)
    private String authorizationRuleName;

    public String authorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListDisasterRecoveryConfigKeysArgs() {}

    private ListDisasterRecoveryConfigKeysArgs(ListDisasterRecoveryConfigKeysArgs $) {
        this.alias = $.alias;
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListDisasterRecoveryConfigKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListDisasterRecoveryConfigKeysArgs $;

        public Builder() {
            $ = new ListDisasterRecoveryConfigKeysArgs();
        }

        public Builder(ListDisasterRecoveryConfigKeysArgs defaults) {
            $ = new ListDisasterRecoveryConfigKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder alias(String alias) {
            $.alias = alias;
            return this;
        }

        public Builder authorizationRuleName(String authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListDisasterRecoveryConfigKeysArgs build() {
            $.alias = Objects.requireNonNull($.alias, "expected parameter 'alias' to be non-null");
            $.authorizationRuleName = Objects.requireNonNull($.authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
