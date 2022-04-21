// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz;

import com.pulumi.azurenative.logz.inputs.MonitoringTagRulesPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagRuleArgs Empty = new TagRuleArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private Output<String> monitorName;

    public Output<String> monitorName() {
        return this.monitorName;
    }

    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<MonitoringTagRulesPropertiesArgs> properties;

    public Optional<Output<MonitoringTagRulesPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="ruleSetName")
    private @Nullable Output<String> ruleSetName;

    public Optional<Output<String>> ruleSetName() {
        return Optional.ofNullable(this.ruleSetName);
    }

    private TagRuleArgs() {}

    private TagRuleArgs(TagRuleArgs $) {
        this.monitorName = $.monitorName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleSetName = $.ruleSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagRuleArgs $;

        public Builder() {
            $ = new TagRuleArgs();
        }

        public Builder(TagRuleArgs defaults) {
            $ = new TagRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder monitorName(Output<String> monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        public Builder monitorName(String monitorName) {
            return monitorName(Output.of(monitorName));
        }

        public Builder properties(@Nullable Output<MonitoringTagRulesPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(MonitoringTagRulesPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder ruleSetName(@Nullable Output<String> ruleSetName) {
            $.ruleSetName = ruleSetName;
            return this;
        }

        public Builder ruleSetName(String ruleSetName) {
            return ruleSetName(Output.of(ruleSetName));
        }

        public TagRuleArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
