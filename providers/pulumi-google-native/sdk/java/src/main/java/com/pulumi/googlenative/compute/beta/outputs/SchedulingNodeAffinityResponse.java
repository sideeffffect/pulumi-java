// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SchedulingNodeAffinityResponse {
    /**
     * @return Corresponds to the label key of Node resource.
     * 
     */
    private final String key;
    /**
     * @return Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    private final String operator;
    /**
     * @return Corresponds to the label values of Node resource.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private SchedulingNodeAffinityResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    /**
     * @return Corresponds to the label key of Node resource.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Corresponds to the label values of Node resource.
     * 
     */
    public List<String> values() {
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
        public Builder values(String... values) {
            return values(List.of(values));
        }        public SchedulingNodeAffinityResponse build() {
            return new SchedulingNodeAffinityResponse(key, operator, values);
        }
    }
}
