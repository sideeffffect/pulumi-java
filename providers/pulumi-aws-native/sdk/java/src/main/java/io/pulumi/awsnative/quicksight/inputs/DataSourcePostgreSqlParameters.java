// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>PostgreSQL parameters.</p>
 * 
 */
public final class DataSourcePostgreSqlParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourcePostgreSqlParameters Empty = new DataSourcePostgreSqlParameters();

    /**
     * <p>Database.</p>
     * 
     */
    @InputImport(name="database", required=true)
      private final String database;

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @InputImport(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @InputImport(name="port", required=true)
      private final Double port;

    public Double getPort() {
        return this.port;
    }

    public DataSourcePostgreSqlParameters(
        String database,
        String host,
        Double port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourcePostgreSqlParameters() {
        this.database = null;
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePostgreSqlParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePostgreSqlParameters defaults) {
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
        }
        public DataSourcePostgreSqlParameters build() {
            return new DataSourcePostgreSqlParameters(database, host, port);
        }
    }
}
