// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.RateLimitRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RateLimitRuleListResponse {
    /**
     * List of rules
     * 
     */
    private final @Nullable List<RateLimitRuleResponse> rules;

    @OutputCustomType.Constructor
    private RateLimitRuleListResponse(@OutputCustomType.Parameter("rules") @Nullable List<RateLimitRuleResponse> rules) {
        this.rules = rules;
    }

    /**
     * List of rules
     * 
    */
    public List<RateLimitRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitRuleListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RateLimitRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitRuleListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable List<RateLimitRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public RateLimitRuleListResponse build() {
            return new RateLimitRuleListResponse(rules);
        }
    }
}
