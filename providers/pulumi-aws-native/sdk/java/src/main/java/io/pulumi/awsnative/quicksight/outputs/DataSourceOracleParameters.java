// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceOracleParameters {
    private final String database;
    private final String host;
    private final Double port;

    @OutputCustomType.Constructor({"database","host","port"})
    private DataSourceOracleParameters(
        String database,
        String host,
        Double port) {
        this.database = database;
        this.host = host;
        this.port = port;
    }

    public String getDatabase() {
        return this.database;
    }
    public String getHost() {
        return this.host;
    }
    public Double getPort() {
        return this.port;
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

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceOracleParameters build() {
            return new DataSourceOracleParameters(database, host, port);
        }
    }
}
