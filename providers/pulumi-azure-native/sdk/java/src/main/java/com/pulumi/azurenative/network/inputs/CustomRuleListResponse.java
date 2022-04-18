// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.CustomRuleResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines contents of custom rules
 * 
 */
public final class CustomRuleListResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomRuleListResponse Empty = new CustomRuleListResponse();

    /**
     * List of rules
     * 
     */
    @Import(name="rules")
      private final @Nullable List<CustomRuleResponse> rules;

    public List<CustomRuleResponse> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public CustomRuleListResponse(@Nullable List<CustomRuleResponse> rules) {
        this.rules = rules;
    }

    private CustomRuleListResponse() {
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable List<CustomRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(CustomRuleResponse... rules) {
            return rules(List.of(rules));
        }        public CustomRuleListResponse build() {
            return new CustomRuleListResponse(rules);
        }
    }
}
