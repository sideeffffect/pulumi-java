// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * File share information with Path, Username, and Password.
 * 
 */
public final class FileShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileShareArgs Empty = new FileShareArgs();

    /**
     * Password credential used to connect to the share location.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * The folder path for this share.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * User name credential to connect to the share location
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public FileShareArgs(
        @Nullable Output<String> password,
        Output<String> path,
        @Nullable Output<String> userName) {
        this.password = password;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.userName = userName;
    }

    private FileShareArgs() {
        this.password = Codegen.empty();
        this.path = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private Output<String> path;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(FileShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.path = defaults.path;
    	      this.userName = defaults.userName;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public FileShareArgs build() {
            return new FileShareArgs(password, path, userName);
        }
    }
}
