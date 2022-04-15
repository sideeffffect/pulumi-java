// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockGetArgs Empty = new RuleGroupRuleActionBlockGetArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @Import(name="customResponse")
      private final @Nullable Output<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse;

    public Output<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse() {
        return this.customResponse == null ? Codegen.empty() : this.customResponse;
    }

    public RuleGroupRuleActionBlockGetArgs(@Nullable Output<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private RuleGroupRuleActionBlockGetArgs() {
        this.customResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder customResponse(@Nullable Output<RuleGroupRuleActionBlockCustomResponseGetArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public Builder customResponse(@Nullable RuleGroupRuleActionBlockCustomResponseGetArgs customResponse) {
            this.customResponse = Codegen.ofNullable(customResponse);
            return this;
        }        public RuleGroupRuleActionBlockGetArgs build() {
            return new RuleGroupRuleActionBlockGetArgs(customResponse);
        }
    }
}
