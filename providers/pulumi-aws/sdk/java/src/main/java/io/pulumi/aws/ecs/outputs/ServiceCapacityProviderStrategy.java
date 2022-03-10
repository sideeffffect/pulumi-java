// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCapacityProviderStrategy {
    /**
     * Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    private final @Nullable Integer base;
    /**
     * Short name of the capacity provider.
     * 
     */
    private final String capacityProvider;
    /**
     * Relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    private final @Nullable Integer weight;

    @OutputCustomType.Constructor
    private ServiceCapacityProviderStrategy(
        @OutputCustomType.Parameter("base") @Nullable Integer base,
        @OutputCustomType.Parameter("capacityProvider") String capacityProvider,
        @OutputCustomType.Parameter("weight") @Nullable Integer weight) {
        this.base = base;
        this.capacityProvider = capacityProvider;
        this.weight = weight;
    }

    /**
     * Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
    */
    public Optional<Integer> getBase() {
        return Optional.ofNullable(this.base);
    }
    /**
     * Short name of the capacity provider.
     * 
    */
    public String getCapacityProvider() {
        return this.capacityProvider;
    }
    /**
     * Relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
    */
    public Optional<Integer> getWeight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCapacityProviderStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer base;
        private String capacityProvider;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCapacityProviderStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder base(@Nullable Integer base) {
            this.base = base;
            return this;
        }

        public Builder capacityProvider(String capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public ServiceCapacityProviderStrategy build() {
            return new ServiceCapacityProviderStrategy(base, capacityProvider, weight);
        }
    }
}
