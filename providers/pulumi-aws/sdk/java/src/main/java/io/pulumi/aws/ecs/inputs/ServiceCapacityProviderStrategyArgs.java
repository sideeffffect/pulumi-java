// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceCapacityProviderStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCapacityProviderStrategyArgs Empty = new ServiceCapacityProviderStrategyArgs();

    /**
     * Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    @Import(name="base")
      private final @Nullable Output<Integer> base;

    public Output<Integer> base() {
        return this.base == null ? Codegen.empty() : this.base;
    }

    /**
     * Short name of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
      private final Output<String> capacityProvider;

    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * Relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> weight() {
        return this.weight == null ? Codegen.empty() : this.weight;
    }

    public ServiceCapacityProviderStrategyArgs(
        @Nullable Output<Integer> base,
        Output<String> capacityProvider,
        @Nullable Output<Integer> weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider, "expected parameter 'capacityProvider' to be non-null");
        this.weight = weight;
    }

    private ServiceCapacityProviderStrategyArgs() {
        this.base = Codegen.empty();
        this.capacityProvider = Codegen.empty();
        this.weight = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCapacityProviderStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> base;
        private Output<String> capacityProvider;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCapacityProviderStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder base(@Nullable Output<Integer> base) {
            this.base = base;
            return this;
        }
        public Builder base(@Nullable Integer base) {
            this.base = Codegen.ofNullable(base);
            return this;
        }
        public Builder capacityProvider(Output<String> capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }
        public Builder capacityProvider(String capacityProvider) {
            this.capacityProvider = Output.of(Objects.requireNonNull(capacityProvider));
            return this;
        }
        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = Codegen.ofNullable(weight);
            return this;
        }        public ServiceCapacityProviderStrategyArgs build() {
            return new ServiceCapacityProviderStrategyArgs(base, capacityProvider, weight);
        }
    }
}
