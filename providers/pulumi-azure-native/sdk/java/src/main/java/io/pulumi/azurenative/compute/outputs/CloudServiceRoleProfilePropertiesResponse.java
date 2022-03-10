// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CloudServiceRoleSkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceRoleProfilePropertiesResponse {
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * Describes the cloud service role sku.
     * 
     */
    private final @Nullable CloudServiceRoleSkuResponse sku;

    @OutputCustomType.Constructor
    private CloudServiceRoleProfilePropertiesResponse(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("sku") @Nullable CloudServiceRoleSkuResponse sku) {
        this.name = name;
        this.sku = sku;
    }

    /**
     * Resource name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Describes the cloud service role sku.
     * 
    */
    public Optional<CloudServiceRoleSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleProfilePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable CloudServiceRoleSkuResponse sku;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleProfilePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder sku(@Nullable CloudServiceRoleSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public CloudServiceRoleProfilePropertiesResponse build() {
            return new CloudServiceRoleProfilePropertiesResponse(name, sku);
        }
    }
}
