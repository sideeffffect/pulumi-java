// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Oracle database profile.
 * 
 */
public final class OracleProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final OracleProfileResponse Empty = new OracleProfileResponse();

    /**
     * Connection string attributes
     * 
     */
    @Import(name="connectionAttributes", required=true)
    private Map<String,String> connectionAttributes;

    public Map<String,String> connectionAttributes() {
        return this.connectionAttributes;
    }

    /**
     * Database for the Oracle connection.
     * 
     */
    @Import(name="databaseService", required=true)
    private String databaseService;

    public String databaseService() {
        return this.databaseService;
    }

    /**
     * Hostname for the Oracle connection.
     * 
     */
    @Import(name="hostname", required=true)
    private String hostname;

    public String hostname() {
        return this.hostname;
    }

    /**
     * Password for the Oracle connection.
     * 
     */
    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    public Integer port() {
        return this.port;
    }

    /**
     * Username for the Oracle connection.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private OracleProfileResponse() {}

    private OracleProfileResponse(OracleProfileResponse $) {
        this.connectionAttributes = $.connectionAttributes;
        this.databaseService = $.databaseService;
        this.hostname = $.hostname;
        this.password = $.password;
        this.port = $.port;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleProfileResponse $;

        public Builder() {
            $ = new OracleProfileResponse();
        }

        public Builder(OracleProfileResponse defaults) {
            $ = new OracleProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder connectionAttributes(Map<String,String> connectionAttributes) {
            $.connectionAttributes = connectionAttributes;
            return this;
        }

        public Builder databaseService(String databaseService) {
            $.databaseService = databaseService;
            return this;
        }

        public Builder hostname(String hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public OracleProfileResponse build() {
            $.connectionAttributes = Objects.requireNonNull($.connectionAttributes, "expected parameter 'connectionAttributes' to be non-null");
            $.databaseService = Objects.requireNonNull($.databaseService, "expected parameter 'databaseService' to be non-null");
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
