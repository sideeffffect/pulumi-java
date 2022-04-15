// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     * 
     */
    @Import(name="allowSsh")
      private final @Nullable Output<Boolean> allowSsh;

    public Output<Boolean> allowSsh() {
        return this.allowSsh == null ? Codegen.empty() : this.allowSsh;
    }

    /**
     * Whether the user is allowed to use sudo to elevate privileges
     * 
     */
    @Import(name="allowSudo")
      private final @Nullable Output<Boolean> allowSudo;

    public Output<Boolean> allowSudo() {
        return this.allowSudo == null ? Codegen.empty() : this.allowSudo;
    }

    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
     * 
     */
    @Import(name="level")
      private final @Nullable Output<String> level;

    public Output<String> level() {
        return this.level == null ? Codegen.empty() : this.level;
    }

    /**
     * The stack to set the permissions for
     * 
     */
    @Import(name="stackId")
      private final @Nullable Output<String> stackId;

    public Output<String> stackId() {
        return this.stackId == null ? Codegen.empty() : this.stackId;
    }

    /**
     * The user's IAM ARN to set permissions for
     * 
     */
    @Import(name="userArn", required=true)
      private final Output<String> userArn;

    public Output<String> userArn() {
        return this.userArn;
    }

    public PermissionArgs(
        @Nullable Output<Boolean> allowSsh,
        @Nullable Output<Boolean> allowSudo,
        @Nullable Output<String> level,
        @Nullable Output<String> stackId,
        Output<String> userArn) {
        this.allowSsh = allowSsh;
        this.allowSudo = allowSudo;
        this.level = level;
        this.stackId = stackId;
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private PermissionArgs() {
        this.allowSsh = Codegen.empty();
        this.allowSudo = Codegen.empty();
        this.level = Codegen.empty();
        this.stackId = Codegen.empty();
        this.userArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSsh;
        private @Nullable Output<Boolean> allowSudo;
        private @Nullable Output<String> level;
        private @Nullable Output<String> stackId;
        private Output<String> userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSsh = defaults.allowSsh;
    	      this.allowSudo = defaults.allowSudo;
    	      this.level = defaults.level;
    	      this.stackId = defaults.stackId;
    	      this.userArn = defaults.userArn;
        }

        public Builder allowSsh(@Nullable Output<Boolean> allowSsh) {
            this.allowSsh = allowSsh;
            return this;
        }
        public Builder allowSsh(@Nullable Boolean allowSsh) {
            this.allowSsh = Codegen.ofNullable(allowSsh);
            return this;
        }
        public Builder allowSudo(@Nullable Output<Boolean> allowSudo) {
            this.allowSudo = allowSudo;
            return this;
        }
        public Builder allowSudo(@Nullable Boolean allowSudo) {
            this.allowSudo = Codegen.ofNullable(allowSudo);
            return this;
        }
        public Builder level(@Nullable Output<String> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable String level) {
            this.level = Codegen.ofNullable(level);
            return this;
        }
        public Builder stackId(@Nullable Output<String> stackId) {
            this.stackId = stackId;
            return this;
        }
        public Builder stackId(@Nullable String stackId) {
            this.stackId = Codegen.ofNullable(stackId);
            return this;
        }
        public Builder userArn(Output<String> userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }
        public Builder userArn(String userArn) {
            this.userArn = Output.of(Objects.requireNonNull(userArn));
            return this;
        }        public PermissionArgs build() {
            return new PermissionArgs(allowSsh, allowSudo, level, stackId, userArn);
        }
    }
}
