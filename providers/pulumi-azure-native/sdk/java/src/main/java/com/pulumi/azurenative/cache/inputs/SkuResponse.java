// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * SKU parameters supplied to the create Redis operation.
 * 
 */
public final class SkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0, 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     * 
     */
    @Import(name="capacity", required=true)
      private final Integer capacity;

    public Integer capacity() {
        return this.capacity;
    }

    /**
     * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     * 
     */
    @Import(name="family", required=true)
      private final String family;

    public String family() {
        return this.family;
    }

    /**
     * The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium)
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public SkuResponse(
        Integer capacity,
        String family,
        String name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuResponse() {
        this.capacity = null;
        this.family = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public SkuResponse build() {
            return new SkuResponse(capacity, family, name);
        }
    }
}
