// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RulePredicateArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulePredicateArgs Empty = new RulePredicateArgs();

    /**
     * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    @Import(name="dataId", required=true)
    private Output<String> dataId;

    public Output<String> dataId() {
        return this.dataId;
    }

    /**
     * Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `waf_byte_match_set`, `waf_ipset`, `aws.waf.SizeConstraintSet`, `aws.waf.SqlInjectionMatchSet` or `aws.waf.XssMatchSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses except `192.0.2.44`.
     * 
     */
    @Import(name="negated", required=true)
    private Output<Boolean> negated;

    public Output<Boolean> negated() {
        return this.negated;
    }

    /**
     * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private RulePredicateArgs() {}

    private RulePredicateArgs(RulePredicateArgs $) {
        this.dataId = $.dataId;
        this.negated = $.negated;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulePredicateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulePredicateArgs $;

        public Builder() {
            $ = new RulePredicateArgs();
        }

        public Builder(RulePredicateArgs defaults) {
            $ = new RulePredicateArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataId(Output<String> dataId) {
            $.dataId = dataId;
            return this;
        }

        public Builder dataId(String dataId) {
            return dataId(Output.of(dataId));
        }

        public Builder negated(Output<Boolean> negated) {
            $.negated = negated;
            return this;
        }

        public Builder negated(Boolean negated) {
            return negated(Output.of(negated));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RulePredicateArgs build() {
            $.dataId = Objects.requireNonNull($.dataId, "expected parameter 'dataId' to be non-null");
            $.negated = Objects.requireNonNull($.negated, "expected parameter 'negated' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
