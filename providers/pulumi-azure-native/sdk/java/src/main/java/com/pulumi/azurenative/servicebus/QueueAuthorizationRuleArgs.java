// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.servicebus.enums.AccessRights;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueAuthorizationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueAuthorizationRuleArgs Empty = new QueueAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @Import(name="authorizationRuleName")
    private @Nullable Output<String> authorizationRuleName;

    public Optional<Output<String>> authorizationRuleName() {
        return Optional.ofNullable(this.authorizationRuleName);
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="queueName", required=true)
    private Output<String> queueName;

    public Output<String> queueName() {
        return this.queueName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @Import(name="rights", required=true)
    private Output<List<AccessRights>> rights;

    public Output<List<AccessRights>> rights() {
        return this.rights;
    }

    private QueueAuthorizationRuleArgs() {}

    private QueueAuthorizationRuleArgs(QueueAuthorizationRuleArgs $) {
        this.authorizationRuleName = $.authorizationRuleName;
        this.namespaceName = $.namespaceName;
        this.queueName = $.queueName;
        this.resourceGroupName = $.resourceGroupName;
        this.rights = $.rights;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueAuthorizationRuleArgs $;

        public Builder() {
            $ = new QueueAuthorizationRuleArgs();
        }

        public Builder(QueueAuthorizationRuleArgs defaults) {
            $ = new QueueAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationRuleName(@Nullable Output<String> authorizationRuleName) {
            $.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder authorizationRuleName(String authorizationRuleName) {
            return authorizationRuleName(Output.of(authorizationRuleName));
        }

        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        public Builder queueName(Output<String> queueName) {
            $.queueName = queueName;
            return this;
        }

        public Builder queueName(String queueName) {
            return queueName(Output.of(queueName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder rights(Output<List<AccessRights>> rights) {
            $.rights = rights;
            return this;
        }

        public Builder rights(List<AccessRights> rights) {
            return rights(Output.of(rights));
        }

        public Builder rights(AccessRights... rights) {
            return rights(List.of(rights));
        }

        public QueueAuthorizationRuleArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.queueName = Objects.requireNonNull($.queueName, "expected parameter 'queueName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.rights = Objects.requireNonNull($.rights, "expected parameter 'rights' to be non-null");
            return $;
        }
    }

}
