// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU parameters supplied to the create namespace operation
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The Event Hubs throughput units, value should be 0 to 20 throughput units.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> capacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Name of this SKU.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The billing tier of this particular SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> tier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public SkuResponse(
        @Nullable Integer capacity,
        String name,
        @Nullable String tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private SkuResponse() {
        this.capacity = null;
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(capacity, name, tier);
        }
    }
}
