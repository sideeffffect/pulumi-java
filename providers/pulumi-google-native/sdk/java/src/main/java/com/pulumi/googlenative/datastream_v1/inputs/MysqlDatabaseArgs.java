// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.MysqlTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL database.
 * 
 */
public final class MysqlDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlDatabaseArgs Empty = new MysqlDatabaseArgs();

    /**
     * Database name.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Tables in the database.
     * 
     */
    @Import(name="mysqlTables")
    private @Nullable Output<List<MysqlTableArgs>> mysqlTables;

    public Optional<Output<List<MysqlTableArgs>>> mysqlTables() {
        return Optional.ofNullable(this.mysqlTables);
    }

    private MysqlDatabaseArgs() {}

    private MysqlDatabaseArgs(MysqlDatabaseArgs $) {
        this.database = $.database;
        this.mysqlTables = $.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlDatabaseArgs $;

        public Builder() {
            $ = new MysqlDatabaseArgs();
        }

        public Builder(MysqlDatabaseArgs defaults) {
            $ = new MysqlDatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder mysqlTables(@Nullable Output<List<MysqlTableArgs>> mysqlTables) {
            $.mysqlTables = mysqlTables;
            return this;
        }

        public Builder mysqlTables(List<MysqlTableArgs> mysqlTables) {
            return mysqlTables(Output.of(mysqlTables));
        }

        public Builder mysqlTables(MysqlTableArgs... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }

        public MysqlDatabaseArgs build() {
            return $;
        }
    }

}
