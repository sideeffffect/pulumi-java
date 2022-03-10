// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceModelWithAllowedPropertySetResponseSku {
    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    private final @Nullable String family;
    /**
     * The name of the SKU. Ex - P3. It is typically a letter+number code
     * 
     */
    private final String name;
    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    private final @Nullable String size;
    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier, but is not required on a PUT.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private ResourceModelWithAllowedPropertySetResponseSku(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("family") @Nullable String family,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("size") @Nullable String size,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
    */
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The name of the SKU. Ex - P3. It is typically a letter+number code
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
    */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier, but is not required on a PUT.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceModelWithAllowedPropertySetResponseSku defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceModelWithAllowedPropertySetResponseSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ResourceModelWithAllowedPropertySetResponseSku build() {
            return new ResourceModelWithAllowedPropertySetResponseSku(capacity, family, name, size, tier);
        }
    }
}
