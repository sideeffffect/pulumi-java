// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class OracleProfileResponse {
    /**
     * Connection string attributes
     * 
     */
    private final Map<String,String> connectionAttributes;
    /**
     * Database for the Oracle connection.
     * 
     */
    private final String databaseService;
    /**
     * Hostname for the Oracle connection.
     * 
     */
    private final String hostname;
    /**
     * Password for the Oracle connection.
     * 
     */
    private final String password;
    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    private final Integer port;
    /**
     * Username for the Oracle connection.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"connectionAttributes","databaseService","hostname","password","port","username"})
    private OracleProfileResponse(
        Map<String,String> connectionAttributes,
        String databaseService,
        String hostname,
        String password,
        Integer port,
        String username) {
        this.connectionAttributes = connectionAttributes;
        this.databaseService = databaseService;
        this.hostname = hostname;
        this.password = password;
        this.port = port;
        this.username = username;
    }

    /**
     * Connection string attributes
     * 
    */
    public Map<String,String> getConnectionAttributes() {
        return this.connectionAttributes;
    }
    /**
     * Database for the Oracle connection.
     * 
    */
    public String getDatabaseService() {
        return this.databaseService;
    }
    /**
     * Hostname for the Oracle connection.
     * 
    */
    public String getHostname() {
        return this.hostname;
    }
    /**
     * Password for the Oracle connection.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * Port for the Oracle connection, default value is 1521.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Username for the Oracle connection.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> connectionAttributes;
        private String databaseService;
        private String hostname;
        private String password;
        private Integer port;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttributes = defaults.connectionAttributes;
    	      this.databaseService = defaults.databaseService;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.username = defaults.username;
        }

        public Builder setConnectionAttributes(Map<String,String> connectionAttributes) {
            this.connectionAttributes = Objects.requireNonNull(connectionAttributes);
            return this;
        }

        public Builder setDatabaseService(String databaseService) {
            this.databaseService = Objects.requireNonNull(databaseService);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public OracleProfileResponse build() {
            return new OracleProfileResponse(connectionAttributes, databaseService, hostname, password, port, username);
        }
    }
}
