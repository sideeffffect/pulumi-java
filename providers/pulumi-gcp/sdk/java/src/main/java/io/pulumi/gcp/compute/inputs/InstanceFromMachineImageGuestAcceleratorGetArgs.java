// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceFromMachineImageGuestAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageGuestAcceleratorGetArgs Empty = new InstanceFromMachineImageGuestAcceleratorGetArgs();

    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public InstanceFromMachineImageGuestAcceleratorGetArgs(
        Output<Integer> count,
        Output<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceFromMachineImageGuestAcceleratorGetArgs() {
        this.count = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageGuestAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceFromMachineImageGuestAcceleratorGetArgs build() {
            return new InstanceFromMachineImageGuestAcceleratorGetArgs(count, type);
        }
    }
}
