// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.budgets.inputs;

import com.pulumi.awsnative.budgets.inputs.BudgetsActionIamActionDefinitionArgs;
import com.pulumi.awsnative.budgets.inputs.BudgetsActionScpActionDefinitionArgs;
import com.pulumi.awsnative.budgets.inputs.BudgetsActionSsmActionDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetsActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetsActionDefinitionArgs Empty = new BudgetsActionDefinitionArgs();

    @Import(name="iamActionDefinition")
    private @Nullable Output<BudgetsActionIamActionDefinitionArgs> iamActionDefinition;

    public Optional<Output<BudgetsActionIamActionDefinitionArgs>> iamActionDefinition() {
        return Optional.ofNullable(this.iamActionDefinition);
    }

    @Import(name="scpActionDefinition")
    private @Nullable Output<BudgetsActionScpActionDefinitionArgs> scpActionDefinition;

    public Optional<Output<BudgetsActionScpActionDefinitionArgs>> scpActionDefinition() {
        return Optional.ofNullable(this.scpActionDefinition);
    }

    @Import(name="ssmActionDefinition")
    private @Nullable Output<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition;

    public Optional<Output<BudgetsActionSsmActionDefinitionArgs>> ssmActionDefinition() {
        return Optional.ofNullable(this.ssmActionDefinition);
    }

    private BudgetsActionDefinitionArgs() {}

    private BudgetsActionDefinitionArgs(BudgetsActionDefinitionArgs $) {
        this.iamActionDefinition = $.iamActionDefinition;
        this.scpActionDefinition = $.scpActionDefinition;
        this.ssmActionDefinition = $.ssmActionDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetsActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetsActionDefinitionArgs $;

        public Builder() {
            $ = new BudgetsActionDefinitionArgs();
        }

        public Builder(BudgetsActionDefinitionArgs defaults) {
            $ = new BudgetsActionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder iamActionDefinition(@Nullable Output<BudgetsActionIamActionDefinitionArgs> iamActionDefinition) {
            $.iamActionDefinition = iamActionDefinition;
            return this;
        }

        public Builder iamActionDefinition(BudgetsActionIamActionDefinitionArgs iamActionDefinition) {
            return iamActionDefinition(Output.of(iamActionDefinition));
        }

        public Builder scpActionDefinition(@Nullable Output<BudgetsActionScpActionDefinitionArgs> scpActionDefinition) {
            $.scpActionDefinition = scpActionDefinition;
            return this;
        }

        public Builder scpActionDefinition(BudgetsActionScpActionDefinitionArgs scpActionDefinition) {
            return scpActionDefinition(Output.of(scpActionDefinition));
        }

        public Builder ssmActionDefinition(@Nullable Output<BudgetsActionSsmActionDefinitionArgs> ssmActionDefinition) {
            $.ssmActionDefinition = ssmActionDefinition;
            return this;
        }

        public Builder ssmActionDefinition(BudgetsActionSsmActionDefinitionArgs ssmActionDefinition) {
            return ssmActionDefinition(Output.of(ssmActionDefinition));
        }

        public BudgetsActionDefinitionArgs build() {
            return $;
        }
    }

}
