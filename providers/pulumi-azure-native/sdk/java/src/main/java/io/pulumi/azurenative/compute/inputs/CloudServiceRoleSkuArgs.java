// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the cloud service role sku.
 * 
 */
public final class CloudServiceRoleSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceRoleSkuArgs Empty = new CloudServiceRoleSkuArgs();

    /**
     * Specifies the number of role instances in the cloud service.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Double> capacity;

    public Input<Double> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the tier of the cloud service. Possible Values are <br /><br /> **Standard** <br /><br /> **Basic**
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public CloudServiceRoleSkuArgs(
        @Nullable Input<Double> capacity,
        @Nullable Input<String> name,
        @Nullable Input<String> tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    private CloudServiceRoleSkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> capacity;
        private @Nullable Input<String> name;
        private @Nullable Input<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Input<Double> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Double capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public CloudServiceRoleSkuArgs build() {
            return new CloudServiceRoleSkuArgs(capacity, name, tier);
        }
    }
}
