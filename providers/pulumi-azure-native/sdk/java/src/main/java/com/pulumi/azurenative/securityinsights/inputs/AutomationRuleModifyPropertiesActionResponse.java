// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.inputs.AutomationRuleModifyPropertiesActionResponseActionConfiguration;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an automation rule action to modify an object&#39;s properties
 * 
 */
public final class AutomationRuleModifyPropertiesActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutomationRuleModifyPropertiesActionResponse Empty = new AutomationRuleModifyPropertiesActionResponse();

    /**
     * The configuration of the modify properties automation rule action
     * 
     */
    @Import(name="actionConfiguration", required=true)
    private AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration;

    public AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * The type of the automation rule action
     * Expected value is &#39;ModifyProperties&#39;.
     * 
     */
    @Import(name="actionType", required=true)
    private String actionType;

    public String actionType() {
        return this.actionType;
    }

    /**
     * The order of execution of the automation rule action
     * 
     */
    @Import(name="order", required=true)
    private Integer order;

    public Integer order() {
        return this.order;
    }

    private AutomationRuleModifyPropertiesActionResponse() {}

    private AutomationRuleModifyPropertiesActionResponse(AutomationRuleModifyPropertiesActionResponse $) {
        this.actionConfiguration = $.actionConfiguration;
        this.actionType = $.actionType;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleModifyPropertiesActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleModifyPropertiesActionResponse $;

        public Builder() {
            $ = new AutomationRuleModifyPropertiesActionResponse();
        }

        public Builder(AutomationRuleModifyPropertiesActionResponse defaults) {
            $ = new AutomationRuleModifyPropertiesActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder actionConfiguration(AutomationRuleModifyPropertiesActionResponseActionConfiguration actionConfiguration) {
            $.actionConfiguration = actionConfiguration;
            return this;
        }

        public Builder actionType(String actionType) {
            $.actionType = actionType;
            return this;
        }

        public Builder order(Integer order) {
            $.order = order;
            return this;
        }

        public AutomationRuleModifyPropertiesActionResponse build() {
            $.actionConfiguration = Objects.requireNonNull($.actionConfiguration, "expected parameter 'actionConfiguration' to be non-null");
            $.actionType = Codegen.stringProp("actionType").arg($.actionType).require();
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            return $;
        }
    }

}
