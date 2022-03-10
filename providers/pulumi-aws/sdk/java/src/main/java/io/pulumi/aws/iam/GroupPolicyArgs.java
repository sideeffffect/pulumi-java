// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupPolicyArgs Empty = new GroupPolicyArgs();

    /**
     * The IAM group to attach to the policy.
     * 
     */
    @InputImport(name="group", required=true)
      private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * The name of the policy. If omitted, this provider will
     * assign a random, unique name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public GroupPolicyArgs(
        Input<String> group,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        Input<String> policy) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.name = name;
        this.namePrefix = namePrefix;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private GroupPolicyArgs() {
        this.group = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> group;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.policy = defaults.policy;
        }

        public Builder group(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder group(String group) {
            this.group = Input.of(Objects.requireNonNull(group));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder policy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public GroupPolicyArgs build() {
            return new GroupPolicyArgs(group, name, namePrefix, policy);
        }
    }
}
