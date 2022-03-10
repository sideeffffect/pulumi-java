// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition {
    /**
     * The action setting that a log record must contain in order to meet the condition. Valid values: `ALLOW`, `BLOCK`, `COUNT`.
     * 
     */
    private final String action;

    @OutputCustomType.Constructor
    private WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition(@OutputCustomType.Parameter("action") String action) {
        this.action = action;
    }

    /**
     * The action setting that a log record must contain in order to meet the condition. Valid values: `ALLOW`, `BLOCK`, `COUNT`.
     * 
    */
    public String getAction() {
        return this.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionActionCondition(action);
        }
    }
}
