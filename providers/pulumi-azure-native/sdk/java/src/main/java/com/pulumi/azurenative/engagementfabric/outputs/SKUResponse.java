// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SKUResponse {
    /**
     * @return The name of the SKU
     * 
     */
    private final String name;
    /**
     * @return The price tier of the SKU
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private SKUResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return The name of the SKU
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The price tier of the SKU
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public SKUResponse build() {
            return new SKUResponse(name, tier);
        }
    }
}
