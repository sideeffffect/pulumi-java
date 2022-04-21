// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
 * 
 */
public final class LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs Empty = new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs();

    /**
     * Match all of the elements. See also MatchScope in JsonBody. You must specify either this setting or the IncludedPaths setting, but not both.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Object> all;

    public Optional<Output<Object>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * Match only the specified include paths. See also MatchScope in JsonBody.
     * 
     */
    @Import(name="includedPaths")
    private @Nullable Output<List<String>> includedPaths;

    public Optional<Output<List<String>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs() {}

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs $) {
        this.all = $.all;
        this.includedPaths = $.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs $;

        public Builder() {
            $ = new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs();
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs defaults) {
            $ = new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<Object> all) {
            $.all = all;
            return this;
        }

        public Builder all(Object all) {
            return all(Output.of(all));
        }

        public Builder includedPaths(@Nullable Output<List<String>> includedPaths) {
            $.includedPaths = includedPaths;
            return this;
        }

        public Builder includedPaths(List<String> includedPaths) {
            return includedPaths(Output.of(includedPaths));
        }

        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }

        public LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternPropertiesArgs build() {
            return $;
        }
    }

}
