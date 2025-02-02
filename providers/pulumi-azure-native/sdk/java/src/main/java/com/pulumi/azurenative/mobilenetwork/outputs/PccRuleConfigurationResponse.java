// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.outputs;

import com.pulumi.azurenative.mobilenetwork.outputs.PccRuleQosPolicyResponse;
import com.pulumi.azurenative.mobilenetwork.outputs.ServiceDataFlowTemplateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PccRuleConfigurationResponse {
    /**
     * @return The name of the rule. This must be unique within the parent Service. You must not use any of the following reserved strings - `default`, `requested` or `service`.
     * 
     */
    private final String ruleName;
    /**
     * @return A precedence value that is used to decide between PCC Rules when identifying the QoS values to use for a particular Sim. A lower value means a higher priority. This value should be unique among all PCC Rules configured in the Mobile Network.
     * 
     */
    private final Integer rulePrecedence;
    /**
     * @return The QoS policy to use for packets matching this rule. If this field is null then the Service will define the QoS settings.
     * 
     */
    private final @Nullable PccRuleQosPolicyResponse ruleQosPolicy;
    /**
     * @return The set of service data flow templates to use for this PCC Rule.
     * 
     */
    private final List<ServiceDataFlowTemplateResponse> serviceDataFlowTemplates;
    /**
     * @return Determines whether flows that match this PCC Rule are permitted.
     * 
     */
    private final @Nullable String trafficControl;

    @CustomType.Constructor
    private PccRuleConfigurationResponse(
        @CustomType.Parameter("ruleName") String ruleName,
        @CustomType.Parameter("rulePrecedence") Integer rulePrecedence,
        @CustomType.Parameter("ruleQosPolicy") @Nullable PccRuleQosPolicyResponse ruleQosPolicy,
        @CustomType.Parameter("serviceDataFlowTemplates") List<ServiceDataFlowTemplateResponse> serviceDataFlowTemplates,
        @CustomType.Parameter("trafficControl") @Nullable String trafficControl) {
        this.ruleName = ruleName;
        this.rulePrecedence = rulePrecedence;
        this.ruleQosPolicy = ruleQosPolicy;
        this.serviceDataFlowTemplates = serviceDataFlowTemplates;
        this.trafficControl = trafficControl;
    }

    /**
     * @return The name of the rule. This must be unique within the parent Service. You must not use any of the following reserved strings - `default`, `requested` or `service`.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }
    /**
     * @return A precedence value that is used to decide between PCC Rules when identifying the QoS values to use for a particular Sim. A lower value means a higher priority. This value should be unique among all PCC Rules configured in the Mobile Network.
     * 
     */
    public Integer rulePrecedence() {
        return this.rulePrecedence;
    }
    /**
     * @return The QoS policy to use for packets matching this rule. If this field is null then the Service will define the QoS settings.
     * 
     */
    public Optional<PccRuleQosPolicyResponse> ruleQosPolicy() {
        return Optional.ofNullable(this.ruleQosPolicy);
    }
    /**
     * @return The set of service data flow templates to use for this PCC Rule.
     * 
     */
    public List<ServiceDataFlowTemplateResponse> serviceDataFlowTemplates() {
        return this.serviceDataFlowTemplates;
    }
    /**
     * @return Determines whether flows that match this PCC Rule are permitted.
     * 
     */
    public Optional<String> trafficControl() {
        return Optional.ofNullable(this.trafficControl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PccRuleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleName;
        private Integer rulePrecedence;
        private @Nullable PccRuleQosPolicyResponse ruleQosPolicy;
        private List<ServiceDataFlowTemplateResponse> serviceDataFlowTemplates;
        private @Nullable String trafficControl;

        public Builder() {
    	      // Empty
        }

        public Builder(PccRuleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleName = defaults.ruleName;
    	      this.rulePrecedence = defaults.rulePrecedence;
    	      this.ruleQosPolicy = defaults.ruleQosPolicy;
    	      this.serviceDataFlowTemplates = defaults.serviceDataFlowTemplates;
    	      this.trafficControl = defaults.trafficControl;
        }

        public Builder ruleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public Builder rulePrecedence(Integer rulePrecedence) {
            this.rulePrecedence = Objects.requireNonNull(rulePrecedence);
            return this;
        }
        public Builder ruleQosPolicy(@Nullable PccRuleQosPolicyResponse ruleQosPolicy) {
            this.ruleQosPolicy = ruleQosPolicy;
            return this;
        }
        public Builder serviceDataFlowTemplates(List<ServiceDataFlowTemplateResponse> serviceDataFlowTemplates) {
            this.serviceDataFlowTemplates = Objects.requireNonNull(serviceDataFlowTemplates);
            return this;
        }
        public Builder serviceDataFlowTemplates(ServiceDataFlowTemplateResponse... serviceDataFlowTemplates) {
            return serviceDataFlowTemplates(List.of(serviceDataFlowTemplates));
        }
        public Builder trafficControl(@Nullable String trafficControl) {
            this.trafficControl = trafficControl;
            return this;
        }        public PccRuleConfigurationResponse build() {
            return new PccRuleConfigurationResponse(ruleName, rulePrecedence, ruleQosPolicy, serviceDataFlowTemplates, trafficControl);
        }
    }
}
