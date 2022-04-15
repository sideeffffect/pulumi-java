// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * When destroying this user, destroy even if it
     * has non-provider-managed IAM access keys, login profile or MFA devices. Without `force_destroy`
     * a user with non-provider-managed access keys and login profile will fail to be destroyed.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> forceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * The user's name. The name must consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: `=,.@-_.`. User names are not distinguished by case. For example, you cannot create users named both "TESTUSER" and "testuser".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Path in which to create the user.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * 
     */
    @Import(name="permissionsBoundary")
      private final @Nullable Output<String> permissionsBoundary;

    public Output<String> permissionsBoundary() {
        return this.permissionsBoundary == null ? Codegen.empty() : this.permissionsBoundary;
    }

    /**
     * Key-value mapping of tags for the IAM user
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public UserArgs(
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<String> permissionsBoundary,
        @Nullable Output<Map<String,String>> tags) {
        this.forceDestroy = forceDestroy;
        this.name = name;
        this.path = path;
        this.permissionsBoundary = permissionsBoundary;
        this.tags = tags;
    }

    private UserArgs() {
        this.forceDestroy = Codegen.empty();
        this.name = Codegen.empty();
        this.path = Codegen.empty();
        this.permissionsBoundary = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<String> permissionsBoundary;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.permissionsBoundary = defaults.permissionsBoundary;
    	      this.tags = defaults.tags;
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            this.permissionsBoundary = permissionsBoundary;
            return this;
        }
        public Builder permissionsBoundary(@Nullable String permissionsBoundary) {
            this.permissionsBoundary = Codegen.ofNullable(permissionsBoundary);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public UserArgs build() {
            return new UserArgs(forceDestroy, name, path, permissionsBoundary, tags);
        }
    }
}
