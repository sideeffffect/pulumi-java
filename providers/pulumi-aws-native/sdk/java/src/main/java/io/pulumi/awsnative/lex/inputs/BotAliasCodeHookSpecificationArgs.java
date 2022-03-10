// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasLambdaCodeHookArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasCodeHookSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasCodeHookSpecificationArgs Empty = new BotAliasCodeHookSpecificationArgs();

    @InputImport(name="lambdaCodeHook", required=true)
      private final Input<BotAliasLambdaCodeHookArgs> lambdaCodeHook;

    public Input<BotAliasLambdaCodeHookArgs> getLambdaCodeHook() {
        return this.lambdaCodeHook;
    }

    public BotAliasCodeHookSpecificationArgs(Input<BotAliasLambdaCodeHookArgs> lambdaCodeHook) {
        this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook, "expected parameter 'lambdaCodeHook' to be non-null");
    }

    private BotAliasCodeHookSpecificationArgs() {
        this.lambdaCodeHook = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasCodeHookSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BotAliasLambdaCodeHookArgs> lambdaCodeHook;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasCodeHookSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaCodeHook = defaults.lambdaCodeHook;
        }

        public Builder lambdaCodeHook(Input<BotAliasLambdaCodeHookArgs> lambdaCodeHook) {
            this.lambdaCodeHook = Objects.requireNonNull(lambdaCodeHook);
            return this;
        }

        public Builder lambdaCodeHook(BotAliasLambdaCodeHookArgs lambdaCodeHook) {
            this.lambdaCodeHook = Input.of(Objects.requireNonNull(lambdaCodeHook));
            return this;
        }
        public BotAliasCodeHookSpecificationArgs build() {
            return new BotAliasCodeHookSpecificationArgs(lambdaCodeHook);
        }
    }
}
