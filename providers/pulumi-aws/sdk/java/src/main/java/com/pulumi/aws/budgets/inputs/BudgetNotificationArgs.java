// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetNotificationArgs Empty = new BudgetNotificationArgs();

    /**
     * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    @Import(name="comparisonOperator", required=true)
    private Output<String> comparisonOperator;

    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    @Import(name="notificationType", required=true)
    private Output<String> notificationType;

    public Output<String> notificationType() {
        return this.notificationType;
    }

    /**
     * (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    @Import(name="subscriberEmailAddresses")
    private @Nullable Output<List<String>> subscriberEmailAddresses;

    public Optional<Output<List<String>>> subscriberEmailAddresses() {
        return Optional.ofNullable(this.subscriberEmailAddresses);
    }

    /**
     * (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    @Import(name="subscriberSnsTopicArns")
    private @Nullable Output<List<String>> subscriberSnsTopicArns;

    public Optional<Output<List<String>>> subscriberSnsTopicArns() {
        return Optional.ofNullable(this.subscriberSnsTopicArns);
    }

    /**
     * (Required) Threshold when the notification should be sent.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    @Import(name="thresholdType", required=true)
    private Output<String> thresholdType;

    public Output<String> thresholdType() {
        return this.thresholdType;
    }

    private BudgetNotificationArgs() {}

    private BudgetNotificationArgs(BudgetNotificationArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.notificationType = $.notificationType;
        this.subscriberEmailAddresses = $.subscriberEmailAddresses;
        this.subscriberSnsTopicArns = $.subscriberSnsTopicArns;
        this.threshold = $.threshold;
        this.thresholdType = $.thresholdType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetNotificationArgs $;

        public Builder() {
            $ = new BudgetNotificationArgs();
        }

        public Builder(BudgetNotificationArgs defaults) {
            $ = new BudgetNotificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        public Builder notificationType(Output<String> notificationType) {
            $.notificationType = notificationType;
            return this;
        }

        public Builder notificationType(String notificationType) {
            return notificationType(Output.of(notificationType));
        }

        public Builder subscriberEmailAddresses(@Nullable Output<List<String>> subscriberEmailAddresses) {
            $.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }

        public Builder subscriberEmailAddresses(List<String> subscriberEmailAddresses) {
            return subscriberEmailAddresses(Output.of(subscriberEmailAddresses));
        }

        public Builder subscriberEmailAddresses(String... subscriberEmailAddresses) {
            return subscriberEmailAddresses(List.of(subscriberEmailAddresses));
        }

        public Builder subscriberSnsTopicArns(@Nullable Output<List<String>> subscriberSnsTopicArns) {
            $.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }

        public Builder subscriberSnsTopicArns(List<String> subscriberSnsTopicArns) {
            return subscriberSnsTopicArns(Output.of(subscriberSnsTopicArns));
        }

        public Builder subscriberSnsTopicArns(String... subscriberSnsTopicArns) {
            return subscriberSnsTopicArns(List.of(subscriberSnsTopicArns));
        }

        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public Builder thresholdType(Output<String> thresholdType) {
            $.thresholdType = thresholdType;
            return this;
        }

        public Builder thresholdType(String thresholdType) {
            return thresholdType(Output.of(thresholdType));
        }

        public BudgetNotificationArgs build() {
            $.comparisonOperator = Objects.requireNonNull($.comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
            $.notificationType = Objects.requireNonNull($.notificationType, "expected parameter 'notificationType' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.thresholdType = Objects.requireNonNull($.thresholdType, "expected parameter 'thresholdType' to be non-null");
            return $;
        }
    }

}
