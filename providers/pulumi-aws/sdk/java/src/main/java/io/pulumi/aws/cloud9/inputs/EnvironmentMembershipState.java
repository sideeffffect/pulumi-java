// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloud9.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentMembershipState Empty = new EnvironmentMembershipState();

    /**
     * The ID of the environment that contains the environment member you want to add.
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId == null ? Codegen.empty() : this.environmentId;
    }

    /**
     * The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<String> permissions;

    public Output<String> permissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    /**
     * The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    @Import(name="userArn")
      private final @Nullable Output<String> userArn;

    public Output<String> userArn() {
        return this.userArn == null ? Codegen.empty() : this.userArn;
    }

    /**
     * he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    @Import(name="userId")
      private final @Nullable Output<String> userId;

    public Output<String> userId() {
        return this.userId == null ? Codegen.empty() : this.userId;
    }

    public EnvironmentMembershipState(
        @Nullable Output<String> environmentId,
        @Nullable Output<String> permissions,
        @Nullable Output<String> userArn,
        @Nullable Output<String> userId) {
        this.environmentId = environmentId;
        this.permissions = permissions;
        this.userArn = userArn;
        this.userId = userId;
    }

    private EnvironmentMembershipState() {
        this.environmentId = Codegen.empty();
        this.permissions = Codegen.empty();
        this.userArn = Codegen.empty();
        this.userId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> environmentId;
        private @Nullable Output<String> permissions;
        private @Nullable Output<String> userArn;
        private @Nullable Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.permissions = defaults.permissions;
    	      this.userArn = defaults.userArn;
    	      this.userId = defaults.userId;
        }

        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Codegen.ofNullable(environmentId);
            return this;
        }
        public Builder permissions(@Nullable Output<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }
        public Builder userArn(@Nullable Output<String> userArn) {
            this.userArn = userArn;
            return this;
        }
        public Builder userArn(@Nullable String userArn) {
            this.userArn = Codegen.ofNullable(userArn);
            return this;
        }
        public Builder userId(@Nullable Output<String> userId) {
            this.userId = userId;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = Codegen.ofNullable(userId);
            return this;
        }        public EnvironmentMembershipState build() {
            return new EnvironmentMembershipState(environmentId, permissions, userArn, userId);
        }
    }
}
