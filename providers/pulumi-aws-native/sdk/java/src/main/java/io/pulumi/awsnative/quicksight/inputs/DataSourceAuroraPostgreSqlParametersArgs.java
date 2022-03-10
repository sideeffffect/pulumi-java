// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon Aurora with PostgreSQL compatibility parameters.</p>
 * 
 */
public final class DataSourceAuroraPostgreSqlParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceAuroraPostgreSqlParametersArgs Empty = new DataSourceAuroraPostgreSqlParametersArgs();

    /**
     * <p>Database.</p>
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @InputImport(name="host", required=true)
      private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Double> port;

    public Input<Double> getPort() {
        return this.port;
    }

    public DataSourceAuroraPostgreSqlParametersArgs(
        Input<String> database,
        Input<String> host,
        Input<Double> port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceAuroraPostgreSqlParametersArgs() {
        this.database = Input.empty();
        this.host = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAuroraPostgreSqlParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private Input<String> host;
        private Input<Double> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAuroraPostgreSqlParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder host(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder port(Input<Double> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Double port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public DataSourceAuroraPostgreSqlParametersArgs build() {
            return new DataSourceAuroraPostgreSqlParametersArgs(database, host, port);
        }
    }
}
