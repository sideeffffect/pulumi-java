// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.budgets.inputs;

import com.pulumi.awsnative.budgets.enums.BudgetsActionActionThresholdType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class BudgetsActionActionThresholdArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetsActionActionThresholdArgs Empty = new BudgetsActionActionThresholdArgs();

    @Import(name="type", required=true)
    private Output<BudgetsActionActionThresholdType> type;

    public Output<BudgetsActionActionThresholdType> type() {
        return this.type;
    }

    @Import(name="value", required=true)
    private Output<Double> value;

    public Output<Double> value() {
        return this.value;
    }

    private BudgetsActionActionThresholdArgs() {}

    private BudgetsActionActionThresholdArgs(BudgetsActionActionThresholdArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetsActionActionThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetsActionActionThresholdArgs $;

        public Builder() {
            $ = new BudgetsActionActionThresholdArgs();
        }

        public Builder(BudgetsActionActionThresholdArgs defaults) {
            $ = new BudgetsActionActionThresholdArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<BudgetsActionActionThresholdType> type) {
            $.type = type;
            return this;
        }

        public Builder type(BudgetsActionActionThresholdType type) {
            return type(Output.of(type));
        }

        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public BudgetsActionActionThresholdArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
