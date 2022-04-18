// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.budgets.outputs;

import com.pulumi.awsnative.budgets.outputs.BudgetsActionIamActionDefinition;
import com.pulumi.awsnative.budgets.outputs.BudgetsActionScpActionDefinition;
import com.pulumi.awsnative.budgets.outputs.BudgetsActionSsmActionDefinition;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetsActionDefinition {
    private final @Nullable BudgetsActionIamActionDefinition iamActionDefinition;
    private final @Nullable BudgetsActionScpActionDefinition scpActionDefinition;
    private final @Nullable BudgetsActionSsmActionDefinition ssmActionDefinition;

    @CustomType.Constructor
    private BudgetsActionDefinition(
        @CustomType.Parameter("iamActionDefinition") @Nullable BudgetsActionIamActionDefinition iamActionDefinition,
        @CustomType.Parameter("scpActionDefinition") @Nullable BudgetsActionScpActionDefinition scpActionDefinition,
        @CustomType.Parameter("ssmActionDefinition") @Nullable BudgetsActionSsmActionDefinition ssmActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
        this.scpActionDefinition = scpActionDefinition;
        this.ssmActionDefinition = ssmActionDefinition;
    }

    public Optional<BudgetsActionIamActionDefinition> iamActionDefinition() {
        return Optional.ofNullable(this.iamActionDefinition);
    }
    public Optional<BudgetsActionScpActionDefinition> scpActionDefinition() {
        return Optional.ofNullable(this.scpActionDefinition);
    }
    public Optional<BudgetsActionSsmActionDefinition> ssmActionDefinition() {
        return Optional.ofNullable(this.ssmActionDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BudgetsActionIamActionDefinition iamActionDefinition;
        private @Nullable BudgetsActionScpActionDefinition scpActionDefinition;
        private @Nullable BudgetsActionSsmActionDefinition ssmActionDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamActionDefinition = defaults.iamActionDefinition;
    	      this.scpActionDefinition = defaults.scpActionDefinition;
    	      this.ssmActionDefinition = defaults.ssmActionDefinition;
        }

        public Builder iamActionDefinition(@Nullable BudgetsActionIamActionDefinition iamActionDefinition) {
            this.iamActionDefinition = iamActionDefinition;
            return this;
        }
        public Builder scpActionDefinition(@Nullable BudgetsActionScpActionDefinition scpActionDefinition) {
            this.scpActionDefinition = scpActionDefinition;
            return this;
        }
        public Builder ssmActionDefinition(@Nullable BudgetsActionSsmActionDefinition ssmActionDefinition) {
            this.ssmActionDefinition = ssmActionDefinition;
            return this;
        }        public BudgetsActionDefinition build() {
            return new BudgetsActionDefinition(iamActionDefinition, scpActionDefinition, ssmActionDefinition);
        }
    }
}
