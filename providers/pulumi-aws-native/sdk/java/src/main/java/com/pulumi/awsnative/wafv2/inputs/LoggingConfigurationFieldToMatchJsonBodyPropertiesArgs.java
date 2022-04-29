// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior;
import com.pulumi.awsnative.wafv2.enums.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope;
import com.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Inspect the request body as JSON. The request body immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.
 * 
 */
public final class LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs extends ResourceArgs {

    public static final LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs Empty = new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs();

    /**
     * What AWS WAF should do if it fails to completely parse the JSON body.
     * 
     */
    @Import(name="invalidFallbackBehavior")
    private @Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior;

    /**
     * @return What AWS WAF should do if it fails to completely parse the JSON body.
     * 
     */
    public Optional<Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior>> invalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }

    /**
     * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * 
     */
    @Import(name="matchPattern", required=true)
    private Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern;

    /**
     * @return The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * 
     */
    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern() {
        return this.matchPattern;
    }

    /**
     * The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
     * 
     */
    @Import(name="matchScope", required=true)
    private Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope;

    /**
     * @return The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
     * 
     */
    public Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope() {
        return this.matchScope;
    }

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs() {}

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs $) {
        this.invalidFallbackBehavior = $.invalidFallbackBehavior;
        this.matchPattern = $.matchPattern;
        this.matchScope = $.matchScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs $;

        public Builder() {
            $ = new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs();
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs defaults) {
            $ = new LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param invalidFallbackBehavior What AWS WAF should do if it fails to completely parse the JSON body.
         * 
         * @return builder
         * 
         */
        public Builder invalidFallbackBehavior(@Nullable Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior> invalidFallbackBehavior) {
            $.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        /**
         * @param invalidFallbackBehavior What AWS WAF should do if it fails to completely parse the JSON body.
         * 
         * @return builder
         * 
         */
        public Builder invalidFallbackBehavior(LoggingConfigurationFieldToMatchJsonBodyPropertiesInvalidFallbackBehavior invalidFallbackBehavior) {
            return invalidFallbackBehavior(Output.of(invalidFallbackBehavior));
        }

        /**
         * @param matchPattern The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
         * 
         * @return builder
         * 
         */
        public Builder matchPattern(Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs> matchPattern) {
            $.matchPattern = matchPattern;
            return this;
        }

        /**
         * @param matchPattern The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
         * 
         * @return builder
         * 
         */
        public Builder matchPattern(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs matchPattern) {
            return matchPattern(Output.of(matchPattern));
        }

        /**
         * @param matchScope The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
         * 
         * @return builder
         * 
         */
        public Builder matchScope(Output<LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope> matchScope) {
            $.matchScope = matchScope;
            return this;
        }

        /**
         * @param matchScope The parts of the JSON to match against using the MatchPattern. If you specify All, AWS WAF matches against keys and values.
         * 
         * @return builder
         * 
         */
        public Builder matchScope(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchScope matchScope) {
            return matchScope(Output.of(matchScope));
        }

        public LoggingConfigurationFieldToMatchJsonBodyPropertiesArgs build() {
            $.matchPattern = Objects.requireNonNull($.matchPattern, "expected parameter 'matchPattern' to be non-null");
            $.matchScope = Objects.requireNonNull($.matchScope, "expected parameter 'matchScope' to be non-null");
            return $;
        }
    }

}
