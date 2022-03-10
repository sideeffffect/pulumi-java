// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SchedulingNodeAffinityResponse {
    /**
     * The label key of Node resource to reference.
     * 
     */
    private final String key;
    /**
     * The operator to use for the node resources specified in the `values` parameter.
     * 
     */
    private final String operator;
    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private SchedulingNodeAffinityResponse(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("operator") String operator,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    /**
     * The label key of Node resource to reference.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * The operator to use for the node resources specified in the `values` parameter.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Corresponds to the label values of Node resource.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingNodeAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingNodeAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public SchedulingNodeAffinityResponse build() {
            return new SchedulingNodeAffinityResponse(key, operator, values);
        }
    }
}
