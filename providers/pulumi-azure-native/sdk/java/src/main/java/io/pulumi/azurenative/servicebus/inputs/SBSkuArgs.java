// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.azurenative.servicebus.enums.SkuName;
import io.pulumi.azurenative.servicebus.enums.SkuTier;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of the namespace.
 * 
 */
public final class SBSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SBSkuArgs Empty = new SBSkuArgs();

    /**
     * The specified messaging units for the tier. For Premium tier, capacity are 1,2 and 4.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Name of this SKU.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<SkuName> name;

    public Input<SkuName> getName() {
        return this.name;
    }

    /**
     * The billing tier of this particular SKU.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<SkuTier> tier;

    public Input<SkuTier> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public SBSkuArgs(
        @Nullable Input<Integer> capacity,
        Input<SkuName> name,
        @Nullable Input<SkuTier> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private SBSkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SBSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private Input<SkuName> name;
        private @Nullable Input<SkuTier> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SBSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder name(Input<SkuName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(SkuName name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder tier(@Nullable Input<SkuTier> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable SkuTier tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public SBSkuArgs build() {
            return new SBSkuArgs(capacity, name, tier);
        }
    }
}
