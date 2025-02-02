// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetSku {
    /**
     * @return Specifies the number of virtual machines in the scale set.
     * 
     */
    private final Integer capacity;
    /**
     * @return Specifies the size of virtual machines in a scale set.
     * 
     */
    private final String name;
    /**
     * @return Specifies the tier of virtual machines in a scale set. Possible values, `standard` or `basic`.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private ScaleSetSku(
        @CustomType.Parameter("capacity") Integer capacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return Specifies the number of virtual machines in the scale set.
     * 
     */
    public Integer capacity() {
        return this.capacity;
    }
    /**
     * @return Specifies the size of virtual machines in a scale set.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the tier of virtual machines in a scale set. Possible values, `standard` or `basic`.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetSku defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSetSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ScaleSetSku build() {
            return new ScaleSetSku(capacity, name, tier);
        }
    }
}
