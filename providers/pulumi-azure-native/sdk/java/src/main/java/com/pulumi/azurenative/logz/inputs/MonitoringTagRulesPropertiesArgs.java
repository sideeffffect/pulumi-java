// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.inputs.LogRulesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringTagRulesPropertiesArgs Empty = new MonitoringTagRulesPropertiesArgs();

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    @Import(name="logRules")
    private @Nullable Output<LogRulesArgs> logRules;

    public Optional<Output<LogRulesArgs>> logRules() {
        return Optional.ofNullable(this.logRules);
    }

    private MonitoringTagRulesPropertiesArgs() {}

    private MonitoringTagRulesPropertiesArgs(MonitoringTagRulesPropertiesArgs $) {
        this.logRules = $.logRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringTagRulesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringTagRulesPropertiesArgs $;

        public Builder() {
            $ = new MonitoringTagRulesPropertiesArgs();
        }

        public Builder(MonitoringTagRulesPropertiesArgs defaults) {
            $ = new MonitoringTagRulesPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder logRules(@Nullable Output<LogRulesArgs> logRules) {
            $.logRules = logRules;
            return this;
        }

        public Builder logRules(LogRulesArgs logRules) {
            return logRules(Output.of(logRules));
        }

        public MonitoringTagRulesPropertiesArgs build() {
            return $;
        }
    }

}
