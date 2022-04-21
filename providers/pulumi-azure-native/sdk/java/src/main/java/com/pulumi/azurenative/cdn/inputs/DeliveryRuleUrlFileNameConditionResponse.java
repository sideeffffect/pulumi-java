// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.UrlFileNameMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the UrlFileName condition for the delivery rule.
 * 
 */
public final class DeliveryRuleUrlFileNameConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleUrlFileNameConditionResponse Empty = new DeliveryRuleUrlFileNameConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;UrlFileName&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private UrlFileNameMatchConditionParametersResponse parameters;

    public UrlFileNameMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    private DeliveryRuleUrlFileNameConditionResponse() {}

    private DeliveryRuleUrlFileNameConditionResponse(DeliveryRuleUrlFileNameConditionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleUrlFileNameConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleUrlFileNameConditionResponse $;

        public Builder() {
            $ = new DeliveryRuleUrlFileNameConditionResponse();
        }

        public Builder(DeliveryRuleUrlFileNameConditionResponse defaults) {
            $ = new DeliveryRuleUrlFileNameConditionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(UrlFileNameMatchConditionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public DeliveryRuleUrlFileNameConditionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
