// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class DataSourceOracleParameters extends com.pulumi.resources.InvokeArgs {

    public static final DataSourceOracleParameters Empty = new DataSourceOracleParameters();

    @Import(name="database", required=true)
      private final String database;

    public String database() {
        return this.database;
    }

    @Import(name="host", required=true)
      private final String host;

    public String host() {
        return this.host;
    }

    @Import(name="port", required=true)
      private final Double port;

    public Double port() {
        return this.port;
    }

    public DataSourceOracleParameters(
        String database,
        String host,
        Double port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceOracleParameters() {
        this.database = null;
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOracleParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOracleParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceOracleParameters build() {
            return new DataSourceOracleParameters(database, host, port);
        }
    }
}
