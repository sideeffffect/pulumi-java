// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SafetyRuleRuleConfig {
    /**
     * @return Logical negation of the rule.
     * 
     */
    private final Boolean inverted;
    /**
     * @return Number of controls that must be set when you specify an `ATLEAST` type rule.
     * 
     */
    private final Integer threshold;
    /**
     * @return Rule type. Valid values are `ATLEAST`, `AND`, and `OR`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SafetyRuleRuleConfig(
        @CustomType.Parameter("inverted") Boolean inverted,
        @CustomType.Parameter("threshold") Integer threshold,
        @CustomType.Parameter("type") String type) {
        this.inverted = inverted;
        this.threshold = threshold;
        this.type = type;
    }

    /**
     * @return Logical negation of the rule.
     * 
     */
    public Boolean inverted() {
        return this.inverted;
    }
    /**
     * @return Number of controls that must be set when you specify an `ATLEAST` type rule.
     * 
     */
    public Integer threshold() {
        return this.threshold;
    }
    /**
     * @return Rule type. Valid values are `ATLEAST`, `AND`, and `OR`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleRuleConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean inverted;
        private Integer threshold;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleRuleConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inverted = defaults.inverted;
    	      this.threshold = defaults.threshold;
    	      this.type = defaults.type;
        }

        public Builder inverted(Boolean inverted) {
            this.inverted = Objects.requireNonNull(inverted);
            return this;
        }
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SafetyRuleRuleConfig build() {
            return new SafetyRuleRuleConfig(inverted, threshold, type);
        }
    }
}
