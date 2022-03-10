// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.AccessRights;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueAuthorizationRuleArgs Empty = new QueueAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName")
      private final @Nullable Input<String> authorizationRuleName;

    public Input<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Input.empty() : this.authorizationRuleName;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
      private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * The queue name.
     * 
     */
    @InputImport(name="queueName", required=true)
      private final Input<String> queueName;

    public Input<String> getQueueName() {
        return this.queueName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @InputImport(name="rights", required=true)
      private final Input<List<AccessRights>> rights;

    public Input<List<AccessRights>> getRights() {
        return this.rights;
    }

    public QueueAuthorizationRuleArgs(
        @Nullable Input<String> authorizationRuleName,
        Input<String> namespaceName,
        Input<String> queueName,
        Input<String> resourceGroupName,
        Input<List<AccessRights>> rights) {
        this.authorizationRuleName = authorizationRuleName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.queueName = Objects.requireNonNull(queueName, "expected parameter 'queueName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
    }

    private QueueAuthorizationRuleArgs() {
        this.authorizationRuleName = Input.empty();
        this.namespaceName = Input.empty();
        this.queueName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.rights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationRuleName;
        private Input<String> namespaceName;
        private Input<String> queueName;
        private Input<String> resourceGroupName;
        private Input<List<AccessRights>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.queueName = defaults.queueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rights = defaults.rights;
        }

        public Builder authorizationRuleName(@Nullable Input<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder authorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Input.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder namespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder queueName(Input<String> queueName) {
            this.queueName = Objects.requireNonNull(queueName);
            return this;
        }

        public Builder queueName(String queueName) {
            this.queueName = Input.of(Objects.requireNonNull(queueName));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder rights(Input<List<AccessRights>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder rights(List<AccessRights> rights) {
            this.rights = Input.of(Objects.requireNonNull(rights));
            return this;
        }
        public QueueAuthorizationRuleArgs build() {
            return new QueueAuthorizationRuleArgs(authorizationRuleName, namespaceName, queueName, resourceGroupName, rights);
        }
    }
}
