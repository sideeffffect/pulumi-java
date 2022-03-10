// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupRateBasedStatementAggregateKeyType;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupForwardedIPConfigurationArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRateBasedStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRateBasedStatementArgs Empty = new RuleGroupRateBasedStatementArgs();

    @InputImport(name="aggregateKeyType", required=true)
      private final Input<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType;

    public Input<RuleGroupRateBasedStatementAggregateKeyType> getAggregateKeyType() {
        return this.aggregateKeyType;
    }

    @InputImport(name="forwardedIPConfig")
      private final @Nullable Input<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig;

    public Input<RuleGroupForwardedIPConfigurationArgs> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Input.empty() : this.forwardedIPConfig;
    }

    @InputImport(name="limit", required=true)
      private final Input<Integer> limit;

    public Input<Integer> getLimit() {
        return this.limit;
    }

    @InputImport(name="scopeDownStatement")
      private final @Nullable Input<RuleGroupStatementArgs> scopeDownStatement;

    public Input<RuleGroupStatementArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Input.empty() : this.scopeDownStatement;
    }

    public RuleGroupRateBasedStatementArgs(
        Input<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType,
        @Nullable Input<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig,
        Input<Integer> limit,
        @Nullable Input<RuleGroupStatementArgs> scopeDownStatement) {
        this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType, "expected parameter 'aggregateKeyType' to be non-null");
        this.forwardedIPConfig = forwardedIPConfig;
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
    }

    private RuleGroupRateBasedStatementArgs() {
        this.aggregateKeyType = Input.empty();
        this.forwardedIPConfig = Input.empty();
        this.limit = Input.empty();
        this.scopeDownStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRateBasedStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType;
        private @Nullable Input<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig;
        private Input<Integer> limit;
        private @Nullable Input<RuleGroupStatementArgs> scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRateBasedStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder aggregateKeyType(Input<RuleGroupRateBasedStatementAggregateKeyType> aggregateKeyType) {
            this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType);
            return this;
        }

        public Builder aggregateKeyType(RuleGroupRateBasedStatementAggregateKeyType aggregateKeyType) {
            this.aggregateKeyType = Input.of(Objects.requireNonNull(aggregateKeyType));
            return this;
        }

        public Builder forwardedIPConfig(@Nullable Input<RuleGroupForwardedIPConfigurationArgs> forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }

        public Builder forwardedIPConfig(@Nullable RuleGroupForwardedIPConfigurationArgs forwardedIPConfig) {
            this.forwardedIPConfig = Input.ofNullable(forwardedIPConfig);
            return this;
        }

        public Builder limit(Input<Integer> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Input.of(Objects.requireNonNull(limit));
            return this;
        }

        public Builder scopeDownStatement(@Nullable Input<RuleGroupStatementArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder scopeDownStatement(@Nullable RuleGroupStatementArgs scopeDownStatement) {
            this.scopeDownStatement = Input.ofNullable(scopeDownStatement);
            return this;
        }
        public RuleGroupRateBasedStatementArgs build() {
            return new RuleGroupRateBasedStatementArgs(aggregateKeyType, forwardedIPConfig, limit, scopeDownStatement);
        }
    }
}
