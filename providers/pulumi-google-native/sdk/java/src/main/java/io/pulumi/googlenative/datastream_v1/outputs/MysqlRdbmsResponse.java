// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1.outputs.MysqlDatabaseResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MysqlRdbmsResponse {
    /**
     * Mysql databases on the server
     * 
     */
    private final List<MysqlDatabaseResponse> mysqlDatabases;

    @OutputCustomType.Constructor({"mysqlDatabases"})
    private MysqlRdbmsResponse(List<MysqlDatabaseResponse> mysqlDatabases) {
        this.mysqlDatabases = mysqlDatabases;
    }

    /**
     * Mysql databases on the server
     * 
    */
    public List<MysqlDatabaseResponse> getMysqlDatabases() {
        return this.mysqlDatabases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlRdbmsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MysqlDatabaseResponse> mysqlDatabases;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlRdbmsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlDatabases = defaults.mysqlDatabases;
        }

        public Builder setMysqlDatabases(List<MysqlDatabaseResponse> mysqlDatabases) {
            this.mysqlDatabases = Objects.requireNonNull(mysqlDatabases);
            return this;
        }
        public MysqlRdbmsResponse build() {
            return new MysqlRdbmsResponse(mysqlDatabases);
        }
    }
}
