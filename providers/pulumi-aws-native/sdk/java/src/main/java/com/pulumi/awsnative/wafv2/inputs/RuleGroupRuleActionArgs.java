// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionAllowPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionBlockPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCaptchaPropertiesArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionCountPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action taken when Rule matches its condition.
 * 
 */
public final class RuleGroupRuleActionArgs extends ResourceArgs {

    public static final RuleGroupRuleActionArgs Empty = new RuleGroupRuleActionArgs();

    /**
     * Allow traffic towards application.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow;

    /**
     * @return Allow traffic towards application.
     * 
     */
    public Optional<Output<RuleGroupRuleActionAllowPropertiesArgs>> allow() {
        return Optional.ofNullable(this.allow);
    }

    /**
     * Block traffic towards application.
     * 
     */
    @Import(name="block")
    private @Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block;

    /**
     * @return Block traffic towards application.
     * 
     */
    public Optional<Output<RuleGroupRuleActionBlockPropertiesArgs>> block() {
        return Optional.ofNullable(this.block);
    }

    /**
     * Checks valid token exists with request.
     * 
     */
    @Import(name="captcha")
    private @Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha;

    /**
     * @return Checks valid token exists with request.
     * 
     */
    public Optional<Output<RuleGroupRuleActionCaptchaPropertiesArgs>> captcha() {
        return Optional.ofNullable(this.captcha);
    }

    /**
     * Count traffic towards application.
     * 
     */
    @Import(name="count")
    private @Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count;

    /**
     * @return Count traffic towards application.
     * 
     */
    public Optional<Output<RuleGroupRuleActionCountPropertiesArgs>> count() {
        return Optional.ofNullable(this.count);
    }

    private RuleGroupRuleActionArgs() {}

    private RuleGroupRuleActionArgs(RuleGroupRuleActionArgs $) {
        this.allow = $.allow;
        this.block = $.block;
        this.captcha = $.captcha;
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionArgs();
        }

        public Builder(RuleGroupRuleActionArgs defaults) {
            $ = new RuleGroupRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allow Allow traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder allow(@Nullable Output<RuleGroupRuleActionAllowPropertiesArgs> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow Allow traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder allow(RuleGroupRuleActionAllowPropertiesArgs allow) {
            return allow(Output.of(allow));
        }

        /**
         * @param block Block traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder block(@Nullable Output<RuleGroupRuleActionBlockPropertiesArgs> block) {
            $.block = block;
            return this;
        }

        /**
         * @param block Block traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder block(RuleGroupRuleActionBlockPropertiesArgs block) {
            return block(Output.of(block));
        }

        /**
         * @param captcha Checks valid token exists with request.
         * 
         * @return builder
         * 
         */
        public Builder captcha(@Nullable Output<RuleGroupRuleActionCaptchaPropertiesArgs> captcha) {
            $.captcha = captcha;
            return this;
        }

        /**
         * @param captcha Checks valid token exists with request.
         * 
         * @return builder
         * 
         */
        public Builder captcha(RuleGroupRuleActionCaptchaPropertiesArgs captcha) {
            return captcha(Output.of(captcha));
        }

        /**
         * @param count Count traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<RuleGroupRuleActionCountPropertiesArgs> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Count traffic towards application.
         * 
         * @return builder
         * 
         */
        public Builder count(RuleGroupRuleActionCountPropertiesArgs count) {
            return count(Output.of(count));
        }

        public RuleGroupRuleActionArgs build() {
            return $;
        }
    }

}
