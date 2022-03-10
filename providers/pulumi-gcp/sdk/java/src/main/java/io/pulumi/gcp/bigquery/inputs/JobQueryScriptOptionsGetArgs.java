// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryScriptOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryScriptOptionsGetArgs Empty = new JobQueryScriptOptionsGetArgs();

    /**
     * Determines which statement in the script represents the "key result",
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    @InputImport(name="keyResultStatement")
      private final @Nullable Input<String> keyResultStatement;

    public Input<String> getKeyResultStatement() {
        return this.keyResultStatement == null ? Input.empty() : this.keyResultStatement;
    }

    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    @InputImport(name="statementByteBudget")
      private final @Nullable Input<String> statementByteBudget;

    public Input<String> getStatementByteBudget() {
        return this.statementByteBudget == null ? Input.empty() : this.statementByteBudget;
    }

    /**
     * Timeout period for each statement in a script.
     * 
     */
    @InputImport(name="statementTimeoutMs")
      private final @Nullable Input<String> statementTimeoutMs;

    public Input<String> getStatementTimeoutMs() {
        return this.statementTimeoutMs == null ? Input.empty() : this.statementTimeoutMs;
    }

    public JobQueryScriptOptionsGetArgs(
        @Nullable Input<String> keyResultStatement,
        @Nullable Input<String> statementByteBudget,
        @Nullable Input<String> statementTimeoutMs) {
        this.keyResultStatement = keyResultStatement;
        this.statementByteBudget = statementByteBudget;
        this.statementTimeoutMs = statementTimeoutMs;
    }

    private JobQueryScriptOptionsGetArgs() {
        this.keyResultStatement = Input.empty();
        this.statementByteBudget = Input.empty();
        this.statementTimeoutMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryScriptOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyResultStatement;
        private @Nullable Input<String> statementByteBudget;
        private @Nullable Input<String> statementTimeoutMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryScriptOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyResultStatement = defaults.keyResultStatement;
    	      this.statementByteBudget = defaults.statementByteBudget;
    	      this.statementTimeoutMs = defaults.statementTimeoutMs;
        }

        public Builder keyResultStatement(@Nullable Input<String> keyResultStatement) {
            this.keyResultStatement = keyResultStatement;
            return this;
        }

        public Builder keyResultStatement(@Nullable String keyResultStatement) {
            this.keyResultStatement = Input.ofNullable(keyResultStatement);
            return this;
        }

        public Builder statementByteBudget(@Nullable Input<String> statementByteBudget) {
            this.statementByteBudget = statementByteBudget;
            return this;
        }

        public Builder statementByteBudget(@Nullable String statementByteBudget) {
            this.statementByteBudget = Input.ofNullable(statementByteBudget);
            return this;
        }

        public Builder statementTimeoutMs(@Nullable Input<String> statementTimeoutMs) {
            this.statementTimeoutMs = statementTimeoutMs;
            return this;
        }

        public Builder statementTimeoutMs(@Nullable String statementTimeoutMs) {
            this.statementTimeoutMs = Input.ofNullable(statementTimeoutMs);
            return this;
        }
        public JobQueryScriptOptionsGetArgs build() {
            return new JobQueryScriptOptionsGetArgs(keyResultStatement, statementByteBudget, statementTimeoutMs);
        }
    }
}
