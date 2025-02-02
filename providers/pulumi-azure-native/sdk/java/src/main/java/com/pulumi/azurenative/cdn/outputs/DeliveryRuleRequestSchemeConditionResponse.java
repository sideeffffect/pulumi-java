// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.RequestSchemeMatchConditionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliveryRuleRequestSchemeConditionResponse {
    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;RequestScheme&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    private final RequestSchemeMatchConditionParametersResponse parameters;

    @CustomType.Constructor
    private DeliveryRuleRequestSchemeConditionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") RequestSchemeMatchConditionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;RequestScheme&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public RequestSchemeMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RequestSchemeMatchConditionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestSchemeConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(RequestSchemeMatchConditionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public DeliveryRuleRequestSchemeConditionResponse build() {
            return new DeliveryRuleRequestSchemeConditionResponse(name, parameters);
        }
    }
}
