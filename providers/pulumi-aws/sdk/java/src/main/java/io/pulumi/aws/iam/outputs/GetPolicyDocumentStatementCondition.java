// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyDocumentStatementCondition {
    /**
     * Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     * 
     */
    private final String test;
    /**
     * Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
     * 
     */
    private final List<String> values;
    /**
     * Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     * 
     */
    private final String variable;

    @CustomType.Constructor
    private GetPolicyDocumentStatementCondition(
        @CustomType.Parameter("test") String test,
        @CustomType.Parameter("values") List<String> values,
        @CustomType.Parameter("variable") String variable) {
        this.test = test;
        this.values = values;
        this.variable = variable;
    }

    /**
     * Name of the [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html) to evaluate.
     * 
    */
    public String test() {
        return this.test;
    }
    /**
     * Values to evaluate the condition against. If multiple values are provided, the condition matches if at least one of them applies. That is, AWS evaluates multiple values as though using an "OR" boolean operation.
     * 
    */
    public List<String> values() {
        return this.values;
    }
    /**
     * Name of a [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys) to apply the condition to. Context variables may either be standard AWS variables starting with `aws:` or service-specific variables prefixed with the service name.
     * 
    */
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String test;
        private List<String> values;
        private String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentStatementCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.test = defaults.test;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        public Builder test(String test) {
            this.test = Objects.requireNonNull(test);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public Builder variable(String variable) {
            this.variable = Objects.requireNonNull(variable);
            return this;
        }        public GetPolicyDocumentStatementCondition build() {
            return new GetPolicyDocumentStatementCondition(test, values, variable);
        }
    }
}
