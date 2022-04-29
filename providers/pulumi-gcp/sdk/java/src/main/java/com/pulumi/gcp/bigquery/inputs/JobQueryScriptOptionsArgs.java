// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobQueryScriptOptionsArgs extends ResourceArgs {

    public static final JobQueryScriptOptionsArgs Empty = new JobQueryScriptOptionsArgs();

    /**
     * Determines which statement in the script represents the &#34;key result&#34;,
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    @Import(name="keyResultStatement")
    private @Nullable Output<String> keyResultStatement;

    /**
     * @return Determines which statement in the script represents the &#34;key result&#34;,
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    public Optional<Output<String>> keyResultStatement() {
        return Optional.ofNullable(this.keyResultStatement);
    }

    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    @Import(name="statementByteBudget")
    private @Nullable Output<String> statementByteBudget;

    /**
     * @return Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    public Optional<Output<String>> statementByteBudget() {
        return Optional.ofNullable(this.statementByteBudget);
    }

    /**
     * Timeout period for each statement in a script.
     * 
     */
    @Import(name="statementTimeoutMs")
    private @Nullable Output<String> statementTimeoutMs;

    /**
     * @return Timeout period for each statement in a script.
     * 
     */
    public Optional<Output<String>> statementTimeoutMs() {
        return Optional.ofNullable(this.statementTimeoutMs);
    }

    private JobQueryScriptOptionsArgs() {}

    private JobQueryScriptOptionsArgs(JobQueryScriptOptionsArgs $) {
        this.keyResultStatement = $.keyResultStatement;
        this.statementByteBudget = $.statementByteBudget;
        this.statementTimeoutMs = $.statementTimeoutMs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueryScriptOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueryScriptOptionsArgs $;

        public Builder() {
            $ = new JobQueryScriptOptionsArgs();
        }

        public Builder(JobQueryScriptOptionsArgs defaults) {
            $ = new JobQueryScriptOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyResultStatement Determines which statement in the script represents the &#34;key result&#34;,
         * used to populate the schema and query results of the script job.
         * Possible values are `LAST` and `FIRST_SELECT`.
         * 
         * @return builder
         * 
         */
        public Builder keyResultStatement(@Nullable Output<String> keyResultStatement) {
            $.keyResultStatement = keyResultStatement;
            return this;
        }

        /**
         * @param keyResultStatement Determines which statement in the script represents the &#34;key result&#34;,
         * used to populate the schema and query results of the script job.
         * Possible values are `LAST` and `FIRST_SELECT`.
         * 
         * @return builder
         * 
         */
        public Builder keyResultStatement(String keyResultStatement) {
            return keyResultStatement(Output.of(keyResultStatement));
        }

        /**
         * @param statementByteBudget Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
         * 
         * @return builder
         * 
         */
        public Builder statementByteBudget(@Nullable Output<String> statementByteBudget) {
            $.statementByteBudget = statementByteBudget;
            return this;
        }

        /**
         * @param statementByteBudget Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
         * 
         * @return builder
         * 
         */
        public Builder statementByteBudget(String statementByteBudget) {
            return statementByteBudget(Output.of(statementByteBudget));
        }

        /**
         * @param statementTimeoutMs Timeout period for each statement in a script.
         * 
         * @return builder
         * 
         */
        public Builder statementTimeoutMs(@Nullable Output<String> statementTimeoutMs) {
            $.statementTimeoutMs = statementTimeoutMs;
            return this;
        }

        /**
         * @param statementTimeoutMs Timeout period for each statement in a script.
         * 
         * @return builder
         * 
         */
        public Builder statementTimeoutMs(String statementTimeoutMs) {
            return statementTimeoutMs(Output.of(statementTimeoutMs));
        }

        public JobQueryScriptOptionsArgs build() {
            return $;
        }
    }

}
