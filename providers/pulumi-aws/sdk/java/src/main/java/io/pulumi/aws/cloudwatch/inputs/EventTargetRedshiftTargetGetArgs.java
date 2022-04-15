// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetRedshiftTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetRedshiftTargetGetArgs Empty = new EventTargetRedshiftTargetGetArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * The database user name.
     * 
     */
    @Import(name="dbUser")
      private final @Nullable Output<String> dbUser;

    public Output<String> dbUser() {
        return this.dbUser == null ? Codegen.empty() : this.dbUser;
    }

    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    @Import(name="secretsManagerArn")
      private final @Nullable Output<String> secretsManagerArn;

    public Output<String> secretsManagerArn() {
        return this.secretsManagerArn == null ? Codegen.empty() : this.secretsManagerArn;
    }

    /**
     * The SQL statement text to run.
     * 
     */
    @Import(name="sql")
      private final @Nullable Output<String> sql;

    public Output<String> sql() {
        return this.sql == null ? Codegen.empty() : this.sql;
    }

    /**
     * The name of the SQL statement.
     * 
     */
    @Import(name="statementName")
      private final @Nullable Output<String> statementName;

    public Output<String> statementName() {
        return this.statementName == null ? Codegen.empty() : this.statementName;
    }

    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     * 
     */
    @Import(name="withEvent")
      private final @Nullable Output<Boolean> withEvent;

    public Output<Boolean> withEvent() {
        return this.withEvent == null ? Codegen.empty() : this.withEvent;
    }

    public EventTargetRedshiftTargetGetArgs(
        Output<String> database,
        @Nullable Output<String> dbUser,
        @Nullable Output<String> secretsManagerArn,
        @Nullable Output<String> sql,
        @Nullable Output<String> statementName,
        @Nullable Output<Boolean> withEvent) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.dbUser = dbUser;
        this.secretsManagerArn = secretsManagerArn;
        this.sql = sql;
        this.statementName = statementName;
        this.withEvent = withEvent;
    }

    private EventTargetRedshiftTargetGetArgs() {
        this.database = Codegen.empty();
        this.dbUser = Codegen.empty();
        this.secretsManagerArn = Codegen.empty();
        this.sql = Codegen.empty();
        this.statementName = Codegen.empty();
        this.withEvent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRedshiftTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private @Nullable Output<String> dbUser;
        private @Nullable Output<String> secretsManagerArn;
        private @Nullable Output<String> sql;
        private @Nullable Output<String> statementName;
        private @Nullable Output<Boolean> withEvent;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRedshiftTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.dbUser = defaults.dbUser;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.sql = defaults.sql;
    	      this.statementName = defaults.statementName;
    	      this.withEvent = defaults.withEvent;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder dbUser(@Nullable Output<String> dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public Builder dbUser(@Nullable String dbUser) {
            this.dbUser = Codegen.ofNullable(dbUser);
            return this;
        }
        public Builder secretsManagerArn(@Nullable Output<String> secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }
        public Builder secretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = Codegen.ofNullable(secretsManagerArn);
            return this;
        }
        public Builder sql(@Nullable Output<String> sql) {
            this.sql = sql;
            return this;
        }
        public Builder sql(@Nullable String sql) {
            this.sql = Codegen.ofNullable(sql);
            return this;
        }
        public Builder statementName(@Nullable Output<String> statementName) {
            this.statementName = statementName;
            return this;
        }
        public Builder statementName(@Nullable String statementName) {
            this.statementName = Codegen.ofNullable(statementName);
            return this;
        }
        public Builder withEvent(@Nullable Output<Boolean> withEvent) {
            this.withEvent = withEvent;
            return this;
        }
        public Builder withEvent(@Nullable Boolean withEvent) {
            this.withEvent = Codegen.ofNullable(withEvent);
            return this;
        }        public EventTargetRedshiftTargetGetArgs build() {
            return new EventTargetRedshiftTargetGetArgs(database, dbUser, secretsManagerArn, sql, statementName, withEvent);
        }
    }
}
