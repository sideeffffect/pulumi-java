// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceConnectionConfiguration {
    private final String databaseHost;
    private final String databaseName;
    private final Integer databasePort;
    private final String secretArn;
    private final String tableName;

    @OutputCustomType.Constructor
    private DataSourceConnectionConfiguration(
        @OutputCustomType.Parameter("databaseHost") String databaseHost,
        @OutputCustomType.Parameter("databaseName") String databaseName,
        @OutputCustomType.Parameter("databasePort") Integer databasePort,
        @OutputCustomType.Parameter("secretArn") String secretArn,
        @OutputCustomType.Parameter("tableName") String tableName) {
        this.databaseHost = databaseHost;
        this.databaseName = databaseName;
        this.databasePort = databasePort;
        this.secretArn = secretArn;
        this.tableName = tableName;
    }

    public String getDatabaseHost() {
        return this.databaseHost;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }
    public Integer getDatabasePort() {
        return this.databasePort;
    }
    public String getSecretArn() {
        return this.secretArn;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConnectionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseHost;
        private String databaseName;
        private Integer databasePort;
        private String secretArn;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConnectionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseHost = defaults.databaseHost;
    	      this.databaseName = defaults.databaseName;
    	      this.databasePort = defaults.databasePort;
    	      this.secretArn = defaults.secretArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder databaseHost(String databaseHost) {
            this.databaseHost = Objects.requireNonNull(databaseHost);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databasePort(Integer databasePort) {
            this.databasePort = Objects.requireNonNull(databasePort);
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public DataSourceConnectionConfiguration build() {
            return new DataSourceConnectionConfiguration(databaseHost, databaseName, databasePort, secretArn, tableName);
        }
    }
}
