// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlInjectionMatchSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlInjectionMatchSetArgs Empty = new SqlInjectionMatchSetArgs();

    /**
     * The name or description of the SQL Injection Match Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @Import(name="sqlInjectionMatchTuples")
    private @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples;

    public Optional<Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>>> sqlInjectionMatchTuples() {
        return Optional.ofNullable(this.sqlInjectionMatchTuples);
    }

    private SqlInjectionMatchSetArgs() {}

    private SqlInjectionMatchSetArgs(SqlInjectionMatchSetArgs $) {
        this.name = $.name;
        this.sqlInjectionMatchTuples = $.sqlInjectionMatchTuples;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlInjectionMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlInjectionMatchSetArgs $;

        public Builder() {
            $ = new SqlInjectionMatchSetArgs();
        }

        public Builder(SqlInjectionMatchSetArgs defaults) {
            $ = new SqlInjectionMatchSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sqlInjectionMatchTuples(@Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples) {
            $.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
            return this;
        }

        public Builder sqlInjectionMatchTuples(List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs> sqlInjectionMatchTuples) {
            return sqlInjectionMatchTuples(Output.of(sqlInjectionMatchTuples));
        }

        public Builder sqlInjectionMatchTuples(SqlInjectionMatchSetSqlInjectionMatchTupleArgs... sqlInjectionMatchTuples) {
            return sqlInjectionMatchTuples(List.of(sqlInjectionMatchTuples));
        }

        public SqlInjectionMatchSetArgs build() {
            return $;
        }
    }

}
