// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A custom error rule.
 * 
 */
public final class CustomErrorRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomErrorRuleArgs Empty = new CustomErrorRuleArgs();

    /**
     * Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    @Import(name="isErrorType")
    private @Nullable Output<Boolean> isErrorType;

    /**
     * @return Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
     * 
     */
    public Optional<Output<Boolean>> isErrorType() {
        return Optional.ofNullable(this.isErrorType);
    }

    /**
     * Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selects messages to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private CustomErrorRuleArgs() {}

    private CustomErrorRuleArgs(CustomErrorRuleArgs $) {
        this.isErrorType = $.isErrorType;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomErrorRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomErrorRuleArgs $;

        public Builder() {
            $ = new CustomErrorRuleArgs();
        }

        public Builder(CustomErrorRuleArgs defaults) {
            $ = new CustomErrorRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isErrorType Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
         * 
         * @return builder
         * 
         */
        public Builder isErrorType(@Nullable Output<Boolean> isErrorType) {
            $.isErrorType = isErrorType;
            return this;
        }

        /**
         * @param isErrorType Mark this message as possible payload in error response. Otherwise, objects of this type will be filtered when they appear in error payload.
         * 
         * @return builder
         * 
         */
        public Builder isErrorType(Boolean isErrorType) {
            return isErrorType(Output.of(isErrorType));
        }

        /**
         * @param selector Selects messages to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selects messages to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public CustomErrorRuleArgs build() {
            return $;
        }
    }

}
