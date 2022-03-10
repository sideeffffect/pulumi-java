// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.inputs.KeyValuePairArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a discrete action.
 * 
 */
public final class DiscreteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscreteActionArgs Empty = new DiscreteActionArgs();

    /**
     * String that represents a Capability URN.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * List of key value pairs.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<List<KeyValuePairArgs>> parameters;

    public Input<List<KeyValuePairArgs>> getParameters() {
        return this.parameters;
    }

    /**
     * String that represents a selector.
     * 
     */
    @InputImport(name="selectorId", required=true)
      private final Input<String> selectorId;

    public Input<String> getSelectorId() {
        return this.selectorId;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is 'discrete'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public DiscreteActionArgs(
        Input<String> name,
        Input<List<KeyValuePairArgs>> parameters,
        Input<String> selectorId,
        Input<String> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.selectorId = Objects.requireNonNull(selectorId, "expected parameter 'selectorId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DiscreteActionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.selectorId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscreteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<KeyValuePairArgs>> parameters;
        private Input<String> selectorId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscreteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.selectorId = defaults.selectorId;
    	      this.type = defaults.type;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder parameters(Input<List<KeyValuePairArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(List<KeyValuePairArgs> parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder selectorId(Input<String> selectorId) {
            this.selectorId = Objects.requireNonNull(selectorId);
            return this;
        }

        public Builder selectorId(String selectorId) {
            this.selectorId = Input.of(Objects.requireNonNull(selectorId));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DiscreteActionArgs build() {
            return new DiscreteActionArgs(name, parameters, selectorId, type);
        }
    }
}
