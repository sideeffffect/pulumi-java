// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileVeevaConnectorProfileCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileVeevaConnectorProfileCredentialsArgs Empty = new ConnectorProfileVeevaConnectorProfileCredentialsArgs();

    /**
     * The password that corresponds to the username.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The name of the user.
     * 
     */
    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public ConnectorProfileVeevaConnectorProfileCredentialsArgs(
        Input<String> password,
        Input<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ConnectorProfileVeevaConnectorProfileCredentialsArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileVeevaConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileVeevaConnectorProfileCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder username(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public ConnectorProfileVeevaConnectorProfileCredentialsArgs build() {
            return new ConnectorProfileVeevaConnectorProfileCredentialsArgs(password, username);
        }
    }
}
