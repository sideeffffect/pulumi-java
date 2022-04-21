// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPolicyArgs Empty = new UserPolicyArgs();

    /**
     * The name of the policy. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    /**
     * IAM user to which to attach this policy.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    public Output<String> user() {
        return this.user;
    }

    private UserPolicyArgs() {}

    private UserPolicyArgs(UserPolicyArgs $) {
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.policy = $.policy;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPolicyArgs $;

        public Builder() {
            $ = new UserPolicyArgs();
        }

        public Builder(UserPolicyArgs defaults) {
            $ = new UserPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        public Builder user(String user) {
            return user(Output.of(user));
        }

        public UserPolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}
