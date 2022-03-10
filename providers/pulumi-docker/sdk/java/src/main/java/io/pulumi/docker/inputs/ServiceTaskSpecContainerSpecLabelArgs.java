// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceTaskSpecContainerSpecLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecLabelArgs Empty = new ServiceTaskSpecContainerSpecLabelArgs();

    @InputImport(name="label", required=true)
      private final Input<String> label;

    public Input<String> getLabel() {
        return this.label;
    }

    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ServiceTaskSpecContainerSpecLabelArgs(
        Input<String> label,
        Input<String> value) {
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceTaskSpecContainerSpecLabelArgs() {
        this.label = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> label;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        public Builder label(Input<String> label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder label(String label) {
            this.label = Input.of(Objects.requireNonNull(label));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ServiceTaskSpecContainerSpecLabelArgs build() {
            return new ServiceTaskSpecContainerSpecLabelArgs(label, value);
        }
    }
}
