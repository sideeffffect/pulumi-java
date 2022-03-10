// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information for connecting to MySQL server
 * 
 */
public final class MySqlConnectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final MySqlConnectionInfoResponse Empty = new MySqlConnectionInfoResponse();

    /**
     * Password credential.
     * 
     */
    @InputImport(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Port for Server
     * 
     */
    @InputImport(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Name of the server
     * 
     */
    @InputImport(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * Type of connection info
     * Expected value is 'MySqlConnectionInfo'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @InputImport(name="userName")
      private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public MySqlConnectionInfoResponse(
        @Nullable String password,
        Integer port,
        String serverName,
        String type,
        @Nullable String userName) {
        this.password = password;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private MySqlConnectionInfoResponse() {
        this.password = null;
        this.port = null;
        this.serverName = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private Integer port;
        private String serverName;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public MySqlConnectionInfoResponse build() {
            return new MySqlConnectionInfoResponse(password, port, serverName, type, userName);
        }
    }
}
