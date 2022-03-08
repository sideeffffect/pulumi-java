// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectionCloudSqlCredential {
    /**
     * Password for database.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final String password;
    /**
     * Username for database.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private ConnectionCloudSqlCredential(
        String password,
        String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * Password for database.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * Username for database.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionCloudSqlCredential defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionCloudSqlCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ConnectionCloudSqlCredential build() {
            return new ConnectionCloudSqlCredential(password, username);
        }
    }
}
