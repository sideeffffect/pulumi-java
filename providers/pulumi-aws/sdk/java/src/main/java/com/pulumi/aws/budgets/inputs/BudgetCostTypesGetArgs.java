// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetCostTypesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetCostTypesGetArgs Empty = new BudgetCostTypesGetArgs();

    /**
     * A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeCredit")
    private @Nullable Output<Boolean> includeCredit;

    public Optional<Output<Boolean>> includeCredit() {
        return Optional.ofNullable(this.includeCredit);
    }

    /**
     * Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    @Import(name="includeDiscount")
    private @Nullable Output<Boolean> includeDiscount;

    public Optional<Output<Boolean>> includeDiscount() {
        return Optional.ofNullable(this.includeDiscount);
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeOtherSubscription")
    private @Nullable Output<Boolean> includeOtherSubscription;

    public Optional<Output<Boolean>> includeOtherSubscription() {
        return Optional.ofNullable(this.includeOtherSubscription);
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeRecurring")
    private @Nullable Output<Boolean> includeRecurring;

    public Optional<Output<Boolean>> includeRecurring() {
        return Optional.ofNullable(this.includeRecurring);
    }

    /**
     * A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeRefund")
    private @Nullable Output<Boolean> includeRefund;

    public Optional<Output<Boolean>> includeRefund() {
        return Optional.ofNullable(this.includeRefund);
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeSubscription")
    private @Nullable Output<Boolean> includeSubscription;

    public Optional<Output<Boolean>> includeSubscription() {
        return Optional.ofNullable(this.includeSubscription);
    }

    /**
     * A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeSupport")
    private @Nullable Output<Boolean> includeSupport;

    public Optional<Output<Boolean>> includeSupport() {
        return Optional.ofNullable(this.includeSupport);
    }

    /**
     * A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeTax")
    private @Nullable Output<Boolean> includeTax;

    public Optional<Output<Boolean>> includeTax() {
        return Optional.ofNullable(this.includeTax);
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeUpfront")
    private @Nullable Output<Boolean> includeUpfront;

    public Optional<Output<Boolean>> includeUpfront() {
        return Optional.ofNullable(this.includeUpfront);
    }

    /**
     * Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    @Import(name="useAmortized")
    private @Nullable Output<Boolean> useAmortized;

    public Optional<Output<Boolean>> useAmortized() {
        return Optional.ofNullable(this.useAmortized);
    }

    /**
     * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    @Import(name="useBlended")
    private @Nullable Output<Boolean> useBlended;

    public Optional<Output<Boolean>> useBlended() {
        return Optional.ofNullable(this.useBlended);
    }

    private BudgetCostTypesGetArgs() {}

    private BudgetCostTypesGetArgs(BudgetCostTypesGetArgs $) {
        this.includeCredit = $.includeCredit;
        this.includeDiscount = $.includeDiscount;
        this.includeOtherSubscription = $.includeOtherSubscription;
        this.includeRecurring = $.includeRecurring;
        this.includeRefund = $.includeRefund;
        this.includeSubscription = $.includeSubscription;
        this.includeSupport = $.includeSupport;
        this.includeTax = $.includeTax;
        this.includeUpfront = $.includeUpfront;
        this.useAmortized = $.useAmortized;
        this.useBlended = $.useBlended;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetCostTypesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetCostTypesGetArgs $;

        public Builder() {
            $ = new BudgetCostTypesGetArgs();
        }

        public Builder(BudgetCostTypesGetArgs defaults) {
            $ = new BudgetCostTypesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeCredit(@Nullable Output<Boolean> includeCredit) {
            $.includeCredit = includeCredit;
            return this;
        }

        public Builder includeCredit(Boolean includeCredit) {
            return includeCredit(Output.of(includeCredit));
        }

        public Builder includeDiscount(@Nullable Output<Boolean> includeDiscount) {
            $.includeDiscount = includeDiscount;
            return this;
        }

        public Builder includeDiscount(Boolean includeDiscount) {
            return includeDiscount(Output.of(includeDiscount));
        }

        public Builder includeOtherSubscription(@Nullable Output<Boolean> includeOtherSubscription) {
            $.includeOtherSubscription = includeOtherSubscription;
            return this;
        }

        public Builder includeOtherSubscription(Boolean includeOtherSubscription) {
            return includeOtherSubscription(Output.of(includeOtherSubscription));
        }

        public Builder includeRecurring(@Nullable Output<Boolean> includeRecurring) {
            $.includeRecurring = includeRecurring;
            return this;
        }

        public Builder includeRecurring(Boolean includeRecurring) {
            return includeRecurring(Output.of(includeRecurring));
        }

        public Builder includeRefund(@Nullable Output<Boolean> includeRefund) {
            $.includeRefund = includeRefund;
            return this;
        }

        public Builder includeRefund(Boolean includeRefund) {
            return includeRefund(Output.of(includeRefund));
        }

        public Builder includeSubscription(@Nullable Output<Boolean> includeSubscription) {
            $.includeSubscription = includeSubscription;
            return this;
        }

        public Builder includeSubscription(Boolean includeSubscription) {
            return includeSubscription(Output.of(includeSubscription));
        }

        public Builder includeSupport(@Nullable Output<Boolean> includeSupport) {
            $.includeSupport = includeSupport;
            return this;
        }

        public Builder includeSupport(Boolean includeSupport) {
            return includeSupport(Output.of(includeSupport));
        }

        public Builder includeTax(@Nullable Output<Boolean> includeTax) {
            $.includeTax = includeTax;
            return this;
        }

        public Builder includeTax(Boolean includeTax) {
            return includeTax(Output.of(includeTax));
        }

        public Builder includeUpfront(@Nullable Output<Boolean> includeUpfront) {
            $.includeUpfront = includeUpfront;
            return this;
        }

        public Builder includeUpfront(Boolean includeUpfront) {
            return includeUpfront(Output.of(includeUpfront));
        }

        public Builder useAmortized(@Nullable Output<Boolean> useAmortized) {
            $.useAmortized = useAmortized;
            return this;
        }

        public Builder useAmortized(Boolean useAmortized) {
            return useAmortized(Output.of(useAmortized));
        }

        public Builder useBlended(@Nullable Output<Boolean> useBlended) {
            $.useBlended = useBlended;
            return this;
        }

        public Builder useBlended(Boolean useBlended) {
            return useBlended(Output.of(useBlended));
        }

        public BudgetCostTypesGetArgs build() {
            return $;
        }
    }

}
