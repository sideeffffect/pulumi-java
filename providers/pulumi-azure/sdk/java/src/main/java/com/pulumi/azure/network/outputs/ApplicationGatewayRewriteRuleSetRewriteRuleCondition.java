// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRewriteRuleSetRewriteRuleCondition {
    /**
     * @return Perform a case in-sensitive comparison. Defaults to `false`
     * 
     */
    private final @Nullable Boolean ignoreCase;
    /**
     * @return Negate the result of the condition evaluation. Defaults to `false`
     * 
     */
    private final @Nullable Boolean negate;
    /**
     * @return The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    private final String pattern;
    /**
     * @return The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
     * 
     */
    private final String variable;

    @CustomType.Constructor
    private ApplicationGatewayRewriteRuleSetRewriteRuleCondition(
        @CustomType.Parameter("ignoreCase") @Nullable Boolean ignoreCase,
        @CustomType.Parameter("negate") @Nullable Boolean negate,
        @CustomType.Parameter("pattern") String pattern,
        @CustomType.Parameter("variable") String variable) {
        this.ignoreCase = ignoreCase;
        this.negate = negate;
        this.pattern = pattern;
        this.variable = variable;
    }

    /**
     * @return Perform a case in-sensitive comparison. Defaults to `false`
     * 
     */
    public Optional<Boolean> ignoreCase() {
        return Optional.ofNullable(this.ignoreCase);
    }
    /**
     * @return Negate the result of the condition evaluation. Defaults to `false`
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The pattern, either fixed string or regular expression, that evaluates the truthfulness of the condition.
     * 
     */
    public String pattern() {
        return this.pattern;
    }
    /**
     * @return The [variable](https://docs.microsoft.com/en-us/azure/application-gateway/rewrite-http-headers#server-variables) of the condition.
     * 
     */
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSetRewriteRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreCase;
        private @Nullable Boolean negate;
        private String pattern;
        private String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleSetRewriteRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.negate = defaults.negate;
    	      this.pattern = defaults.pattern;
    	      this.variable = defaults.variable;
        }

        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Builder negate(@Nullable Boolean negate) {
            this.negate = negate;
            return this;
        }
        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public Builder variable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }        public ApplicationGatewayRewriteRuleSetRewriteRuleCondition build() {
            return new ApplicationGatewayRewriteRuleSetRewriteRuleCondition(ignoreCase, negate, pattern, variable);
        }
    }
}
