// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceSchedulingNodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceSchedulingNodeAffinityArgs Empty = new InstanceSchedulingNodeAffinityArgs();

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    @InputImport(name="operator", required=true)
      private final Input<String> operator;

    public Input<String> getOperator() {
        return this.operator;
    }

    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    @InputImport(name="values", required=true)
      private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public InstanceSchedulingNodeAffinityArgs(
        Input<String> key,
        Input<String> operator,
        Input<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private InstanceSchedulingNodeAffinityArgs() {
        this.key = Input.empty();
        this.operator = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceSchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> operator;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceSchedulingNodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder operator(Input<String> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder values(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public InstanceSchedulingNodeAffinityArgs build() {
            return new InstanceSchedulingNodeAffinityArgs(key, operator, values);
        }
    }
}
