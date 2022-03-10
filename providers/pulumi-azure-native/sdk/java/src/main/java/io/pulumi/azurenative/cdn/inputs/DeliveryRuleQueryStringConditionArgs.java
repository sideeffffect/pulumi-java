// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.QueryStringMatchConditionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the QueryString condition for the delivery rule.
 * 
 */
public final class DeliveryRuleQueryStringConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleQueryStringConditionArgs Empty = new DeliveryRuleQueryStringConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'QueryString'.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<QueryStringMatchConditionParametersArgs> parameters;

    public Input<QueryStringMatchConditionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleQueryStringConditionArgs(
        Input<String> name,
        Input<QueryStringMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleQueryStringConditionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleQueryStringConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<QueryStringMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleQueryStringConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder parameters(Input<QueryStringMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(QueryStringMatchConditionParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }
        public DeliveryRuleQueryStringConditionArgs build() {
            return new DeliveryRuleQueryStringConditionArgs(name, parameters);
        }
    }
}
