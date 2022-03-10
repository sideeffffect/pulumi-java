// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Username and password for basic login authentication.
 * 
 */
public final class BasicLoginInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicLoginInformationArgs Empty = new BasicLoginInformationArgs();

    /**
     * Login password.
     * 
     */
    @InputImport(name="password")
      private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Login username.
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public BasicLoginInformationArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> username) {
        this.password = password;
        this.username = username;
    }

    private BasicLoginInformationArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicLoginInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicLoginInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder username(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public BasicLoginInformationArgs build() {
            return new BasicLoginInformationArgs(password, username);
        }
    }
}
