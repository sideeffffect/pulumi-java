// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleStopActionGetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptRuleState extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleState Empty = new ReceiptRuleState();

    /**
     * A list of Add Header Action blocks. Documented below.
     * 
     */
    @Import(name="addHeaderActions")
    private @Nullable Output<List<ReceiptRuleAddHeaderActionGetArgs>> addHeaderActions;

    public Optional<Output<List<ReceiptRuleAddHeaderActionGetArgs>>> addHeaderActions() {
        return Optional.ofNullable(this.addHeaderActions);
    }

    /**
     * The name of the rule to place this rule after
     * 
     */
    @Import(name="after")
    private @Nullable Output<String> after;

    public Optional<Output<String>> after() {
        return Optional.ofNullable(this.after);
    }

    /**
     * The SES receipt rule ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A list of Bounce Action blocks. Documented below.
     * 
     */
    @Import(name="bounceActions")
    private @Nullable Output<List<ReceiptRuleBounceActionGetArgs>> bounceActions;

    public Optional<Output<List<ReceiptRuleBounceActionGetArgs>>> bounceActions() {
        return Optional.ofNullable(this.bounceActions);
    }

    /**
     * If true, the rule will be enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A list of Lambda Action blocks. Documented below.
     * 
     */
    @Import(name="lambdaActions")
    private @Nullable Output<List<ReceiptRuleLambdaActionGetArgs>> lambdaActions;

    public Optional<Output<List<ReceiptRuleLambdaActionGetArgs>>> lambdaActions() {
        return Optional.ofNullable(this.lambdaActions);
    }

    /**
     * The name of the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of email addresses
     * 
     */
    @Import(name="recipients")
    private @Nullable Output<List<String>> recipients;

    public Optional<Output<List<String>>> recipients() {
        return Optional.ofNullable(this.recipients);
    }

    /**
     * The name of the rule set
     * 
     */
    @Import(name="ruleSetName")
    private @Nullable Output<String> ruleSetName;

    public Optional<Output<String>> ruleSetName() {
        return Optional.ofNullable(this.ruleSetName);
    }

    /**
     * A list of S3 Action blocks. Documented below.
     * 
     */
    @Import(name="s3Actions")
    private @Nullable Output<List<ReceiptRuleS3ActionGetArgs>> s3Actions;

    public Optional<Output<List<ReceiptRuleS3ActionGetArgs>>> s3Actions() {
        return Optional.ofNullable(this.s3Actions);
    }

    /**
     * If true, incoming emails will be scanned for spam and viruses
     * 
     */
    @Import(name="scanEnabled")
    private @Nullable Output<Boolean> scanEnabled;

    public Optional<Output<Boolean>> scanEnabled() {
        return Optional.ofNullable(this.scanEnabled);
    }

    /**
     * A list of SNS Action blocks. Documented below.
     * 
     */
    @Import(name="snsActions")
    private @Nullable Output<List<ReceiptRuleSnsActionGetArgs>> snsActions;

    public Optional<Output<List<ReceiptRuleSnsActionGetArgs>>> snsActions() {
        return Optional.ofNullable(this.snsActions);
    }

    /**
     * A list of Stop Action blocks. Documented below.
     * 
     */
    @Import(name="stopActions")
    private @Nullable Output<List<ReceiptRuleStopActionGetArgs>> stopActions;

    public Optional<Output<List<ReceiptRuleStopActionGetArgs>>> stopActions() {
        return Optional.ofNullable(this.stopActions);
    }

    /**
     * `Require` or `Optional`
     * 
     */
    @Import(name="tlsPolicy")
    private @Nullable Output<String> tlsPolicy;

    public Optional<Output<String>> tlsPolicy() {
        return Optional.ofNullable(this.tlsPolicy);
    }

    /**
     * A list of WorkMail Action blocks. Documented below.
     * 
     */
    @Import(name="workmailActions")
    private @Nullable Output<List<ReceiptRuleWorkmailActionGetArgs>> workmailActions;

    public Optional<Output<List<ReceiptRuleWorkmailActionGetArgs>>> workmailActions() {
        return Optional.ofNullable(this.workmailActions);
    }

    private ReceiptRuleState() {}

    private ReceiptRuleState(ReceiptRuleState $) {
        this.addHeaderActions = $.addHeaderActions;
        this.after = $.after;
        this.arn = $.arn;
        this.bounceActions = $.bounceActions;
        this.enabled = $.enabled;
        this.lambdaActions = $.lambdaActions;
        this.name = $.name;
        this.recipients = $.recipients;
        this.ruleSetName = $.ruleSetName;
        this.s3Actions = $.s3Actions;
        this.scanEnabled = $.scanEnabled;
        this.snsActions = $.snsActions;
        this.stopActions = $.stopActions;
        this.tlsPolicy = $.tlsPolicy;
        this.workmailActions = $.workmailActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleState $;

        public Builder() {
            $ = new ReceiptRuleState();
        }

        public Builder(ReceiptRuleState defaults) {
            $ = new ReceiptRuleState(Objects.requireNonNull(defaults));
        }

        public Builder addHeaderActions(@Nullable Output<List<ReceiptRuleAddHeaderActionGetArgs>> addHeaderActions) {
            $.addHeaderActions = addHeaderActions;
            return this;
        }

        public Builder addHeaderActions(List<ReceiptRuleAddHeaderActionGetArgs> addHeaderActions) {
            return addHeaderActions(Output.of(addHeaderActions));
        }

        public Builder addHeaderActions(ReceiptRuleAddHeaderActionGetArgs... addHeaderActions) {
            return addHeaderActions(List.of(addHeaderActions));
        }

        public Builder after(@Nullable Output<String> after) {
            $.after = after;
            return this;
        }

        public Builder after(String after) {
            return after(Output.of(after));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder bounceActions(@Nullable Output<List<ReceiptRuleBounceActionGetArgs>> bounceActions) {
            $.bounceActions = bounceActions;
            return this;
        }

        public Builder bounceActions(List<ReceiptRuleBounceActionGetArgs> bounceActions) {
            return bounceActions(Output.of(bounceActions));
        }

        public Builder bounceActions(ReceiptRuleBounceActionGetArgs... bounceActions) {
            return bounceActions(List.of(bounceActions));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder lambdaActions(@Nullable Output<List<ReceiptRuleLambdaActionGetArgs>> lambdaActions) {
            $.lambdaActions = lambdaActions;
            return this;
        }

        public Builder lambdaActions(List<ReceiptRuleLambdaActionGetArgs> lambdaActions) {
            return lambdaActions(Output.of(lambdaActions));
        }

        public Builder lambdaActions(ReceiptRuleLambdaActionGetArgs... lambdaActions) {
            return lambdaActions(List.of(lambdaActions));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder recipients(@Nullable Output<List<String>> recipients) {
            $.recipients = recipients;
            return this;
        }

        public Builder recipients(List<String> recipients) {
            return recipients(Output.of(recipients));
        }

        public Builder recipients(String... recipients) {
            return recipients(List.of(recipients));
        }

        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        public Builder ruleSetName(String ruleSetName) {
            return ruleSetName(Output.of(ruleSetName));
        }

        public Builder s3Actions(@Nullable Output<List<ReceiptRuleS3ActionGetArgs>> s3Actions) {
            $.s3Actions = s3Actions;
            return this;
        }

        public Builder s3Actions(List<ReceiptRuleS3ActionGetArgs> s3Actions) {
            return s3Actions(Output.of(s3Actions));
        }

        public Builder s3Actions(ReceiptRuleS3ActionGetArgs... s3Actions) {
            return s3Actions(List.of(s3Actions));
        }

        public Builder scanEnabled(@Nullable Output<Boolean> scanEnabled) {
            $.scanEnabled = scanEnabled;
            return this;
        }

        public Builder scanEnabled(Boolean scanEnabled) {
            return scanEnabled(Output.of(scanEnabled));
        }

        public Builder snsActions(@Nullable Output<List<ReceiptRuleSnsActionGetArgs>> snsActions) {
            $.snsActions = snsActions;
            return this;
        }

        public Builder snsActions(List<ReceiptRuleSnsActionGetArgs> snsActions) {
            return snsActions(Output.of(snsActions));
        }

        public Builder snsActions(ReceiptRuleSnsActionGetArgs... snsActions) {
            return snsActions(List.of(snsActions));
        }

        public Builder stopActions(@Nullable Output<List<ReceiptRuleStopActionGetArgs>> stopActions) {
            $.stopActions = stopActions;
            return this;
        }

        public Builder stopActions(List<ReceiptRuleStopActionGetArgs> stopActions) {
            return stopActions(Output.of(stopActions));
        }

        public Builder stopActions(ReceiptRuleStopActionGetArgs... stopActions) {
            return stopActions(List.of(stopActions));
        }

        public Builder tlsPolicy(@Nullable Output<String> tlsPolicy) {
            $.tlsPolicy = tlsPolicy;
            return this;
        }

        public Builder tlsPolicy(String tlsPolicy) {
            return tlsPolicy(Output.of(tlsPolicy));
        }

        public Builder workmailActions(@Nullable Output<List<ReceiptRuleWorkmailActionGetArgs>> workmailActions) {
            $.workmailActions = workmailActions;
            return this;
        }

        public Builder workmailActions(List<ReceiptRuleWorkmailActionGetArgs> workmailActions) {
            return workmailActions(Output.of(workmailActions));
        }

        public Builder workmailActions(ReceiptRuleWorkmailActionGetArgs... workmailActions) {
            return workmailActions(List.of(workmailActions));
        }

        public ReceiptRuleState build() {
            return $;
        }
    }

}
